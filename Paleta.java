import java.awt.Button;

public class Paleta extends	Button {  
	private int alto=10;
	private int ancho=30;

	public Paleta(int x,int y){
		this.setBounds(x,y,this.ancho,this.alto);
	}  

	public int getAncho(){
		return this.ancho;
	}

	public void setAncho(int ancho){
		this.ancho=ancho;
	}
	public int getAlto(){
		return this.alto;
	}

	public void setAlto(int alto){
		this.alto=alto;
	}

}
