package com.renan.conta.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.renan.conta.domain.Fatura;

@Repository
public interface FaturaRepository extends JpaRepository<Fatura, Integer>{
	
}