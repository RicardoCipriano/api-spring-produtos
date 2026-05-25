package com.estudo.apispringprodutos.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // Diz ao Spring que isso é um controlador de API REST
public class OlaMundoController {

    @GetMapping("/hello") // Cria uma rota GET no endereço http://localhost:8080/hello
    public String dizerOla() {
        return "Olá Mundo! Minha primeira API com Spring Boot e Java 21 está funcionando! 🚀";
    }
}