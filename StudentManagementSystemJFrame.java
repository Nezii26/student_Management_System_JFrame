import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.awt.event.*;


class Homepage extends JFrame{
	
	
	Homepage(){
		setSize(400,400);
		setTitle("View Student System");
		setLocationRelativeTo(null);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		
		//Home page Title Bar
		JPanel hometitlePanel = new JPanel(new GridLayout(3, 1));
		
		JLabel lblTitle1 = new JLabel("ICET");
		lblTitle1.setFont(new Font("",1,28));
		lblTitle1.setHorizontalAlignment(JLabel.CENTER);
		
		JLabel lblTitle2 = new JLabel("Learning Management System");
		lblTitle2.setFont(new Font("",1,24));
		lblTitle2.setHorizontalAlignment(JLabel.CENTER);		
		
		JLabel lblTitle3 = new JLabel("Choose an option from the menu below to get started");
		lblTitle3.setFont(new Font("",1,8));
		lblTitle3.setHorizontalAlignment(JLabel.CENTER);
		
		hometitlePanel.add(lblTitle1);
		hometitlePanel.add(lblTitle2);
		hometitlePanel.add(lblTitle3);
		
		add(hometitlePanel, BorderLayout.NORTH);
		add("North",hometitlePanel);
////////////////////////////////////Management Buttons//////////////////////////////////////////	
	
		//Home Button
		JPanel homeButtonPanel = new JPanel();
		homeButtonPanel.setLayout(new GridLayout(4,1,4,4));
		
		//student button
		JButton btnstudent = new JButton("Student Management");
		btnstudent.setFont(new Font("",1,20));
		
		JPanel studentPanel = new JPanel();
		studentPanel.add(btnstudent);
		
		homeButtonPanel.add(studentPanel);
		
		
		
		//batch button
		JButton btnbatch = new JButton("Batch Management");
		btnbatch.setFont(new Font("",1,20));
		
		JPanel batchPanel = new JPanel();
		batchPanel.add(btnbatch);
		
		homeButtonPanel.add(batchPanel);
		
		
		
		//grade button
		JButton btngrade = new JButton("Grade Management");
		btngrade.setFont(new Font("",1,20));
		
		JPanel gradePanel = new JPanel();
		gradePanel.add(btngrade);
		
		homeButtonPanel.add(gradePanel);
		
		
		
		//report button
		JButton btnreport = new JButton("Report Management");
		btnreport.setFont(new Font("",1,20));
		
		JPanel reportPanel = new JPanel();
		reportPanel.add(btnreport);
		
		homeButtonPanel.add(reportPanel);
		

///////////////////////Move Management Pages/////////////////////////////////////////

		//Student Management
		btnstudent.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent evt){
					
				StudentManagement studentManagement = new StudentManagement();
				studentManagement.setVisible(true);
			}
		});	
		
		//Batch Management
		btnbatch.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent evt){
					
				BatchManagement batchManagement = new BatchManagement();
				batchManagement.setVisible(true);
			}
		});	 
		
		//Grade Management
		btngrade.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent evt){
					
				GradeManagement gradeManagement = new GradeManagement();
				gradeManagement.setVisible(true);
			}
		});	
		
		//Report Management
		btnreport.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent evt){
					
				ReportManagement reportManagement = new ReportManagement();
				reportManagement.setVisible(true);
			}
		});	

		add(homeButtonPanel);

	}

}

class StudentManagementSystemJFrame{
	public static void main(String[] args){
		Homepage homePage= new Homepage();
		homePage.setVisible(true);	
	}
}
