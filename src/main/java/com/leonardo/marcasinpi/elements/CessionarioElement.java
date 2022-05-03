package com.leonardo.marcasinpi.elements;

import org.springframework.stereotype.Component;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@Component
@XmlRootElement(name = "cessionario")
public class CessionarioElement {
	
	private String nomeRazaoSocial;

	@XmlAttribute (name = "nome-razao-social")
	public String getNomeRazaoSocial() {
		return nomeRazaoSocial;
	}

	public void setNomeRazaoSocial(String nomeRazaoSocial) {
		this.nomeRazaoSocial = nomeRazaoSocial;
	}	
}
