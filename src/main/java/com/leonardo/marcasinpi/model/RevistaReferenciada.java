package com.leonardo.marcasinpi.model;


import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

import javax.persistence.*;


@Entity
@Component
@Getter
@Setter
public class RevistaReferenciada { 
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "revista")
	private String revista;
	
	@Column(name = "processo")
	private String processo;
	
	@Column (name = "nome_marca")
	private String nomeMarca;
	
	@Column (name = "apresentacao_marca")
	private String apresentacaoMarca;
	
	@Column (name = "natureza_marca")
	private String naturezaMarca;
	
	@Column(name = "despacho")
	private String despacho;
	
	@Column(name = "palavra_chave")
	private String palavraChave;
	
	@Column(name = "processo_verificado")
	private String processoVerificado;
	
	@Column(name = "id_suario")
	private Long idUsuario;

	
} 


