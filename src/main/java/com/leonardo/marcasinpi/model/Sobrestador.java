package com.leonardo.marcasinpi.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

import javax.persistence.*;

@Entity
@Component
@Getter
@Setter
public class Sobrestador {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column(name = "processo_sobrestador")
	private String processoSobrestador;
	
	@Column(name = "marca")
	private String marca;
	
	@ManyToOne
	private Processo processo;

	
	
}
