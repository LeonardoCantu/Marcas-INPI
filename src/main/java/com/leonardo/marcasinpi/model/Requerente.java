package com.leonardo.marcasinpi.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

import javax.persistence.*;

@Entity
@Component
@Getter
@Setter
public class Requerente {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "nome_razao_social")
	private String nomeRazaoSocial;
	
	@Column(name = "pais")
	private String pais;
	
	@Column(name = "uf")
	private String uf;

}
