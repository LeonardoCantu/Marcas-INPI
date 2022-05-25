package com.leonardo.marcasinpi.repository;

import com.leonardo.marcasinpi.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UsuarioRepositorio extends JpaRepository<Usuario, Long> {
	
	Usuario findByNomeAndEmpresa(String nome, String empresa);
	
	Optional<Usuario> findByEmailIgnoreCaseAndPassword(String email, String password);

	Usuario findByEmail(String email);

}
