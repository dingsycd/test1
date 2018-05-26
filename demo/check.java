class check {
    public static void main(String[] args) {
        //System.out.println(args[args.length-2]);
        //java.lang.ArrayIndexOutOfBoundsException: -2

        System.out.println(14^23);
        /*
       14    1110
       23    10111
       25    11001
         */
        System.out.println(14&23);
        /*
       14     1110
       23    10111
       6     00110
         */
        System.out.println(14|23);
        /*
        14    1110
        23   10111
        31   11111
         */
        System.out.println(~14);
        /*
        取反
        整数则为：-（a+1）
        负数则为：-a-1
         */
        //三目运算
        System.out.println(1>2?3:4);
    }
}
