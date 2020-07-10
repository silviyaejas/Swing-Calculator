import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Calculator implements ActionListener{
	boolean isOperatorClicked=false;
	boolean isEqualToClickedAlready=false;
	boolean isSignClicked=false;
	boolean isDotClicked=false;
	boolean isModClicked=false;
	String oldValue="0",newValue;
	String operator;
	Float oldValueF,newValueF;
	
	JFrame jf;
	JLabel displayLabel;
	JButton sevenButton;
	JButton eightButton;
	JButton nineButton;
	JButton fourButton;
	JButton fiveButton;
	JButton sixButton;
	JButton oneButton;
	JButton twoButton;
	JButton threeButton;
	JButton dotButton,clearButton;
	JButton zeroButton,modButton,signButton;
	JButton equalButton,divButton,mulButton,minusButton,plusButton;
	
	
	public Calculator() {
		jf=new JFrame("Calculator");
		jf.setLayout(null);
		jf.setSize(420, 640);   //width,height
		jf.setLocation(300,150);  //position of the window on the screen
		jf.getContentPane().setBackground(Color.BLACK); 
		
		//Display screen
		displayLabel=new JLabel();
		displayLabel.setBounds(30, 40, 350, 60);
		displayLabel.setFont(new Font("Serif", Font.PLAIN, 50));
		displayLabel.setBackground(Color.decode("#1F2333"));
		displayLabel.setOpaque(true);
		displayLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		displayLabel.setForeground(Color.white);
		displayLabel.setText("0");
		jf.add(displayLabel);
		
		
		
		//Buttons in calculator
		
		clearButton=new JButton("C");
		clearButton.setBounds(30,130 , 80, 80);
		clearButton.setFont(new Font("Arial", Font.PLAIN, 30));
		clearButton.setBackground(Color.decode("#434B69"));
		clearButton.setForeground(Color.WHITE);
		clearButton.addActionListener(this);
		jf.add(clearButton);
		
		signButton=new JButton("+/-");
		signButton.setBounds(120,130 , 80,80); 
		signButton.setFont(new Font("Arial", Font.PLAIN, 30));
		signButton.setBackground(Color.decode("#434B69"));
		signButton.setForeground(Color.WHITE);
		signButton.addActionListener(this);
		jf.add(signButton);
		
		modButton=new JButton("%");
		modButton.setBounds(210,130 , 80, 80); 
		modButton.setFont(new Font("Arial", Font.PLAIN, 30));
		modButton.setBackground(Color.decode("#434B69"));
		modButton.setForeground(Color.WHITE);
		modButton.addActionListener(this);
		jf.add(modButton);
		
		
	
		sevenButton=new JButton("7");
		sevenButton.setBounds(30,220 , 80, 80); 
		sevenButton.setFont(new Font("Arial", Font.PLAIN, 30));
		sevenButton.setBackground(Color.decode("#141933"));
		sevenButton.setForeground(Color.WHITE);
		sevenButton.addActionListener(this);
		jf.add(sevenButton);
		
		eightButton=new JButton("8");
		eightButton.setBounds(120,220 , 80, 80);
		eightButton.setFont(new Font("Arial", Font.PLAIN, 30));
		eightButton.setBackground(Color.decode("#141933"));
		eightButton.setForeground(Color.WHITE);
		eightButton.addActionListener(this);
		jf.add(eightButton);

		nineButton=new JButton("9");
		nineButton.setBounds(210,220 , 80, 80);
		nineButton.setFont(new Font("Arial", Font.PLAIN, 30));
		nineButton.setBackground(Color.decode("#141933"));
		nineButton.setForeground(Color.WHITE);
		nineButton.addActionListener(this);
		jf.add(nineButton);
		
		
		fourButton=new JButton("4");
		fourButton.setBounds(30,310 , 80, 80);
		fourButton.setFont(new Font("Arial", Font.PLAIN, 30));
		fourButton.setBackground(Color.decode("#141933"));
		fourButton.setForeground(Color.WHITE);
		fourButton.addActionListener(this);
		jf.add(fourButton);

		fiveButton=new JButton("5");
		fiveButton.setBounds(120,310 , 80, 80);
		fiveButton.setFont(new Font("Arial", Font.PLAIN, 30));
		fiveButton.setBackground(Color.decode("#141933"));
		fiveButton.setForeground(Color.WHITE);
		fiveButton.addActionListener(this);
		jf.add(fiveButton);

		sixButton=new JButton("6");
		sixButton.setBounds(210,310 , 80, 80);
		sixButton.setFont(new Font("Arial", Font.PLAIN, 30));
		sixButton.setBackground(Color.decode("#141933"));
		sixButton.setForeground(Color.WHITE);
		sixButton.addActionListener(this);
		jf.add(sixButton);
		
		oneButton=new JButton("1");
		oneButton.setBounds(30,400 , 80, 80);
		oneButton.setFont(new Font("Arial", Font.PLAIN, 30));
		oneButton.setBackground(Color.decode("#141933"));
		oneButton.setForeground(Color.WHITE);
		oneButton.addActionListener(this);
		jf.add(oneButton);

		twoButton=new JButton("2");
		twoButton.setBounds(120,400 , 80, 80);
		twoButton.setFont(new Font("Arial", Font.PLAIN, 30));
		twoButton.setBackground(Color.decode("#141933"));
		twoButton.setForeground(Color.WHITE);
		twoButton.addActionListener(this);
		jf.add(twoButton);

		threeButton=new JButton("3");
		threeButton.setBounds(210,400 , 80, 80);
		threeButton.setFont(new Font("Arial", Font.PLAIN, 30));
		threeButton.setBackground(Color.decode("#141933"));
		threeButton.setForeground(Color.WHITE);
		threeButton.addActionListener(this);
		jf.add(threeButton);
		
	

		zeroButton=new JButton("0");
		zeroButton.setBounds(30,490 , 170, 80);
		zeroButton.setFont(new Font("Arial", Font.PLAIN, 30));
		zeroButton.setBackground(Color.decode("#141933"));
		zeroButton.setForeground(Color.WHITE);
		zeroButton.addActionListener(this);
		jf.add(zeroButton);
		
		dotButton=new JButton(".");
		dotButton.setBounds(210,490 , 80, 80);
		dotButton.setFont(new Font("Arial", Font.PLAIN, 30));
		dotButton.setBackground(Color.decode("#141933"));
		dotButton.setForeground(Color.WHITE);
		dotButton.addActionListener(this);
		jf.add(dotButton);

		equalButton=new JButton("=");
		equalButton.setBounds(300,490 , 80, 80);
		equalButton.setFont(new Font("Arial", Font.PLAIN, 30));
		equalButton.setBackground(Color.decode("#149DDD"));
		equalButton.setForeground(Color.WHITE);
		equalButton.addActionListener(this);
		jf.add(equalButton);
		
		
		divButton=new JButton("/");
		divButton.setBounds(300,130 , 80, 80);
		divButton.setFont(new Font("Arial", Font.PLAIN, 30));
		divButton.setBackground(Color.decode("#149DDD"));
		divButton.setForeground(Color.WHITE);
		divButton.addActionListener(this);
		jf.add(divButton);
        
		mulButton=new JButton("x");
		mulButton.setBounds(300,220 , 80, 80);
		mulButton.setFont(new Font("Arial", Font.PLAIN, 30));
		mulButton.setBackground(Color.decode("#149DDD"));
		mulButton.setForeground(Color.WHITE);
		mulButton.addActionListener(this);
		jf.add(mulButton);
		
		minusButton=new JButton("-");
		minusButton.setBounds(300,310 , 80, 80);
		minusButton.setFont(new Font("Arial", Font.PLAIN, 30));
		minusButton.setBackground(Color.decode("#149DDD"));
		minusButton.setForeground(Color.WHITE);
		minusButton.addActionListener(this);
		jf.add(minusButton);
		
		plusButton=new JButton("+");
		plusButton.setBounds(300,400 , 80, 80);
		plusButton.setFont(new Font("Arial", Font.PLAIN, 30));
		plusButton.setBackground(Color.decode("#149DDD"));
		plusButton.setForeground(Color.WHITE);
		plusButton.addActionListener(this);
		jf.add(plusButton);
		
		
		
		jf.setVisible(true);    //window made visible
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//to stop the program execution once the window is closed
	}
   
	public static void main(String[] args) {
		new Calculator();   //object for class Calculator 
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==sevenButton) {
			if(isOperatorClicked||displayLabel.getText()=="0") {
				displayLabel.setText("7");
				isOperatorClicked=false;
			}else {
				displayLabel.setText(displayLabel.getText()+ "7");	
			}
		}
		
		else if(e.getSource()==eightButton) {
			 if(isOperatorClicked||displayLabel.getText()=="0") {
				displayLabel.setText("8");
				isOperatorClicked=false;
			}else {
				displayLabel.setText(displayLabel.getText()+ "8");	
			}
			}
		
		else if(e.getSource()==nineButton) {
			 if(isOperatorClicked||displayLabel.getText()=="0") {
					displayLabel.setText("9");
					isOperatorClicked=false;
				}else {
					
					displayLabel.setText(displayLabel.getText()+ "9");
				}
			}
		
		else if(e.getSource()==fourButton) {
			if(isOperatorClicked||displayLabel.getText()=="0") {
				displayLabel.setText("4");
				isOperatorClicked=false;
			}else {
				displayLabel.setText(displayLabel.getText()+ "4");	
			}	
		}
		
		else if(e.getSource()==fiveButton) {
			if(isOperatorClicked||displayLabel.getText()=="0") {
				displayLabel.setText("5");
				isOperatorClicked=false;
			}else {
				displayLabel.setText(displayLabel.getText()+ "5");	
			}
		}
		else if(e.getSource()==sixButton) {
			if(isOperatorClicked||displayLabel.getText()=="0") {
				displayLabel.setText("6");
				isOperatorClicked=false;
			}else {
				displayLabel.setText(displayLabel.getText()+ "6");	
			}
		}
		
		else if(e.getSource()==oneButton) {
			if(isOperatorClicked||displayLabel.getText()=="0") {
				displayLabel.setText("1");
				isOperatorClicked=false;
			}else {
				displayLabel.setText(displayLabel.getText()+ "1");	
			}
		}
		
		else if(e.getSource()==twoButton) {
			if(isOperatorClicked||displayLabel.getText()=="0") {
				displayLabel.setText("2");
				isOperatorClicked=false;
			}else {
				displayLabel.setText(displayLabel.getText()+ "2");	
			}
		}
		else if(e.getSource()==threeButton) {
			if(isOperatorClicked||displayLabel.getText()=="0") {
				displayLabel.setText("3");
				isOperatorClicked=false;
			}else {
				displayLabel.setText(displayLabel.getText()+ "3");	
			}
		}
		else if(e.getSource()==dotButton) {
			
			if(isDotClicked==false) {
			if(isOperatorClicked) {
				displayLabel.setText("0.");
				isOperatorClicked=false;
			}else {
				displayLabel.setText(displayLabel.getText()+ ".");	
			}
			isDotClicked=true;
			}
		}
		else if(e.getSource()==zeroButton) {
			if(isOperatorClicked||displayLabel.getText()=="0") {
				displayLabel.setText("0");
				isOperatorClicked=false;
			}else {
				displayLabel.setText(displayLabel.getText()+ "0");	
			}
			
		}
		
		
		
		else if(e.getSource()==modButton) {
			String newValue1;
			Float oldValue1F,newValue1F;
			
			if(isModClicked) {
				oldValue1F=Float.parseFloat(oldValue);
				newValue1=displayLabel.getText();
				newValue1F=Float.parseFloat(newValue1);
				newValue1F=(oldValue1F*newValue1F)/100;
				displayLabel.setText(newValue1F+"");
				isModClicked=false;
				isOperatorClicked=true;
				
			}else {
				newValue1=displayLabel.getText();
				newValue1F=Float.parseFloat(newValue1);
				newValue1F=newValue1F/100;
				displayLabel.setText(newValue1F+"");
				isOperatorClicked=true;
			}
	
		}
		
		
		else if(e.getSource()==signButton) {
			String newValue2;
			newValue2=displayLabel.getText();
			
			if(newValue2!="0") {
				if(isSignClicked==false) {
				newValue2="-"+newValue2;
				displayLabel.setText(newValue2);
				isSignClicked=true;
				
				}
				else {
					newValue2= newValue2.replaceAll("-", "");
					displayLabel.setText(newValue2);
					isSignClicked=false;
				}
			}
		}
		
		
		else if(e.getSource()==divButton) {
			
			isOperatorClicked=true;
			oldValue=displayLabel.getText();
			operator="/";
			isEqualToClickedAlready=false;
			isDotClicked=false;
		}
		else if(e.getSource()==mulButton) {
			
			isOperatorClicked=true;
			oldValue=displayLabel.getText();
			operator="x";
			isEqualToClickedAlready=false;
			isDotClicked=false;
			
		}
		else if(e.getSource()==minusButton) {
	
			isOperatorClicked=true;
			oldValue=displayLabel.getText();
			operator="-";
			isEqualToClickedAlready=false;
			isDotClicked=false;
			isModClicked=true;
		}
		else if(e.getSource()==plusButton) {
			
			isOperatorClicked=true;
			oldValue=displayLabel.getText();
			operator="+";
			isEqualToClickedAlready=false;
			isDotClicked=false;
			isModClicked=true;
			

		}
		else if(e.getSource()==equalButton) {
			
			isOperatorClicked=true;
			isDotClicked=false;
			if(isEqualToClickedAlready==false) {
			newValue=displayLabel.getText();
			oldValueF=Float.parseFloat(oldValue);
			newValueF=Float.parseFloat(newValue);
			isEqualToClickedAlready=true;
			
			}else {
				oldValue=displayLabel.getText();
				oldValueF=Float.parseFloat(oldValue);
			
			}
			if(operator=="/") {
				float result=oldValueF/newValueF;
				displayLabel.setText(result+"");
			}
			else if(operator=="x") {
				float result=oldValueF*newValueF;
				displayLabel.setText(result+"");
			}
			else if(operator=="-") {
				float result=oldValueF-newValueF;
				displayLabel.setText(result+"");
			}
			else if(operator=="+") {
				float result=oldValueF+newValueF;
				displayLabel.setText(result+"");
				
			}

			
		
		
		
		
		
		}
		else if(e.getSource()==clearButton) {
			
			isEqualToClickedAlready=false;
			isSignClicked=false;
			isDotClicked=false;
			displayLabel.setText("0");
			oldValue="0";
			newValue="0";
			operator="";
			
		}
		
	}

	
	
}
