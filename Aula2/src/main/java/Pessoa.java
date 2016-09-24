
public class Pessoa {
	String nome;
	int cpf;
	int rg;
	
	public Pessoa(String nome,int cpf,int rg){
		this.nome = nome;
		this.cpf = cpf;
		this.rg = rg;
		
	}
	
	@Override
	public String toString() {
		
		return "Nome:" +nome +" Cpf:" +cpf +" RG:" +rg;
	}
}
