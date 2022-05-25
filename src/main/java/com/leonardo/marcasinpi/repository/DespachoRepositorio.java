package com.leonardo.marcasinpi.repository;

import com.leonardo.marcasinpi.model.Despacho;
import com.leonardo.marcasinpi.model.Processo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface DespachoRepositorio extends JpaRepository<Despacho, Long>{

	String queryNome = "SELECT d.*, p.revista_id "
			+ "FROM despacho d "
			+ "INNER JOIN processo p "
			+ "ON p.id = d.processo_id WHERE p.revista_id = (:revistaId) "
			+ "AND d.nome ilike (%:nome%)";

	String queryTextoComplementar = "SELECT d.*, p.revista_id "
			+ "FROM despacho d "
			+ "INNER JOIN processo p "
			+ "ON p.id = d.processo_id WHERE p.revista_id = (:revistaId) "
			+ "AND d.texto_complementar ilike (%:textoComplementar%)";

	String queryTextoSobrestamento = "SELECT d.*, p.revista_id "
			+ "FROM despacho d "
			+ "INNER JOIN processo p "
			+ "ON p.id = d.processo_id WHERE p.revista_id = (:revistaId) "
			+ "AND d.texto_sobrestamento ilike (%:textoSobrestamento%)";
	
	String queryBuscaTodosDespachosPorProcessoId = "SELECT * FROM despacho WHERE processo_id = (:processoId)";

	Optional<Despacho> findByCodigoAndNomeAndTextoComplementarAndTextoSobrestamentoAndProcesso(String codigo,
			String nome, String textoComplementar, String textoSobrestamento, Processo processo);

	@Query(value = queryNome, nativeQuery = true)
	List<Despacho> findByNomeContainingIgnoreCase(@Param("nome") String palavraChave, @Param("revistaId") Long revistaId);

	@Query(value = queryTextoComplementar, nativeQuery = true)
	List<Despacho> findByTextoComplementarContainingIgnoreCase(@Param("textoComplementar") String palavraChave, @Param("revistaId") Long revistaId);

	@Query(value = queryTextoSobrestamento, nativeQuery = true)
	List<Despacho> findByTextoSobrestamentoContainingIgnoreCase(@Param("textoSobrestamento") String palavraChave, @Param("revistaId") Long revistaId);

	@Query(value = queryBuscaTodosDespachosPorProcessoId, nativeQuery = true)
	List<Despacho> findAllByProcessoId(@Param("processoId") Long processoId);
}
