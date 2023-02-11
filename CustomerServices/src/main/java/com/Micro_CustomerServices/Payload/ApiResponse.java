package com.Micro_CustomerServices.Payload;

import lombok.*;
import org.springframework.http.HttpStatus;

@Getter
@Setter
@Builder

@AllArgsConstructor
@NoArgsConstructor


public class ApiResponse {

    private String mesage;
    private  boolean success;
    private HttpStatus status;


}
