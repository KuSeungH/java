package aa;



import java.util.Arrays;
import java.util.Scanner;

public class ham2 {
        public static void main(String[] args) {
                
                /*
                 * _____
                 * 
                 * String strl="apple";
                 * String mitjool="_____";
                 * 
                 * char [] ch1={'a','p','p','l','e'}
                 * char [] jool={'_','_','_','_','_'}
                 * 
                 */
                
                String [] moonja= {"a","p","p","l","e"};
                String [] jool= {"_","_","_","_","_"};
                
                //초기치 작업인데 사실 프로그램 작성시에는 먼저 쓰지 않음
                String ip;
                // int cnt=0
                int sw=0;
                //count와 flag기법
                for(int k=0;k<jool.length;k++) {
                        System.out.print(jool[k]);
                }
                System.out.println();
                
                
                Scanner scan= new Scanner(System.in);
                
                for(int i=1 ; i<=13;i++) {//13-for-start
                        //cnt=0;
                                                
                        System.out.println("예상글자입력:");
                        ip=scan.next();        // nextLine() // i love you
                        
                        for(int j=0; j<5;j++) {// 맞추면 밑줄지우고 대신 해당 문자를 아래로
                                if(ip.equals(moonja[j])) {// 내용비교
                                        jool[j]=moonja[j];//영문자를 밑줄로 내려보냄
                                }
                        }
                        
                        /*
                         * 
                         * a p p l e ==> moonja배멸
                         * 
                         * 
                         * - - - - - ==> jool배열
                         * 
                         */
                        
                        for(int j=0;j<jool.length;j++) {
                                System.out.print(jool[j]);        // 시작하자마자 p를 입력하고 맞추었으니 _PP__
                        }
                        System.out.println("\t"+i+"번 시도");
                        
                        // 배열 통채로 비교
                        // if(aa>3){
                        if(Arrays.equals(moonja, jool)) {
                                System.out.println("참잘했어요");
                                sw=1;        // 13번 까지 계속 진행 한 후 결과보기
                                break;        // 반복문을 뼈자 나오는 것으로 13-for-end 다음으로 exit
                        }
                }// 13-for-end
                
                if(sw==0) {
                        System.out.println("다음기회에");
                }
                
        }//main-end
        
}//class-end

