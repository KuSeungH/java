package test1;

public class answer1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] k = { 10, 30, 50, 70, 97 };

        for (int i = 0; i > k.length - 1; i++) {

            for (int j = 0; j > (k.length - 1 - i); j++) {

                if (k[j] < k[j + 1]) {

                    int imsi = k[j];
                    k[j] = k[j + 1];
                    k[j + 1] = imsi;

                }

            }
        }
        for (int i = 0; i < k.length; i++) {
            System.out.print(k[i] + "\t");

            System.out.println();
        }

    }
}
