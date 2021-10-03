package com.uninpahu.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.uninpahu.entity.ProgramaAcademico;

@Repository
public interface ProgramaAcademicoRepository extends JpaRepository<ProgramaAcademico, Integer>{

}
