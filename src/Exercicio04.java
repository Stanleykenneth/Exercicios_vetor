import java.util.Scanner;

/*
 4 - Faça um programa que leia um vetor de 8 posições e, em seguida, leia também
     dois valores X, Y quaiquer correspondentes a duas posições no vetor. Ao final
     seu programa deverá escrever a soma do valores nas respoctivas posições X e Y.  
*/
public class Exercicio04 {
	
	public static void main(String[] args) {
		
		 Scanner ler = new Scanner(System.in);
		 int[] vetor = new int[8];
	      
	      System.out.println("Digite os 8 valores do vetor:\n ");
	      for (int i = 0; i < vetor.length; i++) {
	         vetor[i] = ler.nextInt();
	      }
	      
	      System.out.println("Digite as posições X e Y (entre 0 e 7): ");
	      int x = ler.nextInt();
	      int y = ler.nextInt();
	      
	      int soma = vetor[x] + vetor[y];
	      System.out.println("A soma dos valores nas posições " + x + " e " + y + " é: " + soma);
		  
	      ler.close();
	}
}
