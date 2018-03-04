import java.awt.Color;
import java.awt.Graphics;

public class Buildings{
	int x;
	int y;
	int row;
	int col;
	int x2;
	int y2;
	int row2;
	int col2;
	
	//colors
	Color grey;
	Color white;
	Color darkgrey;
	
	
	public Buildings(int x, int y, int row, int col, int x2, int y2, int row2, int col2){
		this.x=x;
		this.y=y;
		this.row= row;
		this.col=col;
		this.x2=x2;
		this.y2=y2;
		this.row2= row2;
		this.col2=col2;
		
		//colors
		grey= new Color(128,128,128);
		white= new Color(255,255,255);
		darkgrey= new Color(112,128,144);
		
	}	
		
	public void drawMe(Graphics g){
		int tempX = x;
		int tempY = y;
		int tempX2 = x2;
		int tempY2 = y2;
		
		for(int r=0; r<row; r++){
		
			for(int c=0; c<col; c++){
				//buildings
				g.setColor(grey);
				g.fillRect(tempX, tempY, 23,40);
				
				//windows
				g.setColor(white);
				g.fillRect(tempX+4, tempY+5,6,6);
				
				g.setColor(white);
				g.fillRect(tempX+12,tempY+5,6,6);
				
				g.setColor(white);
				g.fillRect(tempX+4,tempY+22,6,6);
				
				g.setColor(white);
				g.fillRect(tempX+12,tempY+22,6,6);
				
				tempX+=40;
			}
			tempX= x; 
			tempY+=50;
		
		}	
		
		for(int r=0; r<row2; r++){
		
			for(int c=0; c<col2; c++){
				//buildings
				g.setColor(darkgrey);
				g.fillRect(tempX2, tempY2,23,50);
				
				//windows
				g.setColor(white);
				g.fillRect(tempX2+4, tempY2+5,6,6);
				
				g.setColor(white);
				g.fillRect(tempX2+12,tempY2+5,6,6);
				
				g.setColor(white);
				g.fillRect(tempX2+4,tempY2+22,6,6);
				
				g.setColor(white);
				g.fillRect(tempX2+12,tempY2+22,6,6);
				
				g.setColor(white);
				g.fillRect(tempX2+4,tempY2+38,6,6);
				
				g.setColor(white);
				g.fillRect(tempX2+12,tempY2+38,6,6);
				
				tempX2+=40;
			}
			tempX2= x2; 
			tempY2+=54;
		
		}	
	}
}