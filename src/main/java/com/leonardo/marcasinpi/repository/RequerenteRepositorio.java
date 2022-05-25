package com.leonardo.marcasinpi.repository;

import com.leonardo.marcasinpi.model.Requerente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface RequerenteRepositorio extends JpaRepository<Requerente, Long>{

	Optional<Requerente> findByNomeRazaoSocialAndPais(String nomeRazaoSocial, String pais);

}
