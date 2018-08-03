package com.fastfive.defesacivil.core.business;

import java.util.List;
import java.util.Optional;

import com.fastfive.defesacivil.core.model.SolicitacaoVistoria;

public interface ISolicitacaoVistoriaBusiness {

	List<SolicitacaoVistoria> findAll();

	SolicitacaoVistoria save(SolicitacaoVistoria solicitacaoVistoria);
	
	Optional<SolicitacaoVistoria> findById(Long id);
}
