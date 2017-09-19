package br.com.comandadigitalwebservice.ComandaDigitalWebService.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import br.com.comandadigitalwebservice.ComandaDigitalWebService.repository.interfaces.ReservaRepository;
import br.com.comandadigitalwebservice.ComandaDigitalWebService.service.ReservaService;

@Service
public class ReservaServiceImpl implements ReservaService{


	@Autowired
	private ReservaRepository repositorio;
	
}
