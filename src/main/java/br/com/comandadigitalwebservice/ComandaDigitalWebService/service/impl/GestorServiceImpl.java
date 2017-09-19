package br.com.comandadigitalwebservice.ComandaDigitalWebService.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.comandadigitalwebservice.ComandaDigitalWebService.repository.interfaces.GestorRepository;
import br.com.comandadigitalwebservice.ComandaDigitalWebService.service.GestorService;

@Service
public class GestorServiceImpl implements GestorService{

	@Autowired
	private GestorRepository repositorio;
}
