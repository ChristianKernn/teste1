package veiculo;

public class Caminhao implements IVeiculo {
	public float carga;
	private boolean isEstacionado;

	@Override
	public String buzinar() {
		return "foooooooooooooooooooooon";
	}

	@Override
	public boolean estacionar() {
		if(!isEstacionado) return true;
		return false;
	}
	
}
