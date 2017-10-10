package OO.day03;

public class Tetromino{
Cell[] cells;
Tetromino(){
	cells =new Cell[4]; //创建格子数组对象
	
}
void drop(){	
	for(int i=0;i<cells.length;i++){
		this.cells[i].row++;
	}
}
void moveLeft(){
	for(int i=0;i<cells.length;i++){
		cells[i].col--;
	}
}
void moveRight(){
	for(int i=0;i<cells.length;i++){
		cells[i].col++;
	}
}
void print(){
	for(int i=0;i<cells.length;i++){
		String str= cells[i].getCellInfo();
		System.out.println(str);
	}
}
}