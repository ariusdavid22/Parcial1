package com.spring.security;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Micontroller {

    @GetMapping("/publico")
    public String publico() {
        return "✅ Este contenido es público.";
    }

    @GetMapping("/privado")
    public String privado() {
        return "🔒 Este contenido es privado.";
    }
}