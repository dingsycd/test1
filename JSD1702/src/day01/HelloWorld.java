package day01;//声明包day01

public class HelloWorld {//声明类

	public static void main(String[] args) {
		
	System.out.println("HelloWorld");
	System.out.println("hello");
	byte b=1;
	char ch=2;
	short sh =3;
	b=(byte) ch;
	System.out.println(b);
	b=(byte) sh;
	System.out.println(b);
	ch =(char) b;
	System.out.println(ch);
	ch=(char) sh;
	System.out.println(ch);
	sh=b;
	System.out.println(sh);
	sh=(short) ch;
	System.out.println(sh);
	}




}
