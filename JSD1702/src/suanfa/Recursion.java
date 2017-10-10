package suanfa;

import java.util.Scanner;

public class Recursion {

	public static void main(String[] args) {
		Recursion r1=new Recursion();
		System.out.println("请输入一个整数");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
//		int sum =0;
//		System.out.println(r1.plus(n));
//		for(int i =1;i<=10000000;i++){
//			sum +=i;
//		}
//		System.out.println(sum);
	}
	public int plus(int i){
		if(i==1){
			return 1;
		}
		return i+plus(i-1);
	}
}
