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
import java.io.FileReader;
import java.io.IOException;

import javax.swing.event.AncestorListener;
import javax.swing.event.AncestorEvent;
@SuppressWarnings("serial")
public class Q1 extends JFrame {
	JPanel panel;
	
	
	  
	JComboBox<String> jc;
	String [] a = {"단일전공", "복수 전공","부 전공"};

	public <tBounds> Q1() {
		setTitle("학점관리");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Color color = new Color(140,252,100,100);

		Container x = getContentPane();
		x.setBackground(color);
		x.setLayout(null);
		;
		jc = new JComboBox<String>(a);
		jc.setBounds(300, 20, 80, 25);
		x.add(jc);

		JTextArea area;
		JLabel w1;
		JLabel w2;
		JLabel w3;

		JTextField King;
		JTextField KingKong;
		JTextField a1;

		 @SuppressWarnings("unused")
		JScrollPane parea;
		JButton w;


		area = new JTextArea();
		@SuppressWarnings("unused")
		JScrollPane scrollPane = new JScrollPane(area);
			setVisible(true);
		area.setRows(20);
			area.setColumns(30);
			area.setBounds(0, 380, 720, 1000);
			x.add(area);
			


		w = new JButton("버튼");
		w.setFont(new Font("휴먼고딕체",Font.BOLD,20));
		x.add(w);
		w.setBounds(000, 320, 250, 50);

		w.addActionListener(new ActionListener() {
			@Override
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
		x.add(w1);
		w1.setBounds(000, 100, 140, 50);

		w2= new JLabel("복수전공");
		w2.setFont(new Font("휴면고딕체",Font.BOLD,25));
		x.add(w2);
		w2.setBounds(0, 170, 140, 50);

		w3= new JLabel("부 전공");
		w3.setFont(new Font("휴면고딕체",Font.BOLD,25));
		x.add(w3);
		w3.setBounds(0,240, 140, 50);

		King = new JTextField("");
		King.setFont(new Font("휴먼고딕체",Font.BOLD,25));
		x.add(King);
		King.setBounds(200, 100, 300, 50);
		King.setHorizontalAlignment(SwingConstants.CENTER);

		KingKong = new JTextField("");
		KingKong.setFont(new Font("휴먼고딕체",Font.BOLD,25));
		x.add(KingKong);
		KingKong.setBounds(200, 170, 300, 50);
		KingKong.setHorizontalAlignment(SwingConstants.CENTER);

		a1 = new JTextField("");
		a1.setFont(new Font(""
				+ "휴먼고딕체",Font.BOLD,25));
		x.add(a1);
		a1.setBounds(200,240, 300, 50);
		a1.setHorizontalAlignment(SwingConstants.CENTER);

		setSize(730, 800);
		setResizable(false);
		setVisible(true);
	}


	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Q1 frame = new Q1();
	}
}
