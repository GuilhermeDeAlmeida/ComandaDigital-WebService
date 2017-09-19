 package br.com.comandadigitalwebservice.ComandaDigitalWebService.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.comandadigitalwebservice.ComandaDigitalWebService.repository.interfaces.ColaboradorRepository;
import br.com.comandadigitalwebservice.ComandaDigitalWebService.service.ColaboradorService;

@Service
public class ColaboradorServiceImpl implements ColaboradorService{

	@Autowired
	private ColaboradorRepository repositorio;
}
