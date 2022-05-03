package com.leonardo.marcasinpi.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

import javax.persistence.*;

@Entity
@Component
@Getter
@Setter
public class SubClasseNacional {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "codigo")
	private String codigo;

	@ManyToOne
	private ClasseNacional classeNacional;

}
