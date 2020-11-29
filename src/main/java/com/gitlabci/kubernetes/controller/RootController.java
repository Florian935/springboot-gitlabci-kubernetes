package com.gitlabci.kubernetes.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RootController {

    @GetMapping("/")
    public String root() {
        return "Hello from Root";
    }

    @GetMapping("/demo")
    public String demo() {
        return "Hello from Demo yop !";
    }

    @GetMapping("/kida")
    public String kida() {
        return "Envoi une photo de Kida, bah répond";
    }
}
