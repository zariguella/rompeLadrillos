import javax.swing.JButton;

public class Pelota extends	JButton {  
  private int alto=10;
  private int ancho=10;
  private int direccion=1;
  private int x=0;
  private int y=0;
  private int m=1;
  private int b=7;

	public Pelota(int x,int y){
        this.x=x;
        this.y=y;
		this.setBounds(x,y,this.ancho,this.alto);
	}

	public void reflejarPelota(int direccion){
		

		if (direccion!=2){		
		   this.direccion=direccion;
		}
		
		m=-1/m;
		b=y-m*x;
	
		
	}

	public void moverPelota(){        
		x=x+direccion;
		y=m*x+b;
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

  }
