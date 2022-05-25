package com.leonardo.marcasinpi.repository;

import com.leonardo.marcasinpi.model.RevistaReferenciada;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface RevistaReferenciadaRepositorio extends JpaRepository<RevistaReferenciada, Long> {

	@Query(value = "SELECT"
			+ " r.revista,"
			+ " r.id_usuario,"
			+ " min(r.id) as id,"
			+ " max(apresentacao_marca) as apresentacao_marca,"
			+ " max(despacho) as despacho,"
			+ " max(natureza_marca) as natureza_marca,"
			+ " max(palavra_chave) as palavra_chave,"
			+ "	max(nome_marca) as nome_marca,"
			+ "	max(processo) as processo,"
			+ "	max(processo_verificado) as processo_verificado"
			+ " FROM REVISTA_REFERENCIADA r where id_usuario = (:usuario) GROUP BY r.revista, r.id_usuario;", nativeQuery = true)
	List<RevistaReferenciada> findALLRevista(@Param("usuario") Long usuario);
	
	
	

	@Query(value = "SELECT"
			+ " r.revista,"
			+ " r.processo,"
			+ " r.id_usuario,"
			+ " min(r.id) as id,"
			+ " max(apresentacao_marca) as apresentacao_marca,"
			+ " max(despacho) as despacho,"
			+ " max(natureza_marca) as natureza_marca,"
			+ " max(palavra_chave) as palavra_chave,"
			+ "	max(nome_marca) as nome_marca,"
			+ "	max(processo_verificado) as processo_verificado"
			+ " FROM REVISTA_REFERENCIADA r where revista = (:revista) and id_usuario = (:usuario) GROUP BY r.revista, r.processo, r.id_usuario;", nativeQuery = true)
	List<RevistaReferenciada> findallProcessosByRevista(@Param("revista") String revista,@Param("usuario") Long usuario);
	
}
