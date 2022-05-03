package com.leonardo.marcasinpi.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Component
@Getter
@Setter
public class Cedente {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "nome_razao_social")
	private String nomeRazaoSocial;
	
	@Column(name = "pais")
	private String pais;
	
	@Column(name = "uf")
	private String uf;
	
	@ManyToOne
	private Protocolo protocolo;

}
