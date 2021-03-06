import javax.swing.JFrame;
import java.awt.Color;
import java.awt.event.*;
import javax.swing.Timer;
import javax.swing.JOptionPane;


public class Campo extends JFrame{
  private int alto=600;
  private int ancho=600;
  private int xInicial=10;
  private int yInicial=10;
  private int numLadrillos=50;
  private Ladrillo ladrillos[]=new Ladrillo[numLadrillos];
  private int tiempo=10;
  private int fin=0;
  private Pelota b=new Pelota(10,10);
  private Paleta p=new Paleta(250,475);
  
  
  public Campo(){  
  	this.setLayout(null);
    this.setFocusable(true);
    this.addKeyListener(new KeyListener() {
        @Override
        public void keyTyped(KeyEvent e) {
        }
        @Override
        public void keyPressed(KeyEvent e) {
            int keyCode = e.getKeyCode();
            switch( keyCode ) { 
                case KeyEvent.VK_UP:
                    break;
                case KeyEvent.VK_DOWN:
                    break;
                case KeyEvent.VK_LEFT:
                    p.moverseIzquierda(10);
                    break;
                case KeyEvent.VK_RIGHT :
                    p.moverseDerecha(10);
                    break;
             }
        }
        @Override
        public void keyReleased(KeyEvent e) {
        }
    });
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
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

  public int getFin(){
      return this.fin;
  }
  
  public void dibujarCampo(){
	b=new Pelota(300,300);
  	p=new Paleta(250,475);
	p.setBackground(Color.ORANGE);
	 this.add(p); 	 
   	 b.setBackground(Color.RED);
  	 this.add(b);
		int j=0; 
	 for(int i=0;i<numLadrillos;i=i+1){
		if((i%10)==0){
			
			j++;
		}
	    Ladrillo l=new Ladrillo(this.xInicial+50*(i%10),this.yInicial+30*j);
	    l.setBackground(Color.BLUE);
	    ladrillos[i]=l;
	    this.add(l);
	}
  }

  public boolean colision(){
    boolean colision=false;
	for (int i=0; i<this.numLadrillos;i++){
		 if(ladrillos[i]!=null){
			Ladrillo l=ladrillos[i];		
			 if (
				(b.getX()>=l.getX())&
				(b.getX()<=l.getX()+l.getAncho())&
				(b.getY()>=l.getY())&
				(b.getY()<=l.getY()+l.getAlto())
			){  
              			colision=true;
				b.reflejarPelota(2);
			}if (
				((b.getX()+b.getAncho())>=l.getX())&
				((b.getX()+b.getAncho())<=l.getX()+l.getAncho())&
				(b.getY()>=l.getY())&
				(b.getY()<=l.getY()+l.getAlto())
			){
			 	 colision=true;
				 b.reflejarPelota(-1);
				
            		}if (
				(b.getX()>=l.getX())&
				(b.getX()<=l.getX()+l.getAncho())&
				(b.getY()+b.getAlto()>=l.getY())&
				(b.getY()+b.getAlto()<=l.getY()+l.getAlto())
			){
			  colision=true;
			  b.reflejarPelota(2);
            		}if (
 				(b.getX()+b.getAncho()>=l.getX())&
				(b.getX()+b.getAncho()<=l.getX()+l.getAncho())&
				(b.getY()+b.getAlto()>=l.getY())&
				(b.getY()+b.getAlto()<=l.getY()+l.getAlto())
			){
              			colision=true;
				b.reflejarPelota(1);
			}
            if(colision){
				this.remove(l);
				ladrillos[i]=null;
           	}
            colision=false;
         }
	}
	return colision;  
  }
  public void colisionPaleta(){
	     if (
		    (b.getX()>=p.getX())&
		    (b.getX()<=p.getX()+p.getAncho())&
		    (b.getY()+b.getAlto()>=p.getY())
	    ){
          			b.reflejarPelota(+1);
	    }
  }

  public void colisionCampo(){
	if (b.getX()>=this.getAncho()-10){	
		b.reflejarPelota(-1);		
	}
	if (b.getY()<=3){	
		b.reflejarPelota(2);		
	}	
	
	if (b.getX()<=10){	
		b.reflejarPelota(+1);		
	}	

	if (b.getY()>p.getY()+p.getAlto()){		 	
	 JOptionPane.showMessageDialog(null, "Has perdido", "Game Over", JOptionPane.INFORMATION_MESSAGE);
		dispatchEvent(new WindowEvent(this, WindowEvent.WINDOW_CLOSING));
	 
	}	
  }

  public static void main (String [ ] args) {
      final Campo c=new Campo();
      c.setBounds(c.xInicial,c.yInicial,c.ancho,c.alto);
      c.dibujarCampo();
      c.show();      
      Timer timer = new Timer (c.tiempo, new ActionListener(){ 
	    public void actionPerformed(ActionEvent e){ 
        c.colisionPaleta();
	c.colisionCampo();
		if (c.getFin()==1){
		   c.dibujarCampo(); 
		}
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



