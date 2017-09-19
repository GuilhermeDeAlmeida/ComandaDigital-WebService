package br.com.comandadigitalwebservice.ComandaDigitalWebService.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import br.com.comandadigitalwebservice.ComandaDigitalWebService.entity.Estabelecimento;
import br.com.comandadigitalwebservice.ComandaDigitalWebService.entity.Mesa;
import br.com.comandadigitalwebservice.ComandaDigitalWebService.repository.interfaces.MesaRepository;
import br.com.comandadigitalwebservice.ComandaDigitalWebService.service.MesaService;
@Service
public class MesaServiceImpl implements MesaService{
	@Autowired
	private MesaRepository repositorio;

}
