package br.com.caelum.cdcreact.daos;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.caelum.cdcreact.models.Cliente;

@Repository
public interface ClienteDAO extends CrudRepository<Cliente, Integer>{

}
