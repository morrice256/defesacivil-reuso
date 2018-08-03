package com.fastfive.defesacivil.core.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fastfive.defesacivil.core.business.IRPABusiness;
import com.fastfive.defesacivil.core.business.IRegionalBusiness;
import com.fastfive.defesacivil.core.model.RPA;
import com.fastfive.defesacivil.core.model.Regional;

@RestController
@RequestMapping("recursos")
public class SolicitacaoRecursosController {

	@Autowired
	private IRegionalBusiness regionalBusiness;

	@Autowired
	private IRPABusiness rpaBusiness;
	

	@GetMapping("regional")
	public List<Regional> getRegionais() {		
		return regionalBusiness.findAll();		
	}
	
	@GetMapping("rpa")
	public List<RPA> getRPA() {		
		return rpaBusiness.findAll();		
	}
	
}
