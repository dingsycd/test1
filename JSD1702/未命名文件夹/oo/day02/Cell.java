package oo.day02;

public class Cell {
	int row; //行号
	int col; //列号
	Cell(int row,int col){
		this.row=row;
		this.col=col;
	}
	Cell(int n){
		this(n,n);
	}
	Cell(){
		this(0,0);
	}
	void drop(){ //下落一格
		row++;
	}
	void moveleft(int n){ //左移n格
		col-=n;
	}
	void drop(int n){ //下落n格
		row+=n;
	}
	void moveright(int n){ //右移n格
		col+=n;
	}
	String getCellInfo(){ //获取行号和列号
		return row+","+col;
	}
}
