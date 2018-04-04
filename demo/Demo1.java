/**
 * 参数传递时，如果参数是基本数据类型，传递的是基本类型值的拷贝。
 * 如果传递的是引用类型，传递的是该变量引用的对象在堆中的地址值。
 * JVM的内存管理
 *
 * 讨论网站  https://www.zhihu.com/question/31203609
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


