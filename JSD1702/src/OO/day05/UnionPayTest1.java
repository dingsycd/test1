package OO.day05;
import java.util.Scanner;
public class UnionPayTest1 {

	public static void main(String[] args) {
		ICBCImpl card1=new ICBCImpl(2000,"123456");
		Scanner input = new Scanner(System.in);
        System.out.println("请输入密码：");
        if(card1.checkPwd(input.next())){
            System.out.println("请输入金额：");
            double num = Double.parseDouble(input.next());
            if(card1.drawMoney(num)){
                System.out.println("取钱成功，卡余额为："+card1.getBalance());
            }
            else{
                System.out.println("取钱失败");
            }
        }else{
            System.out.println("密码错误");
        }
input.close();
    }

		ABC card4 =new ABCImpl();

	}


interface UnionPay1{
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
interface ICBC1 extends UnionPay{
	public void payOnline(double number);
}
interface ABC extends UnionPay{
	public boolean payTelBill(String phoneNum,double sum);
}
class ICBCImpl1 implements ICBC1{
	private double money;
	private String pwd;
	ICBCImpl1(double money,String pwd){
		this.money=money;
		this.pwd=pwd;
	}
	public double getBalance(){return money;}
	public boolean drawMoney(double number){
		if(money>=number){
			money-=number;
			return true;
		}
		return false;
		
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
	public boolean payTelBill(String phoneNum,double sum){return true;}
}
