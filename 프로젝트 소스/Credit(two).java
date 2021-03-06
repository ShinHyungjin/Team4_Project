import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.text.AbstractDocument.Content;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.event.AncestorListener;
import javax.swing.event.AncestorEvent;
@SuppressWarnings("serial")
public class Credit extends JFrame {

	JComboBox<String> jc;
	String [] a = {"단일전공", "복수 전공","부 전공"};


	public <tBounds> Credit() {
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


		JLabel w1;
		JLabel w2;
		JLabel w3;
		
		JTextField King;
		JTextField KingKong;
		JTextField a1;
		
		JButton e1;
		
		w1= new JLabel("제1전공");
		w1.setFont(new Font("휴면고딕체",Font.BOLD,25));
		x.add(w1);
		w1.setBounds(000, 100, 140, 50);
		
		w2= new JLabel("복수전공");
		w2.setFont(new Font("휴면고딕체",Font.BOLD,25));
		x.add(w2);
		w2.setBounds(0, 170, 140, 50);
		
		
	
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
		
		
		
		e1= new JButton("필수 이수 지정 과목");
		e1.setFont(new Font("휴면고딕체",Font.BOLD,20));
		x.add(e1);
		e1.setBounds(000, 320, 250, 50);
		
		x = new JTextArea();
		
		((JTextArea) x).setRows(20);
		((JTextArea) x).setColumns(30);
		x.setBounds(10, 380, 700, 380);
		getContentPane().add(x);
		
		
		
		setSize(730, 800);
		setResizable(false);
		setVisible(true);
	}

	private void setBorder(EmptyBorder emptyBorder) {
		// TODO Auto-generated method stub
		
	}

	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Credit frame = new Credit();
	}
}
