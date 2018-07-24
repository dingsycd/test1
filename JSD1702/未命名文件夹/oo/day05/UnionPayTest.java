package oo.day05;

public class UnionPayTest {

	public static void main(String[] args) {
		
	}

}
interface  UnionPay{
	double getBalance();
	boolean drawMoney(double number);
	boolean checkPwd(String input);
}
interface ICBC extends UnionPay{
	boolean payCelBill(double phoneNum,double sum);
}
class ICBCImpl implements ICBC{
	private double money;
	private String pwd;
	public ICBCImpl(double money,String pwd){
		this.money=money;
		this.pwd=pwd;
	}
	public double getBalance(){
		return money;
	}
	public boolean drawMoney(double number){
		if(money>=number){
			money-=number;
			return true;
		}else{
			return false;
		}
	}
	public boolean checkPwd(String input){
		if(pwd.equals(input)){
			return true;
		}else{
			return false;
		}
	}								
	public boolean payCelBill(double phoneNum,double sum ){
		if(phoneNum)
	}
}