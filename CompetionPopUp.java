package for_videohandler;

import java.awt.Label;

import javax.swing.JButton;
import javax.swing.JFrame;

//import for_videohandler.BreakPopUp.MyActionListener;

public class CompletionPopUp {
	
	private Label wordsOfEncouragement;
	private Label academicValidation;
	
	public CompletionPopUp() {
		this.wordsOfEncouragement = new Label();
		this.academicValidation = new Label();
		buildPopUp();
	}
	
	public void buildPopUp() {
		JFrame frame = new JFrame("Video Checkpoint!!!");  
	    frame.setSize(400,400); 
	    
	    wordsOfEncouragement.setText("CONGRATS you finished your video!!!");
	    wordsOfEncouragement.setBounds(50, 50, 300, 100);
	    wordsOfEncouragement.setAlignment(Label.CENTER);
	    
	    frame.add(wordsOfEncouragement);
	    
	    academicValidation.setText("We are so proud of you!");
	    academicValidation.setBounds(50, 150, 300, 100);
	    academicValidation.setAlignment(Label.CENTER);
	    
	    frame.add(academicValidation);
	    
	    frame.setLayout(null);  
	    
	    frame.setVisible(true);  
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CompletionPopUp pop = new CompletionPopUp();
	}

}
