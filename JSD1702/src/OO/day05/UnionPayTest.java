package OO.day05;

import java.util.Scanner;

public class UnionPayTest {

	public static void main(String[] args) {
		ICBC icbc = new ICBCImpl(2000, "123456");

		Scanner input = new Scanner(System.in);

		System.out.println("请输入密码：");
		if (icbc.checkPwd(input.next())) {
			while (true) {
				System.out.println("请选择功能：0.查询余额 1.取钱,请输入金额： 2.交话费 ");
				int command = input.nextInt();

				switch (command) {
				case 0:
					System.out.println("卡余额为：" + icbc.getBalance());
					break;
				case 1:
					System.out.println("取钱,请输入金额：");
					double num = Double.parseDouble(input.next());

					if (icbc.drawMoney(num)) {
						System.out.println("取钱成功，卡余额为：" + icbc.getBalance());
					} else {
						System.out.println("取钱失败");
					}
					break;
				case 2:
					
					icbc.payCelBill();
					break;
				default:
					System.out.println("输入错误");
				}
			}
		} else {
			System.out.println("密码错误");
		}

	}

}

interface UnionPay {
	double getBalance();

	boolean drawMoney(double number);

	boolean checkPwd(String input);
}

interface ICBC extends UnionPay {
	boolean payCelBill();
}

class ICBCImpl implements ICBC {
	private double money;
	private String pwd;

	public ICBCImpl(double money, String pwd) {
		this.money = money;
		this.pwd = pwd;
	}

	public double getBalance() {
		return money;
	}

	public boolean drawMoney(double number) {
		if (money >= number) {
			money -= number;
			return true;
		} else {
			return false;
		}
	}

	public boolean checkPwd(String input) {
		if (pwd.equals(input)) {
			return true;
		} else {
			return false;
		}
	}

	public boolean payCelBill() {
		String phoneNum;
		double sum;
		Scanner input = new Scanner(System.in);
		System.out.println("请输入电话号码：");
		phoneNum= input.next();		
		if (phoneNum.equals("100")) {
			System.out.println("电话号码正确,请输入充值金额：");
			 sum = Double.parseDouble(input.next());
			if ((money - sum) >= 0.0) {
				money -= sum;
				System.out.println("充值成功,余额为" + money);
			} else {
				System.out.println("余额不足,余额为" + money);
			}
			return true;
		} else {
			System.out.println("电话号码错误");
			return false;
		}

	}
}