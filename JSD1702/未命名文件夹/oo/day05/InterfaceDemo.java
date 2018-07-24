package oo.day05;

public class InterfaceDemo {
//6
public static void main(String[] args) {
	//Inter4 o1 =new Inter4();//接口不能被实例化
	Inter4 o2 =new Eoo();
	Inter3 o3 = new Eoo();
	}
	

}
//1
interface Inter1{
	public static final double PI=3.14;
	public abstract void a();
}
//2
interface Inter2{
	void a();
	void b();
	
}
class Aoo implements Inter2{
	public void a(){}
	public void b(){}
}
//3
interface Inter3{
	void c();
}
class Boo implements Inter2,Inter3{
	public void a(){}
	public void b(){}
	public void c(){}
}
//4
 abstract class Coo{
	 abstract void d();	
}
 class Doo extends Coo implements Inter3{
	 void d(){}
	 public void c(){}
 }
 //5
 interface Inter4 extends Inter3{
	 void e();	 
 }
 class Eoo implements Inter4{
	 public void e(){}
	 public void c(){}
 }