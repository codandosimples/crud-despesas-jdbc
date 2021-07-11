package br.com.codandosimples;

import br.com.codandosimples.dao.DespesaDAO;
import br.com.codandosimples.infra.ConnectionFactory;
import br.com.codandosimples.model.Categoria;
import br.com.codandosimples.model.Despesa;

import java.sql.Connection;
import java.sql.SQLException;
import java.time.LocalDate;

public class CriarDespesa {

	public static void main(String[] args) throws SQLException {

		Connection connection = ConnectionFactory.getConnection();

		Despesa despesa =
				new Despesa(
						"Compra no supermercado",
						LocalDate.of(2021, 5, 10),
						95.0,
						Categoria.ALIMENTACAO);

		DespesaDAO dao = new DespesaDAO(connection);
		dao.save(despesa);

		connection.close();
	}
}
