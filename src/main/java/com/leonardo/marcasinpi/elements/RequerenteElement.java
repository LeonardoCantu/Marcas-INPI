package com.leonardo.marcasinpi.elements;

import org.springframework.stereotype.Component;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@Component
@XmlRootElement(name = "requerente")
public class RequerenteElement {

	private String nomeRazaoSocial;
	
	private String pais;
	
	private String uf;
	
	@XmlAttribute (name = "nome-razao-social")
	public String getNomeRazaoSocial() {
		return nomeRazaoSocial;
	}
	
	public void setNomeRazaoSocial(String nomeRazaoSocial) {
		this.nomeRazaoSocial = nomeRazaoSocial;
	}

	@XmlAttribute (name = "pais")
	public String getPais() {
		return pais;
	}
	
	public void setPais(String pais) {
		this.pais = pais;
	}

	@XmlAttribute (name = "uf")
	public String getUf() {
		return uf;
	}
	
	public void setUf(String uf) {
		this.uf = uf;
	}
}
