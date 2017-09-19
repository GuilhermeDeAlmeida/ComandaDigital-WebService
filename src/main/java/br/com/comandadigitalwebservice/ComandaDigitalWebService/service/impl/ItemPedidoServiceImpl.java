package br.com.comandadigitalwebservice.ComandaDigitalWebService.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import br.com.comandadigitalwebservice.ComandaDigitalWebService.repository.interfaces.ItemPedidoRepository;
import br.com.comandadigitalwebservice.ComandaDigitalWebService.service.ItemPedidoService;

@Service
public class ItemPedidoServiceImpl implements ItemPedidoService{

	@Autowired
	private ItemPedidoRepository repositorio;
}
