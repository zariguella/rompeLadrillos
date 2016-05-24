import java.awt.Button;

public class Pelota extends	Button {  
  private int alto=10;
  private int ancho=10;
  private int x=250;
  private int y=300;
  private int m=2;
  private int b=5;

	public Pelota(int x,int y){
		this.setBounds(x,y,this.ancho,this.alto);
	}
	public void moverPelota(){
		y=m*x+b;
		x=(y-b)/m;
		this.setBounds(x,y,this.ancho,this.alto);
		x++;
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
