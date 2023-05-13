import java.util.Scanner;

/*
  7 - Escreva um programa que leia 10 inteiros e os armazene em um vetor.
      Imprima o vetor, o mior elemento e a posição que ele se encontra.  
*/
public class Exercicio07 {
	
public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		int[] vetor = new int[10];
	      
	      System.out.println("Digite 10 valores inteiros: ");
	      for (int i = 0; i < vetor.length; i++) {
	         vetor[i] = ler.nextInt();
	      }
	      
	      System.out.println("O vetor informado é:");
	      for (int i = 0; i < vetor.length; i++) {
	         System.out.print(vetor[i] + " ");
	      }
	      
	      int maior = vetor[0];
	      int posicao = 0;
	      
	      for (int i = 1; i < vetor.length; i++) {
	         if (vetor[i] > maior) {
	            maior = vetor[i];
	            posicao = i;
	         }
	      }
	      
	      System.out.println("\nO maior elemento do vetor é: " + maior);
	      System.out.println("Ele está na posição: " + posicao);
	      ler.close();
	}
}
