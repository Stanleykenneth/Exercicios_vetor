import java.util.Scanner;

/*
  16 - Faça um programa que leia um vetor de 5 posições para números reais e,
       depois, um código inteiro. Se o código for zero, finalise o programa;
       se for 1, mostre o vetor na ordem direta; se for 2, mostre o vetor na orde
       inversa. Caso, o código for diferente de 1 e 2 escreva uma mensagem informando 
       que o códio é inválido. 
        * 
*/
public class Exercicio16 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		double[] vetor = new double[5]; // vetor para armazenar os valores

		// loop para ler os valores do vetor
		for (int i = 0; i < vetor.length; i++) {
			System.out.print("Digite o valor da posição " + i + ": ");
			vetor[i] = ler.nextDouble();
		}

		int codigo; // variável para armazenar o código digitado pelo usuário
		do {
			System.out.print("\nDigite o código:\n "
			               + " 1 para ordem direta.\n"
					       + " 2 para ordem inversa.\n"
					       + " 0 para sair): ");
			codigo = ler.nextInt();

			if (codigo == 1) {
				System.out.print("Vetor na ordem direta: ");
				for (int i = 0; i < vetor.length; i++) {
					System.out.print(vetor[i] + " ");
				}
				System.out.println();
			} else if (codigo == 2) {
				System.out.print("Vetor na ordem inversa: ");
				for (int i = vetor.length - 1; i >= 0; i--) {
					System.out.print(vetor[i] + " ");
				}
				System.out.println();
			} else if (codigo != 0) {
				System.out.println("Código inválido!");
			}
			System.out.println();
			ler.close();
		} while (codigo != 0);
	}
}
