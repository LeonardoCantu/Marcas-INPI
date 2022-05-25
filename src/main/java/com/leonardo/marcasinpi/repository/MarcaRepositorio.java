package com.leonardo.marcasinpi.repository;

import com.leonardo.marcasinpi.model.Marca;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

@Repository
public interface MarcaRepositorio extends JpaRepository<Marca, Long>{

	String queryNome = "SELECT m.* , p.revista_id "
			+ "FROM marca m "
			+ "INNER JOIN processo p "
			+ "ON p.marca_id = m.id "
			+ "WHERE m.nome ilike (:nome%)  "
			+ "AND p.revista_id = (:revistaId)";

	public List<Marca> findByApresentacaoAndNatureza(String apresentacao, String natureza);

	public Optional<Marca> findByApresentacaoAndNaturezaAndNome(String apresentacao, String natureza, String nome);


	@Query(value = queryNome, nativeQuery = true)
	public Collection<? extends Marca> findByNomeContainingIgnoreCase(@Param("nome") String numeroProcesso, @Param("revistaId") Long revistaId);

}
