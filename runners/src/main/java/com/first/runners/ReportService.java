package com.first.runners;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReportService {

    @Autowired
    private ReportDao reportDao;
    
    public void printName(Integer userId){
        String name =reportDao.getNameById(userId);
        System.out.println(name);
    }
    
}
