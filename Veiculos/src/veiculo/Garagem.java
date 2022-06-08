package veiculo;

import java.util.ArrayList;

public class Garagem {
	private ArrayList<IVeiculo> veiculos = new ArrayList<>();
	public int capacidade;
	
	public void listaVeiculos(){
		System.out.println(veiculos);
	}
	public boolean temVaga(){
		if(veiculos.size() >= capacidade) return false;
		return true;
	}
}