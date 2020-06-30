package com.mauriti.clinica.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.mauriti.clinica.model.Cliente;
import com.mauriti.clinica.repository.Clientes;

@Controller
public class ControllerCeA {
@Autowired
Clientes clientes;

 @GetMapping("/oftcad")
 public String oft() {
	 return "cad_oft";
 }
 
 @PostMapping("/cad_ofta")
 public String Salvar(Cliente cliente) {
	 clientes.save(cliente);
	 return "redirect:/aoft";
 }

 @GetMapping("/nutricad")
 public String nft() {
	 return "cad_nutri";
 }
 @GetMapping("/psicad")
 public String pft() {
	 return "cad_psi";
 }
 
 
 
 @GetMapping("/aoft")
 public ModelAndView Listar(Cliente cliente) {
	 ModelAndView modelAndView = new ModelAndView("loft");
	 modelAndView.addObject("Clientes", clientes.findAll());
	 modelAndView.addObject(new Cliente());
	 return modelAndView;
 }
 
 @GetMapping("/anutri")
 public String nutri() {
	 return "lnutri";
 }
 
 @GetMapping("/apsi")
 public String psi() {
	 return "lpsi";
 }
 
 @GetMapping("/editarCliente/{id}")
 public String editarAlunos(@PathVariable("id") Long id,  Model model) {
  	model.addAttribute("dados", clientes.findById(id));
  	return "editCliente";
 }
 
 @GetMapping("/delete/{id}")
 public String delete(@PathVariable("id") Long id) {
 	clientes.deleteById(id);
 	return "redirect:/aoft";
  }  	
 
 @GetMapping("/EC")
 public String Editar(Cliente cliente) {
	 clientes.save(cliente);
	 return "redirect:/aoft";
 }
 
}