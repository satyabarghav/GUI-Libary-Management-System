import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
import javax.swing.*;

public class Add extends JFrame implements ActionListener {
	JLabel l1,l2,l3,l4;
	JTextField t1,t2,t3,t4;
	JButton b1;
	Add(){
		
		this.setTitle("Add Book");
		this.setSize(420,420);
		Container con = getContentPane();
		con.setLayout(new GridLayout(5,2));
		l1 = new JLabel("Enter Book ID : ");
		l2 = new JLabel("Enter Book name: ");
		l3 = new JLabel("Enter Auhtor name: ");
		l4 = new JLabel("Enter Price: ");
		t1 = new JTextField(50);
		t2 = new JTextField(50);
		t3 = new JTextField(50);
		t4 = new JTextField(50);
		b1 = new JButton("ADD");
		con.add(l1);
		con.add(t1);
		con.add(l2);
		con.add(t2);
		con.add(l3);
		con.add(t3);
		con.add(l4);
		con.add(t4);
		con.add(b1);
		b1.addActionListener(this);
	}
	public static void main(String[] args) {
		Add ob = new Add();
		ob.setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource()==b1) {
			int Id = Integer.parseInt(t1.getText());
			String bname = t2.getText();
			String bauthor = t3.getText();
			float Price = Float.parseFloat(t4.getText());
			Books bb = new Books(Id,bname,bauthor,Price);
			try {
				File fp = new File("C:\\Users\\Desktop\\data.txt");\\ Enter the path of your data file
				FileWriter fw = new FileWriter(fp,true);
				fw.write(Id+" ");
				fw.write(bname+" ");
				fw.write(bauthor+" ");
				fw.write(Price+" ");;
				fw.write("\n");
				fw.close();
				JOptionPane.showMessageDialog(b1,"Book added Succesfully.");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
