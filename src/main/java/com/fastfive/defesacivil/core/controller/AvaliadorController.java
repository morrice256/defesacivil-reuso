package com.fastfive.defesacivil.core.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.fastfive.defesacivil.core.business.IAvaliadorBusiness;
import com.fastfive.defesacivil.core.model.Avaliador;

@RestController
@RequestMapping("avaliador")
public class AvaliadorController {

	@Autowired
	private IAvaliadorBusiness avaliadorBusiness;
	
	@GetMapping
	public List<Avaliador> getAvaliadores() {		
		return avaliadorBusiness.findAll();		
	}
	
	@PostMapping
	public Avaliador saveAvaliador(@RequestBody Avaliador avaliador) {		
		return avaliadorBusiness.save(avaliador);		
	}
}
