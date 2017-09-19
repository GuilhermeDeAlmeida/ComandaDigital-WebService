package br.com.comandadigitalwebservice.ComandaDigitalWebService.repository.interfaces;

import org.springframework.data.repository.CrudRepository;

import br.com.comandadigitalwebservice.ComandaDigitalWebService.entity.Estabelecimento;
import br.com.comandadigitalwebservice.ComandaDigitalWebService.entity.Produto;

public interface ProdutoRepository extends CrudRepository<Produto, Long>{

}
