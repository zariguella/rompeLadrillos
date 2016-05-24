import java.awt.Button;

public class Ladrillo extends	Button {
  private int alto=10;
  private int ancho=30;

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
	public Ladrillo(int x,int y){
		this.setBounds(x,y,this.ancho,this.alto);
	}  
  
}
