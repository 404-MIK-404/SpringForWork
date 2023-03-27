package com.restservice.RestServiceTask.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ServiceError {

    private int statusCode;
    private String message;
    private Date timeStamp;


}
