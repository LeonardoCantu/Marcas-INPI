package com.leonardo.marcasinpi.elements;

import com.example.converterxml.domain.validaxml.DateAdapter;
import org.springframework.stereotype.Component;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.util.Date;
import java.util.List;

@Component
@XmlRootElement(name = "protocolo")
public class ProtocoloElement {

	private String numero;
	
	private Date data;
	
	private String codigoServico;
	
	private String procurador;
	
	private List<CedenteElement> cedentes;
	
	private CedenteElement cedente;
	
	private List<CessionarioElement> cessionarios;
	
	private CessionarioElement cessionario;
	
	private RequerenteElement requerente;
	
	@XmlAttribute (name = "numero")
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	
	@XmlJavaTypeAdapter(value = DateAdapter.class)
	@XmlAttribute (name = "data")
	public Date getData() {
		return data;
	}
	
	public void setData(Date data) {
		this.data = data;
	}

	@XmlAttribute (name = "codigoServico")
	public String getCodigoServico() {
		return codigoServico;
	}
	
	public void setCodigoServico(String codigoServico) {
		this.codigoServico = codigoServico;
	}
	
	@XmlElement(name = "requerente")
	public RequerenteElement getRequerente() {
		return requerente;
	}
	
	public void setRequerente(RequerenteElement requerente) {
		this.requerente = requerente;
	}

	@XmlElement(name = "procurador")
	public String getProcurador() {
		return procurador;
	}    
        
	public void setProcurador(String procurador) {
		this.procurador = procurador;
	}

	@XmlElementWrapper(name = "cedentes")
	@XmlElement(name = "cedente")
	public List<CedenteElement> getCedentes() {
		return cedentes;
	}
	
	public void setCedentes(List<CedenteElement> cedentes) {
		this.cedentes = cedentes;
	}
	
	@XmlElement(name = "cedente")
	public CedenteElement getCedente() {
		return cedente;
	}
	
	public void setCedente(CedenteElement cedente) {
		this.cedente = cedente;
	}

	@XmlElementWrapper(name = "cessionarios")
	@XmlElement(name = "cessionario")
	public List<CessionarioElement> getCessionarios() {
		return cessionarios;
	}
	
	public void setCessionarios(List<CessionarioElement> cessionarios) {
		this.cessionarios = cessionarios;
	}
	
	@XmlElement(name = "cessionario")
	public CessionarioElement getCessionario() {
		return cessionario;
	}
	
	public void setCessionario(CessionarioElement cessionario) {
		this.cessionario = cessionario;
	}
}
