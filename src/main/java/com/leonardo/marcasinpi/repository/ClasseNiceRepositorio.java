package com.leonardo.marcasinpi.repository;

import com.leonardo.marcasinpi.model.ClasseNice;
import com.leonardo.marcasinpi.model.Processo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ClasseNiceRepositorio extends JpaRepository<ClasseNice, Long>{

	Optional<ClasseNice> findByCodigoAndEspecificacaoAndStatusAndProcesso(String codigo, String especificacao,
																			String status, Processo processo);

	List<ClasseNice> findAllByProcesso(Processo processo);

}
