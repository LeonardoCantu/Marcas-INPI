package com.leonardo.marcasinpi.elements;

import org.springframework.stereotype.Component;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@Component
@XmlRootElement(name= "despacho")
public class DespachoElement {
	
	private String codigo;
	
	private String nome;
	
	private String textoComplementar;
	
	private String textoSobrestamento;

	private ProtocoloElement protocolo;

	@XmlAttribute (name = "codigo")
	public String getCodigo() {
		return codigo;
	}
	
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	
	@XmlAttribute (name = "nome")
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	@XmlElement(name = "texto-complementar")
	public String getTextoComplementar() {
		return textoComplementar;
	}
	public void setTextoComplementar(String textoComplementar) {
		this.textoComplementar = textoComplementar;
	}
	
	@XmlElement(name = "protocolo")
	public ProtocoloElement getProtocolo() {
		return protocolo;
	}
	
	public void setProtocolo(ProtocoloElement protocolo) {
		this.protocolo = protocolo;
	}
	
	@XmlElement(name = "texto-sobrestamento")
	public String getTextoSobrestamento() {
		return textoSobrestamento;
	}

	public void setTextoSobrestamento(String textoSobrestamento) {
		this.textoSobrestamento = textoSobrestamento;
	}

}
