package com.first;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
@Component
public class MyCmdLine  implements CommandLineRunner{

    @Override
    public void run(String... args) throws Exception {
        System.out.println("MyCmdRunner :: run() method called......");
    }
    
}
