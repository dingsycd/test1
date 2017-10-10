package OO.day06;

public class NstInnerClassDemo {

	public static void main(String[] args) {
		Inter3 o1 = new Inter3(){
		
		};
		final int num = 5;
		Inter4 o3 = new Inter4(){
			 public void show(){
				 System.out.println("showshow");
			System.out.println(num);
			 }
			};
			o3.show();
	

	}

}

interface Inter4{
	void show();
}
interface Inter3{
	
}