package br.com.caelum.cdcreact.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.caelum.cdcreact.controllers.forms.ClienteForm;

import br.com.caelum.cdcreact.daos.ClienteDAO;

import br.com.caelum.cdcreact.models.Cliente;

@RestController
@RequestMapping("/api/clientes")
@CrossOrigin
public class ClienteController {
	@Autowired
	private ClienteDAO clienteDAO;

	@RequestMapping(consumes=MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.POST)
	public Iterable<Cliente> salva(@Valid @RequestBody ClienteForm autorForm) {		
		clienteDAO.save(autorForm.build());
		//forçando o retorno ser a lista só para não ficar preso no lance dos redirect e cors do navegador
		return lista();
	}
	
	@RequestMapping(method = RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE)
	public Iterable<Cliente> lista() {
		return clienteDAO.findAll();
	}
}
