package com.leonardo.marcasinpi.repository;

import com.leonardo.marcasinpi.model.ClasseNacional;
import com.leonardo.marcasinpi.model.SubClasseNacional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface SubClasseNacionalRepositorio extends JpaRepository<SubClasseNacional, Long>{

	public Optional<SubClasseNacional> findByCodigoAndClasseNacional(String codigo, ClasseNacional classeNacional);

	public Optional<SubClasseNacional> findByCodigoAndClasseNacionalId(String codigo, Long id);
	
}
