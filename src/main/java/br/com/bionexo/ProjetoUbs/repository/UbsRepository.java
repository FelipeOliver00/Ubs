package br.com.bionexo.ProjetoUbs.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.bionexo.ProjetoUbs.models.Ubs;

@Repository
public interface UbsRepository extends JpaRepository<Ubs, Long> {
	

}
