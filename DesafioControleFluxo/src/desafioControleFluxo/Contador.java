package desafioControleFluxo;

import java.util.Scanner;

public class Contador {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite o primeiro parâmetro: ");
		int parametroUm = scanner.nextInt();
		System.out.println("Digite o segundo parâmetro: ");
		int parametroDois = scanner.nextInt();

		try {
			contar(parametroUm, parametroDois);

		} catch (ParametrosInvalidosException exception) {
			exception.msgErro();
		}

	}

	static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
		if (parametroUm < parametroDois) {

			int contagem = parametroDois - parametroUm;

			for (int i = 0; i <= (parametroDois - parametroUm); i++) {
				System.out.println("Imprimindo o número "+i);
			}
		} else {
			new ParametrosInvalidosException().msgErro();
		}
	}
}
