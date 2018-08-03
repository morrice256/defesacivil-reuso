package com.fastfive.defesacivil.core.business.impl;

import java.sql.Timestamp;
import java.time.Instant;
import java.util.List;
import java.util.Optional;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.fastfive.defesacivil.core.business.IChamadoBusiness;
import com.fastfive.defesacivil.core.model.Chamado;
import com.fastfive.defesacivil.core.model.ProcessoStatus;
import com.fastfive.defesacivil.core.repository.ChamadoRepository;
import com.fastfive.defesacivil.core.repository.ProcessoStatusRepository;

@Service
public class ChamadoBusiness implements IChamadoBusiness {

	@Autowired
	private ChamadoRepository chamadoRepository;
	
	@Autowired
	private ProcessoStatusRepository processoStatusRepository;
	
	@Value("${chamado.status.start}")
	private String chamadoStartStatus;

	
	@Override
	public List<Chamado> findAll() {
		return (List<Chamado>) chamadoRepository.findAll();
	}

	@Override
	public Optional<Chamado> findById(Long id) {
		return chamadoRepository.findById(id);
	} 

	@Override
	public Chamado save(Chamado chamado) {
		ProcessoStatus startStatus = processoStatusRepository.findByDescricao(chamadoStartStatus);
		chamado.setProcessoStatus(startStatus);
		chamado.setProcesso( gerarNumeroProcesso() );
		chamado.setDataChamado( Timestamp.from(Instant.now()) );
		return chamadoRepository.save(chamado);
	}

	private Long gerarNumeroProcesso() {
		Long numeroPrcesso = null;
		Chamado chamado = null;
		do {
			numeroPrcesso = new Random().nextLong();
			chamado = chamadoRepository.findByProcesso(numeroPrcesso);
			
		} while (chamado != null || numeroPrcesso <= 0);
		return numeroPrcesso;		
	}
	
}
