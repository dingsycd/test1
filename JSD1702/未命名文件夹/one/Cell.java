package one;

public class Cell {
	int row;
	int col;
 Cell(int row,int col){
	this.row=row;
	this.col=col;
}

String getCellInfo(){
	return row+","+col;		
}
}
