package com.leonardo.marcasinpi.repository;

import com.leonardo.marcasinpi.model.Cessionario;
import com.leonardo.marcasinpi.model.Protocolo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface CessionarioRepositorio extends JpaRepository<Cessionario, Long>{

	Optional<Cessionario> findByNomeRazaoSocialAndProtocolo(String nomeRazaoSocial, Protocolo protocolo);
	
}
