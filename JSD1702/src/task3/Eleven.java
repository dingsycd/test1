package task3;

import java.util.Scanner;

public class Eleven {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("请依次输入三个整数：a, b, c（以空格隔开)");
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		a=a>b?a:b;
		a=a>c?a:c;
		System.out.println("最大值为"+a);

	}

}
