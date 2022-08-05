package pe.company.model;

public class Cliente {

	private int id_cliente;
	private String empresa;
	private String vendedor;
	private double credito;

	public Cliente() {
	}

	public Cliente(int id_cliente, String empresa, String vendedor, double credito) {
		this.id_cliente = id_cliente;
		this.empresa = empresa;
		this.vendedor = vendedor;
		this.credito = credito;
	}

	public int getId_cliente() {
		return id_cliente;
	}

	public void setId_cliente(int id_cliente) {
		this.id_cliente = id_cliente;
	}

	public String getEmpresa() {
		return empresa;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}

	public String getVendedor() {
		return vendedor;
	}

	public void setVendedor(String vendedor) {
		this.vendedor = vendedor;
	}

	public double getCredito() {
		return credito;
	}

	public void setCredito(double credito) {
		this.credito = credito;
	}
}