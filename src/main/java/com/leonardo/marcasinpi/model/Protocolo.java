package com.leonardo.marcasinpi.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Component
@Getter
@Setter
public class Protocolo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "numero")
	private String numero;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "data")
	private Date data;
	
	@Column(name = "codigo_servico")
	private String codigoServico;
	
	@Column(name = "procurador")
	private String procurador;
	
	@OneToMany(mappedBy = "protocolo")
	private List<Cedente> cedente;
	
	@OneToMany(mappedBy = "protocolo")
	private List<Cessionario> cessionario;
	
	@OneToOne
	private Requerente requerente;	

	
}
