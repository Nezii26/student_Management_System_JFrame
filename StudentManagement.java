import javax.swing.*;
import java.awt.*;
class StudentManagement extends JFrame{
	StudentManagement(){
		setSize(450,450);
		setTitle("Student Management");
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);	
		setLocationRelativeTo(null);
		
		JPanel titlePanel = new JPanel(new GridLayout(2,1));
		
		JLabel lblTitleS = new JLabel("Student Management");
		lblTitleS.setFont(new Font("",1,20));
		lblTitleS.setHorizontalAlignment(JLabel.CENTER);
		add("North",lblTitleS);
		
		
		JLabel lblTitleS2 = new JLabel("Choose an option from the menu below to get started");
		lblTitleS2.setFont(new Font("",1,10));
		lblTitleS2.setHorizontalAlignment(JLabel.CENTER);
		add("Center",lblTitleS2);
		
		titlePanel.add(lblTitleS);
		titlePanel.add(lblTitleS2);
		
		add(titlePanel, BorderLayout.NORTH);
			
		
	}
	
}

