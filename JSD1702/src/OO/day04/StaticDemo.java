package OO.day04;

public class StaticDemo {

	public static void main(String[] args) {
		Loo o1=new Loo();
		o1.show(); //1,1
		Loo o2=new Loo();
		o2.show(); //1,2
		System.out.println(Loo.b ); //2，建议类名点访问
		System.out.println(o1.b);   //2,一般不建议对象点访问
		Moo.test();
		Noo o3=new Noo();
		Noo o4 =new Noo();

	}

}
class Moo{
	int a;
	static int b;
	
	void show(){
		System.out.println(this.a);
		System.out.println(Moo.b);
	}
	static void test(){
		//静态方法没有隐式的this传递
		
		//System.out.println(this.a); //编译错误
		System.out.println(Moo.b);
	}
}
class Noo{
	
	Noo(){
		System.out.println("构造方法");
	}
	static{
		System.out.println("静态块");
	}
}
class  Loo{
	int a;
	static int b;
	Loo(){
		a++;
		b++;
	}
	void show(){
		System.out.println("a="+a);
		System.out.println("b="+b);
	}
}