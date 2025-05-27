package com.example.spring_batch;

import org.springframework.batch.item.ItemProcessor;

public class CustomProcesor  implements ItemProcessor<Customer,Customer>{

    @Override
    public Customer process(Customer item) throws Exception {
        return item;
    }
    
}
