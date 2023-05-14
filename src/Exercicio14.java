import java.util.Scanner;

/*
  14 - Faça um programa que leia um vetor de 10 posições
       e verifique se existe valores iguais e os escreva na tela. 
*/
public class Exercicio14 {
	
	public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int[] vetor = new int[10]; // vetor para armazenar os valores

        // loop para ler os valores do vetor
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite o valor da posição " + i + ": ");
            vetor[i] = ler.nextInt();
        }

        // loop para verificar se existem valores iguais
        System.out.print("Valores iguais: ");
        for (int i = 0; i < vetor.length; i++) {
            for (int j = i+1; j < vetor.length; j++) {
                if (vetor[i] == vetor[j]) {
                    System.out.print(vetor[i] + " ");
                }
            }ler.close();
        }
    }
}







