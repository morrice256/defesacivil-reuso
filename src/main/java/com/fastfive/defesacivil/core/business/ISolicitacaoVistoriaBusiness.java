package com.fastfive.defesacivil.core.business;

import java.util.List;

import com.fastfive.defesacivil.core.model.SolicitacaoVistoria;

public interface ISolicitacaoVistoriaBusiness {

	List<SolicitacaoVistoria> findAll();

	SolicitacaoVistoria save(SolicitacaoVistoria solicitacaoVistoria);
	
}
