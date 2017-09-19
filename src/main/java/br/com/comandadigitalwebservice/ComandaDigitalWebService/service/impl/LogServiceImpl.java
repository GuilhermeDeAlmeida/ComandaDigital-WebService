package br.com.comandadigitalwebservice.ComandaDigitalWebService.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import br.com.comandadigitalwebservice.ComandaDigitalWebService.repository.interfaces.LogRepository;
import br.com.comandadigitalwebservice.ComandaDigitalWebService.service.LogService;

@Service
public class LogServiceImpl implements LogService{

	@Autowired
	private LogRepository repositorio;

}
