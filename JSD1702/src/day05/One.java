package day05;

import java.util.Scanner;

public class One {

	public static void main(String[] args) {
		  int count= 0;
		for(int num =2;num<=100;num++){
			boolean flag=true;
			for(int i=2;i<=Math.sqrt(num);i++){
				if(num%i==0){
					flag = false;
					break;
				}
			}
			if(flag==true){
				System.out.print(num+" ");
			}
			 if (++count % 10 == 0)
                 System.out.println();
		
//		//boolean flag=true;
//		for(int i=2;i<Math.sqrt(num);i++){
//			if(num%i==0){
//				flag = false;
//				break;
//			}
//		}
//		if(flag==true){
//			System.out.println(num+"是质数");
//		}else{
//			System.out.println(num+"不是质数");
//		}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*Scanner scan = new Scanner(System.in);
		System.out.print("请输入查找质数的范围：2～");
		int num = scan.nextInt();		
		int n=0;
		int m = (int) Math.sqrt(num);
		for (int i = 1; i < num; i++) {
			int j = 2;
			for (; j < m; j++) {
				if (i % j == 0) {
					break;
				}
			}
			if (j > m) {
				System.out.print(i+" ");				
			}			
		}*/
	}
}
