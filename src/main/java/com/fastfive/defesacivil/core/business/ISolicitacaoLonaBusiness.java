package com.fastfive.defesacivil.core.business;

import java.util.List;
import java.util.Optional;

import com.fastfive.defesacivil.core.model.SolicitacaoLona;

public interface ISolicitacaoLonaBusiness {
	
	List<SolicitacaoLona> findAll();

	SolicitacaoLona save(SolicitacaoLona solicitacaoLona);

	Optional<SolicitacaoLona> findById(Long id);
}
