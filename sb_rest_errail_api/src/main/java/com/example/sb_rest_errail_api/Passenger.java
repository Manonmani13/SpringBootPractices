package com.example.sb_rest_errail_api;

import lombok.Data;

@Data
public class Passenger {
    private String fname;

    private String lname;

    private String from;

    private String to;

    private String doj;

    private String trainNum;
}
