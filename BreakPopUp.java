package for_videohandler;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;
import java.awt.*;  
import java.awt.event.*; //imports java ActionListener
import java.util.ArrayList;
import java.util.Random;


public class BreakPopUp {
	//private Frame frame;
	private Label wordsOfEncouragement;
	private Label starPoints;
	//private Panel controlPanel;
	private boolean buttonPressed;
	
	private class MyActionListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			buttonPressed = true;
			System.out.println("BUTTON PRESSED BROOOO");
		}
	}
	
	public BreakPopUp() {
		this.buttonPressed = false;
		this.wordsOfEncouragement = new Label();
		this.starPoints = new Label();
		buildPopUp();
	}
	
	public String chooseEncouragement() {
		ArrayList<String> words = new ArrayList<>();
		words.add("You got this! Drink water!");
		words.add("Proud of you! Walk for 2 min!");
		words.add("Look how far you've gotten! Grab a snack!");
		words.add("It's okay to relax! 5 breaths in, 5 breaths out!");
		words.add("Remember: you are smart! Say some daily affirmations!");
		Random randomGen = new Random();
		return words.get(randomGen.nextInt(4));
		
	}
	
	public void buildPopUp() {
		JFrame frame = new JFrame("Video Checkpoint!!!");
	    JButton contButton = new JButton("press to continue :)");  
	    contButton.setBounds(100,200,200,100); 
	    
	    frame.add(contButton);  
	    frame.setSize(400,400); 
	    wordsOfEncouragement.setText(chooseEncouragement());
	    wordsOfEncouragement.setBounds(50, 30, 300, 100);
	    wordsOfEncouragement.setAlignment(Label.CENTER);
	    starPoints.setText("You gained 5 star points!");
	    starPoints.setBounds(100, 100, 200, 100);
	    starPoints.setAlignment(Label.CENTER);
	    contButton.addActionListener(new MyActionListener());
	    frame.add(wordsOfEncouragement);
	    frame.add(starPoints);
	    frame.setLayout(null);  
	    
	    frame.setVisible(true);  
	}
	
	public static void main(String[] args){
		BreakPopUp pop = new BreakPopUp();
		
	}
	
//	//timer for 15 seconds, in reality it would be 15 min
//	public void timeVideo(int videoLength) {
//		int countdown = 15000;
//		
//		var timer = new Timer(countdown, null);
//		
//		timer.start();
//	}
	
	
}
