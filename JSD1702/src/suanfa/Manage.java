package suanfa;
import java.util.Scanner;
public class Manage {
	public static void main(String[] args) {	
		Scanner scan = new Scanner(System.in);
		System.out.println("--------------------------------------------------------");
		System.out.println("                  欢迎进入图书管理系统");
		System.out.println("--------------------------------------------------------");
		System.out.println("请先登录");
		System.out.print("用户名:");
		String command =scan.next();
		System.out.print("   密码:");
        command =scan.next();
		System.out.println();
		System.out.println("菜单：     1.借书    2.还书    3.查阅    4.退出");
		System.out.println("请选择：");	
		int i=0;
		while(true){
           int n=scan.nextInt();
			switch(n){
			case 1:
				System.out.println("借书");
				break;
			case 2:
				System.out.println("还书");
				break;
			case 3:
				System.out.println("查阅");
				break;
			case 4 :
				System.out.println("退出");
				return;
			}
		}
		
		
	}

}

