package OOday03;

public class SuperDemo {

	public static void main(String[] args) {
		Boo o =new Boo();

	}
}	
	class Aoo{
		Aoo(){
			System.out.println("父类构造");
		}
	}
	class Boo extends Aoo{
		Boo(){
			System.out.println("子类构造");
		}
	}
	class Coo{
		Coo(int n){
			
		}
	}
	class Doo extends Coo{
		Doo(){
			super(2);
		}
	}


