package OO.day01;

public class StudentText {

	public static void main(String[] args) {
		Student zs=new Student();
		zs.name="张三";
		zs.age=25;
		zs.address="廊坊";
		zs.study();
		zs.sayHI();
		
		Student dd=new Student();
		dd.name="丁鼎";
		dd.age=23;
		dd.address="陕西";
		dd.study();
		dd.sayHI();
 
	}

}
