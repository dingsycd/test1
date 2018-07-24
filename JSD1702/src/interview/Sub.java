package interview;

/**
 * 先执行父类的静态块，接着执行子类的静态块，
 * 再执行父类的构造方法，接着执行子类的构造方法，
 * 再按顺序执行其他方法（注意子类是否覆盖了父类的方法，引用的类型，对象的类型）
 * @author DD
 *
 */
class Super{
	
	 int i =10;
	Super(){
		out();
		println();
		
		i =20;
		
	}
	void println(){
		System.out.println(i+"Super");
	}
	static{
		System.out.println(1);
	}
	static void out(){
		System.out.println(11);
	}
	void put(){
		System.out.println(111);
	}
}
public class Sub extends Super{
	int j =30;
	Sub(){
		//super.println();
		println();
		out();
		j=40;
	}
	static void out(){
		System.out.println(22);
	}
	void println(){
		System.out.println(j+"Sub");
	}
	static{
		System.out.println(2);
	}
	void put(){
		System.out.println(222);
	}
	void move(){
		System.out.println(2222);
	}
	public static void main(String[] args) {
		//char c = 10002;
		//int c = 0;
		//System.out.println(c);
		
		
		//System.out.println(new Super().i); //10Super20
		//System.out.print(new Super().j); ////编译错误,j不是new Super()的属性
		//System.out.println(new Super()); //10Superinterview.Super@19bb25a
		//System.out.print(new Sub().i); //0Sub30Sub20
		//System.out.print(new Sub().j); //0Sub30Sub40
	    //System.out.print(new Sub()); //0Sub30Subinterview.Sub@1e58cb8
	    
		
		//Super s = new Super();
		//s.put();
		//System.out.println(s); //10Superinterview.Super@da6bf4
		//System.out.println(s.i); //10Super20
		//System.out.println(s.j); //编译错误,j不是s的属性
		
		//Super s1 = new Sub(); //0Sub30Sub
		//s1.put();
		//s1.move(); //编译错误,move()不是s1的方法
		//System.out.print(s1);  //interview.Sub@da6bf420
		//System.out.println(s1.i); //20
		//System.out.println(s1.j); //编译错误,j不是s1的属性
		
		//Sub s2 = new Sub(); //0Sub30Sub
		//System.out.println(s2); //interview.Sub@1e58cb8
		//s2.put();
		//s2.move();
		//System.out.println(s2.i); //20
		//System.out.println(s2.j); //40
	}
}