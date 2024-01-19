package com.example.globalExceptionHandlersks.dto;

import jakarta.persistence.Column;
import lombok.Data;

@Data
public class PostDto {
    private Long id;
    private String Title;
    private String Description;
    private String Content;

}
