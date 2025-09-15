package br.edu.iffarroupilha.autocentersb.modelo;

import jakarta.persistence.*;
import lombok.*;

@Builder @AllArgsConstructor @Getter @Setter @Entity @NoArgsConstructor


public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idcliente;

    @Column(nullable = false, length = 11)
    private String cpf;

    @Column(nullable = false)
    private String nome;

    @Column(length = 11)
    private String telefone;

}
