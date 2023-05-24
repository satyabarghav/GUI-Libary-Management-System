package program;
import java.util.*;
import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.*;
import java.io.File;
import java.io.FileNotFoundException;

import javax.swing.*;

public class Lend extends JFrame implements ActionListener {
	JButton b1,b2;
	JLabel l1;
	JTextField t1;
	JComboBox c1,c2;
	ArrayList<Books> list = new ArrayList<>();
	Lend(){
		File fp = new File("C:\\Users\\satya\\Desktop\\data.txt");
		try {
			Scanner fr = new Scanner(fp);
			fr.reset();
			while(fr.hasNext()) {
				Books b = new Books(fr.nextInt(),fr.next(),fr.next(),fr.nextFloat());
				list.add(b);
			}
			fr.close();
		} catch (FileNotFoundException ae) {
			// TODO Auto-generated catch block
			ae.printStackTrace();
		}
		this.setTitle("Lend Book");
		this.setSize(300,300);
		Container con = getContentPane();
		con.setLayout(new GridLayout(2,1));
		b1 = new JButton("Lend");
		c1 = new JComboBox();
		c1.addItem("Select");
		for(int i=0;i<list.size();i++) {
			String s = list.get(i).name;
			String au = list.get(i).author;
			s += " by "+au;
			c1.addItem(s);
		}
		con.add(c1);
		con.add(b1);
		con.setBackground(Color.BLUE);
		b1.addActionListener(this);	
		
	}
	public static void main(String[] args) {
		Lend l = new Lend();
		l.setVisible(true);

	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==b1) {
			String title = c1.getSelectedItem().toString();
					JOptionPane.showMessageDialog(b1,title+" Is Lended to you");
		}
		
	}

}
