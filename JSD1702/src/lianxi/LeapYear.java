package lianxi;
import java.util.Scanner;
public class LeapYear {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入年份：");
		int year = scan.nextInt();
		/*if((year%4==0&&year%100!=0) ||(year%400==0)){
			System.out.println(year+"是闰年");
		}else{
		System.out.println(year+"不是闰年");
		}*/
		boolean flag= (year%4==0&&year%100!=0) ||(year%400==0);
		String str = flag ? year+"是闰年" :year+"不是闰年";
		System.out.println(str);
	}

}
