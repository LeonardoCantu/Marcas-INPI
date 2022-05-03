package com.leonardo.marcasinpi.model;

import com.leonardo.marcasinpi.model.Usuario;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.util.Date;

@Entity
@Component
@Getter
@Setter
public class ProcessoVerificado { 
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "numero_processo")
	private String numeroProcesso;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "data_verificacao")
	private Date dataVerificacao;
	
	@OneToOne
	private Usuario usuario;

} 


