package OO.day03;

public class SuperDemo {

	public static void main(String[] args) {
		Aoo a = new Aoo();
		a.p();
		a.t();
		Aoo a1 = new Boo();
		a1.p();
		a1.t();
		//a1.s();  a1不能调用s()方法
		Boo b =new Boo();
		b.p();
		b.t();
		b.s();
		//Boo b1 = new Aoo(); 编译错误
		//java.lang.ClassCastException: 
		//OO.day03.Aoo cannot be cast to OO.day03.Boo 类转换异常，运行时报错
		Boo b1 = (Boo) new Aoo(); 
		b1.p();
		b1.t();
		b1.s();
	}
	//static修饰类时，只能修饰内部类
	static class F{
		public F() {
			System.out.println("F");
		}
		void f(){
			System.out.println("f");
		}
	}
}	
	class Aoo{
		Aoo(){
			System.out.println("父类构造");
		}
		public static void t(){
			System.out.println("t");
		}
		public void p(){
			System.out.println("p");
		}
	}
	class Boo extends Aoo{
		Boo(){
			System.out.println("子类构造");
		}
		public static void t(){
			System.out.println("t1");
		}
		public void s(){
			System.out.println("s");
		}
	}
	class Coo{
		Coo(int n){
			
		}
	}
	class Doo extends Coo{
		Doo(){
			super(2);
		}
	}


