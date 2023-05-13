import java.util.Scanner;

/*
  6 - Faça um programa que receba do usuário um vetor com 10 posições.
      Em seguida deverá ser impresso o Maior e Menor elemento do vetor. 
*/
public class Exercicio06 {
	
public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in); 
		int vetor[] = new int[10];
		
//		System.out.println("Digite 10 valores:\n");
//		for(int i = 0; i < vetor.length; i++ ) {
//			vetor[i] = ler.nextInt();
//		}
//		System.out.println("O Maior elemento do vetor é: " + vetor[9]);
//		System.out.println("O Menor elemento do vetor é: " + vetor[0]);
		
		      
	      System.out.println("Digite 10 valores inteiros: ");
	      for (int i = 0; i < vetor.length; i++) {
	         vetor[i] = ler.nextInt();
	      }
	      
	      int maior = vetor[0];
	      int menor = vetor[0];
	      
	      for (int i = 1; i < vetor.length; i++) {
	         if (vetor[i] > maior) {
	            maior = vetor[i];
	         }
	         if (vetor[i] < menor) {
	            menor = vetor[i];
	         }
	      }
	      
	      System.out.println("O maior elemento do vetor é: " + maior);
	      System.out.println("O menor elemento do vetor é: " + menor);
	      
	      ler.close();
	   }
}
