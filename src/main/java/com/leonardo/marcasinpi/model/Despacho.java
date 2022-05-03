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
public class Despacho {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "codigo")
	private String codigo;
	
	@Column(name = "nome")
	private String nome;
	
	@Column(name = "texto_complementar")
	@Size(max=1000000)
	private String textoComplementar;
	
	@Column(name = "texto_sobrestamento")
	@Size(max=1000000)
	private String textoSobrestamento;
	
	@OneToOne
	private Protocolo protocolo;	
	
	@ManyToOne
	private Processo processo;

}
