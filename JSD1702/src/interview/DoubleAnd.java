package interview;

public class DoubleAnd {
	static String s ;
	public static void main(String[] args) {	
		//1.&&有短路作用，&不短路，两边都为true才是true
		//2.&表示位逻辑运算
//		if(s!=null&&s.equals("")){
//			System.out.println("s不为空");
//		}else{
//			System.out.println("s不合法");
//		}
//		//输入s不合法
		
		
//		if(s!=null&s.equals("")){
//			System.out.println("s不为空");
//		}else{
//			System.out.println("s不合法");
//		}
//		//输入 Exception in thread "main" java.lang.NullPointerException
		
		int n1 =2;  //0010
		int n2 = 3; //0011
		int n3 = 5; //0101
		//System.out.println(n1&&n2);  编译错误
		System.out.println(n1&n2); //二进制为0010,输出为2
		System.out.println(n1&n3); //0000,输出为0
		System.out.println(n2&n3); //0001,输出为1
	}
}
