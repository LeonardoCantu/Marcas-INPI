package com.leonardo.marcasinpi.repository;

import com.leonardo.marcasinpi.model.Protocolo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ProtocoloRepositorio extends JpaRepository<Protocolo, Long>{

	Optional<Protocolo> findByNumero(String numero);

}
