package pe.company.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import pe.company.db.MySQLConnection;
import pe.company.model.Cliente;

public class ClienteDAO {

	private Connection conn;
	private PreparedStatement ps;
	private ResultSet rs;

	public List<Cliente> listarClientes() {
		List<Cliente> lista = new ArrayList<>();

		try {
			conn = MySQLConnection.MySQLgetConnection();
			ps = conn.prepareStatement("select * from cliente");
			rs = ps.executeQuery();

			while (rs.next()) {
				Cliente cliente = new Cliente(rs.getInt("id_cliente"), rs.getString("empresa"),
						rs.getString("vendedor"), rs.getDouble("credito"));
				lista.add(cliente);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return lista;
	}
}