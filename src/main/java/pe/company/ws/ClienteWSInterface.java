package pe.company.ws;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

import pe.company.model.Cliente;

@WebService(name = "ClienteWSInterface", targetNamespace = "http://ws.company.pe/")
public interface ClienteWSInterface {

	@WebMethod(operationName = "listarClientes", action = "urn:ListarClientes")
	@RequestWrapper(className = "pe.company.ws.jaxws.ListarClientes", localName = "listarClientes", targetNamespace = "http://ws.company.pe/")
	@ResponseWrapper(className = "pe.company.ws.jaxws.ListarClientesResponse", localName = "listarClientesResponse", targetNamespace = "http://ws.company.pe/")
	@WebResult(name = "return")
	List<Cliente> listarClientes(@WebParam(name = "arg0") int limiteRegistros);

}