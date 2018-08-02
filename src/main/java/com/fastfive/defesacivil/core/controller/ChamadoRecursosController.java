package com.fastfive.defesacivil.core.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fastfive.defesacivil.core.business.IChamadoOrigemBusiness;
import com.fastfive.defesacivil.core.model.ChamadoOrigem;

@RestController
@RequestMapping("recursos")
public class ChamadoRecursosController {

	@Autowired
	private IChamadoOrigemBusiness chamadoOrigemBusiness; 
	
	@GetMapping(value = "origem")
	public List<ChamadoOrigem> getChamadoOrigens() {		
		return chamadoOrigemBusiness.findAll();		
	}
	
	@GetMapping(value="localizacao")
	public List<ChamadoOrigem> getProcessoLocalizacao() {		
		return chamadoOrigemBusiness.findAll();		
	}
	
}
