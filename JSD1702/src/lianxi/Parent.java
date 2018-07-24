package lianxi;

public class Parent {
	
	public void get(){
		System.out.println(11);
	}
	public static void main(String[] args) {
		Parent p1 = new Parent();
		Parent p2 = new Son();
		Son p3 = new Son();
		p1.get();
		p2.get();
		//p2.have(); 编译错误,p2没有have()方法
		p3.have();
	}
	
}
class Son extends Parent{
	public void get(){
		System.out.println(22);
	}
	public void have(){
		System.out.println(33);
	}
}