package com.leonardo.marcasinpi.elements;

import org.springframework.stereotype.Component;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@Component
@XmlRootElement(name = "classe-nice")
public class ClasseNiceElement {
	
	private String codigo;
	
	private String especificacao;
	
	private String traducaoEspecificacao;
	
	private String status;
	
	@XmlAttribute (name = "codigo")
	public String getCodigo() {
		return codigo;
	}
	
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	@XmlElement(name = "especificacao")
	public String getEspecificacao() {
		return especificacao;
	}
	
	public void setEspecificacao(String especificacao) {
		this.especificacao = especificacao;
	}
	
	@XmlElement(name = "traducao-especificacao")
	public String getTraducaoEspecificacao() {
		return traducaoEspecificacao;
	}
	
	public void setTraducaoEspecificacao(String traducaoEspecificacao) {
		this.traducaoEspecificacao = traducaoEspecificacao;
	}
	
	@XmlElement(name = "status")
	public String getStatus() {
		return status;
	}
	
	public void setStatus(String status) {
		this.status = status;
	}
}
