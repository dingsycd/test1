import java.util.ArrayList;
import java.util.Collection;

public class Demo2 {
	public static void main(String[] args) {
		//java就近调用原则
		test(0);
	} 
	
	public static void test(int i){
		System.out.println("int");
	}
	public static void test(String str){
		System.out.println("string");
	}
	public static void test(Collection c){
		System.out.println("collection");
	}
	public static void test(ArrayList arrayList){
		System.out.println("arrayList");
	}
	public static void test(Object o){
		System.out.println("object");
	}
	
}