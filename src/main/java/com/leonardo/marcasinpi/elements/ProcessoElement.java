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
@XmlRootElement(name = "processo")
public class ProcessoElement {

	private String numero;

	private String apostila;

	private DadosDeMadriElement dadosDeMadri;

	private String procurador;
	
	private Date dataDeposito;
	
	private Date dataConcessao;
	
	private Date dataVigencia;
	
	private MarcaElement marca;

	private ClasseNacionalElement classeNacional;
	
	private List<SobrestadorElement> sobrestadores;

	private List<DespachoElement> despachos;

	private List<TitularElement> titulares;

	private List<ClasseViennaElement> classesVienna;

	private List<ClasseNiceElement> listaClasseNice;

	private List<PrioridadeElement> prioridadeUnionista;

	@XmlElementWrapper(name = "despachos")
	@XmlElement(name = "despacho")
	public List<DespachoElement> getDespachos() {
		return despachos;
	}

	@XmlAttribute(name = "numero")
	public String getNumero() {
		return numero;
	}
	
	@XmlJavaTypeAdapter(value = DateAdapter.class)
	@XmlAttribute (name = "data-deposito")
	public Date getDataDeposito() {
		return dataDeposito;
	}

	public void setDataDeposito(Date dataDeposito) {
		this.dataDeposito = dataDeposito;
	}

	@XmlJavaTypeAdapter(value = DateAdapter.class)
	@XmlAttribute (name = "data-concessao")
	public Date getDataConcessao() {
		return dataConcessao;
	}

	public void setDataConcessao(Date dataConcessao) {
		this.dataConcessao = dataConcessao;
	}

	@XmlJavaTypeAdapter(value = DateAdapter.class)
	@XmlAttribute (name = "data-vigencia")
	public Date getDataVigencia() {
		return dataVigencia;
	}

	public void setDataVigencia(Date dataVigencia) {
		this.dataVigencia = dataVigencia;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public void setDespachos(List<DespachoElement> despachos) {
		this.despachos = despachos;
	}

	@XmlElementWrapper(name = "titulares")
	@XmlElement(name = "titular")
	public List<TitularElement> getTitulares() {
		return titulares;
	}

	public void setTitulares(List<TitularElement> titulares) {
		this.titulares = titulares;
	}

	@XmlElement(name = "procurador")
	public String getProcurador() {
		return procurador;
	}

	public void setProcurador(String procurador) {
		this.procurador = procurador;
	}

	@XmlElementWrapper(name = "sobrestadores")
	@XmlElement(name = "sobrestador")
	public List<SobrestadorElement> getSobrestadores() {
		return sobrestadores;
	}

	public void setSobrestadores(List<SobrestadorElement> sobrestadores) {
		this.sobrestadores = sobrestadores;
	}

	@XmlElement(name = "marca")
	public MarcaElement getMarca() {
		return marca;
	}

	public void setMarca(MarcaElement marca) {
		this.marca = marca;
	}

	@XmlElement(name = "classe-nacional")
	public ClasseNacionalElement getClasseNacional() {
		return classeNacional;
	}

	public void setClasseNacional(ClasseNacionalElement classeNacional) {
		this.classeNacional = classeNacional;
	}

	@XmlElementWrapper(name = "classes-vienna")
	@XmlElement(name = "classe-vienna")
	public List<ClasseViennaElement> getClassesVienna() {
		return classesVienna;
	}

	public void setClassesVienna(List<ClasseViennaElement> classesVienna) {
		this.classesVienna = classesVienna;
	}

	@XmlElementWrapper(name = "lista-classe-nice")
	@XmlElement(name = "classe-nice")
	public List<ClasseNiceElement> getListaClasseNice() {
		return listaClasseNice;
	}

	public void setListaClasseNice(List<ClasseNiceElement> listaClasseNice) {
		this.listaClasseNice = listaClasseNice;
	}

	@XmlElementWrapper(name = "prioridade-unionista")
	@XmlElement(name = "prioridade")
	public List<PrioridadeElement> getPrioridadeUnionista() {
		return prioridadeUnionista;
	}

	public void setPrioridadeUnionista(List<PrioridadeElement> prioridadeUnionista) {
		this.prioridadeUnionista = prioridadeUnionista;
	}

	@XmlElement(name = "dados-de-madri")
	public DadosDeMadriElement getDadosDeMadri() {
		return dadosDeMadri;
	}

	public void setDadosDeMadri(DadosDeMadriElement dadosDeMadri) {
		this.dadosDeMadri = dadosDeMadri;
	}

	@XmlElement(name = "apostila")
	public String getApostila() {
		return apostila;
	}

	public void setApostila(String apostila) {
		this.apostila = apostila;
	}
}