package day01;
import java.util.Scanner; 
public class Judge {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.print("请输入姓名：");
	String name=scan.next();
	if(name.equalsIgnoreCase("aa")){
		System.out.println(name+"是BAD MAN！");
	}
	System.out.println(name);
	}

}
