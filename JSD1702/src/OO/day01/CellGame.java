package OO.day01;

import java.util.Scanner;

public class CellGame {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Cell1 c = new Cell1();
		c.row = 3;
		c.col = 3;
		print(c);
		int n;
		do{
			 n = scan.nextInt();
		switch (n) {
		case 0:
			System.out.println("游戏结束");
			break;
		case 1:
			c.drop();
			print(c);
			break;	
		case 2:
			c.moveLeft();
			print(c);
			break;	
		case 3:
			c.moveright();
			print(c);
			break;		
		}		
		}while(n!=0);
	}

	public static void printWall(Cell1 cc) {

		for (int i = 0; i < 20; i++) {
			for (int j = 0; j< 10; j++) {
				if (i == cc.row && j == cc.col) {
					System.out.print(". ");
				} else {
					System.out.print("- ");
				}
			}
			System.out.println();
		}
		
	}
	public static void print(Cell1 c){
		System.out.println("Cell的位置为 (" + c.row + "," + c.col + ")");
		printWall(c);
		System.out.println("1表示下落一行，" + "2表示左移一列，3表示右移一列，" + "0表示退出");
	}
}
