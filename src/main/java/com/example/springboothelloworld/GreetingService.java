package com.example.springboothelloworld;

import org.springframework.stereotype.Service;

@Service
public class GreetingService {
    private final GreetingRepository repo;

    public GreetingService(GreetingRepository repo) {
        this.repo = repo;
    }

    public String getMessage(String lang) {
        return repo.findByLangCode(lang)
                .map(Greeting::getMessage)
                .orElse("No greeting found.");
    }
}
