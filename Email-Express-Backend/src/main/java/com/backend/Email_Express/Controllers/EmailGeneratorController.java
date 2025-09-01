package com.backend.Email_Express.Controllers;

import com.backend.Email_Express.DTO.EmailRequestDTO;
import com.backend.Email_Express.Services.EmailGeneratorService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/email")
@AllArgsConstructor
@CrossOrigin(origins = "*")
public class EmailGeneratorController {

    private final EmailGeneratorService emailGeneratorService;

    @PostMapping("/generate")
    public Mono<String> generateEmail(@RequestBody EmailRequestDTO emailRequest) {
        return emailGeneratorService.generateEmailReply(emailRequest);
    }
}