import java.util.Random;
import java.util.Scanner;


public class JogoAdivinha {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int numeroAleatorio = new Random().nextInt(10) + 1;
		int i = 0;
		int chute = 0;
		
		for(;i != numeroAleatorio;){
			System.out.println("Digite seu chute: ");
			i = entrada.nextInt();
			chute++;
			
			if (i != numeroAleatorio){
				System.out.println("Chute errado, tente novamente");
			}
		}
		System.out.println("Você acertou em " +chute +" tentativas.");
		entrada.close();
	
	}
}