package OO.day04;

public class Cell {
	int row; //行号
	int col; //列号
	Cell(int row,int col){
		this.row=row;
		this.col=col;
	}
	
	String getCellInfo(){ //获取行号和列号
		return row+","+col;
	}
}
