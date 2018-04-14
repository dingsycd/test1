package algorithm;

/**
 * 完全平方指用一个整数乘以自己例如1*1，2*2，3*3等，依此类推。
 * 若一个数能表示成某个整数的平方的形式，则称这个数为完全平方数。
 *
 * 一个整数，它加上100后是一个完全平方数，
 * 再加上168又是一个完全平方数，请问该数是多少？
 */
public class PerfectSquare {
    public static void main(String[] args) {
//        for(int i=0;i<100000000;i++){
//            if(Math.sqrt(i+100) %1 ==0){
//                if(Math.sqrt(i+168) %1 ==0){
//                    System.out.println("该数为："+i);
//                }
//            }
//        }
        int x =0;
        while (true){
            if(Math.sqrt(x+100)%1==0 && Math.sqrt(x+168)%1==0){
                System.out.println("该数为："+x);
                return;
            }
            x++;
        }
    }
}
