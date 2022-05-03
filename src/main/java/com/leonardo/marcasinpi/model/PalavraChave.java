package com.leonardo.marcasinpi.model;


import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
@Component
@Getter
@Setter
public class PalavraChave {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank
	@Column(name = "palavra_chave")
	private String palavraChave;
	
	@NotBlank
	@Column(name = "codigo_classe_nice")
	private String codigoClasseNice;
	
	@OneToOne
	private Usuario usuario;

}
