


public class Interruptor {
	
	Lampada lampada;
	
	public Interruptor(Lampada lampada){
		this.lampada = lampada;
	}
	
	public void apertar(){
		if(lampada.estaLigada() != false){
			lampada.desligada();			
		}else{
			lampada.ligada();
		}
	}
	
}
