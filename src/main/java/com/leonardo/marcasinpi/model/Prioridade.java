package com.leonardo.marcasinpi.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.util.Date;

@Entity
@Component
@Getter
@Setter
public class Prioridade {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "data")
	private Date data;
	
	@Column(name = "numero")
	private String numero;
	
	@Column(name = "pais")
	private String pais;
	
	@ManyToOne
	private Processo processo;
	

}
