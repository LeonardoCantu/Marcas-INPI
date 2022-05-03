package com.leonardo.marcasinpi.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity
@Component
@Getter
@Setter
public class ClasseNice {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "codigo")
	private String codigo;
	
	@Column(name = "especificacao")
	@Size(max=1000000)
	private String especificacao;
	
	@Column(name = "traducao_especificacao")
	@Size(max=1000000)
	private String traducaoEspecificacao;
	
	@Column(name = "status")
	private String status;
	
	@ManyToOne
	private Processo processo;

}
