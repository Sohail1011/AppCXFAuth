package pe.company.ws;

import java.util.List;
import java.util.stream.Collectors;

import javax.jws.WebService;

import pe.company.dao.ClienteDAO;
import pe.company.model.Cliente;

@WebService(targetNamespace = "http://ws.company.pe/", endpointInterface = "pe.company.ws.ClienteWSInterface", portName = "ClienteWSPort", serviceName = "ClienteWSService")
public class ClienteWS implements ClienteWSInterface {

	ClienteDAO clienteDAO = new ClienteDAO();

	public List<Cliente> listarClientes(int limiteRegistros) {
		List<Cliente> lista = clienteDAO.listarClientes();
		return lista.stream().limit(limiteRegistros).collect(Collectors.toList());
	}
}