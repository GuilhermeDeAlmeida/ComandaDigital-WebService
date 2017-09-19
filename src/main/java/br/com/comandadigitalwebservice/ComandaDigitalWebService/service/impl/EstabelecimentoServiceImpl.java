package br.com.comandadigitalwebservice.ComandaDigitalWebService.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.com.comandadigitalwebservice.ComandaDigitalWebService.repository.interfaces.EstabelecimentoRepository;
import br.com.comandadigitalwebservice.ComandaDigitalWebService.service.EstabelecimentoService;

@Service
public class EstabelecimentoServiceImpl implements EstabelecimentoService{

	@Autowired
	private EstabelecimentoRepository repositorio;
	
}
