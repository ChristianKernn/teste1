package veiculo;

public class Carro implements IVeiculo {
	public int qtdPassageiros;
	private boolean isEstacionado;

	@Override
	public String buzinar() {
		return "fon";
	}

	@Override
	public boolean estacionar() {
		if(!isEstacionado) return true;
		return false;
	}
}
