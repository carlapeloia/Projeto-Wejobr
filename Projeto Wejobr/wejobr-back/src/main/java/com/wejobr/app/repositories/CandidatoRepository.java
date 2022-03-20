package com.wejobr.app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wejobr.app.entities.Candidato;

@Repository
public interface CandidatoRepository extends JpaRepository<Candidato, Long>{
	

}
