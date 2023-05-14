import java.util.Scanner;

/*
  13 - Fazer um programa para ler 5 valores e, em seguida, mostrar a posição
       onde se encontram o maior e o menor valor. 
*/
public class Exercicio13 {
		
	 public static void main(String[] args) {
	        Scanner ler = new Scanner(System.in);

	        double[] valores = new double[5]; // vetor para armazenar os valores
	        int posicaoMaior = 0; // variável para armazenar a posição do maior valor
	        int posicaoMenor = 0; // variável para armazenar a posição do menor valor

	        // loop para ler os valores e encontrar o maior e o menor valor
	        for (int i = 0; i < valores.length; i++) {
	            System.out.print("Digite o " + (i+1) + "º valor: ");
	            valores[i] = ler.nextDouble();
	            if (valores[i] > valores[posicaoMaior]) {
	                posicaoMaior = i;
	            }
	            if (valores[i] < valores[posicaoMenor]) {
	                posicaoMenor = i;
	            }
	        }

	        // exibir o resultado
	        System.out.println("Posição do maior valor: " + posicaoMaior);
	        System.out.println("Posição do menor valor: " + posicaoMenor);
	        
	        ler.close();
	    }
}
