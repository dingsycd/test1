package day04;

import java.util.Scanner;

public class Nine1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("输入一个数：");
		int num = scan.nextInt();
		double n = 1;
		double sum = 0;
		int i;
		for (i = 2; ; i++) {
			sum += n;
			n = 1.0/ i;
			if (i == num) {
				break;
			}
		}
		System.out.println(sum);
	}
}
