package for_videohandler;

import java.awt.Color;
import java.awt.Label;
import javax.swing.JFrame;

/**
 * when video is finished, congratulate students
 * @author ainsleesmith
 *
 */
public class CompletionPopUp {
	
	/**
	 * encouraging words
	 */
	private Label wordsOfEncouragement;
	
	/**
	 * academic validation
	 */
	private Label academicValidation;
	
	/**
	 * class constructor
	 */
	public CompletionPopUp() {
		this.wordsOfEncouragement = new Label();
		this.academicValidation = new Label();
		buildPopUp();
	}
	
	/**
	 * builds and displays pop up screen
	 */
	public void buildPopUp() {
		JFrame frame = new JFrame("Video Checkpoint!!!");  
	    frame.setSize(400,400); 
	    
	    frame.getContentPane().setBackground(Color.pink);
	    
	    wordsOfEncouragement.setText("CONGRATS you finished your video!!!");
	    wordsOfEncouragement.setBounds(50, 50, 300, 100);
	    wordsOfEncouragement.setAlignment(Label.CENTER);
	    wordsOfEncouragement.setBackground(Color.white);
	    
	    frame.add(wordsOfEncouragement);
	    
	    academicValidation.setText("We are so proud of you!");
	    academicValidation.setBounds(50, 150, 300, 100);
	    academicValidation.setAlignment(Label.CENTER);
	    academicValidation.setBackground(Color.white);
	    
	    frame.add(academicValidation);
	    
	    frame.setLayout(null);  
	    
	    frame.setVisible(true);  
	}
	
	public static void main(String[] args) {
		CompletionPopUp pop = new CompletionPopUp();
	}

}
