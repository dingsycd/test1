package oo.day02;

public class CellTest {

	public static void main(String[] args) {
	Cell c =new Cell();
	Cell c1=new Cell(1);
	Cell c2=new Cell(2,3);
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
