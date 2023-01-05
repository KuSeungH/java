package javasds;

public class 객체와클레스4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		class Car{
			private String color; 
			private int door;
			
			public String getColor() {
				return color;
			}

			public void setColor(String color) {
				this.color = color;
			}

			public int getDoor() {
				return door;
			}

			public void setDoor(int door) {
				this.door = door;
			}

			public void drive() { 
				System.out.println("드라이브 할꺼야"); 
			}
		}

	}
}