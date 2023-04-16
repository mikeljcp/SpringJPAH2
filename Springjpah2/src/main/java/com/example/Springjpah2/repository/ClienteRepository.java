package com.example.Springjpah2.repository;

import com.example.Springjpah2.entities.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}
