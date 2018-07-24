package task3;
import java.util.Scanner;
public class Seven {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("请依次输入三个整数：a, b, c（以空格隔开)");
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		System.out.println("您输入的是：");
		System.out.println("a="+a+", b="+b+", c="+c);
		/*int d=a+b+c;
		int min=a<b?a:b;
		min=min<c?min:c;
		int max=a>b?a:b;
		max=max>c?max:c;
		a=min;b=d-max-min;c=max;*/
		int temp=0;
		if(a>b){
			temp=a;
			a=b;
			b=temp;
		}
		if(a>c){
			temp=a;
			a=c;
			c=temp;
		}
		if(b>c){
			temp=b;
			b=c;
			c=temp;
		}
		System.out.println("升序排列后,结果为");
		System.out.println("a="+a+", b="+b+", c="+c);
	}

}
