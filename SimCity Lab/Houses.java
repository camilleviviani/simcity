import java.awt.Color;
import java.awt.Graphics;

public class Houses{

	int x;
	int y;
	int row;
	int col;
	int wrow;
	int wcol;
	int windowX;
	int windowY;
	int x2;
	int y2;
	int row2;
	int col2;
	
	//colors
	Color brown;
	Color white;
	Color red;
	Color teal;


	public Houses(int x, int y, int row, int col, int windowX, int windowY, int wrow, int wcol, int x2, int y2, int row2, int col2){
		this.x = x;
		this.y = y;
		this.row= row;
		this.col= col;
		this.windowX= windowX;
		this.windowY= windowY;
		this.wrow= wrow;
		this.wcol= wcol;
		this.x2 = x2;
		this.y2 = y2;
		this.row2= row2;
		this.col2= col2;
		
		brown = new Color(222,184,135);
		white = new Color(255,255,255);
		red= new Color(178,34,34);
		teal= new Color(0,139,139);
		
	}
	
	public void drawMe(Graphics g){
		int tempX = x;
		int tempY = y;
		int tempX2= windowX;
		int tempY2= windowY;
		int tempX3 = x2;
		int tempY3 = y2;
		
		//draw building
		for(int r=0; r<row; r++){
		
			for(int c=0; c<col; c++){
				g.setColor(brown);
				g.fillRect(tempX, tempY, 16,27);
				
				//windows
				g.setColor(white);
				g.fillRect(tempX2, tempY2,4,4);
				
				g.setColor(white);
				g.fillRect(tempX2+8,tempY2,4,4);
				
				//door
				g.setColor(red);
				g.fillRect(tempX2+3,tempY2+13,6,8);
				
				//roof
				g.setColor(red);
				g.fillRect(tempX2-6,tempY2-7,24,5);
				
				tempX+=35;
				tempX2+=35;
			}
			
			//changes tempX back to the original position
			tempX= x; 
			tempY+=40;
			tempX2= windowX; 
			tempY2+=40;
		}
		
		for(int r=0; r<row2; r++){
		
			for(int c=0; c<col2; c++){
				g.setColor(brown);
				g.fillRect(tempX3, tempY3, 16,27);
				
				//door
				g.setColor(teal);
				g.fillRect(tempX3+5,tempY3+18,6,8);
				
				//windows
				g.setColor(white);
				g.fillRect(tempX3+2, tempY3+3,4,4);
				
				g.setColor(white);
				g.fillRect(tempX3+10,tempY3+3,4,4);
				
				//roof
				g.setColor(teal);
				g.fillRect(tempX3-4,tempY3-5,24,5);
			
				tempX3+=35;
			}
			
			//changes tempX back to the original position
			tempX3= x2; 
			tempY3+=40;
		}
		
				
				
				
				
				
				
						
	}	
}