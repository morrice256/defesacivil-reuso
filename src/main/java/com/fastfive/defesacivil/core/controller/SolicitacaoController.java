package com.fastfive.defesacivil.core.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fastfive.defesacivil.core.business.ISolicitacaoLonaBusiness;
import com.fastfive.defesacivil.core.business.ISolicitacaoVistoriaBusiness;
import com.fastfive.defesacivil.core.model.SolicitacaoLona;
import com.fastfive.defesacivil.core.model.SolicitacaoVistoria;

@RestController
@RequestMapping("solicitacao")
public class SolicitacaoController {

	@Autowired
	private ISolicitacaoLonaBusiness solicitacaoLonaBusiness;

	@Autowired
	private ISolicitacaoVistoriaBusiness solicitacaoVistoriaBusiness;
	
	@PostMapping("/lona")
	public SolicitacaoLona saveSolicitacaoLona(@RequestBody SolicitacaoLona solicitacaoLona) {		
		return solicitacaoLonaBusiness.save(solicitacaoLona);		
	}
	
	@GetMapping("/lona/{id}")
	public Optional<SolicitacaoLona> getSolicitacaoLona(@PathVariable Long id) {		
		return solicitacaoLonaBusiness.findById(id);		
	}
	
	@PostMapping("/vistoria")
	public SolicitacaoVistoria saveSolicitacaoVistoria(@RequestBody SolicitacaoVistoria solicitacaoVistoria) {		
		return solicitacaoVistoriaBusiness.save(solicitacaoVistoria);		
	}
	
	@GetMapping("/vistoria/{id}")
	public Optional<SolicitacaoVistoria> getSolicitacaoVistoria(@PathVariable Long id) {		
		return solicitacaoVistoriaBusiness.findById(id);		
	}
	
}
