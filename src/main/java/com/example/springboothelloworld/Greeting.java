package com.example.springboothelloworld;

import jakarta.persistence.*;

@Entity
@Table(name = "greetings")
public class Greeting {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "lang_code", nullable = false, unique = true)
    private String langCode;

    @Column(nullable = false)
    private String message;

    public String getMessage() {
        return message;
    }

    public String getLangCode() {
        return langCode;
    }

    // 선택: 생성자와 setter도 필요 시 추가
    public Greeting() {}

    public Greeting(String langCode, String message) {
        this.langCode = langCode;
        this.message = message;
    }
}
