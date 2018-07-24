package OO.day02;

public class Test {

	public static void main(String[] args) {
		T t = new T(2,5);
		System.out.println("T的原始位置");
		t.print();
		t.drop();
		System.out.println("下落后");
		t.print();
		t.moveLeft();
		System.out.println("左移后");
		t.print();
		t.moveRight();
		System.out.println("右移后");
		t.print();
		J j=new J(1,2);
		System.out.println("J的初始位置");
		j.print();
		System.out.println("下落后");
		j.drop();
		j.print();
		System.out.println("左移后");
		j.moveLeft();
		j.print();
		System.out.println("右移后");
		j.moveRight();
		j.print();
		O o=new O(1,2);
		System.out.println("O的初始位置");
		o.print();
		System.out.println("下落后");
		o.drop();
		o.print();
		System.out.println("左移后");
		o.moveLeft();
		o.print();
		System.out.println("右移后");
		o.moveRight();
		o.print();
		Z z=new Z(4,5);
		System.out.println("Z的初始位置");
		z.print();
		System.out.println("下落后");
		z.drop();
		z.print();
		System.out.println("左移后");
		z.moveLeft();
		z.print();
		System.out.println("右移后");
		z.moveRight();
		z.print();
		

	}

}
