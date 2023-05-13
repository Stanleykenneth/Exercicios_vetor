import java.util.Scanner;

/*
 3 - Ler um conjunto de números reais, armazenando-os em vetor e calcular o quadrado dos
     componetes desse vetor, armazenando em outro vetor. Os conjuntos têm 10 elementos cada.
     Imprimir todos os conjuntos.            
*/
public class Exercicio03 {
	
	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		double[] numeros = new double[10];
		double[] quadrados = new double[10];

		System.out.println("Digite 10 números reais: ");
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = ler.nextDouble();
			quadrados[i] = numeros[i] * numeros[i];
		}

		System.out.println("Números digitados: ");
		for (double numero : numeros) {
			System.out.print(numero + ", ");
		}

		System.out.println("\nQuadrados dos números: ");
		for (double quadrado : quadrados) {
			System.out.print(quadrado + ", ");

			ler.close();
		}
	}
}
