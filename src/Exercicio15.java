import java.util.Scanner;

/*
 15 - Leia um vetor com 20 números inteiros.Escreva os elementos do vetor
      eliminando repetidos.
*/
public class Exercicio15 {
	
	   public static void main(String[] args) {
	        Scanner ler = new Scanner(System.in);

	        int[] vetor = new int[20]; // vetor para armazenar os valores

	        // loop para ler os valores do vetor
	        for (int i = 0; i < vetor.length; i++) {
	            System.out.print("Digite o valor da posição " + i + ": ");
	            vetor[i] = ler.nextInt();
	        }

	        // loop para imprimir os valores do vetor sem repetições
	        System.out.print("Valores sem repetição: ");
	        for (int i = 0; i < vetor.length; i++) {
	            boolean repetido = false;
	            for (int j = 0; j < i; j++) {
	                if (vetor[i] == vetor[j]) {
	                    repetido = true;
	                    break;
	                }
	            }
	            if (!repetido) {
	                System.out.print(vetor[i] + " ");
	            }
	            
	            ler.close();
	        }
	    }
	
	}

