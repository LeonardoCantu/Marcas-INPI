package com.leonardo.marcasinpi.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.util.List;

@Entity
@Component
@Getter
@Setter
public class ClasseNacional {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(name = "codigo")
	private String codigo;
	
	@Column(name = "especificacao")
	@Size(max=1000000)
	private String especificacao;
	
	@OneToMany(mappedBy = "classeNacional")
	private List<SubClasseNacional> subClasseNacional;
	
}
