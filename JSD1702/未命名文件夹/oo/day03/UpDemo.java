package oo.day03;

public class UpDemo {

	public static void main(String[] args) {
		Eoo o=new Eoo();
		o.e=2;
		o.show();
		Foo o1=new Foo();
		o1.f=2;
		o1.test();
	}
}
	class Eoo{
		int e;
		void show(){};
	}
	class Foo extends Eoo{
		int f;
		void test(){};
	}


