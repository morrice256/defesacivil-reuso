package com.fastfive.defesacivil.core.business;

import java.util.List;
import com.fastfive.defesacivil.core.model.SolicitacaoLona;

public interface ISolicitacaoLonaBusiness {
	
	List<SolicitacaoLona> findAll();

	SolicitacaoLona save(SolicitacaoLona solicitacaoLona);
	
}
