package com.example.springboothelloworld;

import org.springframework.stereotype.Service;

@Service
public class GreetingService {
    private final GreetingRepository greetingRepository;

    public GreetingService(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    public String getMessageByLang(String langCode) {
        return greetingRepository.findByLangCode(langCode)
                .map(Greeting::getMessage)
                .orElse("지원하지 않는 언어입니다");
    }
}
