package task3;

import java.util.Scanner;

public class Six {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("请依次输入两个整数：a, b（以空格隔开)");
		int a = scan.nextInt();
		int b = scan.nextInt();
		scan.close();
		int max = a > b ? a : b;
		System.out.println("最大值为：" + max);

	}

}
