import java.util.Scanner;

/*
  17 - Leia um vetor de 10 posições e atribua valor 0 para todos os elementos que 
       possuime valores negativos.* 
*/

public class Exercicio17 {
	
	public static void main(String[] args) {

//		Scanner ler = new Scanner(System.in);
//		int vetor[] = new int[10];
//		
//		System.out.println("Digite os valores:\n");
//		for(int i = 0; i < vetor.length; i++) {
//			vetor[i] = ler.nextInt();
//			
//			while(i < 0) {
//				i = 0;
//			}
//		}
//		System.out.println(vetor );
//		ler.close();

		Scanner input = new Scanner(System.in);

		double[] vetor = new double[10]; // vetor para armazenar os valores

		// loop para ler os valores do vetor
		for (int i = 0; i < vetor.length; i++) {
			System.out.print("Digite o valor da posição " + i + ": ");
			vetor[i] = input.nextDouble();
		}

		// loop para atribuir valor 0 para os elementos negativos
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] < 0) {
				vetor[i] = 0;
			}
		}

		// mostra o vetor resultante
		System.out.print("Vetor resultante: ");
		for (int i = 0; i < vetor.length; i++) {
			System.out.print(vetor[i] + " ");
		} input.close();
	}
}
