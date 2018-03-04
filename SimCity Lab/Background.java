import java.awt.Color;
import java.awt.Graphics;

public class Background{
	
	//colors
	Color green;
	Color blue;
	Color yellow;
	Color darkblue;
	Color white;
	Color black;
	Color grey;
	Color teal;
	Color red;
	Color clearyellow;
	
	
	int sunX;
	int sunY;
	int sunX2;
	int sunY2;
	int moonX;
	int moonY;
	int moonX2;
	int moonY2;
	int lightskyX;
	int lightskyY;
	double move;
	int carX;
	int carX2;
	
	
	public Background(){
		green = new Color(154,205,50);
		blue = new Color(135,206,235);
		yellow = new Color(255,255,102);
		darkblue= new Color(70,130,180);
		white= new Color(255,255,255);
		black= new Color(0,0,0);
		grey= new Color(128,128,128);
		teal= new Color(102,205,170);
		red= new Color(220,20,60);
		clearyellow= new Color(255,255,102,200);
		
		
		sunX=700;
		sunY=300;
		sunX2=-700;
		sunY2=300;
		lightskyX=800;
		lightskyY=0;
		moonX=0;
		moonY=-300;
		moonX2=0;
		moonY2=-300;
		carX=800;
		carX2=800;
	}
		
	public void drawMe(Graphics g){
		
		int[] xArray = new int[3];
        int[] yArray = new int[3];
		
		int[] xArray2 = new int[3];
        int[] yArray2 = new int[3];
		
		
		//light
		//Point 1
        xArray[0] = 600;
        yArray[0] = 387;
 
        //Point 2
        xArray[1] = 585;
        yArray[1] = 427;
 
        //Point 3
        xArray[2] = 660;
        yArray[2] = 427;
        
        //fish
        //Point 1
        xArray2[0] = 345;
        yArray2[0] = 558;
 
        //Point 2
        xArray2[1] = 355;
        yArray2[1] = 553;
 
        //Point 3
        xArray2[2] = 355;
        yArray2[2] = 563;
        
		//dark sky
		g.setColor(darkblue);
		g.fillRect(0,0,800,600);
		
		//light sky
		g.setColor(blue);
		g.fillRect(lightskyX,lightskyY,800,600);
		
		//ground
		g.setColor(green);
		g.fillRect(0,250,800,350);
		
		//sun
		g.setColor(yellow);
		g.fillOval(sunX,sunY,40,40);
		
		//sun2
		g.setColor(yellow);
		g.fillOval(sunX2,sunY2,40,40);
		
		//moon
		g.setColor(white);
		g.fillOval(moonX,moonY,40,40);
		
		//moon2
		g.setColor(white);
		g.fillOval(moonX2,moonY2,40,40);
		
		//streets
		g.setColor(yellow);
		g.fillRect(505,250,70,400);
		
		g.setColor(grey);
		g.fillRect(510,250,60,400);
		
		g.setColor(white);
		g.fillRect(535,255,8,50);
		
		g.setColor(white);
		g.fillRect(535,335,8,50);
		
		g.setColor(white);
		g.fillRect(535,415,8,50);
		
		g.setColor(white);
		g.fillRect(535,495,8,50);
		
		g.setColor(white);
		g.fillRect(535,575,8,50);
		
		//streets
		g.setColor(yellow);
		g.fillRect(570,430,340,50);
		
		g.setColor(grey);
		g.fillRect(570,435,340,40);
		
		g.setColor(white);
		g.fillRect(580,450,50,6);
		
		g.setColor(white);
		g.fillRect(670,450,50,6);
		
		g.setColor(white);
		g.fillRect(765,450,50,6);
		
		//car
		g.setColor(red);
		g.fillRect(carX+2,435,45,20);
		
		g.setColor(red);
		g.fillOval(carX2+2,425,45,20);
		
		g.setColor(red);
		g.fillOval(carX2-8,433,27,23);
		
		g.setColor(black);
		g.fillOval(carX+5,450,12,12);
		
		g.setColor(black);
		g.fillOval(carX+29,450,12,12);
		
		//street lamp
		g.setColor(black);
		g.fillRect(590,380,7,50);
		
		g.setColor(black);
		g.fillOval(590,380,20,8);
		
		g.setColor(clearyellow);
       	g.fillPolygon(xArray, yArray, 3);
       	
       	//pond
       	g.setColor(blue);
       	g.fillOval(290,520,170,80);
       	
       	g.setColor(teal);
       	g.fillOval(300,530,150,60);
       	
       	//fish
       	g.setColor(red);
       	g.fillOval(330,550,20,14);
       	
       	g.setColor(red);
       	g.fillPolygon(xArray2, yArray2, 3);
	}
	
	public void startMove(){
		move++;
		sunX=(int)(400+700*(Math.cos(move/600)));
		sunY=(int)(500-450*(Math.sin(move/600)));
		
		sunX2=(int)(400-700*(Math.cos(move/600)));
		sunY2= (int)(500+450*(Math.sin(move/600)));
		
		moonX=(int)(400+700*(Math.cos(1.57+move/600)));
		moonY=(int)(500-450*(Math.sin(1.57+move/600)));
	
		moonX2=(int)(400-700*(Math.cos(1.57+move/600)));
		moonY2=(int)(500+450*(Math.sin(1.57+move/600)));
	
		lightskyX--;
		if(lightskyX==-1200){
			lightskyX=800;
		}
		
		carX=(int)(690-110*(Math.sin(move/500)));
		carX2=(int)(690-110*(Math.sin(move/500)));
			
	}		
}