package SwingPagkes;

import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class Database extends JFrame
{
	DefaultTableModel model;
	JTable table;
	JScrollPane pane;
	public Database() {
	getContentPane().setBackground(Color.white);
	setLayout(null);
		
	model=new DefaultTableModel();
		
	table= new JTable();

	table.setModel(model);
	table.setBackground(Color.green);
	pane=new JScrollPane(table);
	pane.setBackground(Color.green);
	
	pane.setBounds(50,50, 600, 150);
	add(pane);
		 
	setSize(800,700);
	setVisible(true);
	setLocation(200,50);
	try 
	{
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost/myedatabase?user=root&password=Rewa@123");
	PreparedStatement pre = con.prepareStatement("select* from usertable");
	ResultSet rs = pre.executeQuery();
	ResultSetMetaData rsd = rs.getMetaData();
	int Countcol=rsd.getColumnCount();
					
	String[] colName=new String[Countcol];
					
	table.setModel(model);
	for(int i=0;i<Countcol;i++)
	{
	colName[i]=rsd.getColumnName(i+1);
	model.setColumnIdentifiers(colName);
						
	}
	String username,email,password,dob,address;
					
	while(rs.next())
	{
		username=rs.getString(1);
		email=rs.getString(2);
		password=rs.getString(3);
		dob=rs.getString(4);
		address=rs.getString(5);
		String[] row={username,password,email,dob,address};
		model.addRow(row);
	}
	}
	catch(Exception e)
	{
				 System.out.println(e);
				 
	}
	}

	public static void main(String[] args) 
	{
		new Database();

	}

}
