package com.leonardo.marcasinpi.repository;

import com.leonardo.marcasinpi.model.PalavraParecida;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
public interface PalavraParecidaRepositorio extends JpaRepository<PalavraParecida, Long>{

	Collection<? extends PalavraParecida> findByNomeContainingIgnoreCase(String palavraChave);

	PalavraParecida findByNome(String nome);

}
