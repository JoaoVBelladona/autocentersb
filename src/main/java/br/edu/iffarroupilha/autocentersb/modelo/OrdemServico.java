package br.edu.iffarroupilha.autocentersb.modelo;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.Date;

@Builder
@AllArgsConstructor
@Getter
@Setter
@Entity
@NoArgsConstructor

public class OrdemServico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long numeroOrdem;

    @ManyToOne
    @JoinColumn(name = "id_veiculo", nullable = false)
    private Veiculo veiculo;

    @ManyToOne
    @JoinColumn(name = "id_servico", nullable = false)
    private Servico servico;

    private double valortotal;

    @Column(nullable = false)
    private LocalDate data;


}
