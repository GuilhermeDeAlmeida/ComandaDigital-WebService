package br.com.comandadigitalwebservice.ComandaDigitalWebService.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import br.com.comandadigitalwebservice.ComandaDigitalWebService.entity.Estabelecimento;
import br.com.comandadigitalwebservice.ComandaDigitalWebService.entity.Produto;
import br.com.comandadigitalwebservice.ComandaDigitalWebService.repository.interfaces.ProdutoRepository;
import br.com.comandadigitalwebservice.ComandaDigitalWebService.service.ProdutoService;

@Service
public class ProdutoServiceImpl implements ProdutoService{


	@Autowired
	private ProdutoRepository repositorio;
	
}
