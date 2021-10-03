package com.uninpahu.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.uninpahu.entity.Formulario;
@Repository
public interface FormularioRepository extends JpaRepository<Formulario, Integer>{

}
