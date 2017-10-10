package day04;
import java.util.Scanner;
public class Nine {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("请输入整数：");
		int num = scan.nextInt();
		double sum=0;
		int i;
		for(i=1;i<=num;i++){				
			sum+=1.0/i;			
		}
			
			System.out.println(sum);
		

		/*long n=0;long sum=0;
		for(int i=1;i<=10;i++){						
			n=n*10+9;
			sum+=n;
		}
		System.out.println(sum);*/
		
	}

}

