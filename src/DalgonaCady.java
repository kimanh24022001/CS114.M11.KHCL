import java.awt.event.*;
import java.awt.*;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

public class DalgonaCady implements ActionListener {
	
	JFrame frame = new JFrame();
	JButton buttonOne = new JButton();
	JButton buttonTwo = new JButton();
	JButton buttonThree = new JButton();
	JLabel background = new JLabel();
	JPanel button_panel = new JPanel();
	JPanel panel = new JPanel();
	JLabel img2_label = new JLabel();
	JLabel img3_label = new JLabel();
	JLabel pain = new JLabel();
	JTextField pick = new JTextField();
	JTextField lose = new JTextField();
	JTextField next = new JTextField();
	JButton[] Buttons = new JButton[4];
    Border thickBorder = new LineBorder(Color.pink, 5);
	int key[]= {1,2,3,4};
	int flag=0;
	ImageIcon img6= new ImageIcon("C:\\Users\\DELL\\Downloads\\src\\img6.jpg");
	ImageIcon img5= new ImageIcon("C:\\Users\\DELL\\Downloads\\src\\img5.jpg");
	ImageIcon img7= new ImageIcon("C:\\Users\\DELL\\Downloads\\src\\img7.png");
	ImageIcon img8= new ImageIcon("C:\\Users\\DELL\\Downloads\\src\\img8.png");
	ImageIcon img9= new ImageIcon("C:\\Users\\DELL\\Downloads\\src\\img9.png");
	ImageIcon img10= new ImageIcon("C:\\Users\\DELL\\Downloads\\src\\img10.png");
	ImageIcon img11= new ImageIcon("C:\\Users\\DELL\\Downloads\\src\\img11.png");
	public DalgonaCady() {
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(550,1200);
		frame.getContentPane().setBackground(Color.white);
		frame.setLayout(null);
		frame.setResizable(false);		
		
		buttonOne.setBounds(150,600,100,100);
		buttonOne.setFont(new Font("MV Boli",Font.BOLD,15));
		buttonOne.setFocusable(false);
		buttonOne.addActionListener(this);
		buttonOne.setText("PLAY!");
		buttonOne.setBackground(Color.pink);
		buttonOne.setForeground(Color.white);
		
		buttonTwo.setBounds(260,600,100,100);
		buttonTwo.setFont(new Font("MV Boli",Font.BOLD,13));
		buttonTwo.setFocusable(false);
		buttonTwo.addActionListener(this);
		buttonTwo.setText("BACK");
		buttonTwo.setBackground(new Color(123,200,200));
		buttonTwo.setForeground(Color.white);
		
		background.setBounds(0,0,550,660);
	//	matxinh.setHorizontalAlignment(matxinh.CENTER);
	    background.setIcon(img6);
		
		
		frame.add(background);
		background.add(buttonOne);
		background.add(buttonTwo);
	
		frame.setVisible(true);
	}
	 public void Play(){
			
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setSize(550,1200);
			frame.getContentPane().setBackground(Color.white);
			frame.setLayout(null);
			frame.setResizable(true);
			
			pick.setBounds(200,15,90,80);
			pick .setText("PICK ONE!");
			pick.setFont(new Font("Ink Free",Font.BOLD,15));
			pick.setForeground(Color.black);
			pick.setBackground(null);
			pick.setBorder(thickBorder);	
			
			button_panel.setBounds(150,100,200,200);
			button_panel.setBorder(thickBorder);	
			button_panel.setLayout(new GridLayout(2,2));
			
			pain.setBounds(400,10,200,200);
			pain.setIcon(img11);

			panel.setBounds(80,320,360,360);
			panel.setBorder(thickBorder);
			panel.setLayout(new GridLayout(1,1));
			buttonThree.setIcon(img7);
			panel.add(buttonThree);
			for(int i=0;i<4;i++) {
				Buttons[i] = new JButton();
				button_panel.add(Buttons[i]);
				Buttons[i].setFont(new Font("MV Boli",Font.BOLD,13));
				Buttons[i].setFocusable(false);
				Buttons[i].addActionListener(this);
				Buttons[i].setIcon(img5);
			}
			
			frame.add(button_panel);
			frame.add(pick);
			frame.add(panel);
			frame.add(pain);
			frame.setVisible(true);
	 }
	 public void Congratulations(){
			
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setSize(650,1200);
			frame.getContentPane().setBackground(Color.black);
			frame.setLayout(null);
			frame.setResizable(true);
			
		
			
			next.setBounds(280,600,90,70);
			next.setFont(new Font("Ink Free",Font.BOLD,35));
			next.setFocusable(false);
			next.addActionListener(this);
			next.setText("Next");
			next.setBackground(Color.white);
			next.setForeground(Color.black);
	
		//	for(int i=0;i<110;i++) {
			//	if (Buttons[i].setBackground()
			frame.add(next);
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
	    
	    if(e.getSource()==buttonTwo ) {
			//	clip.stop();
		//       new History();
			}
	    for(int i=11;i>=0;i--) {
	    	if(e.getSource()==Buttons[i]  ) {
				
	    		flag=0;
	    	}
		}
	}
}
