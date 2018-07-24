package OO.day01;

public class CellTest {

	public static void main(String[] args) {
	/*Cell c =new Cell();
	c.row=2;
	c.col=5;
	c.drop();
	c.moveleft(3);
	String str =c.getCellInfo();
	System.out.println(str);*/
		Cell c =new Cell();
		c.row=2;
		c.col=5;
		System.out.println("Cell的位置为 (" + c.row + "," + c.col + ")");
		printWall(c);
		c.drop();
		System.out.println("下落后：");
		printWall(c);
		c.moveleft(3);
		System.out.println("左移后：");
		printWall(c);
	}
public static void printWall(Cell cc){
	for(int i=0;i<20;i++){
		for(int j=0;j<10;j++){
			if(i==cc.row&&j==cc.col){
				System.out.print("* ");
			}else{
				System.out.print("- ");
			}
		}
		System.out.println();
	}
}
}
