package com.backend.Email_Express.DTO;

import lombok.Data;

@Data
public class EmailRequestDTO {
    private String emailContent;
    private String tone;
}