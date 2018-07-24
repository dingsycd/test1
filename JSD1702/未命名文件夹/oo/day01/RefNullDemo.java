package oo.day01;

public class RefNullDemo {

	public static void main(String[] args) {
	Cell c=new Cell();
	Cell c1=c;
	c.row=2;
	c1.row=5;
	System.out.println(c.row);
	int a=3;
	int b=a;
	a=5;
	b=8;
	System.out.println(a);
	Cell cc=new Cell();
	cc.row=6;
	cc=null;
	cc.row=8;
	System.out.println(cc.row);
	}

}
