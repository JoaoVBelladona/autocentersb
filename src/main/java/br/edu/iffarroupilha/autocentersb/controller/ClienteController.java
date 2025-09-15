package br.edu.iffarroupilha.autocentersb.controller;

import br.edu.iffarroupilha.autocentersb.modelo.Cliente;
import br.edu.iffarroupilha.autocentersb.modelo.service.ClienteService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class ClienteController {

    private ClienteService servico;

    public ClienteController(ClienteService servico) {
        this.servico = servico;
    }

    @GetMapping("/cliente")
    public String test(){
        Cliente teste  = new Cliente();
        teste.setNome("Cliente 001 - joao");
        teste.setCpf("12367890");
        teste.setTelefone("111");

        teste = servico.salvar(teste);

        return "deu certo "+teste.getIdcliente();
    }
}
