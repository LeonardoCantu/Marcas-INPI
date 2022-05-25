package com.leonardo.marcasinpi.repository;

import com.leonardo.marcasinpi.model.ClasseNacional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ClasseNacionalRepositorio extends JpaRepository<ClasseNacional, Long>{
	
	public Optional<ClasseNacional> findByCodigoAndEspecificacao(String codigo, String especificacao);
	
}
