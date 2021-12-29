import java.awt.event.*;
import java.awt.*;

import javax.swing.*;

public class glassBridge implements ActionListener {
	
	JFrame frame = new JFrame();
	JButton buttonOne = new JButton();
	JButton buttonTwo = new JButton();
	JButton buttonThree = new JButton();
	JLabel background = new JLabel();
	JPanel button_panel = new JPanel();
	JLabel img2_label = new JLabel();
	JLabel img3_label = new JLabel();
	JTextField win = new JTextField();
	JTextField lose = new JTextField();
	JButton next = new JButton();
	JButton[] Buttons = new JButton[12];
	int key[]= {1,3,5,6,8,11};
	int flag=0;
	ImageIcon img1= new ImageIcon("C:\\Users\\DELL\\Downloads\\src\\img1.jpg");
	ImageIcon img2= new ImageIcon("C:\\Users\\DELL\\Downloads\\src\\img2.png");
	ImageIcon img3= new ImageIcon("C:\\Users\\DELL\\Downloads\\src\\img3.png");
	ImageIcon img4= new ImageIcon("C:\\Users\\DELL\\Downloads\\src\\img4.jpg");
	public glassBridge() {
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(550,1200);
	//	frame.getContentPane().setBackground(new Color(123,200,200));
		frame.setLayout(null);
		frame.setResizable(false);
		
		
		buttonOne.setBounds(150,300,100,100);
		buttonOne.setFont(new Font("MV Boli",Font.BOLD,15));
		buttonOne.setFocusable(false);
		buttonOne.addActionListener(this);
		buttonOne.setText("PLAY");
		buttonOne.setBackground(Color.pink);
		buttonOne.setForeground(Color.white);
		
		buttonTwo.setBounds(260,300,100,100);
		buttonTwo.setFont(new Font("MV Boli",Font.BOLD,13));
		buttonTwo.setFocusable(false);
		buttonTwo.addActionListener(this);
		buttonTwo.setText("BACK");
		buttonTwo.setBackground(new Color(123,200,200));
		buttonTwo.setForeground(Color.white);
		
		background.setBounds(0,0,550,660);
	//	matxinh.setHorizontalAlignment(matxinh.CENTER);
	    background.setIcon(img1);
		
		
		frame.add(background);
		background.add(buttonOne);
		background.add(buttonTwo);
	
		frame.setVisible(true);
	}
	 public void Play(){
			
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setSize(550,1200);
			frame.getContentPane().setBackground(Color.gray);
			frame.setLayout(null);
			frame.setResizable(true);
			
			buttonThree.setBounds(20,400,100,100);
			buttonThree.setFont(new Font("MV Boli",Font.BOLD,30));
			buttonThree.setFocusable(false);
			buttonThree.addActionListener(this);
			buttonThree.setText("Go");
			buttonThree.setBackground(Color.black);
			buttonThree.setForeground(Color.white);
			
			img2_label.setBounds(450,500,100,100);
			img2_label.setIcon(img2);
			img3_label.setBounds(150,640,100,100);
			img3_label.setIcon(img3);
			
			button_panel.setBounds(150,50,220,600);
			
			button_panel.setLayout(new GridLayout(6,2));
			for(int i=0;i<12;i++) {
				Buttons[i] = new JButton();
				button_panel.add(Buttons[i]);
				Buttons[i].setFont(new Font("MV Boli",Font.BOLD,13));
				Buttons[i].setFocusable(false);
				Buttons[i].addActionListener(this);
				//Buttons[i].setIcon(img4);
			}
			
			frame.add(button_panel);
			frame.add(img2_label);
			frame.add(img3_label);
			frame.add(buttonThree);
		//	frame.remove(img3_label);
			frame.setVisible(true);
	 }
	 public void Congratulations(){
			
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setSize(650,1200);
			frame.getContentPane().setBackground(Color.black);
			frame.setLayout(null);
			frame.setResizable(true);
			
			win.setBounds(200,40,150,100);
			win .setText("You Won!");
			win.setFont(new Font("Ink Free",Font.BOLD,30));
			win.setForeground(Color.white);
			win.setBackground(null);
			
			next.setBounds(280,600,90,70);
			next.setFont(new Font("Ink Free",Font.BOLD,20));
			next.setFocusable(false);
			next.addActionListener(this);
			next.setText("Next");
			next.setBackground(Color.white);
			next.setForeground(Color.black);
			img3_label.setBounds(100,50,100,100);
			img3_label.setIcon(img3);
		//	for(int i=0;i<110;i++) {
			//	if (Buttons[i].setBackground()
			frame.add(next);
			frame.add(win);
			frame.add(img3_label);
	 }
	 public void GameOver(){
			
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setSize(650,1200);
			frame.getContentPane().setBackground(Color.black);
			frame.setLayout(null);
			frame.setResizable(true);

			lose.setBounds(450,200,140,100);
			lose.setText("You Lose!");
			lose.setFont(new Font("Ink Free",Font.BOLD,30));
			lose.setForeground(Color.white);
			lose.setBackground(Color.red);	
			
			frame.add(lose);
			}

	@Override
	public void actionPerformed(ActionEvent e) {
		buttonOne.setEnabled(false);
		buttonTwo.setEnabled(false);
	    if(e.getSource()==buttonOne ) {
	    	 Play();
	    	frame.remove(background);
	    	background.remove(buttonOne);
	   		background.remove(buttonTwo);
		}
	    
	    if(e.getSource()==next ) {
			//	clip.stop();
		       new EvenOddMarbles();
			}
	    for(int i=11;i>=0;i--) {
	    	if(e.getSource()==Buttons[i]  ) {
				img3_label.setBounds(0,0,100,100);
	    		for(int k=11;k>=0;k--) {
	    			Buttons[k].setIcon(null);
	    		}
				img3_label.setIcon(null);
	    		for (int j=0;j<6;j++) {
	    			if (key[j]==i) {
	    				Buttons[i].setIcon(img3);
	    				flag=1;
	    	    		if (j==0) {
		    	    		frame.remove(button_panel);	
	    	    			Congratulations();
	    	    		}
	    				//break;
	    			}
	    		}
	    		if (flag==0) {
	    			frame.remove(img3_label);
	    			Buttons[i].setIcon(img4);
    	    		frame.add(lose);
	    			GameOver();
	    		}
	    		flag=0;
	    	}
		}
	}
}
