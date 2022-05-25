package com.leonardo.marcasinpi.repository;

import com.leonardo.marcasinpi.model.Processo;
import com.leonardo.marcasinpi.model.Sobrestador;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface SobrestadorRepositorio extends JpaRepository<Sobrestador, Long>{

	String queryProcesso = "SELECT s.* , p.revista_id "
			+ "FROM sobrestador s "
			+ "INNER JOIN processo p "
			+ "ON p.id = s.processo_id "
			+ "WHERE  p.revista_id = (:revistaId) "
			+ "AND s.processo_sobrestador = (:numeroProcesso)";


	@Query(value = queryProcesso, nativeQuery = true)
	List<Sobrestador> findByProcessoSobrestador(@Param("numeroProcesso") String numeroProcesso, @Param("revistaId") Long revistaId);

	Optional<Sobrestador> findByProcessoSobrestadorAndProcesso(String processoSobrestador, Processo processo);
	
}
