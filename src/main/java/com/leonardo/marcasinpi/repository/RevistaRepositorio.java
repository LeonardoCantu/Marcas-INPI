package com.leonardo.marcasinpi.repository;

import com.leonardo.marcasinpi.model.Revista;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface RevistaRepositorio extends JpaRepository<Revista, Long> {

	@Query(value = "select max(r) from Revista r")
	List<Revista> find();
	
	
	List<Revista> findAll();

	
}
