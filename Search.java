import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
import javax.swing.*;
public class Search extends JFrame implements ActionListener {
	JLabel l1;
	JButton b1;
	JTextField t1;
	JComboBox cb;
	ArrayList<Books> list = new ArrayList<>();
	Search(){
		File fp = new File("\\path to data file");
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
		this.setTitle("Search");
		this.setSize(420,420);
		Container con = getContentPane();
		con.setLayout(new GridLayout(4,2));
		l1 = new JLabel("Enter ID or Name: ");
		t1 = new JTextField(50);
		b1 = new JButton("Search");
		cb = new JComboBox();
		cb.addItem("Search By Id");
		cb.addItem("Search By Name");
		con.add(cb);
		con.add(l1);
		con.add(t1);
		con.add(b1);
		b1.addActionListener(this);		
	}
	public static void main(String[] args) {
		Search s = new Search();
		s.setVisible(true);

	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==b1) {
			String type = cb.getSelectedItem().toString();
			switch(type) {
			case "Search By Id":
				int key = Integer.parseInt(t1.getText());
				for(Books bb: list) {
					if(bb.id==key) {
						JOptionPane.showMessageDialog(b1,bb);
						break;
					}
				}
				break;
			case "Search By Name":
				String name = t1.getText();
				for(Books bb: list) {
					if(bb.name.equals(name)) {
						JOptionPane.showMessageDialog(b1,bb);
					}
				}
				break;
			}
		}
		
	}

}
