package javasds;

public class String2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String aa ="ondal";
		String bb ="ondal";
		if(aa==bb) { // 안에 들어있는 번지가 같다 
			System.out.println(aa+"\t"+bb);
		}
		
		if(aa.equals(bb)) // aa 와 bb 이름이 같다 
			System.out.println(aa+"\t"+bb);
		
		
		String cc = new String("ondal");
		// heap 주소 3000
		String dd = new String("ondal"); //특별한 경우에 사용을 한다 
		// heap 주소 4000
		
		if(cc==dd) { // 번지가 다르다 
			System.out.println(20);
		}
		
		if(cc.equals(dd)) // 이름이 같다 
			System.out.println(10);
	}

}
