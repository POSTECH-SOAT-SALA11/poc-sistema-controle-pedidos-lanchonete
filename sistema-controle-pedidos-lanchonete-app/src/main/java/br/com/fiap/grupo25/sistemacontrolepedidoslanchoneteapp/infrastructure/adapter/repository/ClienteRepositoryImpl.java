package br.com.fiap.grupo25.sistemacontrolepedidoslanchoneteapp.infrastructure.adapter.repository;

import br.com.fiap.grupo25.sistemacontrolepedidoslanchoneteapp.domain.model.Cliente;
import br.com.fiap.grupo25.sistemacontrolepedidoslanchoneteapp.domain.repository.ClienteRepository;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class ClienteRepositoryImpl implements ClienteRepository {
    private final JdbcTemplate jdbcTemplate;

    public ClienteRepositoryImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public void salvar(Cliente cliente) {
        String sql = "INSERT INTO cliente (cpf, nome, email) VALUES (?, ?, ?)";
        jdbcTemplate.update(sql, cliente.getCpf(), cliente.getNome(), cliente.getEmail());
    }
}