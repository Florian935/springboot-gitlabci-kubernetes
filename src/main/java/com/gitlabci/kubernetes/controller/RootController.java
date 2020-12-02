package com.gitlabci.kubernetes.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class RootController {

    @GetMapping("/")
    public String root() {
        return "Hello from Root !!";
    }

    @GetMapping("/demo")
    public String demo() {
        return "Hello from Demo !";
    }

    @GetMapping("/kida")
    public String kida() {
        return "Envoi une photo de Kida, bah répond";
    }
	
    @GetMapping("/joeystarr")
    public String joeyStarr() {
	return "'Ludo je le calcule pas c'est une pompe à vélo.' J. Starr - 2012";
    }
}
