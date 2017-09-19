package br.com.comandadigitalwebservice.ComandaDigitalWebService.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.com.comandadigitalwebservice.ComandaDigitalWebService.repository.interfaces.ContaRepository;
import br.com.comandadigitalwebservice.ComandaDigitalWebService.service.ContaService;

@Service
public class ContaServiceImpl implements ContaService{

	@Autowired
	private ContaRepository repositorio;
}
