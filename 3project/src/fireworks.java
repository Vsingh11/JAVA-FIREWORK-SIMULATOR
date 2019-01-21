import javax.swing.JPanel;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.util.Random;

import javax.swing.JComponent;
import javax.swing.JFrame;

public class fireworks extends JComponent {  // this is my second class and contains all the graphic functions
       
	Graphics g;   // I declares my static variables here
	static int time,angle,speed;
	static String color;
	static String combo="  ";
	static int explosionX , explosionY, XX, YY,XXA,YYA, XXB,YYB,XXC,YYC,XXD,YYD,XXE,YYE;
	static int a,b;

	protected static double angleRad; 
	public void setAngle(int type) {    // These are setters who receive the value from the other class and set it equal to the static  variables declared here
		angle = type;
	}
	
	public void setSpeed(int tie) {
		speed = tie;
	}
	
	public void setColor(String tie) {
		color = tie;
	}
	public void setTime(int tie) {
		time = tie;
	}
    
	public void setCombo(String tie) {
		combo = tie;
		//System.out.println(combo);
	}
	

   
@Override
	public void paintComponent(Graphics g){   //  this is my paintComponent method and I give all the g. commands here
            
           
      
      g.fillRect(0, 0, getWidth(), getHeight()); // makes the background black which acts like the night sky 
            
      angleRad =  Math.toRadians(angle);
      if(combo.equals("BOMB") ) {   // the if condition checks the type entered  // expalined the type of explosion in the READ ME
  
      				for (double i = 0; i <= time; i += 0.005) {  // this loop draws my projectile and it takes the value entered by the user and draws it according to it
      					
      					int x =  + (int) ((speed)*(Math.cos(angleRad)*i));  
      					int y = getHeight() - (int) ((speed*Math.sin(angleRad)*i)-(0.5*9.8*Math.pow(i, 2)));
      					
      					if(color.equals("CYAN")){         // this if condition is present in every condition and sets the color which user has entered
      							g.setColor(Color.CYAN);
      					}else if(color.equals("RED")){
  							g.setColor(Color.RED);
  						}else if(color.equals("BLUE")){
      							g.setColor(Color.BLUE);
      				    }else if(color.equals("MAGENTA")){
          							g.setColor(Color.MAGENTA);
          				}else if(color.equals("YELLOW")){
              							g.setColor(Color.YELLOW);
          				}
      					g.fillOval(x - (4/2), y - (4/2), 4, 4);  // draws many small ovals in a line which eventually looks like the projectile
      					explosionX = x;
      					explosionY = y;
      					
      				}
      				  for( double i = 0; i < 500; i++) {
      					  Random rand = new Random();

      					  XX = rand.nextInt(explosionX+115) + (explosionX-170) ; // generate two random numbers which act as the co-ordinates for the ovals
      					  YY = rand.nextInt(explosionY+150) + (explosionY-126) ;  // generate two random numbers which act as the co-ordinates for the ovals
      				
      				
      				
      			
      				g.fillOval((XX),( YY) , 5, 5);   // draws many small ovals and which gives it the look of explosion 
      				  }
      			}
      else if(combo == "CIRCLES") { // type 2 
      				 
      				for (double i = 0; i <= time; i += 0.005) {
      					int x =  + (int) ((speed)*(Math.cos(angleRad)*i));
      					int y = getHeight() - (int) ((speed*Math.sin(angleRad)*i)-(0.5*9.8*Math.pow(i, 2)));
      					
      					if(color.equals("CYAN")){            // same as the first condition
  							g.setColor(Color.CYAN);
  					}else if(color.equals("RED")){
							g.setColor(Color.RED);
						}else if(color.equals("BLUE")){
  							g.setColor(Color.BLUE);
  				    }else if(color.equals("MAGENTA")){
      							g.setColor(Color.MAGENTA);
      				}else if(color.equals("YELLOW")){
          							g.setColor(Color.YELLOW);
      				}
      					g.fillOval(x - (4/2), y - (4/2), 4, 4); // same as the first condition
      					explosionX = x; 
      					explosionY = y;
      					
      				}for( double i = 0; i < 10; i++) {     // generates many random circles and draws many circles of different sizes
    					  Random rand = new Random();  

    			
    					  
    				g.drawOval(explosionX, explosionY, 40, 40);	  
    					  
    				 XX = rand.nextInt(explosionX+50) + (explosionX-143) ;
    			       YY = rand.nextInt(explosionY+110) + (explosionY-85) ;
    				
    			
    				g.drawOval((XX),( YY) , 40, 40);
    				
    				XXA = rand.nextInt(explosionX+50) + (explosionX-143) ;
					YYA = rand.nextInt(explosionY+110) + (explosionY-85) ;
    				
					g.drawOval(XX, YY, 20, 20);
					
    				XXB = rand.nextInt(explosionX+50) + (explosionX-143) ;
					  YYB = rand.nextInt(explosionY+110) + (explosionY-85) ;
				    
					  g.drawOval(XXB, YYB, 12, 12);
				    
				    XXD = rand.nextInt(explosionX+50) + (explosionX-143) ;
					YYD = rand.nextInt(explosionY+110) + (explosionY-85) ;
    				
    				g.drawOval(XXD, YYD, 30, 30);
    				
    				XXC = rand.nextInt(explosionX+50) + (explosionX-143) ;
					YYC = rand.nextInt(explosionY+110) + (explosionY-85) ;
    				
					g.drawOval(XXC, YYC, 60,60 );
					
					XXE = rand.nextInt(explosionX+50) + (explosionX-143) ;
					YYE = rand.nextInt(explosionY+110) + (explosionY-85) ;
    				
    				g.drawOval(XXE, YYE, 5, 5);
    				
      			
      				}	
      				
      			}
      else if(combo == "ROCKET") { // type 3 
      				
      				for (double i = 0; i <= time; i += 0.005) {
      					int x =  + (int) ((speed)*(Math.cos(angleRad)*i));
      					int y = getHeight() - (int) ((speed*Math.sin(angleRad)*i)-(0.5*9.8*Math.pow(i, 2)));
      				
      					if(color.equals("CYAN")){
  							g.setColor(Color.CYAN);
  					}else if(color.equals("RED")){
							g.setColor(Color.RED);
						}else if(color.equals("BLUE")){
  							g.setColor(Color.BLUE);
  				    }else if(color.equals("MAGENTA")){
      							g.setColor(Color.MAGENTA);
      				}else if(color.equals("YELLOW")){
          							g.setColor(Color.YELLOW);
      				}
      					g.fillOval(x - (4/2), y - (4/2), 4, 4);  // same as the first condition 
      					explosionX = x;
      					explosionY = y;
      					
      				}  
      				 for( double t = 0; t < 100; t++) {
     					  Random rand = new Random();

     					  XX = rand.nextInt(explosionX+415) + (explosionX-170) ;
     					  YY = rand.nextInt(explosionY+550) + (explosionY-126) ;
     				//System.out.println(explosionX);
     				
     				
     			
     					 g.drawLine(explosionX, explosionY, XX, YY);  // draws 100 lines to random co-ordinates which eventually looks as the pathway of the rocket 
     					
     			
     				  }
      				
      				
      				
      			}
      else if(combo == "BRANCHES") {  // tyoe 4 
      				for (double i = 0; i <= time; i += 0.005) {
      					int x =  + (int) ((speed)*(Math.cos(angleRad)*i));
      					int y = getHeight() - (int) ((speed*Math.sin(angleRad)*i)-(0.5*9.8*Math.pow(i, 2)));
      					//System.out.println(x);
      					if(color.equals("CYAN")){
  							g.setColor(Color.CYAN);
  					}else if(color.equals("RED")){
							g.setColor(Color.RED);
						}else if(color.equals("BLUE")){
  							g.setColor(Color.BLUE);
  				    }else if(color.equals("MAGENTA")){
      							g.setColor(Color.MAGENTA);
      				}else if(color.equals("YELLOW")){
          							g.setColor(Color.YELLOW);
      				}
      					g.fillOval(x - (4/2), y - (4/2), 4, 4); //  same as the first condition 
      					explosionX = x;
      					explosionY = y;
      					
      				}
      				
      				Random rand = new Random(); 
      		
      				for( double t = 0; t < 20; t++) {         // this sets the value of color again as it gets changed to yellow in the next nested for loop
      					if(color.equals("CYAN")){
  							g.setColor(Color.CYAN);
  					}else if(color.equals("RED")){
							g.setColor(Color.RED);
						}else if(color.equals("BLUE")){
  							g.setColor(Color.BLUE);
  				    }else if(color.equals("MAGENTA")){
      							g.setColor(Color.MAGENTA);
      				}else if(color.equals("YELLOW")){
          							g.setColor(Color.YELLOW);
      				}
                           
   					  XX = rand.nextInt(explosionX+55) + (explosionX) ;
   					  YY = rand.nextInt(explosionY+100) + (explosionY+80) ;
   		
   				
   				
   			
   					 g.drawLine(explosionX, explosionY, XX, YY);  // draws first lines which act as the trace of first rocket 
   					 
   					for( double o = 0; o < 2; o++) {
   					   
   					 g.setColor(Color.YELLOW);
   					  XXA = rand.nextInt(XX+30) + (XX) ;
   					  YYA = rand.nextInt(YY+30) + (YY+20) ;
   				
   					 g.drawLine(XX, YY, XXA, YYA);   // draws the lines from the end point of first rocket which act as branches of the first explosion
   					
   			
   				  }
   					
   			
   				  }
      				
      			
 					
      			}
      else if(combo == "SQUARES") {  // type 5
      				
      				for (double i = 0; i <= time; i += 0.005) {
      					int x =  + (int) ((speed)*(Math.cos(angleRad)*i));
      					int y = getHeight()  - (int) ((speed*Math.sin(angleRad)*i)-(0.5*9.8*Math.pow(i, 2)));
      				
      					if(color.equals("CYAN")){
  							g.setColor(Color.CYAN);
  					}else if(color.equals("RED")){
							g.setColor(Color.RED);
						}else if(color.equals("BLUE")){
  							g.setColor(Color.BLUE);
  				    }else if(color.equals("MAGENTA")){
      							g.setColor(Color.MAGENTA);
      				}else if(color.equals("YELLOW")){
          							g.setColor(Color.YELLOW);
      				}
      					g.fillOval(x - (4/2), y - (4/2), 4, 4);  // same as the first condition
      					explosionX = x; x = a; x= b;
      					explosionY = y;
      					
      				}
      				
      				
      				for( double i = 0; i < 50; i++) {
  					  Random rand = new Random();

  	    		
					  
  				g.drawRect(explosionX, explosionY, 30, 30);	  
  					  
  				 XX = rand.nextInt(explosionX+50) + (explosionX-143) ;
  			       YY = rand.nextInt(explosionY+110) + (explosionY-85) ;
  				
  			
  				g.drawRect((XX),( YY) , 20, 20);
  				
  				XXA = rand.nextInt(explosionX+50) + (explosionX-143) ;
					YYA = rand.nextInt(explosionY+110) + (explosionY-85) ;
  				
					g.drawRect(XXA, YYA, 18, 18);
					
  				XXB = rand.nextInt(explosionX+50) + (explosionX-143) ;
					  YYB = rand.nextInt(explosionY+110) + (explosionY-85) ;
				    
					  g.drawRect(XXB, YYB, 8, 8);
				    
				    XXD = rand.nextInt(explosionX+50) + (explosionX-143) ;
					YYD = rand.nextInt(explosionY+110) + (explosionY-85) ;
  				
  				g.drawRect(XXD, YYD, 14, 14);
  				
  				XXC = rand.nextInt(explosionX+50) + (explosionX-143) ;
					YYC = rand.nextInt(explosionY+110) + (explosionY-85) ;
  				
					g.drawRect(XXC, YYC, 10,10 );
					
					XXE = rand.nextInt(explosionX+50) + (explosionX-143) ;
					YYE = rand.nextInt(explosionY+110) + (explosionY-85) ;
  				
  				g.drawRect(XXE, YYE, 5, 5);  // draws random squares of different sizes near the end of the projectile
  				
    			
    				}	
            				
      
      			} 
            	
            
            }
           
   	}
	 
	 

	 

