package br.edu.iffarroupilha.autocentersb.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Builder @AllArgsConstructor @Getter @Setter @Entity @NoArgsConstructor


public class Servico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idservico;
    private String descricao;
    private double preco;


}
