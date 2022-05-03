package com.leonardo.marcasinpi.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

@Entity
@Component
@Getter
@Setter
public class Usuario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank
	@Column(name = "nome")
	private String nome;
	
	@NotBlank
	@Email
	@Column(name = "email")
	private String email;
	
	@NotBlank
	@Column(name = "password")
	private String password;
	
	@NotBlank
	@Column(name = "empresa")
	private String empresa;


}
