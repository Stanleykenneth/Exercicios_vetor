import java.util.Scanner;

/*
   9 - Crie um programa que lê 6 valores inteiros pares e em seguida
       mostre na tela os valores lidos na ordem inversa. 
*/
public class Exercicio09 {
	
	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		int[] valores = new int[6];

		System.out.println("Digite 6 valores inteiros pares:\n ");
		for (int i = 0; i < valores.length; i++) {
			int valor = ler.nextInt();
			while (valor % 2 != 0) {
				System.out.println("Valor inválido! Digite um valor par:\n");
				valor = ler.nextInt();
			}
			valores[i] = valor;
		}

		System.out.println("Valores lidos na ordem inversa:\n");
		for (int i = valores.length - 1; i >= 0; i--) {
			System.out.println(valores[i]);
		}
		ler.close();
	}
}
