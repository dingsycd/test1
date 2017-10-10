package two;

public class Hoo {
	public int a;
	int b;
	protected int c;
	private int d;
void	show(){
		a=1;
		b=2;
		c=3;
		d=4;
	
	}
}
class Joo extends Hoo{
	
void	show(){
	Joo o=new Joo();
	o.a=1;
	o.b=2;
	o.c=3;
	o.show();
		
	}
}