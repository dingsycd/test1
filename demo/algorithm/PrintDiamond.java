package algorithm;

/**
 * 67.打印出如下图案（菱形）
 * <p>
 * **
 * ****
 * ******
 * ****
 * **
 */
public class PrintDiamond {
    public static void main(String[] args) {
        //菱形的对角线垂直切相等(即高和宽必须是相等的奇数)
//        int lay;
//        lay = 7;//菱形的总长度
//        for(int m = 1; m <=(lay+1)/2; m++)//正序输出上半部分
//        {
//            for(int b = 1; b <=(lay+1)/2-m ; b++)//输出空格
//            {
//                System.out.print(" ");
//            }
//            for(int c = 1; c <= m*2-1; c++)
//            {
//                System.out.print("*");
//            }
//            System.out.println();//换行
//        }
//        for(int d =(lay+1)/2-1;d >= 1; d --)//倒序输出下半部分
//        {
//            for(int b = 1; b <= (lay+1)/2-d; b++)//输出空格
//            {
//                System.out.print(" ");
//            }
//            for(int c = (lay+1)/2-d; c <=(lay+1)/2-2+d; c ++)//(lay+1)/2-1即为下半个三角形
//            {
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        int x = 7;
        //上半部分
        for(int i =1;i<=x/2+1;i++){
            //先打印空格
            for(int j = 1;j<=x/2+1-i;j++){
                System.out.print(" ");
            }
            //再打印*
            for(int k = 1;k<=2*i-1;k++){
                System.out.print("*");
            }
            //换行
            System.out.println();
        }
        //下半部分
        for(int i =1;i<=x/2;i++){
            //先打印空格
            for(int j=1;j<=i;j++){
                System.out.print(" ");
            }
            //再打印*
            for(int k =1;k<=x-2*i;k++){
                System.out.print("*");
            }
            //换行
            System.out.println();
        }
    }
}
