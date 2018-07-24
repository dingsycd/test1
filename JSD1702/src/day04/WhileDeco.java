package day04;

public class WhileDeco {

	public static void main(String[] args) {
		/*int time=0;
		while(time<10){
			System.out.println("行动是成功的阶梯");
			time++;
		}
		System.out.println("over");*/
		/*int num =1;
		while(num<=9){
			System.out.println(num+"*9="+num*9);
			num++;
		}
		System.out.println("over");		
		/*执行过程：
                              num=1;
          num<=9吗？  true, 输出1*9=9;
          num<=9吗？  true, 输出2*9=18;
          num<=9吗？  true, 输出3*9=27;
          num<=9吗？  true, 输出4*9=36;
          num<=9吗？  true, 输出5*9=45;
          num<=9吗？  true, 输出6*9=54;
          num<=9吗？  true, 输出7*9=63;
          num<=9吗？  true, 输出8*9=72;
          num<=9吗？  true, 输出9*9=81;
          num<=9吗？ false, 输出over;*/
		int num =9;
		while(num>=1){
			System.out.println(num+"*9="+num*9);
			num--;
		}
		System.out.println("over");
           	
	}

}
