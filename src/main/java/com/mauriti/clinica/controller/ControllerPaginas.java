package com.mauriti.clinica.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ControllerPaginas {
	
    @GetMapping("/paginainicial")
       public String retorne() {
	   return "home";
     }
    @GetMapping("/cadastros")
    public String cadastro() {
    	return "cadastrar";
    }
    @GetMapping("/agendamentos")
    public String agenda() {
    	return "listas";
    }
    @GetMapping("/sobre")
    public String ultimo() {
    	return "nos";
    }

}
