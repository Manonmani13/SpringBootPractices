package com.first.runners;

import org.springframework.stereotype.Repository;

@Repository
public class ReportDao {

    public String getNameById(Integer userId){
        if(userId==100){
            return "Mano";
        }
        else if(userId==100){
            return "smith";
        }else{
            return "Nobody";
        }
    }
    
}
