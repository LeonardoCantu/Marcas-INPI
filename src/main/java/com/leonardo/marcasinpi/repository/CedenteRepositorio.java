package com.leonardo.marcasinpi.repository;


import com.leonardo.marcasinpi.model.Cedente;
import com.leonardo.marcasinpi.model.Protocolo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CedenteRepositorio extends JpaRepository<Cedente, Long>{

	Optional<Cedente> findByNomeRazaoSocialAndPaisAndUfAndProtocolo(String nomeRazaoSocial, String pais, String uf,
			Protocolo protocolo);

}
