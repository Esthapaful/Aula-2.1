import java.util.Scanner;


public class ImprimirDezPares {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite um numero: ");
		int numero = entrada.nextInt();
		int pares = numero/2;
		int a = pares;
		
		for(int i = 1;i <= 10 && i <= a;i++){
			System.out.println(i * 2);
			pares--;			
		}
		entrada.close();
	}	
}

