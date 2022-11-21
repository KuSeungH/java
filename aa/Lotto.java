package aa;

import java.util.Random;

public class Lotto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1/45 * 1/44 * 1/43 * 1/42 * 1/41 * 1/40

		for(int i = 0; i < 6; i++) {
			System.out.println( (int)Math.ceil(45*Math.random()) + "\t");
		}										// 0~1
												// 0.xx ~ 44.xxxx
												//1.. 45.xx
												// 1 ~ 45
		
		System.out.println(" ");
		
		Random rd = new Random();
		int num1 =rd.nextInt(45) + 1;
		int num2 =rd.nextInt(45) + 1;
		int num3 =rd.nextInt(45) + 1;
		int num4 =rd.nextInt(45) + 1;
		int num5 =rd.nextInt(45) + 1;
		int num6 =rd.nextInt(45) + 1;
		System.out.println(num1+ " " + num2 + " " + num3 + " " + num4 + " " + num5 + "  " + num6);
	}

}
