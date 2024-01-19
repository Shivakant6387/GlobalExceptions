package com.example.globalExceptionHandlersks.service;

import lombok.Data;

@Data
public class PostResponse {
    private String Content;
    private String PageNo;
    private String PageSize;
    private String TotalElements;
    private String TotalPages;
    private String Last;

}
