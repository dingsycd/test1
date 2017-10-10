package suanfa;

import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		System.out.println("图书管理系统");
		String[][] a = {{"1","29","200"},{"2","15","100"},{"3","10","300"}};
		while(true){			
			System.out.print("请选择:");
			Scanner sc = new Scanner(System.in);
			String x = sc.next();	
			if(x.equals("0")){
				System.out.println("已退出");
				return;
		}		
			System.out.println("id     价格     库存");
			for(int i=0;i<a.length;i++){
				if(x.equals(a[i][0])){
					System.out.println(a[i][0]+"       "+a[i][1]+"       "+a[i][2]);
				}		
			}
		}
	}

}
