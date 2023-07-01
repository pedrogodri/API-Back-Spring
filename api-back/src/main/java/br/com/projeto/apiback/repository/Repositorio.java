package br.com.projeto.apiback.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.projeto.apiback.model.Cliente;

public interface Repositorio extends CrudRepository<Cliente, Long>{
    
}