package com.leonardo.marcasinpi.repository;

import com.leonardo.marcasinpi.model.Processo;
import com.leonardo.marcasinpi.model.Revista;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ProcessoRepositorio extends JpaRepository<Processo, Long> {


	String queryMarca = "SELECT p.*, m.* "
			+ "FROM processo p "
			+ "INNER JOIN marca m "
			+ "ON p.marca_id = m.id "
			+ "WHERE m.id = (:marcaId) "
			+ "AND " +
            "p.revista_id = (:revistaId)";

	String queryNumeroProcesso = "SELECT * FROM processo "
            + "WHERE numero = (:numeroProcesso) "
            + "AND " +
            "revista_id = (:revistaId)";

	@Query(value = queryMarca, nativeQuery = true)
	List<Processo> findByMarca(@Param("marcaId") Long marcaId, @Param("revistaId") Long revistaId);

	@Query(value = queryNumeroProcesso, nativeQuery = true)
    List<Processo> findAllByNumeroAndRevistaId(@Param("numeroProcesso") String numeroProcesso, @Param("revistaId") Long revistaId);

    Optional<Processo> findByNumeroAndRevista(String numero, Revista revista);
    List<Processo> findAllByRevista(Optional<Revista> revista);
}
