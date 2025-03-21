package com.example.primeiro_projeto.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HelloController {
    /*
    //////////////////////////////////////////
     * PRIMEIRO PROGRAMA:    
    @GetMapping("/hello")
    public String hello() {
        return "Hello, World!";
    }
     */
    /////////////////////////////////////////
    /// 
    /// 
    // SEGUNDO PROGRAMA
    
    
    @GetMapping("/bemvindo/{nome}")
    public String bemVindo(@PathVariable String nome) {
    return "Bem-vindo, " + nome + "!";
    }
     
    /// FUNCAO SOMA

    @GetMapping("/somar/{num1}/{num2}")
    public String somando(@PathVariable String num1, @PathVariable String num2) {
        
        int soma= Integer.valueOf(num1)+Integer.valueOf(num2);

    return "O resultado da soma de " + num1 + "+" + num2 + " é " + soma;
    }


}



