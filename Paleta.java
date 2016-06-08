import javax.swing.JButton;

public class Paleta extends	JButton {  
	private int alto=10;
	private int ancho=30;
	private int x;
	private int y;

	public Paleta(int x,int y){
        this.x=x;
        this.y=y;
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
	public int getX(){
		return this.x;
	}

	public void setX(int x){
		this.x=x;
	}
	public int getY(){
		return this.y;
	}

	public void setY(int y){
		this.y=y;
	}
    public void moverseIzquierda(int cantidad){
		x=x-cantidad;
		setBounds(x,y,this.ancho,this.alto);
	}
	public void moverseDerecha(int cantidad){
		x=x+cantidad;
		setBounds(x,y,this.ancho,this.alto);
	}

}
