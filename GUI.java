import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.*;

public class GUI extends JFrame implements ActionListener {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JButton b1,b2,b3,b4;
	JLabel l1;
	GUI(String s){
		this.setVisible(true);
		this.setTitle("Library Management System");
		this.setSize(420,420);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container con = getContentPane();
		con.setLayout(new GridLayout(4,1));
		b1 = new JButton("Add Book");
		b2 = new JButton("Lend Book");
		b3 = new JButton("Search");
		l1 = new JLabel("Welecome "+s+" to the Library");
		con.add(l1);
		con.add(b1);
		con.add(b2);
		con.add(b3);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
	}

	public static void main(String[] args) {
		GUI ob = new GUI("31617");

	}

	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==b1)
		{
			Add a = new Add();
			a.setVisible(true);
		}
		else if(e.getSource()==b2)
		{
			Lend l = new Lend();
			l.setVisible(true);
		}
		else if(e.getSource()==b3) {
			Search s = new Search();
			s.setVisible(true);
		}
}
}
