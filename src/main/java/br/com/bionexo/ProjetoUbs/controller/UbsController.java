package br.com.bionexo.ProjetoUbs.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.bionexo.ProjetoUbs.models.Ubs;
import br.com.bionexo.ProjetoUbs.service.UbsService;

@RestController
@RequestMapping("/ubs")
public class UbsController {
	
	@Autowired
	private UbsService ubsService;
	
	@GetMapping(value = "/{id}")
	public Optional<Ubs> findById(@PathVariable Long id){
		return ubsService.findId(id);
	}
	
	
	
	
	
}
