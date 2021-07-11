package br.com.codandosimples;

import br.com.codandosimples.dao.DespesaDAO;
import br.com.codandosimples.infra.ConnectionFactory;
import br.com.codandosimples.model.Despesa;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Optional;

public class AtualizarDespesa {

	public static void main(String[] args) throws SQLException {
		Connection connection = ConnectionFactory.getConnection();

		DespesaDAO dao = new DespesaDAO(connection);
		Optional<Despesa> optional = dao.findById(1L);

		optional.ifPresent(it -> {
			it.setDescricao("Descrição atualizada");
			it.setValor(46);
			dao.update(it);
		});

		connection.close();
	}
}
