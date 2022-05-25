package com.leonardo.marcasinpi.repository;

import com.leonardo.marcasinpi.model.TagNula;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface TagNulaRepositorio extends JpaRepository<TagNula, Long>{

	Optional<TagNula> findByNumeroProcesso(String numeroProcesso);
	
}
