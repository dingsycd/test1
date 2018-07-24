package oo.day02;

public class RefArrayDemo {

	public static void main(String[] args) {
	Cell[] cells = new Cell[4];
	cells[0]=new Cell(2,5);
	cells[1]=new Cell(2,6);
	cells[2]=new Cell(2,7);
	cells[3]=new Cell(3,5);
	
	Cell[] cs=new Cell[]{
		new Cell(2,5),
		new Cell(2,6),
		new Cell(2,7),
		new Cell(3,5)
	};
	
	int[][] arr = new int[3][];
	arr[0]=new int[3];
	arr[1]=new int[2];
	arr[2]=new int[3];
	arr[0][0]=1;
	int[][]a=new int[3][4];
	for(int i=0;i<a.length;i++){
		for(int j=0;j<a[i].length;j++){
			a[i][j]=100;
		}
	}
	}

}
