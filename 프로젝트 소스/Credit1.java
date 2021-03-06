package halla.Team4_Project;

package hoho.hoho;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Credit1 extends JFrame {

	JLabel Need1, Need2, go1, go2, go3, go4, gi1, gi2, gi3, gi4, jun1, jun2, jun3, jun4, hak1, hak2;
	JTextField box1, box2, box3, box4, box5, box6, box7, box8, box9, box10, box11, box12, box13, box14;
	JButton button;
	JComboBox jc;
	String [] a = {"단일전공", "복수전공", "부전공"};
	public Credit1() {

		setTitle("학점관리");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Color color = new Color(140,252,100,100);
		Container c = getContentPane();
		c.setBackground(color);
		c.setLayout(null);

		jc = new JComboBox<String>(a);
		c.add(jc);
		jc.setBounds(300, 20, 80, 25);
		
		Need1 = new JLabel("학점");
		Need1.setFont(new Font("휴면고딕체",Font.BOLD,50));
		c.add(Need1);
		Need1.setBounds(90, 85, 250, 40);

		go1 = new JLabel("교양필수");
		go1.setFont(new Font("휴먼고딕체",Font.BOLD,22));
		c.add(go1);
		go1.setBounds(90, 140, 100, 40);

		go2 = new JLabel("교양선택");
		go2.setFont(new Font("휴먼고딕체",Font.BOLD,22));
		c.add(go2);
		go2.setBounds(90, 140, 100, 160);
		
		gi1 = new JLabel("기본필수");
		gi1.setFont(new Font("휴먼고딕체",Font.BOLD,22));
		c.add(gi1);
		gi1.setBounds(270, 140, 100, 40);
		
		gi2 = new JLabel("기본선택");
		gi2.setFont(new Font("휴먼고딕체",Font.BOLD,22));
		c.add(gi2);
		gi2.setBounds(270, 140, 100, 150);

		jun1 = new JLabel("전공필수");
		jun1.setFont(new Font("휴먼고딕체",Font.BOLD,22));
		c.add(jun1);
		jun1.setBounds(450, 140, 100, 40);

		jun2 = new JLabel("전공선택");
		jun2.setFont(new Font("휴먼고딕체",Font.BOLD,22));
		c.add(jun2);
		jun2.setBounds(450, 140, 100, 150);

	    hak1 = new JLabel("총 이수학점");
		hak1.setFont(new Font("휴면고딕체",Font.BOLD,22));
		c.add(hak1);
		hak1.setBounds(60, 95, 250, 365);

		Need2 = new JLabel("필요학점");
		Need2.setFont(new Font("휴면고딕체",Font.BOLD,40));
		c.add(Need2);
		Need2.setBounds(90, 110, 250, 470);

		go3 = new JLabel("교양필수");
		go3.setFont(new Font("휴먼고딕체",Font.BOLD,22));
		c.add(go3);
		go3.setBounds(90, 165, 100, 460);

		go4 = new JLabel("교양선택");
		go4.setFont(new Font("휴먼고딕체",Font.BOLD,22));
		c.add(go4);
		go4.setBounds(90, 165, 100, 570);

		gi3 = new JLabel("기본필수");
		gi3.setFont(new Font("휴먼고딕체",Font.BOLD,22));
		c.add(gi3);
		gi3.setBounds(270, 165, 100, 460);

		gi4 = new JLabel("기본선택");
		gi4.setFont(new Font("휴먼고딕체",Font.BOLD,22));
		c.add(gi4);
		gi4.setBounds(270, 165, 100, 570);

		jun3 = new JLabel("전공필수");
		jun3.setFont(new Font("휴먼고딕체",Font.BOLD,22));
		c.add(jun3);
		jun3.setBounds(450, 165, 100, 460);

		jun4 = new JLabel("전공선택");
		jun4.setFont(new Font("휴먼고딕체",Font.BOLD,22));
		c.add(jun4);
		jun4.setBounds(450, 165, 100, 570);

		hak2 = new JLabel("총 이수학점");
		hak2.setFont(new Font("휴면고딕체",Font.BOLD,22));
		c.add(hak2);
		hak2.setBounds(60, 115, 250, 780);

		box1 = new JTextField();
		c.add(box1);
		box1.setBounds(185, 145, 70, 30);

		box2 = new JTextField();
		c.add(box2);
		box2.setBounds(365, 145, 70, 30);

		box3 = new JTextField();
		c.add(box3);
		box3.setBounds(545, 145, 70, 30);

		box4 = new JTextField();
		c.add(box4);
		box4.setBounds(185, 205, 70, 30);

		box5 = new JTextField();
		c.add(box5);
		box5.setBounds(365, 205, 70, 30);

		box6 = new JTextField();
		c.add(box6);
		box6.setBounds(545, 205, 70, 30);

		box7 = new JTextField();
		c.add(box7);
		box7.setBounds(185, 265, 70, 30);

		box8 = new JTextField();
		c.add(box8);
		box8.setBounds(185, 380, 70, 30);
		box8.setEditable(false);

		box9 = new JTextField();
		c.add(box9);
		box9.setBounds(365, 380, 70, 30);
		box9.setEditable(false);

		box10 = new JTextField();
		c.add(box10);
		box10.setBounds(545, 380, 70, 30);
		box10.setEditable(false);

		box11 = new JTextField();
		c.add(box11);
		box11.setBounds(185, 435, 70, 30);
		box11.setEditable(false);

		box12 = new JTextField();
		c.add(box12);
		box12.setBounds(365, 435, 70, 30);
		box12.setEditable(false);

		box13 = new JTextField();
		c.add(box13);
		box13.setBounds(545, 435, 70, 30);
		box13.setEditable(false);

		box14 = new JTextField();
		c.add(box14);
		box14.setBounds(185, 490, 70, 30);
		box14.setEditable(false);

		button = new JButton("비교하기");
		button.setFont(new Font("휴면고딕체", Font.BOLD,17));
		c.add(button);
		button.setBounds(280, 550, 120, 30);

		setSize(730, 800);
		setResizable(false);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		Credit1 frame = new Credit1();
	}
}
