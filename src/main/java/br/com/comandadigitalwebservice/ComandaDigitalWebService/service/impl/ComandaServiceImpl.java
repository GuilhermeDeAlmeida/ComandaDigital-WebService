package br.com.comandadigitalwebservice.ComandaDigitalWebService.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import br.com.comandadigitalwebservice.ComandaDigitalWebService.repository.interfaces.ComandaRepository;
import br.com.comandadigitalwebservice.ComandaDigitalWebService.service.ComandaService;
@Service
public class ComandaServiceImpl implements ComandaService{

	@Autowired
	private ComandaRepository repositorio;
}
