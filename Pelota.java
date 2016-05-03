import java.awt.Button;

public class Pelota extends	Button {  
  private int alto=10;
  private int ancho=10;
  private int x=0
  private int y=0
  private int m=2
  private int b=5

  public Pelota(int x,int y){
    this.setBounds(x,y,this.ancho,this.alto);

  public void moverPelota(){
  	y=m*x+b;
  	x=(y-b)/m


  }
   

  }
 
 }