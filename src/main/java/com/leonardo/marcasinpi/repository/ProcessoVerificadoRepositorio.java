package com.leonardo.marcasinpi.repository;

import com.leonardo.marcasinpi.model.ProcessoVerificado;
import com.leonardo.marcasinpi.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProcessoVerificadoRepositorio  extends JpaRepository<ProcessoVerificado, Long>{

	List<ProcessoVerificado> findAllByUsuario(Usuario usuario);

	List<ProcessoVerificado> findAllByUsuarioId(Long id);
	
	ProcessoVerificado findByNumeroProcessoAndUsuario(String numeroProcesso, Usuario usuario);

}
