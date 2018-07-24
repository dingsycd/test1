package lianxi;

import java.util.Scanner;

public class Guessing {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = (int) (Math.random() * 1000);
		int guess;
		do {
			System.out.println("请猜！");
			guess = scan.nextInt();
			if (guess == 0) {
				break;
			}
			if (guess > num) {
				System.out.println("太大了！");
			} else {
				System.out.println("太小了！");
			}
		} while (guess != num);
		/*
		 * while(guess!=num){ if(guess==0){ break; } if(guess>num){
		 * System.out.println("太大了！请猜！"); }else{ System.out.println("太小了！请猜！");
		 * } guess = scan.nextInt(); }
		 */
		if (guess == 0) {
			System.out.println("请下次再猜！");
		} else {
			System.out.println("恭喜你，猜对了！");
		}
	}

}
