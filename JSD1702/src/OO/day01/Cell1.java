package OO.day01;

public class Cell1 {
int row;
int col;
void drop(){
	row++;
}
void moveLeft(){
	col--;
}
void moveright(){
	col++;
}
String getInfo(){
	return row+","+col;
}
}
