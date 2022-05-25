package com.leonardo.marcasinpi.repository;

import com.leonardo.marcasinpi.model.PalavraChave;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PalavraChaveRepositorio extends JpaRepository<PalavraChave, Long> {


	PalavraChave findByPalavraChaveAndUsuarioIdAndCodigoClasseNice(String palavraChave, Long id, String codigoClasseNice);
	
	List<PalavraChave> findAllByUsuarioId(Long id);
	
	List<PalavraChave> findAllByCodigoClasseNice(String codigoClasseNice);
	
}