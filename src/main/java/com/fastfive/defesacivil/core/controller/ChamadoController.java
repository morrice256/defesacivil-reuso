package com.fastfive.defesacivil.core.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.fastfive.defesacivil.core.business.IChamadoBusiness;
import com.fastfive.defesacivil.core.model.Chamado;

@RestController("/chamado")
public class ChamadoController {

	@Autowired
	private IChamadoBusiness chamadoBusiness;
	
	@GetMapping
	public List<Chamado> getChamados() {		
		return chamadoBusiness.findAll();		
	}
	
	@PostMapping
	public Chamado saveChamado(@RequestBody Chamado chamado) {		
		return chamadoBusiness.save(chamado);		
	}
	
}
