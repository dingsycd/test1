package day06;
import java.util.Scanner;
public class Guess {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int count=0;
		int len;
		System.out.println("欢迎尝试猜字母游戏！");		
		do{
		System.out.print("请选择游戏级别(5,7,9)?");
		len=scan.nextInt();
		}while(len!=5&&len!=7&&len!=9);
		char[]chs=generate(len);
		System.out.println(chs);
		while(true){
			System.out.println("猜吧！");
			String str=scan.next().toUpperCase();
			if(str=="EXIT"){
				System.out.println("下次再来吧！");
				break;
			}
			char[]input=str.toCharArray();
			int[]result=check(chs,input);
			int score=100*chs.length-10*count;
			if(result[0]==chs.length){
				 System.out.println("恭喜你！猜对了！得分为："+score);
				 break;
			}else{
				count++;
				System.out.println("字符对的个数为："+result[1]+",位置对的个数为："+result[0]);
			}
		}
		
		
		

	}

public static char[]generate(int len){
	char[] chs = new char[len];
	char[] letters={ 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 
			'K', 'L', 'M', 'N', 'O', 'P', 'R', 'S', 'T', 'U','V', 'W', 
			'X', 'Y', 'Z'};
	boolean[] flag=new boolean[letters.length];	
	for(int i=0;i<chs.length;i++){
		int index;			
		do{
			index=(int)(Math.random()*letters.length);
		}
		while(flag[index]==true);
		chs[i]=letters[index];
		flag[index]=true;
	}
	return chs;
}

public static int[]check(char[]chs,char[]input){
	int[]result=new int[2];
	for(int i=0;i<input.length;i++){
		for(int j=0;j<chs.length;j++){
			if(input[i]==chs[j]){
				result[1]++;
				if(i==j){
					result[0]++;
				}
				break;
			}
		}
	}
	return result;
}
}