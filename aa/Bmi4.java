package aa;

import javax.swing.JOptionPane;

// 자바에 그래픽 화면 출력  awt, swing(window builder), scenebuilder(xml)

public class Bmi4 {
	public static void main(String[] args) {
		
		int ki = Integer.parseInt(JOptionPane.showInputDialog("키는?"));
		
		int mom = Integer.parseInt(JOptionPane.showInputDialog("몸무게는?"));
		
		double mki = ki / 100.0;
		double bmi = mom/ Math.pow(mki, 2);
							// power 제곱 함수
		
		System.out.println("비만도: " + bmi);
		
		if(bmi >= 30.0) 
			System.out.println("비만");
		else if(bmi>=25.0) 
			System.out.println("과체중");
		else if(bmi>=20.0)
			System.out.println("보통");
		else
			System.out.println("저체중");
		
	}
}
