package com.leonardo.marcasinpi.repository;

import com.leonardo.marcasinpi.model.ClasseVienna;
import com.leonardo.marcasinpi.model.Processo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ClasseViennaRepositorio extends JpaRepository<ClasseVienna, Long>{

	Optional<ClasseVienna> findByCodigoAndEdicaoAndProcesso(String codigo, String edicao, Processo processo);

}
