package for_videohandler;
import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.*;  
import java.awt.event.*; //imports java ActionListener
import java.util.ArrayList;
import java.util.Random;

/**
 * creates pop up when 15min marker is triggered to encourage students
 * and reward them with star points
 * @author ainsleesmith
 *
 */
public class BreakPopUp {
	
	/**
	 * words of encouragement
	 */
	private Label wordsOfEncouragement;
	
	/**
	 * star point text
	 */
	private Label starPoints;
	
	/**
	 * tells if button is pressed
	 */
	private boolean buttonPressed;
	
	/**
	 * action listener to notify is button is pressed
	 * originaly made so that we could continue video
	 * for students when they pressed the pop up continue button
	 * @author ainsleesmith
	 *
	 */
	private class MyActionListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			buttonPressed = true;
			System.out.println("BUTTON PRESSED BROOOO");
		}
	}
	
	/**
	 * class constructor
	 */
	public BreakPopUp() {
		this.buttonPressed = false;
		this.wordsOfEncouragement = new Label();
		this.starPoints = new Label();
		buildPopUp();
	}
	
	/**
	 * chooses randomized encouragement
	 * @return phrase of encouragement
	 */
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
	
	/**
	 * builds and displays pop up
	 */
	public void buildPopUp() {
		JFrame frame = new JFrame("Video Checkpoint!!!");
	    JButton contButton = new JButton("press to continue :)");  
	    contButton.setBounds(100,230,200,100); 
	    
	    frame.getContentPane().setBackground(Color.pink);
	    
	    frame.add(contButton);  
	    frame.setSize(400,400); 
	    wordsOfEncouragement.setText(chooseEncouragement());
	    wordsOfEncouragement.setBounds(50, 30, 300, 100);
	    wordsOfEncouragement.setAlignment(Label.CENTER);
	    
	    wordsOfEncouragement.setBackground(Color.white);
	    
	    starPoints.setText("You gained 5 star points!");
	    starPoints.setBounds(100, 100, 200, 100);
	    starPoints.setAlignment(Label.CENTER);
	    
	    starPoints.setBackground(Color.white);
	    
	    contButton.addActionListener(new MyActionListener());
	    frame.add(wordsOfEncouragement);
	    frame.add(starPoints);
	    frame.setLayout(null);  
	    
	    frame.setVisible(true);  
	}
	
	public static void main(String[] args){
		BreakPopUp pop = new BreakPopUp();
	}	
	
}
