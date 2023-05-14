import java.util.Scanner;

/*
  11 - Faça um programa que preencha um vetor com 10 números reais,
   	   calcule e mostre a quantidade de números negativos e a soma
   	   dos números positivos desse vetor.	
*/
public class Exercicio11 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		double[] numeros = new double[10]; // vetor para armazenar os números
		int negativos = 0; // contador para a quantidade de números negativos
		double positivos = 0; // variável para a soma dos números positivos

		// loop para ler os números e verificar se são positivos ou negativos
		for (int i = 0; i < numeros.length; i++) {
			System.out.print("Digite o " + (i + 1) + "º número:\n ");
			numeros[i] = ler.nextDouble();
			if (numeros[i] < 0) {
				negativos++;
			} else {
				positivos += numeros[i];
			}
		}
		ler.close();

		// exibir o resultado
		System.out.println("Quantidade de números negativos: " + negativos);
		System.out.println("Soma dos números positivos: " + positivos);

	}
}
