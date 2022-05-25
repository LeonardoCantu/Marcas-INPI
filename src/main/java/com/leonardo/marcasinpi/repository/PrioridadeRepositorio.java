package com.leonardo.marcasinpi.repository;

import com.leonardo.marcasinpi.model.Prioridade;
import com.leonardo.marcasinpi.model.Processo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface PrioridadeRepositorio extends JpaRepository<Prioridade, Long>{

	Optional<Prioridade> findByNumeroAndProcesso(String numero, Processo processo);

}
