import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Dimension;

public class Screen extends JPanel{

	Houses h1;
	Background b1;
	Trees t1;
	Buildings b2;

	
	public Screen(){
		
		h1= new Houses(50,300,4,3,52,305,2,1,600,500,2,5);
		b1= new Background();
		t1= new Trees(300,400,3,3,293,390,260,275,2,6);
		b2= new Buildings(660,275,3,3,50,475,2,3);
		
	}
	
	public Dimension getPreferredSize(){
		return new Dimension(800,600);
	}
	
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		
		b1.drawMe(g);
		h1.drawMe(g);
		t1.drawMe(g);
		b2.drawMe(g);
	}
	
	public void animate(){
		while (true) {
		b1.startMove();
		
		//slow down(wait)	
			try{
				Thread.sleep(3); //milliseconds
			}
			catch(InterruptedException ex){
				Thread.currentThread().interrupt();
			}
			
				//redraw the screen
			repaint();
		}
	}
}
