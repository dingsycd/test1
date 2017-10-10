package lianxi;
import java.util.Scanner;
public class Cashier {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入单价：￥");
		double untiprice = scan.nextDouble();
		System.out.println("请输入数量：");
		double amount =scan.nextDouble();
		System.out.println("请输入金额：￥");
		double money = scan.nextDouble();
		double allPrice = untiprice * amount;
		if(allPrice>=500){
			allPrice*=0.8;	
		}
		if(money>=allPrice){
			double change = money - allPrice;
			System.out.println("总价为：￥"+allPrice+",找零为:￥"+ change);
		}
		else{
			System.out.println("总价为：￥"+allPrice+"，对不起，您给的钱不够，还需：￥"+(allPrice-money));
		}
		
			

	}

}
