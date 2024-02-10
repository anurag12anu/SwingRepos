package SwingPagkes;

import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class JTables  extends JFrame{
public 	JTables(){
	
	 getContentPane().setBackground(Color.white);
	 JLabel heading=new JLabel("Employee Management System");
	 add(heading);
	 setLayout(null);
	 Object cols[]= {"Name","city","age","mno"};
	 Object row1[]= {"anurag","rewa",25,"8794562310"};
	 Object row2[]= {"atul","rewa",24,"854562310"};
	 Object row3[]= {"ravi","indore",26,"8794562310"};
	 Object row4[]= {"saurabh","rewa",23,"834562310"};
	 Object row5[]= {"atul","rewa",24,"854562310"};
	 Object row6[]= {"ravi","indore",26,"8794562310"};
	 Object row7[]= {"saurabh","rewa",23,"834562310"};
	 Object row8[]= {"atul","rewa",24,"854562310"};
	 Object row9[]= {"ravi","indore",26,"8794562310"};
	 Object row10[]= {"saurabh","rewa",23,"834562310"};
	 Object row11[]= {"atul","rewa",24,"854562310"};
	 Object row12[]= {"ravi","indore",26,"8794562310"};
	 Object row13[]= {"saurabh","rewa",23,"834562310"};
			 
	 DefaultTableModel model=new DefaultTableModel();
	 
	 model.setColumnIdentifiers(cols);
	 model.addRow(row1);
	 model.addRow(row2);
	 model.addRow(row3);
	 model.addRow(row4);
	 model.addRow(row5);
	 model.addRow(row6);
	 model.addRow(row7);
	 model.addRow(row8);
	 model.addRow(row9);
	 model.addRow(row10);
	 model.addRow(row11);
	 model.addRow(row12);
	 model.addRow(row13);
	 
	 
	 JTable table= new JTable();
	 table.setModel(model);
	 JScrollPane pane=new JScrollPane(table);
	 pane.setBounds(50,50, 600, 150);
	 add(pane);
		setSize(800,700);
		setVisible(true);
		setLocation(200,50);
	}

	public static void main(String[] args) {
		 new JTables();
		
	}

}
