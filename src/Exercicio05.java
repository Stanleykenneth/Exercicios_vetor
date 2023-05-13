import java.util.Scanner;

/*
   5 - Leia um programa de 10 posições. Contar e ecrever quantos valores paras ele possui. 
*/
public class Exercicio05 {
	
	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		int numero[] = new int[10];
		int pares = 0;

		System.out.println("Digite 10 valores:\n");
		for (int i = 0; i < numero.length; i++) {
			numero[i] = ler.nextInt();
			if (numero[i] % 2 == 0) {
				pares++;
			}

		}

		System.out.println("O vetor possui " + pares + " valores pares.");
		ler.close();
	}
}
