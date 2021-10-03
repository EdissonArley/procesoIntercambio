package com.uninpahu.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.uninpahu.entity.ConveniosInternacionales;

@Repository
public interface ConveniosInternacionalesRepository extends JpaRepository<ConveniosInternacionales, Integer> {

}
