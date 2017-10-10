package OO.day06;

public class InnerClassDemo {

	public static void main(String[] args) {
		Mama m=new Mama();
		//Baby b = new Baby();//内部类对外边
		
	}

}
class Mama{
	private String name;
	Baby creareBaby(){
		return new Baby();//内部类在外部类中创建的
	}
	class Baby{
		void showMamaName(){
			System.out.println(name);
			System.out.println(Mama.this.name);
			//System.out.println(this.name);
		}
	}
}