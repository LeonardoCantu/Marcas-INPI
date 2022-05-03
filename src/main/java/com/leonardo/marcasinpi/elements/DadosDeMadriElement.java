package com.leonardo.marcasinpi.elements;

import com.example.converterxml.domain.validaxml.DateAdapter;
import org.springframework.stereotype.Component;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.util.Date;

@Component
@XmlRootElement(name = "dados-de-madri")
public class DadosDeMadriElement {
	
	private String numeroInscricaoInternacional; 

	private Date dataRecebimentoInpi;
		
	@XmlAttribute (name = "numero-inscricao-internacional")
	public String getNumeroInscricaoInternacional() {
		return numeroInscricaoInternacional;
	}
	
	public void setNumeroInscricaoInternacional(String numeroInscricaoInternacional) {
		this.numeroInscricaoInternacional = numeroInscricaoInternacional;
	}
	
	@XmlJavaTypeAdapter(value = DateAdapter.class)
	@XmlAttribute (name = "data-recebimento-inpi")
	public Date getDataRecebimentoInpi() {
		return dataRecebimentoInpi;
	}

	public void setDataRecebimentoInpi(Date dataRecebimentoInpi) {
		this.dataRecebimentoInpi = dataRecebimentoInpi;
	}
}
