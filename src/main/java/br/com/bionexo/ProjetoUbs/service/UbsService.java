package br.com.bionexo.ProjetoUbs.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.bionexo.ProjetoUbs.models.Ubs;
import br.com.bionexo.ProjetoUbs.repository.UbsRepository;

@Service
public class UbsService {
	
	@Autowired
	private UbsRepository ubsRepository;
		
	public Optional<Ubs> findId(Long id) {
		return ubsRepository.findById(id);
	}
	
}
