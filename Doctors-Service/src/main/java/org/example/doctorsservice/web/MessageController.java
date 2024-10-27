package org.example.doctorsservice.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RefreshScope
@RestController
public class MessageController {
    @Value("${message.age}")
    private String messageBienvenue;

    @GetMapping("/bienvenue")
    public String afficherMessageBienvenue() {
        return messageBienvenue;
    }
}
