package com.leonardo.marcasinpi.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

import javax.persistence.*;

@Entity
@Component
@Getter
@Setter
public class Marca {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "apresentacao")
	private String apresentacao;
	
	@Column(name = "natureza")
	private String natureza;
	
	@Column(name = "nome")
	private String nome;

	
}
