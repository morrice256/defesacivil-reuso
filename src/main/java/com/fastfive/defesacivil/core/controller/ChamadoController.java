package com.fastfive.defesacivil.core.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fastfive.defesacivil.core.business.IChamadoBusiness;
import com.fastfive.defesacivil.core.model.Chamado;

@RestController
@RequestMapping("chamado")
public class ChamadoController {

	@Autowired
	private IChamadoBusiness chamadoBusiness;
	
	@GetMapping
	public List<Chamado> getChamados() {		
		return chamadoBusiness.findAll();
	}
	
	@GetMapping("/{id}")
	public Optional<Chamado> getChamado(@PathVariable Long id) {		
		return chamadoBusiness.findById(id);
	}
	
	@PostMapping
	public Chamado saveChamado(@RequestBody Chamado chamado) {		
		return chamadoBusiness.save(chamado);		
	}
	
}
