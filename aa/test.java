package aa;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.ComboBoxEditor;
import javax.swing.DefaultComboBoxModel;

public class test extends JFrame {

	
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					test frame = new test();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public test() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 650, 499);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbl방속국주관Label = new JLabel("방속국주관");
		lbl방속국주관Label.setHorizontalAlignment(SwingConstants.CENTER);
		lbl방속국주관Label.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		lbl방속국주관Label.setBounds(50, 25, 100, 30);
		contentPane.add(lbl방속국주관Label);
		
		JLabel lbl탤런트선발대회Label = new JLabel("탤런트선발대회");
		lbl탤런트선발대회Label.setHorizontalAlignment(SwingConstants.CENTER);
		lbl탤런트선발대회Label.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		lbl탤런트선발대회Label.setBounds(250, 25, 149, 30);
		contentPane.add(lbl탤런트선발대회Label);
		
		JLabel lbl잘한코너들은Label = new JLabel("잘한 코너들은");
		lbl잘한코너들은Label.setHorizontalAlignment(SwingConstants.CENTER);
		lbl잘한코너들은Label.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		lbl잘한코너들은Label.setBounds(450, 25, 149, 30);
		contentPane.add(lbl잘한코너들은Label);
		
		JButton btn노래Button = new JButton("노래 10점");
		btn노래Button.setBounds(6, 141, 150, 60);
		contentPane.add(btn노래Button);
		
		JButton btn댄스Button = new JButton("댄스 20점");
		btn댄스Button.setBounds(249, 141, 150, 60);
		contentPane.add(btn댄스Button);
		
		JButton btn영어웅변Button = new JButton("영어웅변 30점");
		btn영어웅변Button.setBounds(494, 141, 150, 60);
		contentPane.add(btn영어웅변Button);
		
		JButton btn철인삼종경기Button = new JButton("철인삼종경기 100점");
		btn철인삼종경기Button.setBounds(6, 255, 150, 60);
		contentPane.add(btn철인삼종경기Button);
		
		JButton btn미로탈출Button = new JButton("미로탈출 90점");
		btn미로탈출Button.setBounds(250, 255, 150, 60);
		contentPane.add(btn미로탈출Button);
		
		JButton btn개그Button = new JButton("개그 80점");
		btn개그Button.setBounds(494, 255, 150, 60);
		contentPane.add(btn개그Button);
		
		JButton btn총점수Button = new JButton("총점수는? ");
		btn총점수Button.setFont(new Font("Lucida Grande", Font.PLAIN, 26));
		btn총점수Button.setForeground(Color.CYAN);
		btn총점수Button.setBackground(Color.CYAN);
		btn총점수Button.setBounds(250, 394, 150, 60);
		contentPane.add(btn총점수Button);
		
		JButton btn취소Button = new JButton("취소");
		btn취소Button.setFont(new Font("Lucida Grande", Font.PLAIN, 26));
		btn취소Button.setForeground(Color.YELLOW);
		btn취소Button.setBackground(Color.CYAN);
		btn취소Button.setBounds(494, 394, 150, 60);
		contentPane.add(btn취소Button);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"나는 10대", "나는 20대", "나는 30대이상"}));
		comboBox.setBounds(10, 394, 200, 50);
		contentPane.add(comboBox);
		
		
	}
}
