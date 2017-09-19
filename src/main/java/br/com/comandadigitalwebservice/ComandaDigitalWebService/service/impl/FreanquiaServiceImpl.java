package br.com.comandadigitalwebservice.ComandaDigitalWebService.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.comandadigitalwebservice.ComandaDigitalWebService.repository.interfaces.FranquiaRepository;
import br.com.comandadigitalwebservice.ComandaDigitalWebService.service.FreanquiaService;

@Service
public class FreanquiaServiceImpl implements FreanquiaService{

	@Autowired
	private FranquiaRepository repositorio;
}
