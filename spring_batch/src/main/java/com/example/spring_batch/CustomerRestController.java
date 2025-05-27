package com.example.spring_batch;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.batch.core.JobParameter;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.JobParametersBuilder;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.batch.BatchProperties.Job;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class CustomerRestController {

    @Autowired
    private JobLauncher jobLauncher;

    @Autowired
    private Job job;


    @GetMapping("/customer")
    public void loadCsvToDo() {
        JobParameters jobParameter=  new JobParametersBuilder().addLong("Start-At",System.currentTimeMillis()).toJobParameters());
         jobLauncher.run(job,jobParameter);

    }
    
    
}
