package com.example.spring_batch;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.core.step.builder.StepBuilder;
import org.springframework.batch.item.data.RepositoryItemWriter;
import org.springframework.batch.item.file.FlatFileItemReader;
import org.springframework.batch.item.file.LineMapper;
import org.springframework.batch.item.file.mapping.BeanWrapperFieldSetMapper;
import org.springframework.batch.item.file.mapping.DefaultLineMapper;
import org.springframework.batch.item.file.transform.DelimitedLineTokenizer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.task.SimpleAsyncTaskExecutor;
import org.springframework.core.task.TaskExecutor;

@Configuration
@EnableBatchProcessing
public class CsvBatchConfig {

    @Autowired
    private CustomRepository customRepository;

    @Autowired
    private  StepBuilderFactory stepBuilderFactory;

    @Autowired
    private JobBuilderFactory jobBuilderFactory;

    @Bean
    public FlatFileItemReader<Customer> customerReader(){

        FlatFileItemReader<Customer> itemReader=new FlatFileItemReader<>();
        itemReader.setResource(new FileSystemResource("src/main/resources/customer.csv"));
        itemReader.setName("csv-reader");
        itemReader.setLinesToSkip(1);
        itemReader.setLineMapper(lineMapper());
        return itemReader;
    }

    private LineMapper<Customer> lineMapper() {
        
        DefaultLineMapper<Customer> lineMapper=new DefaultLineMapper<>();

        DelimitedLineTokenizer lineTokenizer=new DelimitedLineTokenizer();
        lineTokenizer.setDelimiter(",");
        lineTokenizer.setStrict(false);
        lineTokenizer.setNames("id","firstName","lastName","email","gender","contactNo","country","dob");

        BeanWrapperFieldSetMapper<Customer> fieldSetMapper=new BeanWrapperFieldSetMapper<>();
        fieldSetMapper.setTargetType(Customer.class);
        lineMapper.setLineTokenizer(lineTokenizer);
        lineMapper.setFieldSetMapper(fieldSetMapper);
        return lineMapper;
    }

    @Bean
    public CustomProcesor customerProcessor(){
        return new CustomProcesor();

    }

    @Bean
    public RepositoryItemWriter customWriter(){
        RepositoryItemWriter<Customer> repositoryItemWriter=new RepositoryItemWriter<>();
        repositoryItemWriter.setRepository(customRepository);
        repositoryItemWriter.setMethodName("save");
        return repositoryItemWriter;

    }

    @Bean
    public Step step1(){
        return stepBuilderFactory.get("step-1").<Customer,Customer>chunk(10).reader(customerReader()).processor(customerProcessor()).writer(customWriter()).build();
    }
    @Bean
    public Step step2(){
        return stepBuilderFactory.get("step-2").<Customer,Customer>chunk(10).reader(customerReader()).processor(customerProcessor()).writer(customWriter()).build();
    }
    
    @Bean
    public Job job(){
        return jobBuilderFactory.get("customers-job").flow(step1()).end().build();
    }

    private TaskExecutor taskExecutor(){
        SimpleAsyncTaskExecutor executor=new SimpleAsyncTaskExecutor();
        executor.setConcurrencyLimit(10);
        return executor;

    }
}
