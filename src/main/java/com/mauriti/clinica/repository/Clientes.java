package com.mauriti.clinica.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mauriti.clinica.model.Cliente;

public interface Clientes extends JpaRepository<Cliente, Long>{
}