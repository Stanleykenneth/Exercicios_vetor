import java.util.Scanner;

/*

  2 - Crei um programa que lê 6 valores inteiros e, em seguida, mostre na tela os valores lidos.
  
*/
public class Exercicio02 {
	
	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		int[] numeros = new int[6];

		System.out.println("Digite 6 números inteiros:\n");
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = ler.nextInt();
		}

		System.out.println("Os números digitados foram: ");
		for (int numero : numeros) {
			System.out.print(numero + ", ");

			ler.close();
		}

	}
}
