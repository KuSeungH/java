package aa;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Scanner;


class BClass extends Frame implements ActionListener{
	
	Label la1 = new Label("당신의 키는");
	Label la2 = new Label("당신의 몸무게는");
	
	TextField tf1 = new TextField();
	TextField tf2 = new TextField();
	
	Button btnkyesan = new Button("BMI계산");
	
	TextField tf3 = new TextField();
	
	// 생성자 // 실행시 제일먼저 찾아오는 곳 
	BClass(){
		this.setLayout(null); // 디자인은 개발자 맘대로
		
		la1.setSize(90, 30); // pixel=picture element
		la1.setLocation(20, 70); // 라벨 내부위치 
		this.add(la1);	// 라벨추가 
		
		la2.setSize(90, 30);
		la2.setLocation(20,100);
		this.add(la2);
		
		tf1.setSize(70, 30);
		tf1.setLocation(120, 70);
		this.add(tf1);
		
		tf2.setSize(70, 30);
		tf2.setLocation(120, 100);
		this.add(tf2);
		
		btnkyesan.setSize(100, 70);
		btnkyesan.setLocation(200, 300);
		this.add(btnkyesan);
		
		btnkyesan.addActionListener(this); // 이벤트 등록
		
		tf3.setSize(400, 50);
		tf3.setLocation(50, 400);
		this.add(tf3);
		
		
		
		this.setSize(500, 500);
		this.setBackground(Color.green); //색추가
		this.setVisible(true);
		
		// 창 닫기 (이벤트 등록 함수)
		addWindowListener(new WindowAdapter() { //addWindowListene는 5개 함수 포함 꼭 다 적어야 한다 
			//하지만 WindowAdapte 이걸 쓰면 필요한 것 만 작성하면 된다 
			public void windowClosing(WindowEvent el) {
				dispose();
				System.exit(0); //강제종료 // c: exit() // 원래 강제 종료는 return이면 충분함 
				//c# : Environment.Exit()
				
			}
		});
	}
	
	@Override
	public void actionPerformed(ActionEvent e) { // 이벤트 처리 함수 
		// TODO Auto-generated method stub
		// 이벤트 처리할 부분을 여기에 적으면 됨 (BMI계산 해서 찍히는 거)
		// 이벤트 3가지 충족 1. 이벤트에 대한 선언 2. 이벤트 처리 함수 3. * 이벤트로 등록이 되어야 함 *
		if(e.getSource()==tf3) {
			// 글상자는 setText 
			int ki = Integer.parseInt(tf1.getText());
			int mom = Integer.parseInt(tf2.getText());
			
			double mki = ki / 100.0;
			double bmi = mom/ Math.pow(mki, 2);
			
			String result;
			
			if(bmi >= 30.0)
				result = "비만";
			else if(bmi>=25.0) 
				result = "과체중";
			else if(bmi>=20.0)
				result = "보통";
			else
				result = "저체중";
			
		
			tf3.setText("당신의 bmi 지수는 " + bmi + "이며 " + result + " 이군요");
			
		
		
		}
		
		
	}
	
	
}

public class BmiGUIClass {
	public static void main(String[] args) {
		
		// gui : graphic user interface
		
		BClass b1 = new BClass();
	}
}
