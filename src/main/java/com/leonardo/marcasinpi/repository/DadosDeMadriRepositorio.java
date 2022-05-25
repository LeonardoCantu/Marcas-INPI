package com.leonardo.marcasinpi.repository;

import com.leonardo.marcasinpi.model.DadosDeMadri;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface DadosDeMadriRepositorio extends JpaRepository<DadosDeMadri, Long>{

	public Optional<DadosDeMadri> findByNumeroInscricaoInternacional(String numeroInscricaoInternacional);
	
}
