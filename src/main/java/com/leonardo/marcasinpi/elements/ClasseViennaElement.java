package com.leonardo.marcasinpi.elements;

import org.springframework.stereotype.Component;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@Component
@XmlRootElement(name = "classe-vienna")
public class ClasseViennaElement {
	
	private String codigo;
	
	private String edicao;
	
	@XmlAttribute (name = "codigo")
	public String getCodigo() {
		return codigo;
	}
	
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	
	@XmlAttribute (name = "edicao")
	public String getEdicao() {
		return edicao;
	}
	
	public void setEdicao(String edicao) {
		this.edicao = edicao;
	}
}
