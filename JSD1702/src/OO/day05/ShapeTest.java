package OO.day05;

public class ShapeTest {

	public static void main(String[] args) {
		Shape[]shapes=new Shape[4];
		shapes[0]=new Circle(1);
		shapes[1]=new Circle(2);
		shapes[2]=new Square(1);
		shapes[3]=new Square(2);
		maxArea(shapes);
	}
	public static void maxArea(Shape[] shapes){
		double max=shapes[0].area();
		int maxIndex =0;
		for(int i=0;i<shapes.length;i++){
			double area=shapes[i].area();
			if(area>max){
				max=area;
				maxIndex=i;
			}
		}
		System.out.println("最大面积为"+max+",下标为"+maxIndex);
	}

}
abstract class Shape{
	protected double c;
	public abstract double area();
	
}
class Circle extends Shape{
	public Circle(double c){
		this.c=c;
	}
	public double area(){
		return 0.0796*c*c;
	}
}
class Square extends Shape{
	public 	Square(double c){
		this.c =c;
	}
	public double area(){
		return 0.0625*c*c;
	}	
}
class Hexagon extends Shape{
	public Hexagon(double c){
		this.c=c;
	}
	public double area(){
		return 0.0721*c*c;
	}
}
