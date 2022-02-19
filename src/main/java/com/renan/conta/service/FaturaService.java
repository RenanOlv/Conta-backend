package com.renan.conta.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.renan.conta.domain.Fatura;
import com.renan.conta.repository.FaturaRepository;
import com.renan.conta.service.exeptions.ObjectNotFoundException;

@Service
public class FaturaService {

	@Autowired
	private FaturaRepository repo;

	public Fatura buscar(Integer id) {
		Optional<Fatura> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
			 "Obejeto não encontrado! Id: " + id + ", Tipo: " + Fatura.class.getName())); 
	}
}