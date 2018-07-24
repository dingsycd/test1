package interview;
/**
 * 跳出多重循环
 * @author DD
 *
 */
public class JumpOutOfMultipleCycles {
	public static void main(String[] args) {
//		for (int i = 0; i < 10; i++) {
//			for (int j = 0; j < 10; j++) {
//				System.out.println("j="+j);
//				if(i==2){
//					return; //return结束整个方法，不执行return下面的语句
//				}
//			}
//			System.out.println("i="+i);
//		}
//		System.out.println("aaa"); //不会执行

//		ok: //在外层循环外加标号，可以退出多重循环
//		for (int i = 0; i < 10; i++) {
//			for (int j = 0; j < 10; j++) {
//				System.out.println("j="+j);
//				if(i==2){
//					break ok;
//				}
//			}
//			System.out.println("i="+i);
//		}
//		System.out.println("aaa");
		
		
		Boolean b = false; //在外层循环条件中加表达式配合开关退出多重循环
		for (int i = 0; i < 10&&!b; i++) {
			for (int j = 0; j < 10; j++) {
				System.out.println("j="+j);
				if(i==2 ){
					b=true;
				}
			}
			System.out.println("i="+i);
		}
		System.out.println("aaa");
	}

}
