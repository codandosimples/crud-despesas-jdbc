package br.com.codandosimples;

import br.com.codandosimples.dao.DespesaDAO;
import br.com.codandosimples.infra.ConnectionFactory;
import br.com.codandosimples.model.Despesa;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class ListarTodasDespesas {

	public static void main(String[] args) throws SQLException {

		Connection connection = ConnectionFactory.getConnection();

		DespesaDAO dao = new DespesaDAO(connection);
		List<Despesa> despesas = dao.findAll();

		for (Despesa despesa : despesas) {
			System.out.println("ID => " + despesa.getId());
			System.out.println("Data => " + despesa.getData());
			System.out.println("Descricao => " + despesa.getDescricao());
			System.out.println("Valor => " + despesa.getValor());
			System.out.println("Categoria => " + despesa.getCategoria());
		}

		connection.close();
	}
}
