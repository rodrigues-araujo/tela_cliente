package Tela;
import java.util.ArrayList;
public class Transportadoras {
	private ArrayList<Transportadora> TranspAtivas;

	public Transportadoras(ArrayList<Transportadora> transpAtivas) {
	
		TranspAtivas = transpAtivas;
		transpAtivas = new ArrayList<Transportadora>();
	}
	public ArrayList<Transportadora> getTransportadoras() {
		return TranspAtivas;
	}

	public void setTransportadoras(ArrayList<Transportadora> transpAtivas) {
		TranspAtivas = transpAtivas;
	}
	
	public void AdicionarTransportadora(Transportadora TranspAtivas){
		this.TranspAtivas.add( TranspAtivas);
	}
	public void RemoverTransportadora(Transportadora transpAtivas) {
		this.TranspAtivas.remove(transpAtivas);
		
	}
}
