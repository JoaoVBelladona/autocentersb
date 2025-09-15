package br.edu.iffarroupilha.autocentersb.modelo.service;

import br.edu.iffarroupilha.autocentersb.modelo.Cliente;
import br.edu.iffarroupilha.autocentersb.modelo.ClienteRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService {

    private ClienteRepository clienteRepository;

    public ClienteService(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    public Cliente salvar(Cliente cliente){
        return this.clienteRepository.save(cliente);
    }

    public List<Cliente> buscarTodos(){
        return this.clienteRepository.findAll();
    }

}
