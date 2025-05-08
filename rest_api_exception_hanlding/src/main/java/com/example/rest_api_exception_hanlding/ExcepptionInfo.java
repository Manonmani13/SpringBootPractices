package com.example.rest_api_exception_hanlding;

import java.time.LocalDate;
import java.time.LocalDateTime;

import lombok.Data;
@Data
public class ExcepptionInfo {
    private String code;

    private String msg;

    private LocalDateTime date;

}
