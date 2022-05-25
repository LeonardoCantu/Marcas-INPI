package com.leonardo.marcasinpi.repository;

import com.leonardo.marcasinpi.model.Processo;
import com.leonardo.marcasinpi.model.Titular;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface TitularRepositorio extends JpaRepository<Titular, Long>{

	Optional<Titular> findByNomeRazaoSocialAndPaisAndUfAndProcesso(String nomeRazaoSocial, String pais, String uf,
																   Processo processo);

}
