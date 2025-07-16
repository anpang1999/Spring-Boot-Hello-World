package com.example.springboothelloworld;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Greeting {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, nullable = false)
    private String langCode;

    @Column(nullable = false)
    private String message;

    // getters/setters

    public Long getId() {
        return id;
    }

    public String getLangCode() {
        return langCode;
    }

    public String getMessage() {
        return message;
    }

}
