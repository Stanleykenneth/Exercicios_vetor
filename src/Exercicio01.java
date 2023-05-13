/*
  1 - Faça um programa que possua um vetordenominado A que armazene 6 números inteiros.
      O programa deve executar os seguintes passos:
      (a) Atribua os seguintes valores: 1, 0, 5, -2, -5, 7.
      (b) Armazene em uma variável inteira (simples) a soma entre os valores
          das posições A[0], A[1], A[5] do vetor e mostre na tela esta soma.
      (c) Modifique o vetor na posição 4, atribua a esta posição o valor 100.
      (d) Mostre na tela cada valor do vetor A, um em cada linha. 
*/

public class Exercicio01 {
	
public static void main(String[] args) {
		
		int A[] = { 1, 0, 5, -2, -5, 7};
		
		System.out.println("Resposta (A):");
		for (int i : A) {
			System.out.print( + i + ", ");
		}
		
		System.out.println();
		System.out.println();
		
		int soma;
		soma = A[0] + A[1] + A[5];
		System.out.println("Resposta (B):" + soma);
		
		System.out.println();
		
		A[4] = 100;
		System.out.println("Resposta (C):" + A[4]);
		
		System.out.println();
		
		System.out.println("Resposta (D):");
		for (int i : A) {			
			System.out.print( i + ", ");
		}
	}
}
