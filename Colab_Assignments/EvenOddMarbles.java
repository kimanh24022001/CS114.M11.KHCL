import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
	public class EvenOddMarbles implements ActionListener {
		
		JFrame frame = new JFrame();
		JButton buttonOne = new JButton();
		JButton buttonTwo = new JButton();
		JButton buttonThree = new JButton();
		JButton buttonFour= new JButton();
		JLabel background= new JLabel();
		JButton Odd = new JButton();
		JButton Even = new JButton();
		JTextField text = new JTextField();
		JTextField win = new JTextField();
		JTextField lose = new JTextField();
		JButton next = new JButton();
		ImageIcon img14= new ImageIcon("C:\\Users\\DELL\\Downloads\\src\\img14.jpg");
		ImageIcon img15= new ImageIcon("C:\\Users\\DELL\\Downloads\\src\\img15.png");
		ImageIcon img16= new ImageIcon("C:\\Users\\DELL\\Downloads\\src\\img16.png");
		ImageIcon img17= new ImageIcon("C:\\Users\\DELL\\Downloads\\src\\img17.jpg");
		public EvenOddMarbles() {
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setSize(700,900);
		//	frame.getContentPane().setBackground(new Color(123,200,200));
			frame.setLayout(null);
			frame.setResizable(false);
			
			
			buttonOne.setBounds(220,500,120,100);
			buttonOne.setFont(new Font("MV Boli",Font.BOLD,20));
			buttonOne.addActionListener(this);
			buttonOne.setText("PLAY");
			buttonOne.setBackground(Color.orange);
			buttonOne.setForeground(Color.white);
			
			buttonTwo.setBounds(400,500,120,100);
			buttonTwo.setFont(new Font("MV Boli",Font.BOLD,20));
			buttonTwo.addActionListener(this);
			buttonTwo.setText("BACK");
			buttonTwo.setBackground(Color.orange);
			buttonTwo.setForeground(Color.white);
			
			background.setBounds(0,0,700,700);
		//	matxinh.setHorizontalAlignment(matxinh.CENTER);
		    background.setIcon(img17);
			
			
			frame.add(background);
			background.add(buttonOne);
			background.add(buttonTwo);
		
			frame.setVisible(true);
		}
		 public void Play(){
				
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.setSize(550,1200);
				frame.getContentPane().setBackground(Color.orange);
				frame.setLayout(null);
				frame.setResizable(true);
				
				text.setBounds(200,15,100,100);
				text .setText("YOUR TURN!");
				text.setFont(new Font("Ink Free",Font.BOLD,15));
				text.setForeground(Color.white);
				text.setBackground(null);
				
				buttonThree.setBounds(150,100,170,200);
				buttonThree.setIcon(img16);
				buttonThree.setFocusable(false);
				buttonThree.addActionListener(this);
				
				buttonFour.setBounds(150,300,170,200);
				buttonFour.setIcon(img16);
				buttonFour.setFocusable(false);
				buttonFour.addActionListener(this);
				
				Odd.setBounds(50,150,100,100);
				Odd .setText("ODD");
				Odd.setFont(new Font("Ink Free",Font.BOLD,20));
				Odd.setForeground(Color.blue);
				Odd.setBackground(null);
				Odd.addActionListener(this);
				
				Even.setBounds(50,350,100,100);
				Even .setText("EVEN");
				Even.setFont(new Font("Ink Free",Font.BOLD,20));
				Even.setForeground(Color.blue);
				Even.setBackground(null);
				Even.addActionListener(this);
				
				frame.add(buttonThree);
				frame.add(buttonFour);
				frame.add(text);
				frame.add(Odd);
				frame.add(Even);
				frame.setVisible(true);
		 }
	public void Congratulations(){
						
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setSize(650,1200);
			frame.getContentPane().setBackground(Color.black);
			frame.setLayout(null);
			frame.setResizable(true);
						
			win.setBounds(400,100,150,100);
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
				
			frame.add(next);
			frame.add(win);
				 }
		 public void GameOver(){
				
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.setSize(650,1200);
				frame.getContentPane().setBackground(Color.black);
				frame.setLayout(null);
				frame.setResizable(true);

				lose.setBounds(400,100,150,100);
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
	    if(e.getSource()==Odd ) {
	    	Congratulations();
	    	buttonThree.setIcon(img14);
			buttonFour.setIcon(img15);
		}
	    if(e.getSource()==Even ) {
	    	GameOver();
			buttonThree.setIcon(img14);
			buttonFour.setIcon(img15);
		}
	    
	    if(e.getSource()==buttonTwo ) {
			//	clip.stop();
		//       new History();
			}
	}
}
