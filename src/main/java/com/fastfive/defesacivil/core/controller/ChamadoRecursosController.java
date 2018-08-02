package com.fastfive.defesacivil.core.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fastfive.defesacivil.core.business.IBairroBusiness;
import com.fastfive.defesacivil.core.business.IChamadoOrigemBusiness;
import com.fastfive.defesacivil.core.business.IProcessoLocalizacaoBusiness;
import com.fastfive.defesacivil.core.model.Bairro;
import com.fastfive.defesacivil.core.model.ChamadoOrigem;
import com.fastfive.defesacivil.core.model.ProcessoLocalizacao;

@RestController
@RequestMapping("recursos")
public class ChamadoRecursosController {

	@Autowired
	private IChamadoOrigemBusiness chamadoOrigemBusiness;

	@Autowired
	private IProcessoLocalizacaoBusiness processoLocalizacaoBusiness;

	@Autowired
	private IBairroBusiness bairroBusiness;
	
	@GetMapping(value = "origem")
	public List<ChamadoOrigem> getChamadoOrigens() {		
		return chamadoOrigemBusiness.findAll();		
	}
	
	@GetMapping(value="localizacao")
	public List<ProcessoLocalizacao> getProcessoLocalizacao() {		
		return processoLocalizacaoBusiness.findAll();		
	}
	
	@GetMapping(value="bairro")
	public List<Bairro> getBairro() {		
		return bairroBusiness.findAll();		
	}
	
}
