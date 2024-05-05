package ASS;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.Border;
import java.sql.*;
import java.awt.event.*;
import java.io.*;
import java.net.Socket;

public class Assignment2Demo extends JFrame implements ActionListener {

	JLabel L1, L2, L3, L4, L5,L6,L7, l0, l1, l2, l3, l4, l5, l6, l7, l8, l9,num1,num2,operator,result;
	JTextField T1, t0, t1, t2, t3, t4, t6, t7, t8, t9,N1,N2;
	JPasswordField P, P1;
	JButton B, B1, B2,B3,B4,B5,Send;
	JCheckBox check;
	JFrame F1, F2, F3;
	JComboBox<String> choose;
	JPanel panel;

	public Assignment2Demo() {
		F1 = new JFrame("::Login Page");
		F2 = new JFrame("::SignUp Page");
		F3 = new JFrame("Welcome ");
		panel= new JPanel();
		JLabel L1 = new JLabel();
		ImageIcon icon = new ImageIcon(Assignment2Demo.class.getResource("/ASS/lock2.png"));
		L1.setIcon(icon);
		
		Border border = BorderFactory.createLineBorder(Color.BLACK, 5);
		L1.setBorder(border);
		L2 = new JLabel("UserName");
		L3 = new JLabel("Password");
		L4 = new JLabel();
		L6 = new JLabel();
		L7 = new JLabel();
		L5 = new JLabel("<html><font color='green'>Acccount Created Successfull!!...<br>Login To Continue..</font></html>");
		T1 = new JTextField(20);
		P = new JPasswordField(20);
		B = new JButton("Login");
		B3= new JButton("Compute");
		B4= new JButton("Close");
		B5= new JButton("Logout");
		check = new JCheckBox("Show Password");
		B1 = new JButton("Signup");
		B2 = new JButton("SignUp");
		B1.setVisible(false);

		l0 = new JLabel("Fill The Form To SignUp");
		l0.setBounds(112, 21, 245, 25);
		l1 = new JLabel("First Name");
		l1.setBounds(37, 84, 95, 25);
		l2 = new JLabel("Last Name");
		l2.setBounds(37, 128, 95, 26);
		l3 = new JLabel("Email");
		l3.setBounds(37, 165, 95, 25);
		l4 = new JLabel("Tel");
		l4.setBounds(37, 201, 95, 22);
		l5 = new JLabel("UserName");
		l5.setBounds(37, 246, 95, 14);
		l6 = new JLabel("Password");
		l6.setBounds(37, 283, 95, 14);
		l7 = new JLabel("Gender");
		l7.setBounds(37, 321, 95, 14);
		l8 = new JLabel("UserType");
		l8.setBounds(37, 358, 95, 14);
		l9 = new JLabel("PhotoId");
		l9.setBounds(37, 401, 95, 19);

		t0 = new JTextField();
		t0.setBounds(222, 84, 135, 25);
		t1 = new JTextField();
		t1.setBounds(222, 131, 135, 25);
		t2 = new JTextField();
		t2.setBounds(222, 167, 135, 25);
		t3 = new JTextField();
		t3.setBounds(222, 202, 135, 25);
		t4 = new JTextField();
		t4.setBounds(222, 243, 135, 25);
		P1 = new JPasswordField();
		P1.setBounds(222, 280, 135, 27);
		t6 = new JTextField();
		t6.setBounds(222, 318, 135, 25);
		t7 = new JTextField();
		t7.setBounds(222, 355, 135, 25);
		t8 = new JTextField();
		t8.setBounds(222, 395, 135, 25);
		
		num1=new JLabel("Number 1:");
		num2=new JLabel("Number 2:");
		operator=new JLabel();
		result=new JLabel();
		choose = new JComboBox<>(new String[]{"Choose Operator","+",  "*", "/","%"});
		Send=new JButton("Send Data");
		N1= new JTextField();
		N2= new JTextField();
		
		L1.setBounds(160, 10, icon.getIconWidth(), icon.getIconHeight());
		L2.setBounds(56, 200, 98, 25);
		L3.setBounds(56, 260, 98, 25);
		L4.setBounds(109, 380, 310, 14);
		L5.setBounds(109, 380, 320, 30);
		L6.setBounds(142, 40, 246, 27);
		L7.setBounds(80, 120, 215, 145);
		T1.setBounds(224, 200, 158, 25);
		P.setBounds(224, 260, 158, 25);
		B.setBounds(90, 327, 98, 25);
		B1.setBounds(360, 327, 89, 25);
		B2.setBounds(122, 452, 108, 25);
		B3.setBounds(314, 150, 100, 27);
		B4.setBounds(314, 200, 100, 27);
		B5.setBounds(125, 300, 100, 27);
		check.setBounds(225, 324, 125, 25);
		
		num1.setBounds(10, 10, 80, 20);
		N1.setBounds(100, 10, 100, 20);
		num2.setBounds(10, 40, 80, 20);
		N2.setBounds(100, 40, 100, 20);
		choose.setBounds(10, 70, 190, 25);
		operator.setBounds(10, 70, 190, 25);
		Send.setBounds(10, 100, 190, 25);
		result.setBounds(10, 100, 190, 25);
		panel.setBounds(80, 120, 215, 145);
		panel.setBorder(BorderFactory.createLineBorder(Color.BLUE, 5));
		panel.setLayout(null);
		
		
		
		

		B.addActionListener(this);
		B1.addActionListener(this);
		B2.addActionListener(this);
		B3.addActionListener(this);
		B4.addActionListener(this);
		B5.addActionListener(this);
		check.addActionListener(this);
		Send.addActionListener(this);
		choose.addActionListener(this);

		F1.add(L1);
		F1.add(L2);
		F1.add(T1);
		F1.add(L3);
		F1.add(P);
		F1.add(B);
		F1.add(check);
		F1.add(B1);
		F1.add(L4);
		F1.add(L5);

		F1.setLayout(null);
		F1.setSize(500, 450);
		F1.setResizable(false);
		L5.setVisible(false);
		F1.setVisible(true);
		F1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		F2.add(l0);
		F2.add(l1);
		F2.add(l2);
		F2.add(l3);
		F2.add(l4);
		F2.add(l5);
		F2.add(l6);
		F2.add(l7);
		F2.add(l8);
		F2.add(l9);
		F2.add(B2);

		F2.add(t0);
		F2.add(t1);
		F2.add(t2);
		F2.add(t3);
		F2.add(t4);
		F2.add(t6);
		F2.add(t7);
		F2.add(t8);
		F2.add(P1);
		
		
		F2.setLayout(null);
		F2.setSize(500, 600);
		F2.setResizable(false);
		F2.setVisible(false);
		F2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		F3.add(L6);
		F3.add(L7);
		F3.add(B3);
		F3.add(B4);
		F3.add(B5);

	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String url = "jdbc:mysql://localhost:3306";
		String user = "root";
		String pass = "Dusengimana@123";
		if (e.getSource() == B) {

			try {
				Connection con = DriverManager.getConnection(url, user, pass);
				Statement st = con.createStatement();
				st.executeUpdate("CREATE DATABASE IF NOT EXISTS Assignment");
				st.executeUpdate("USE Assignment");
				st.executeUpdate(
						"CREATE TABLE IF NOT EXISTS User (Id INT PRIMARY KEY AUTO_INCREMENT, FirstName"
						+ " VARCHAR(20), LastName VARCHAR(20), Email VARCHAR(25), Tel INT(12), Username VARCHAR(20),"
						+ " Password VARCHAR(15), Gender VARCHAR(10), UserType VARCHAR(20), Photo_Id VARCHAR(20))");

				String query = "SELECT * FROM User WHERE Username = ? AND Password = ?";
				PreparedStatement stmt = con.prepareStatement(query);
				stmt.setString(1, T1.getText());
				stmt.setString(2, P.getText());
				ResultSet rs = stmt.executeQuery();

				if (rs.next()) {
					L6.setText("Welcome " + T1.getText().toUpperCase());
					L6.setForeground(Color.BLUE);
					Border border = BorderFactory.createLineBorder(Color.BLUE, 5); 
					L7.setBorder(border);
					F3.setTitle("Welcome " + T1.getText().toUpperCase());
					System.out.println(T1.getText());

					F3.setSize(500, 400);
					F3.setLayout(null);
					F3.setVisible(true);
					F1.setVisible(false);
				} else {

					L4.setText("<html><font color='red'>Wrong UserName Or Password!!</font></html>");
					B1.setVisible(true);
					L4.setVisible(true);

				}
			} catch (SQLException ex) {
				ex.printStackTrace();
			}
		}
		else if (e.getSource() == check) {
			if (check.isSelected()) {
				P.setEchoChar((char) 0);
			} else {
				P.setEchoChar('●');
			}
		} else if (e.getSource() == B1) {
			F1.setVisible(false);
			F2.setVisible(true);
			}
	 else if (e.getSource() == B2) {
			String url1 = "jdbc:mysql://localhost:3306/Assignment";
			try {

				Connection con = DriverManager.getConnection(url1, user, pass);
				Statement st = con.createStatement();
				st.executeUpdate("use Assignment");
				String query = "INSERT INTO User (FirstName, LastName, Email, Tel,"
						+ " Username, Password, Gender, UserType, Photo_Id) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
				PreparedStatement stmt = con.prepareStatement(query);
				stmt.setString(1, t0.getText());
				stmt.setString(2, t1.getText());
				stmt.setString(3, t2.getText());
				stmt.setString(4, t3.getText());
				stmt.setString(5, t4.getText());
				stmt.setString(6, P1.getText());
				stmt.setString(7, t6.getText());
				stmt.setString(8, t7.getText());
				stmt.setString(9, t8.getText());
				stmt.executeUpdate();

				System.out.println("Your account created successfully!...");

				F2.setVisible(false);
				F1.setVisible(true);
				F1.setSize(500, 500);
				B1.setVisible(false);
				L4.setVisible(false);
				L5.setVisible(true);
			} catch (Exception et) {
				System.out.println(et);

			}
		}
		else if(e.getSource()==B3) {
			L7.setVisible(false);
			B3.setVisible(false);
			B4.setVisible(false);

			panel.add(num1);panel.add(N1);
			panel.add(num2);panel.add(N2);
			panel.add(choose);
			panel.add(Send);
			
			F3.add(panel);
			
			}
		else if(e.getSource()==B4) {
			System.exit(0);	
			}
		else if(e.getSource()==B5) {
			F3.setVisible(false);
			F1.setVisible(true);
			P.setText(null);
			T1.setText(null);
			}

		if(e.getSource()==Send) {
			if (N1.getText().isEmpty() || N2.getText().isEmpty()) {
			    JOptionPane.showMessageDialog(null, "Enter The Numbers Very Well");
			}else {
			N1.setVisible(false);
			N2.setVisible(false);
			Send.setVisible(false);
			choose.setVisible(false);
			F3.setTitle(null);
			
			num1.setText("Number 1: "+N1.getText());
			num2.setText("Number 2: "+N2.getText());
			panel.add(operator);
			panel.add(result);
			String choosen= (String)choose.getSelectedItem();
			operator.setText("Operator: "+choosen);
			int n1=Integer.parseInt(N1.getText());
			int n2=Integer.parseInt(N2.getText());
			String oper=(String)choose.getSelectedItem();
			
			try {
				Socket soc=new Socket("127.0.0.1", 5655);
				PrintStream p=new PrintStream(soc.getOutputStream());
				p.println(n1);
				p.println(n2);
				p.println(oper);
				BufferedReader br=new BufferedReader(new InputStreamReader(soc.getInputStream()));
				int result1=Integer.parseInt(br.readLine());
				
				
				result.setForeground(Color.BLUE);
				result.setText("Results: "+result1);
			}catch(Exception ev) {
				System.out.println(ev);
			}
			}
			
		}
		
		
		
	
	}

	public static void main(String[] args) {
		new Assignment2Demo();

	}
}
