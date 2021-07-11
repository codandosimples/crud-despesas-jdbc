package br.com.codandosimples;

import br.com.codandosimples.dao.DespesaDAO;
import br.com.codandosimples.infra.ConnectionFactory;

import java.sql.Connection;
import java.sql.SQLException;

public class RemoverDespesa {

	public static void main(String[] args) throws SQLException {

		Connection connection = ConnectionFactory.getConnection();
		DespesaDAO dao = new DespesaDAO(connection);
		dao.delete(1L);

		connection.close();
	}
}
