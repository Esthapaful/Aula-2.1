import java.util.Scanner;


public class TestarPessoa {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite seu nome: ");
		String nome = entrada.next();
		System.out.println("Digite seu cpf: ");
		int cpf = entrada .nextInt();
		System.out.println("Digite seu rg: ");
		int rg = entrada.nextInt();
		
		
		Pessoa p = new Pessoa(nome,cpf,rg);
		System.out.println(p);
		entrada.close();

	}

}
