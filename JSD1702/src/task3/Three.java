package task3;

public class Three {

	public static void main(String[] args) {
		int i = 100, j = 200;
		boolean b1 = (i > j) && (i++ > 100);
		System.out.println(b1); //false
		System.out.println(i);//100

	}

}
