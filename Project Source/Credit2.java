package halla.Team4_Project;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.text.AbstractDocument.Content;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.geom.Area;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.swing.event.AncestorListener;
import javax.swing.event.AncestorEvent;

public class Credit2 extends JFrame {
	JPanel panel;
	static JComboBox<String> Jc, Um;
	static String [] a = {"복수전공", "단일전공","부전공"};
	JTextArea area;
	String line;

	public Credit2() {
		setTitle("학점관리");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Color color = new Color(196,222,255);

		Container c = getContentPane();
		c.setBackground(color);
		c.setLayout(null);
		Jc = new JComboBox<String>(a);
		Jc.setBounds(250, 20, 80, 25);
		c.add(Jc);
		
		Jc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(((String)Jc.getSelectedItem()).equals(a[0]))
				{
					dispose();
					Credit2 frame = new Credit2();
				}
				if(((String)Jc.getSelectedItem()).equals(a[1]))
				{
					dispose();
					Credit frame = new Credit();
				}
				if(((String)Jc.getSelectedItem()).equals(a[2]))
				{
					dispose();
					Credit3 frame = new Credit3();
				}
				
			}
		});
		
		Um = new JComboBox<String>();
		c.add(Um);
		Um.setBounds(340, 20, 180, 25);
		Um.setAutoscrolls(true);
		
		try {
			BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream("c:\\전공.txt"), "euc-kr"));
			while (true) {
				line = reader.readLine();
				if (line == null)
					break;
				Um.addItem(line);
				}
			reader.close();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		
		Um.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		
		JLabel w1;
		JLabel w2;
		JTextField King;
		JTextField KingKong;
		JTextField a1;
		JScrollPane parea;
		JButton w;

		area = new JTextArea();
		JScrollPane scrollPane = new JScrollPane(area);
		setVisible(true);
		area.setRows(20);
		area.setColumns(30);
		area.setBounds(0, 300, 910, 910);
		c.add(area);

		w = new JButton("버튼");
		w.setFont(new Font("휴먼고딕체",Font.BOLD,20));
		c.add(w);
		w.setBounds(010, 240, 200, 50);

		w.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFileChooser chooser = new JFileChooser();
				int result = chooser.showOpenDialog(panel);	
				if (result != JFileChooser.APPROVE_OPTION)
					return;

				String filePath = chooser.getSelectedFile().getPath();
			try {
					BufferedReader reader = new BufferedReader(new FileReader(filePath));
					while (true) {
						String line = reader.readLine();
						if (line == null)
							break;
						  area.append(line);
		                    area.append("\n");
						area.setText(area.getText() + line);
					}
					reader.close();

				} catch (IOException e1) {
					e1.printStackTrace();
				}

			}
		});

		w1= new JLabel("제1전공");
		w1.setFont(new Font("휴면고딕체",Font.BOLD,25));
		c.add(w1);
		w1.setBounds(10, 100, 140, 50);

		w2= new JLabel("복수전공");
		w2.setFont(new Font("휴면고딕체",Font.BOLD,25));
		c.add(w2);
		w2.setBounds(10, 170, 140, 50);

		King = new JTextField("");
		King.setFont(new Font("휴먼고딕체",Font.BOLD,25));
		c.add(King);
		King.setBounds(120, 100, 300, 50);
		King.setHorizontalAlignment(SwingConstants.CENTER);

		KingKong = new JTextField("");
		KingKong.setFont(new Font("휴먼고딕체",Font.BOLD,25));
		c.add(KingKong);
		KingKong.setBounds(120, 170, 300, 50);
		KingKong.setHorizontalAlignment(SwingConstants.CENTER);

		setSize(900, 900);
		setResizable(false);
		setVisible(true);
	}

	public static void main(String[] args) {
		Credit2 frame = new Credit2();
	}
}