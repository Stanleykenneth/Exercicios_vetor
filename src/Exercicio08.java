import java.util.Scanner;

/*

	8 - Crie um programa que lê 6 valores inteiros e em seguida, mostre na tela
	    os valores lidos na ordem inversa.
 
*/
public class Exercicio08 {
	
	public static void main(String[] args) {
	     
		Scanner ler = new Scanner(System.in);
		
		int valores [] = new int[6];
		
		 System.out.println("Digite 6 valores inteiros: ");
	      for (int i = 0; i < valores.length; i++) {
	         valores[i] = ler.nextInt();
	      }
	      
	      System.out.println("Valores lidos na ordem inversa:");
	      for (int i = valores.length - 1; i >= 0; i--) {
	         System.out.println(valores[i]);
	      }
	      ler.close();
	   }
}
