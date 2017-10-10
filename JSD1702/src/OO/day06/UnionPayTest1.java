package OO.day06;
import java.util.Scanner;
public class UnionPayTest1 {

	public static void main(String[] args) {
		ABCATM atm = new ABCATM();
		UnionPay card =new ABCImpl();
		atm.insertCard(card);
		System.out.println("over");
    }
	}

class ABCATM{
	private UnionPay card;
	public void insertCard(UnionPay card){
		this.card=card;
	}
	public void payTelBill(){
		if(card instanceof ABC){
			ABC abccard=(ABC)card;
			abccard.payTelBill("12345678912", 100);
		}else{
			System.out.println("不是农行卡,不能支付话费");
		}
	}
}


















interface UnionPay{
	public double getBalance();
	public boolean drawMoney(double number);
	public boolean checkPwd(String input);	
}
interface CCB extends UnionPay{
	public boolean payGasBill(double number);
}
class CCBImpl implements CCB{
	private double money;
	private String pwd;
	CCBImpl(double money,String pwd){
		this.money=money;
		this.pwd=pwd;
	}
	public double getBalance(){return money;}
	public boolean drawMoney(double number){return true;}
	public boolean checkPwd(String input){return true;}
	public boolean payGasBill(double number){return true;}
}
interface ICBC extends UnionPay{
	public void payOnline(double number);
}
interface ABC extends UnionPay{
	public boolean payTelBill(String phoneNum,double sum);
}
class ICBCImpl implements ICBC{
	private double money;
	private String pwd;
	ICBCImpl(double money,String pwd){
		this.money=money;
		this.pwd=pwd;
	}
	public double getBalance(){return money;}
	public boolean drawMoney(double number){
		if(money>=number){
			money-=number;
			return true;
		}else{
		return false;
		}
		}
	public boolean checkPwd(String input){
		if(pwd.equals(input )){
			return true;
		}else{
			return false;
		}
	}	
	public void payOnline(double number){
		 if(number < money){
	            money-=number;
	        }

	}
	}

class ABCImpl implements ABC{
	public double getBalance(){return 0.0;}
	public boolean drawMoney(double number){return true;}
	public boolean checkPwd(String input){return true;}
	public boolean payTelBill(String phoneNum,double sum){
		System.out.println("支付话费成功");
		return true;}
}
