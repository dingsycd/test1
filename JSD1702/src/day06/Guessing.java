package day06;
import java.util.Scanner;
public class Guessing {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
char[]chs=generate();
System.out.println(chs);
int count=0;
while(true){
	System.out.println("猜吧！");
	String str = scan.next().toUpperCase(); 
	if(str.equals("EXIT")){
		System.out.println("下次再来吧!");
		break;
	}
	char[]input=str.toCharArray();
	int[] result=check(chs,input);
	if(result[0]==chs.length){
		int sorce=100*chs.length-count*10;
		System.out.println("恭喜你！猜对了!得分为："+sorce);
		break;
	}else{
		count++;
		System.out.println("字符对个数为:"+result[1]+"位置对个数为："+result[0]);
	}
}
	}
//随机生成字符数组
public static char[]generate(){
	char[]chs=new char[5];
	char[] letters ={ 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 
			'K', 'L', 'M', 'N', 'O', 'P', 'R', 'S', 'T', 'U','V', 'W', 
			'X', 'Y', 'Z'};
	boolean[] flag=new boolean[letters.length];
	for(int i=0;i<chs.length;i++){
		int index;
		do{
			index =(int)(Math.random()*letters.length);
		}
		while(flag[index]==true);
		chs[i] = letters[index]; 
		flag[index]=true;
	}
	return chs;
}
//对比：随机字符数组与用户输入的字符数组
public static int[]check(char[]chs,char[]input){
	int[]result=new int[2]; //0,0--result[0]为位置对，result[1]为字符对
	for(int i=0;i<chs.length;i++){ //遍历随机字符数组
		for(int j=0;j<input.length;j++){ //遍历用户输入的字符数组
			if(chs[i]==input[j]){ //字符对
				result[1]++; //字符对个数增1
				if(i==j){ //位置对
					result[0]++; //位置对个数增1
				}
				break;
			}
		}
	}
	return result;
}
}
