package OO.day04;

public class FinalDemo {

	public static void main(String[] args) {
		
	}
	
	//final修饰变量
	class Ooo{
		final int a=50;
		final int b;
		Ooo(){
			b=10;
		}
		void test(){
			final int c;
			//a=5;
		}
	}
	
	
	//final修饰方法
class Poo{
	void show(){}
	final void test(){}
}
class Qoo extends Poo{
	void show(){}
     //void test(){}
}
}

   //final修饰类
final class Roo{}
//class Soo extends Roo{}
class Uoo{}
class Voo extends Uoo{}