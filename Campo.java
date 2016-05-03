import java.awt.Frame;
import java.awt.Color;

public class Campo extends Frame {
  private int alto=500;
  private int ancho=500;
  private int xInicial=0;
  private int yInicial=0;
  private int numLadrillos=10;
  private Ladrillo ladrillos[]=new Ladrillo[numLadrillos];
  
  
  public Campo(){  
	//this.setBackground(Color.GREEN);
  setLayout.(Null)
  }
  
  
  public void setAlto(int alto){
	this.alto=alto;
  }
  
  public void setAncho(int ancho){
	this.ancho=ancho;
  }  
  
  public int getAncho(){
      return this.ancho;
  }
  
  public int getAlto(){
      return this.alto;
  }
  
  public void dibujarCampo(){	
	 Paleta p=new Paleta(250,475);
	 p.setBackground(Color.ORANGE);
	 this.add(p);
   Pelota b=new Pelota(250,300);
   p.setBackground(Color.RED);
   this.add(b);
	 for(int i=0;i<numLadrillos;i=i+1){
	    Ladrillo l=new Ladrillo(this.xInicial+50*i,this.yInicial);
	    l.setBackground(Color.BLUE);
	    ladrillos[i]=l;
	    this.add(l);
	}
  }

  
  
  public static void main (String [ ] args) {
      Campo c=new Campo();
      c.setBounds(c.xInicial,c.yInicial,c.ancho,c.alto);
      c.dibujarCampo();
      Pelota.moverPelota;
      c.show();

}
  
  
}

