package programming;

import java.util.Scanner;

public class ReverseOutput {

	public static void main(String[] args) {	
		System.out.print("请输入:");
		Scanner sc = new Scanner(System.in);
		String s =sc.nextLine();
		//reverseOutput(s);
		ro(s);
	}
	public static void ro(String s){
		char[] ch =s.toCharArray();
		String s1 ="";
		int x;
		if(ch.length%2==0){
			x=ch.length-1;
		}
		else{
			x=ch.length-2;
		}
		for (int i =x;i>=0;i=i-2) {
			s1=s1+ch[i];
		}
		System.out.println(s1);
	}
	public static void reverseOutput(String a) {
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
