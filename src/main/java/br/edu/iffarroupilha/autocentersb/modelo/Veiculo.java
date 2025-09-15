package br.edu.iffarroupilha.autocentersb.modelo;

import jakarta.persistence.*;
import lombok.*;

@Builder
@AllArgsConstructor
@Getter
@Setter
@Entity
@NoArgsConstructor
public class Veiculo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idveiculo;
    @Column(unique = true,  nullable = false,  length = 7)
    private String placa;
    private String modelo;

    @ManyToOne
    @JoinColumn(name = "idcliente", nullable = false)
    private Cliente cliente;

}
