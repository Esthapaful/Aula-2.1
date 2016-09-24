
public class Ponto {
	
	double x = 0.0;
	double y = 0.0;
	
	public Ponto(double coordx, double coordy){
		this.x = coordx;
		this.y = coordy;
	}
	
	public void deslocar(double deltax, double deltay) {
		x += deltax;
		y += deltay;
	}
	
	public void zerar() {
		x = 0;
		y = 0;
	}
	
	public boolean YMaiorZero(){
		if(y > 0){
			return true;
			}
		return false;
	}

}
