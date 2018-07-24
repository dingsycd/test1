package interview;

import java.util.Scanner;

public class ReverseOutput {

	public static void main(String[] args) {	
		System.out.print("请输入：");
		Scanner sc = new Scanner(System.in);
		String s =sc.nextLine();
		//reverseOutput1(s);
		reverseOutput2(s);
	}
	public static void reverseOutput2(String a){
		char[] ch = a.toCharArray();
		int i;
		if(ch.length%2==0){
			i=ch.length-1;
		}else{
			i=ch.length-2;
		}
		for(int x=i;i>=0;i=i-2){
			System.out.print(ch[i]);
		}
	}
	public static void reverseOutput1(String a) {
		StringBuffer sb = new StringBuffer();
		ok:
		for (int i = 0; i < a.length();) {
			if(i==a.length()-1){
				break ok;
			}
		if (i % 2 == 0) {
		sb.append(a.substring(i+1,i+2));
		}
		i = i + 2;
		}
		String str[] = {};
		str = sb.toString().split("");
		for (int i = str.length-1; i >0 ; i--) {
		System.out.print(str[i]);
		}
		}    
}
