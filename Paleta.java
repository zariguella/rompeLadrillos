import java.awt.Button;

public class Paleta extends	Button {  
  private int alto=10;
  private int ancho=30;
  
  public Paleta(int x,int y){
    this.setBounds(x,y,this.ancho,this.alto);
  }  
}