package one;

public class TJTest {

	public static void main(String[] args) {
	T t=new T(2,5);
	printWall(t);
	J j=new J(1,2);
	printWall(j);
	}
	public static void printWall(Tetromino tt){
	for(int i=0;i<20;i++){
		for(int j=0;j<10;j++){
			boolean flag=false;
			for(int k=0;k<tt.cells.length;k++){
				if(i==tt.cells[k].row&&j==tt.cells[k].col){
					flag=true;
					break;
				}
			}
			if(flag){
				System.out.print("* ");
			}else{
				System.out.print("- ");
			}
		}
		System.out.println();
	}
}

}
