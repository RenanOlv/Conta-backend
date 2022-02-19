package com.renan.conta.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.renan.conta.domain.Fatura;
import com.renan.conta.service.FaturaService;

@RestController
@RequestMapping(value="/fatura")
public class FaturaResource {
	@Autowired
	private FaturaService service;

	@RequestMapping(value="/{id}", method=RequestMethod.GET)
	public ResponseEntity<Fatura> buscar(@PathVariable Integer id) {
		Fatura obj = service.buscar(id);
		return ResponseEntity.ok().body(obj);
	}
}