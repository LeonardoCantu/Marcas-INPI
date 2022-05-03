package com.leonardo.marcasinpi.elements;

import org.springframework.stereotype.Component;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@Component
@XmlRootElement(name = "classe-nacional")
public class ClasseNacionalElement {

	private String codigo;

	private String especificacao;

	private List<SubClasseNacionalElement> subClassesNacional;

	@XmlAttribute(name = "codigo")
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

	@XmlElementWrapper(name = "sub-classes-nacional")
	@XmlElement(name = "sub-classe-nacional")
	public List<SubClasseNacionalElement> getSubClassesNacional() {
		return subClassesNacional;
	}

	public void setSubClassesNacional(List<SubClasseNacionalElement> subClassesNacional) {
		this.subClassesNacional = subClassesNacional;
	}

}
