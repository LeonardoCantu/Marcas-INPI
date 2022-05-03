package com.leonardo.marcasinpi.elements;

import com.example.converterxml.domain.validaxml.DateAdapter;
import org.springframework.stereotype.Component;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.util.Date;
import java.util.List;

@Component
@XmlRootElement(name = "revista")
public class RevistaElement {
   	
	private String numero;
	
	private Date data;

	private List<ProcessoElement> processo;
	
	@XmlAttribute (name = "numero")
	public String getNumero() {
		return numero;
	}
	
	public void setNumero(String numero) {
		this.numero = numero;
	}
	
	@XmlJavaTypeAdapter(value = DateAdapter.class)
	@XmlAttribute (name = "data")
	public Date getData(){
		return data;
	}
	
	
	public void setData(Date data) {
		this.data = data;
	}

	@XmlElement(name = "processo")
	public List<ProcessoElement> getProcesso() {
		return processo;
	}
	
	public void setProcesso(List<ProcessoElement> processo) {
		this.processo = processo;
	}
} 


