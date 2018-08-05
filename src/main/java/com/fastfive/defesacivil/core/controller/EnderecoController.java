package com.fastfive.defesacivil.core.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fastfive.defesacivil.core.business.IEnderecoBusiness;
import com.fastfive.defesacivil.core.model.Endereco;

@RestController
@RequestMapping("endereco")
public class EnderecoController {

	@Autowired
	private IEnderecoBusiness enderecoBusiness ;
	
	@GetMapping
	public List<Endereco> getEnderecos() {		
		return enderecoBusiness.findAll();		
	}
	
	@PostMapping
	public Endereco saveEndereco(@RequestBody Endereco endereco) {		
		return enderecoBusiness.save(endereco);		
	}
	
	@PostMapping("/raio")
	public List<Endereco> getEnderecosPorLocalizacaoRaio(@RequestBody Endereco endereco) {
		List<Endereco> listAll = enderecoBusiness.findAll();
		List<Endereco> listRaio = new ArrayList<Endereco>();
		for (Endereco endereco2 : listAll) {
			if (calculaDistancia(endereco2.getLatitude(), endereco2.getLongitude(), endereco.getLatitude(),
					endereco.getLongitude()) <= endereco.getRaio()) {
				listRaio.add(endereco2);
			}
		}
		return listRaio;
	}
	
	private double calculaDistancia(double lat1, double lng1, double lat2, double lng2) {
	    double earthRadius = 6371;//kilometers
	    double dLat = Math.toRadians(lat2 - lat1);
	    double dLng = Math.toRadians(lng2 - lng1);
	    double sindLat = Math.sin(dLat / 2);
	    double sindLng = Math.sin(dLng / 2);
	    double a = Math.pow(sindLat, 2) + Math.pow(sindLng, 2)
	            * Math.cos(Math.toRadians(lat1))
	            * Math.cos(Math.toRadians(lat2));
	    double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));
	    double dist = earthRadius * c;
	 
	    return dist * 1000;
	}
}
