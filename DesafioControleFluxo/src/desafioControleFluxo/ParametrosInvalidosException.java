package desafioControleFluxo;

public class ParametrosInvalidosException extends Exception {

	public void msgErro() {
		System.out.println("O segundo parâmetro deve ser maior que o primeiro");
	}

}
