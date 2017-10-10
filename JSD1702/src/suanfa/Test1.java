package suanfa;
/*
 * 一．关键代码：
	1.斐波那契数列指的是这样一个数列  1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, ...
	数列第一项和第二项是1, 从第三项开始，每一项都等于前两项之和。
	本题的详细要求如下：
	1)实现计算斐波那契数列第n项值的方法。
	定义静态方法f(int  n), 参数n是数列的项数,返回值是第n项的值，
	例如: f(1) 的值是1, f(6)的值是8。
	2)验证当n比较大时候,相邻两项的比值接近黄金分割比值0.618，验算f(45)/f(46)的值大约是0.618。
 */
import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		System.out.println("请输入要算的项数(2-50之间的正整数)");
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		System.out.println(suan(n));
		System.out.println(yanzheng(n));
	}
	public static long suan(int n) {
		long [] arr=new long[n];
		arr[0]=1;
		arr[1]=1;
		for(int i=2;i<arr.length;i++){
			arr[i]=arr[i-1]+arr[i-2];
		}
		return arr[n-1];
	}
	public static double yanzheng(int n) {
		return suan(n-1)/(double)suan(n);
	}
	
	//递归
	public static long	 dg(int n) {
		if(n==1||n==2){
			return 1;
		}else{
			return dg(n-1)+dg(n-2);
		}
	}
}
