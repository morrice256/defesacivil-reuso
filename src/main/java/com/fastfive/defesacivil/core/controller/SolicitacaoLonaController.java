package com.fastfive.defesacivil.core.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fastfive.defesacivil.core.business.ISolicitacaoLonaBusiness;
import com.fastfive.defesacivil.core.model.SolicitacaoLona;

@RestController
@RequestMapping("solicitacaolona")
public class SolicitacaoLonaController {

	@Autowired
	private ISolicitacaoLonaBusiness solicitacaoLonaBusiness;
	
	@GetMapping
	public List<SolicitacaoLona> getSolicitacaoLona() {		
		return solicitacaoLonaBusiness.findAll();		
	}
	
	@PostMapping
	public SolicitacaoLona saveSolicitacaoLona(@RequestBody SolicitacaoLona solicitacaoLona) {		
		return solicitacaoLonaBusiness.save(solicitacaoLona);		
	}
	
}
