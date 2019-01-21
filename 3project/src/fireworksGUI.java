

import java.awt.BorderLayout;
import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.JTextField;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JFrame;

public class fireworksGUI extends JFrame implements ActionListener {
   
	// I declare my variables here
   protected String[] fireworktype = { "NONE", "BOMB", "CIRCLES", "ROCKET", "SQUARES", "BRANCHES" };
   protected String[] color = { "NONE", "RED", "CYAN", "BLUE", "MAGENTA", "YELLOW" };
   protected JButton button ; 
   protected JTextField anglebox, speedbox, timebox;
   protected JLabel anglelabel, speedlabel, timelabel, fireworklabel, colorlabel, gaplabel;
   protected JComboBox colorbox, fireworkbox;
   protected String s,a,t, combo, Color;
   protected int speed,angle,time;
   protected JFrame frame, frame2 ;
   protected Canvas canvas;
   fireworks xyz;
   
   
   
   public fireworksGUI (){  // I build my 1st frame in my constructor and add the Jpanel to it
	
	frame = new JFrame();
	JPanel panel = new JPanel();
	

	setTitle(" Firework Input Box ");      // set the various properties of my frame
	setSize(1150,600);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	setLayout(new BorderLayout());
    
	anglelabel = new JLabel(" Enter Launch Angle");   // create and add the label to the panel
    panel.add(anglelabel);
	
    anglebox = new JTextField(5);  // create and add text field to the panel 
    anglebox.addActionListener(this);
    panel.add(anglebox);
    
    speedlabel = new JLabel(" Enter speed in m/s ");
    panel.add(speedlabel);
	
    speedbox = new JTextField(5);
    anglebox.addActionListener(this);
    panel.add(speedbox);
    
    timelabel = new JLabel(" Enter time delay");
    panel.add(timelabel);
	
    timebox = new JTextField(5);
    panel.add(timebox);
    
    colorlabel = new JLabel(" Choose Color ");
    panel.add(colorlabel);
    
    colorbox = new JComboBox(color); // creates a comboBox which gives the user the option to choose the color they want
    
    panel.add(colorbox); // add the combobox to my panel
    
    fireworklabel = new JLabel(" Choose Firework type ");
    panel.add(fireworklabel); 
    
    fireworkbox = new JComboBox(fireworktype);
    fireworkbox.addActionListener(this);
    panel.add(fireworkbox);
    
    gaplabel = new JLabel("  "); // add a gap so that my button and label have a gap in between them 
    panel.add(gaplabel);
    
    button = new JButton(" LAUNCH ");
    button.addActionListener(this);
    panel.add(button);
    
   add(panel,BorderLayout.NORTH); // set the position of the label to North of the panel 
   
    fireworks fr = new fireworks();
	fr.setPreferredSize(new Dimension(500,500));
	add(fr,BorderLayout.CENTER);
	
	

   }
   
   public static void main(String[]args) {  // this is my main method
	   
		new fireworksGUI().setVisible(true);
		
	}



@Override
public void actionPerformed(ActionEvent e) { // this method has the functions which will be performed when the button is pressed
	
	
	
	if( e.getSource() == button) {                          // checks the source of the action
	System.out.println(" THE LAUNCH BUTTON WAS PRESSED");	
	
	Color = (String) colorbox.getSelectedItem();   // the color variable stores the value of the item selected from the color box
	combo =(String) fireworkbox.getSelectedItem(); // the combo variable stores the value of the item selected from the combo box
	s = speedbox.getText();           // the given String variable stores the value entered
	a = anglebox.getText();     
	t = timebox.getText();     
	speed = Integer.parseInt(s);  // changes the String value to Integer
	time = Integer.parseInt(t);  // changes the String value to Integer
	
	xyz=new fireworks();   // I make the object of other class which has all the graphics functions
	xyz.setTime(time);  // setter for the time variable
	xyz.setCombo(combo);  // setter for the time variable
	xyz.setAngle(angle); // setter for the time variable
	xyz.setSpeed(speed); // setter for the time variable
	xyz.setColor(Color); // setter for the time variable
	angle = Integer.parseInt(a);  
	
	repaint();  // calls the paintComponent method
	
	
	}
	
	
}
 
 
	   
	   
   
    	
    }



