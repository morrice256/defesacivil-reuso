package com.fastfive.defesacivil.core.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.fastfive.defesacivil.core.business.IRiscoBusiness;
import com.fastfive.defesacivil.core.model.Risco;

@RestController
@RequestMapping("risco")
public class RiscoController {

	@Autowired
	private IRiscoBusiness riscoBusiness;
	
	@GetMapping
	public List<Risco> getRiscos() {		
		return riscoBusiness.findAll();		
	}
	
	@PostMapping
	public Risco saveRisco(@RequestBody Risco risco) {		
		return riscoBusiness.save(risco);		
	}
	
}
