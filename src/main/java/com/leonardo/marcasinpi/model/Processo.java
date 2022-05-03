package com.leonardo.marcasinpi.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Component
@Getter
@Setter
public class Processo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "numero")
    private String numero;

    @Column(name = "apostila")
    private String apostila;

    @OneToOne
    private DadosDeMadri dadosDeMadri;

    @Column(name = "procurador")
    private String procurador;

    @Temporal(TemporalType.DATE)
    @Column(name = "data_deposisto")
    private Date dataDeposito;

    @Temporal(TemporalType.DATE)
    @Column(name = "data_concessao")
    private Date dataConcessao;

    @Temporal(TemporalType.DATE)
    @Column(name = "data_vigencia")
    private Date dataVigencia;

    @OneToOne
    private Marca marca;

    @OneToOne
    private ClasseNacional classeNacional;

    @JsonIgnore
    @OneToMany(mappedBy = "processo")
    private List<Sobrestador> sobrestadores;

    @JsonIgnore
    @OneToMany(mappedBy = "processo")
    private List<Despacho> despachos;

    @JsonIgnore
    @OneToMany(mappedBy = "processo")
    private List<Titular> titulares;

    @JsonIgnore
    @OneToMany(mappedBy = "processo")
    private List<ClasseVienna> classesVienna;

    @JsonIgnore
    @OneToMany(mappedBy = "processo")
    private List<ClasseNice> listaClasseNice;

    @JsonIgnore
    @OneToMany(mappedBy = "processo")
    private List<Prioridade> prioridadeUnionista;

    @JsonIgnore
    @ManyToOne
    private Revista revista;

}