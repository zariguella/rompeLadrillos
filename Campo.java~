import javax.swing.JFrame;
import java.awt.Color;
import java.awt.event.*;
import javax.swing.Timer;

public class Campo extends JFrame{
  private int alto=600;
  private int ancho=600;
  private int xInicial=10;
  private int yInicial=10;
  private int numLadrillos=10;
  private Ladrillo ladrillos[]=new Ladrillo[numLadrillos];
  private int tiempo=100;
  private Pelota b=new Pelota(10,10);
  
  
  public Campo(){  
  	setLayout(null);
    this.setFocusable(true);
    this.addKeyListener(new KeyListener() {
        @Override
        public void keyTyped(KeyEvent e) {
        }
        @Override
        public void keyPressed(KeyEvent e) {
        }
        @Override
        public void keyReleased(KeyEvent e) {
        }
    });
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
   	 b.setBackground(Color.RED);
  	 this.add(b);
	 
	 for(int i=0;i<numLadrillos;i=i+1){
	    Ladrillo l=new Ladrillo(this.xInicial+50*i,this.yInicial);
	    l.setBackground(Color.BLUE);
	    ladrillos[i]=l;
	    this.add(l);
	}
  }

  public boolean colision(){
    boolean colision=false;
	/*for (int i=0; i<this.numLadrillos;i++){
		 if(ladrillos[i]!=null){
			Ladrillo l=ladrillos[i];		
			 if (
				(b.getX()>=l.getX())&
				(b.getX()<=l.getX()+l.getAncho())&
				(b.getY()>=l.getY())&
				(b.getY()<=l.getY()+l.getAlto())
			){
              			colision=true;
			}if (
				((b.getX()+b.getAncho())>=l.getX())&
				((b.getX()+b.getAncho())<=l.getX()+l.getAncho())&
				(b.getY()>=l.getY())&
				(b.getY()<=l.getY()+l.getAlto())
			){
			 	 colision=true;
            		}if (
				(b.getX()>=l.getX())&
				(b.getX()<=l.getX()+l.getAncho())&
				(b.getY()+b.getAlto()>=l.getY())&
				(b.getY()+b.getAlto()<=l.getY()+l.getAlto())
			){
			  colision=true;
            		}if (
 				(b.getX()+b.getAncho()>=l.getX())&
				(b.getX()+b.getAncho()<=l.getX()+l.getAncho())&
				(b.getY()+b.getAlto()>=l.getY())&
				(b.getY()+b.getAlto()<=l.getY()+l.getAlto())
			){
              			colision=true;
			}if(colision){
				this.remove(l);
				ladrillos[i]=null;
           		}
         	}
	}*/
	return colision;  
  }
  public static void main (String [ ] args) {
      final Campo c=new Campo();
      c.setBounds(c.xInicial,c.yInicial,c.ancho,c.alto);
      c.dibujarCampo();
      c.show();      
      Timer timer = new Timer (c.tiempo, new ActionListener(){ 
	    public void actionPerformed(ActionEvent e){ 
		if(!c.colision()){
			c.b.moverPelota();
			//System.out.println("Posición X: "+ c.b.getX()+ "Posición Y: " + c.b.getY());
		}
	     } 
	 });
	 timer.start();
	 timer.setRepeats(true);  
  }
}



