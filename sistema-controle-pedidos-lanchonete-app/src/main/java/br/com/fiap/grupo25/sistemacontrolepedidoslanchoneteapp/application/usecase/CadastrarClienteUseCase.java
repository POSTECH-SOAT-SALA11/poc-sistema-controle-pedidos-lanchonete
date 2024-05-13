package br.com.fiap.grupo25.sistemacontrolepedidoslanchoneteapp.application.usecase;

import br.com.fiap.grupo25.sistemacontrolepedidoslanchoneteapp.domain.model.Cliente;
import br.com.fiap.grupo25.sistemacontrolepedidoslanchoneteapp.domain.repository.ClienteRepository;
import org.springframework.stereotype.Component;

@Component
public class CadastrarClienteUseCase {
    private ClienteRepository clienteRepository;

    public CadastrarClienteUseCase(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    public void cadastrarCliente(Cliente cliente) {
        // Adicione validações de negócio aqui

        clienteRepository.salvar(cliente);
    }
}