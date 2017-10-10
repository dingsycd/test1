package task3;

import java.util.Scanner;

public class Nine {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while(true){
		System.out.println("请输入你的工资的税前金额(￥)：");
		double salary = scan.nextDouble();
		if(salary==0){
			System.out.println("结束");
			break;
		}
		double taxIncome = salary - 3500;
		double tax = 0;
		if (taxIncome <= 0) {
		} else if (taxIncome <= 1500) {
			tax = taxIncome * 0.03 - 0;
		} else if (taxIncome <= 4500) {
			tax = taxIncome * 0.1 - 105;
		} else if (taxIncome <= 9000) {
			tax = taxIncome * 0.2 - 555;
		} else if (taxIncome <= 35000) {
			tax = taxIncome * 0.25 - 1005;
		} else if (taxIncome <= 55000) {
			tax = taxIncome * 0.3 - 2755;
		} else if (taxIncome <= 80000) {
			tax = taxIncome * 0.35 - 5505;
		} else {
			tax = taxIncome * 0.45 - 13505;
		}
		System.out.println("您应缴纳的个人所得税是:￥" + tax);
	}
	}
}
