import java.util.Scanner;

/*
  10 - Faça um programa para ler a nota da prova de 15 alunos e amazene num vetor,
       calcule e imprima a média geral. 
*/
public class Exercicio10 {
	
	 public static void main(String[] args) {
	        Scanner ler = new Scanner(System.in);

	        double[] notas = new double[15]; // vetor para armazenar as notas
	        double soma = 0; // variável para armazenar a soma das notas

	        // loop para ler as notas e calcular a soma
	        for (int i = 0; i < notas.length; i++) {
	            System.out.print("Digite a nota do aluno " + (i+1) + ":\n ");
	            notas[i] = ler.nextDouble();
	            soma += notas[i];
	        }

	        // calcular a média geral e imprimir o resultado
	        double media = soma / notas.length;
	        System.out.println("A média geral é\n: " + Math.round(media));
	        
	        ler.close();
	    }
}
