package Tela;
import java.util.ArrayList;
public class Clientes {
	private ArrayList<Cliente> clientesAtivos;

	public Clientes() {}
	
	public Clientes(ArrayList<Cliente> clientes) {
		
		clientesAtivos = new ArrayList<Cliente>();
	}

	public ArrayList<Cliente> getClientes() {
		return clientesAtivos;
	}

	public void setClientes(ArrayList<Cliente> clientes) {
		this.clientesAtivos = clientes;
	}
	public void AdicionarClientes(Cliente clientes) {
		this.clientesAtivos.add(clientes);		
	}
	public void RemoverClientes(Cliente clientes) {
		this.clientesAtivos.remove(clientes);
	}
	
}
