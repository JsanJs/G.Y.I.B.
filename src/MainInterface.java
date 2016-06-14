import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.applet.*;


public class MainInterface extends Applet implements ActionListener{
	

	//To calculate our measurements.
	Calculations num;
	
	
	//Different set of text-fields for current measurements.
	TextField text_squat, text_bench, text_weight, text_calorie, text_height;
	
	//Different set of text-fields for the ideal factors.
	TextField ideal_tweight, ideal_tsquat, ideal_tbench;
	
	//ideal factors to make new character. 
	int ideal_weight, ideal_squat, ideal_bench;
	
	
	//The Button for getting results.
	Button results;
	
	//how much weight you are able to squat..
	int squat;
	
	//how much weight you are able to bench.
	int bench;
	
	//how much you weigh, in kg.
	int body_weight;
	
	//calorie intake.
	int calorie;
	
	//height, in cm.
	int height;
	
	
	public void init(){
		
		//set the defaults for the applet.
		setLayout(null);
		Frame title = (Frame)this.getParent().getParent();
		title.setTitle("Get Your Ideal Body");
		setSize(1366,768);
		
		
		//Our textFields that will be used.
		text_squat = new TextField(8);
		text_bench = new TextField(8);
		text_weight = new TextField(8);
		text_calorie = new TextField(8);
		text_height = new TextField(8);
		ideal_tsquat = new TextField(8);
		ideal_tbench = new TextField(8);
		ideal_tweight = new TextField(8);
		
		//to set our ideal values to 0.
		ideal_weight = 0;
		ideal_squat = 0;
		ideal_bench = 0;

		//The Button to get results.
		results = new Button("Get My Results");

		num = new Calculations();
	}
	
	public void start(){
		
		
		setTextViews();
		
		addTextViews();
		
		//for the button.
		add(results);
		results.setBounds(1100,550,100,75);
		results.addActionListener(this);
		
	}
	
	public void paint(Graphics g){
		
		//For getting the image.
		String file;
		ImagePrint img;
		Image picture;
		
		//Gets our input.
		getInput();
		
		//For calculating.
		int health, upper_str, lower_str;
		
		health = num.diet(height, body_weight);
		upper_str = num.upperBody(bench,body_weight);
		lower_str = num.lowerBody(squat,body_weight);
		
		//Gets the image.
		img =  new ImagePrint(health,upper_str,lower_str);
		file = img.fileimg();
		
		//Renders the image.
		picture = getImage(getDocumentBase(),file);
		g.drawImage(picture, 500, 50, this);
		
		
		//Prints out our description.
		Desc(g);
	
		//If the user input something, then update our canvas.
		if(ideal_weight != 0 && ideal_bench != 0 && ideal_squat != 0){
			info(g);
		}
		
	}
	
	//set our textviews.
	public void setTextViews(){
		
		//we set our boundaries for out textviews.
		text_calorie.setBounds(190,245,40,20);
		text_squat.setBounds(300,205,40,20);
		text_bench.setBounds(220,225,40,20);
		text_weight.setBounds(230,185,40,20);
		text_height.setBounds(140,265,40,20);
		
		ideal_tweight.setBounds(1100,200,40,20);
		ideal_tbench.setBounds(1100,220,40,20);
		ideal_tsquat.setBounds(1100,240,40,20);
		
		//we set our text input boxes to 0.
		text_squat.setText("0");
		text_bench.setText("0");
		text_weight.setText("0");
		text_calorie.setText("0");
		text_height.setText("0");
		
		ideal_tweight.setText("0");
		ideal_tbench.setText("0");
		ideal_tsquat.setText("0");
		
	}
	
	//to add our textViews
	public void addTextViews(){
		
		add(text_squat);
		add(text_bench);
		add(text_weight);
		add(text_calorie);
		add(text_height);
		
		add(ideal_tweight);
		add(ideal_tbench);
		add(ideal_tsquat);
		
	}
	
	//To print out our description and other information.
	public void Desc(Graphics g){
		
		g.drawString("G.Y.I.B. is an application that will you determine how your BMI compares to the national averages, as well as help you in your attempt to reach your ideal body figure!", 250, 20);
		g.drawString("It will provide a month to month prediction of your transformation through the values that you input! (Designed for adults ages 20+)", 375, 40);
		
		g.drawString("What is the max weight you can squat with (in pounds): ", 0, 220);
		g.drawString("How much can you bench (in pounds): ", 0, 240);
		g.drawString("How much do you weigh (in kilograms): ", 0, 200);
		g.drawString("What is your daily calorie intake: ", 0, 260);
		g.drawString("How tall are you (in cm): ", 0, 280);
		
		g.drawString(": Enter your Ideal Weight (in kilograms)", 1150, 210);
		g.drawString(": Enter your ideal Squat (in pounds)", 1150, 230);
		g.drawString(": Enter your ideal Bench (in pounds)", 1150, 250);
		
	}
	
	//Gets our input
	public void getInput(){
		
		//prints out the questions
		String s1, s2, s3, s4, s5, s6;
				
		String i1, i2, i3;
				
		//gets the strings from the textViews
		s1 = text_squat.getText();
		s2 = text_bench.getText();
		s3 = text_weight.getText();
		s5 = text_calorie.getText();
		s6 = text_height.getText();
				
		i1 = ideal_tsquat.getText();
		i2 = ideal_tweight.getText();
		i3 = ideal_tbench.getText();
				
		//Turns the strings into values
		squat = Integer.parseInt(s1);
		bench = Integer.parseInt(s2);
		body_weight = Integer.parseInt(s3);
		calorie = Integer.parseInt(s5);
		height = Integer.parseInt(s6);
				
		ideal_squat = Integer.parseInt(i1);
		ideal_weight = Integer.parseInt(i2);
		ideal_bench = Integer.parseInt(i3);
		
		
	}
	
	//To print the information to help out the user.
	public void info(Graphics g){
		
		//For those that have reached their ideal body type.
		if(body_weight == ideal_weight && squat == ideal_squat && bench == ideal_bench){
			
			g.drawString("Congratulations! You have reached your ideal body type!", 0, 460);
		
		}else{
		    
			//For those that are working to reach it, prints out information to reach ideal BMI.
			g.drawString("In order to reach your ideal body, we suggest that you:", 0, 460);
		
		    if(body_weight > ideal_weight){
		    	
		    	g.drawString("*Intake under 2400 calories per day, ", 0, 500);
			  
		    }else if(body_weight == ideal_weight){
			  
				g.drawString("*Maintain this weight by intaking 2400-3000 calories per day, ", 0, 500);
		
			}else if(ideal_weight > body_weight){
			
				g.drawString("*Intake more than 3000 calories per day, ", 0, 500);
		
		}
		
		//Gives suggestions to those who wants to maximize results in their workout program.
		if(num.lowerBody(squat,body_weight) > num.upperBody(bench, body_weight)){
			
			  g.drawString("*Do lower-body strength training two days a week,", 0, 520);
		      g.drawString("*And do upper-body strength training four days a week.", 0, 540);
		
		}  else if(num.lowerBody(squat, body_weight) < num.upperBody(bench, body_weight)){
			
			  g.drawString("*Do lower-body strength training four days a week,", 0, 520);
			  g.drawString("*And do upper-body strength training two days a week.", 0, 540);
		
		}  else{
			
			  g.drawString("*Do lower-body strength training three days a week,", 0, 520);
		      g.drawString("*And do upper-body strength training three days a week.", 0, 540);
		
		}
	}
	
}
	
	
	public boolean action(Event event, Object obj){
		
		repaint();
		return true;
	
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		String action = e.getActionCommand();
		
		//To update the application.
		if(action.equals("Get My Results")){
			
			repaint();
		
		}
		
	}

}
