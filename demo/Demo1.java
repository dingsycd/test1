/**
 * 没想明白，应该和jvm有关
 */
public class Demo1 {
	public static void main(String[] args) {
		StringBuilder a = new StringBuilder("a");
		StringBuilder b = new StringBuilder("b");
		append(a,b);
		System.out.println("main a:" + a);//a1
		System.out.println("main b:" + b);//b

		StringBuffer c = new StringBuffer("c");
		StringBuffer d = new StringBuffer("d");
		append1(c,d);
		System.out.println("main c:" + c);//
		System.out.println("main d:" + d);//
		
		int i = 1;
		add(i);
		System.out.println(add(i)); //2
		System.out.println(i);//?   1
	}
	
	public static int add(int i){
		i++;
		return i;
	}
	
	public static void append(
			StringBuilder a,StringBuilder b){
		a.append("1");
		System.out.println("appen a:"+a);//a1
		b = a;
		System.out.println("appen b:"+b);//a1
	}

	public static void append1(
			StringBuffer c,StringBuffer d){
		c.append("1");
		System.out.println("appen c:"+c);//c1
		d = c;
		System.out.println("appen d:"+d);//c1
	}
}


