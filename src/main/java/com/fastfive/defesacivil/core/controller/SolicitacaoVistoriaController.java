package com.fastfive.defesacivil.core.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fastfive.defesacivil.core.business.ISolicitacaoVistoriaBusiness;
import com.fastfive.defesacivil.core.model.SolicitacaoVistoria;

@RestController
@RequestMapping("solicitacaovistoria")
public class SolicitacaoVistoriaController {


	@Autowired
	private ISolicitacaoVistoriaBusiness solicitacaoVistoriaBusiness;
	
	@GetMapping
	public List<SolicitacaoVistoria> getSolicitacaoVistorias() {		
		return solicitacaoVistoriaBusiness.findAll();		
	}
	
	@PostMapping
	public SolicitacaoVistoria saveSolicitacaoVistoria(@RequestBody SolicitacaoVistoria solicitacaoVistoria) {		
		return solicitacaoVistoriaBusiness.save(solicitacaoVistoria);		
	}
	
}
