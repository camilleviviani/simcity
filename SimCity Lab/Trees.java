import java.awt.Color;
import java.awt.Graphics;

public class Trees{
	
	int x;
	int y;
	int row;
	int col;
	
	int x2;
	int y2;
	int row2;
	int col2;
	
	int treex;
	int treey;
	
	//colors
	Color brown;
	Color green;
	Color darkgreen;
	Color red;
	
	public Trees(int x, int y, int row, int col, int treex, int treey, int x2, int y2, int row2, int col2){
		this.x = x;
		this.y = y;
		this.row= row;
		this.col= col;
		this.treex= treex;
		this.treey= treey;
		this.x2 = x2;
		this.y2 = y2;
		this.row2= row2;
		this.col2= col2;
		
		brown= new Color(205,133,63);
		green= new Color(0,100,0);
		darkgreen= new Color(34,139,34);
		red= new Color(255,0,0);
	}
	
	public void drawMe(Graphics g){
		int tempX = x;
		int tempY = y;
		int tempX2= treex;
		int tempY2= treey;
		int tempX3 = x2;
		int tempY3 = y2;
		
		//draw trees
		for(int r=0; r<row; r++){
		
			for(int c=0; c<col; c++){
				g.setColor(brown);
				g.fillRect(tempX, tempY,10,30);
				
				g.setColor(green);
				g.fillOval(tempX2, tempY2, 25,25);
				
				//apples
				g.setColor(red);
				g.fillOval(tempX2+4,tempY2+5,8,8);
				
				tempX+=35;
				tempX2+=35;
			}
			
			tempX= x; 
			tempY+=40;
			
			tempX2= treex; 
			tempY2+=40;
			
			}
			
		for(int r=0; r<row2; r++){
		
			for(int c=0; c<col2; c++){
				g.setColor(brown);
				g.fillRect(tempX3, tempY3,10,30);
				
				g.setColor(darkgreen);
				g.fillOval(tempX3-7, tempY3-10, 25,25);
				
				//apples
				g.setColor(red);
				g.fillOval(tempX3-2,tempY3-8,8,8);
				
				tempX3+=40;
			}
		
			tempX3= x2; 
			tempY3+=38;
			
			}
				
	}



















}