package algorithm;

/**
 * 一球从100米高度自由落下，每次落地后反跳回原高度的一半；
 * 再落下，求它在?第10次落地时，共经过多少米？第10次反弹多高？
 */
public class BallFall {
    public static void main(String[] args) {
        //经过的路程
        double s = 0;
        //反弹的高度
        double h = 100;
        for (int i =1;i<=10;i++){
            s += h*2;
            h = h/2;
        }
        s = s-100;
        System.out.println("第10次落地时，共经过"+s+"米;");
        System.out.println("第10次反弹"+h+"米。");
    }
}
