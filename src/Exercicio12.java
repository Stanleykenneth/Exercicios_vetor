import java.util.Scanner;

/*
   12 - Fazer um programa para ler  5 valores e, em seguida, mostrar todos os valores
        lidos juntamente com o maior, o menor e média dos valores. 
*/
public class Exercicio12 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		double[] valores = new double[5]; // vetor para armazenar os valores
		double maior = Double.MIN_VALUE; // variável para armazenar o maior valor
		double menor = Double.MAX_VALUE; // variável para armazenar o menor valor
		double soma = 0; // variável para armazenar a soma dos valores

		// loop para ler os valores e encontrar o maior e o menor valor
		for (int i = 0; i < valores.length; i++) {
			System.out.print("Digite o " + (i + 1) + "º valor:\n ");
			valores[i] = ler.nextDouble();
			if (valores[i] > maior) {
				maior = valores[i];
			}
			if (valores[i] < menor) {
				menor = valores[i];
			}
			soma += valores[i];
		}

		// calcular a média dos valores
		double media = soma / valores.length;

		// exibir os resultados
		System.out.print("Valores lidos: ");
		for (int i = 0; i < valores.length; i++) {
			System.out.print(valores[i] + " ");
		}
		System.out.println("\nMaior valor: " + maior);
		System.out.println("Menor valor: " + menor);
		System.out.println("Média dos valores: " + media);

		ler.close();
	}

}
