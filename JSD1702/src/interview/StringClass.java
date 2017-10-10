package interview;

public class StringClass {

	public static void main(String[] args) {
		String s1 = "java"; 
//		String s2 = "java"; 
//		System.out.println(s1==s2); //true	,因为s1和s2都保存在栈内存中,都指向方法区String常量池中的java	
//		String s3 = new String("java");
//		System.out.println(s1==s3); //false
//		String s4 = "j";
//		String s5 = "ava";
//		String s6 = s4+s5; //相当于 String s6 = new String("java");保存在堆内存中
//		System.out.println(s1==s6); //false
//		String s7 = "j"+new String("ava");
//		System.out.println(s1==s7); //false
//		String s8 = "j"+"ava"; //编译器将带有"+"的字符串进行优化，等同于"java"
//		System.out.println(s1==s8); //true
		String s9 = new String ("java");
		String s10 = s9.intern(); //等同于 String 10 = "java";
		System.out.println(s9==s10); //false
		System.out.println(s1==s10); //true

	}

}
