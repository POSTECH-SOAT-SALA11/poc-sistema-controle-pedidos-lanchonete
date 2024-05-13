package br.com.fiap.grupo25.sistemacontrolepedidoslanchoneteapp.application.controller;

import br.com.fiap.grupo25.sistemacontrolepedidoslanchoneteapp.application.usecase.CadastrarClienteUseCase;
import br.com.fiap.grupo25.sistemacontrolepedidoslanchoneteapp.domain.model.Cliente;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/clientes")
public class ClienteController {
    private CadastrarClienteUseCase cadastrarClienteUseCase;

    public ClienteController(CadastrarClienteUseCase cadastrarClienteUseCase) {
        this.cadastrarClienteUseCase = cadastrarClienteUseCase;
    }

    @PostMapping
    public ResponseEntity<Void> cadastrarCliente(@RequestBody Cliente cliente) {
        cadastrarClienteUseCase.cadastrarCliente(cliente);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
}
