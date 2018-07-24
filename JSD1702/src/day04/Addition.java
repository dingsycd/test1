package day04;
import java.util.Scanner;
public class Addition {

	public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			int score =0;
			for(int i=1;i<=10;i++){
				int a=(int)(Math.random()*100);
				int b=(int)(Math.random()*100);
				int result =a+b;
				System.out.println("请计算：");
				System.out.println("("+i+")"+a+"+"+b+"=?");
				int answer=scan.nextInt();
				if(answer==result){
					System.out.println("答对了！");
					score+=10;
				}else{
					System.out.println("答错了！");
				}
			}
			System.out.println("总分为："+score);
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			/*int score=0;
			for(int i=1;i<=10;i++){
				int a=(int)(Math.random()*100);	
				int b=(int)(Math.random()*100);	
				int result =a+b;
				System.out.println("("+i+")"+a+"+"+b+"=?");
				System.out.println("请计算：");
				int answer =scan.nextInt();
				if(answer==result){
					System.out.println("答对了！");
					score+=10;			
				}else{
					System.out.println("答错了！");
				}						
				}
			System.out.println("总分为："+score);*/
	}

}
