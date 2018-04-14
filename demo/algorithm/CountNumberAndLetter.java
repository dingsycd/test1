package algorithm;

import java.util.Scanner;

/**
 * 输入一行字符，分别统计出其中英文字母、空格、数字和其它字符的个数。
 */
public class CountNumberAndLetter {
    public static void main(String[] args) {
        int letterCount = 0 ; //字母的个数
        int spaceCount = 0 ; //空格的个数
        int numberCount = 0 ; //数字的个数
        int otherCount = 0 ; //其他字符的个数
        System.out.println("请输入一组字符：");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        char[] chars = str.toCharArray();
        for(int i =0;i<chars.length;i++){
            //判断是否为字母
            if(Character.isLetter(chars[i])){
                letterCount++;
            }
            //判断是否为空格
            else if (Character.isSpaceChar(chars[i])){
                spaceCount++;
            }
            //判断是否为数字
            else if (Character.isDigit(chars[i])){
                numberCount++;
            }
            //以上都不是为其他
            else{
                otherCount++;
            }
        }
        System.out.println("字母个数为："+letterCount);
        System.out.println("空格个数为："+spaceCount);
        System.out.println("数字个数为："+numberCount);
        System.out.println("其他字符个数为："+otherCount);

    }
}
