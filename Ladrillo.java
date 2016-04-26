import java.awt.Button;

public class Ladrillo extends	Button {
  private int alto=10;
  private int ancho=30;
  
  public Ladrillo(int x,int y){
    this.setBounds(x,y,this.ancho,this.alto);
  }  
  
}