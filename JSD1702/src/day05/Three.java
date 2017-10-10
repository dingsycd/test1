package day05;
import java.util.Scanner;
public class Three {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入查找质数的范围：2~");
        int max = scanner.nextInt();
        scanner.close();
        int numOfPrime = 0;
        for (int n = 2; n <= max; n++) {
            // 判断n是否是质数
            int m = (int) Math.sqrt(n);
            int i = 2;
            for (; i <= m; i++) {
                if (n % i == 0)
                    break;
            }
            if (i > m) {
                System.out.print(n + "\t");
                if (++numOfPrime % 10 == 0)
                    System.out.println();
            }
        }
        System.out.println("\n共有" + numOfPrime + "个质数");
    }
}