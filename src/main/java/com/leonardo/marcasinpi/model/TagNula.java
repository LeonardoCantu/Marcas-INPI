package com.leonardo.marcasinpi.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.util.Date;

@Entity
@Component
@Getter
@Setter
public class TagNula {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column (name = "numeroProcesso")
	private String numeroProcesso;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column (name = "data")
	private Date data;
	
	@Column (name = "tagXml")
	@Size(max=1000000)
	private String tagXml;


	
}
