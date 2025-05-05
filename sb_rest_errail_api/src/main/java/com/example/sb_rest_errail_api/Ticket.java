package com.example.sb_rest_errail_api;

import lombok.Data;

@Data
public class Ticket {
    private Integer ticketId;

    private String from;

    private String to;

    private String trialNum;

    private String tktCost;

    private String ticketStatus;

}
