


public class TestarLampada {

	public static void main(String[] args) {
		
		Lampada lampada = new Lampada(220, "Josias");
		Interruptor interruptor = new Interruptor(lampada);
		
		interruptor.apertar();
		interruptor.apertar();
		interruptor.apertar();
		interruptor.apertar();
		interruptor.apertar();
		interruptor.apertar();
		


	}

}
