package com.leonardo.marcasinpi.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
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
public class Revista { 
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "numero")
	private String numero;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "data")
	private Date data;
	
	@JsonIgnore
	@OneToMany(mappedBy = "revista")
	private List<Processo> processo;

} 


