package com.leonardo.marcasinpi.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.util.Date;

@Entity
@Component
@Getter
@Setter
public class DadosDeMadri {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "numero_inscricao_internacional")
    private String numeroInscricaoInternacional;

    @Temporal(TemporalType.DATE)
    @Column(name = "data_recebimento_inpi")
    private Date dataRecebimentoInpi;


}
