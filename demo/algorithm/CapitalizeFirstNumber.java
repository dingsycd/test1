package algorithm;

/**
 * 将一个英文句子中的每一个单词的首字母转化为大写字母
 */
public class CapitalizeFirstNumber {
    public static void main(String[] args) {
        String s = "today is sunny!";
        System.out.println(change(s));
    }
    public static String change(String s){
        /*
        \b和\B都是边界符。不同的是\b是单词分界符，而\B是非单词分界符。
        单词边界就是，单词和符号的边界，
        这里的单词可以是数字、英文单词、中文单词并且这些单词不互斥。
        单词和符号之间的边界不是\B的边界，
        而单词和单词之间的边界和符号和符号之间的边界就是\B的边界。
        https://blog.csdn.net/Marvel__Dead/article/details/53363955
         */
        String[] arr = s.trim().split("\\b");
        StringBuffer stringBuffer = new StringBuffer();
        //System.out.println(arr.length);
        if (s.length() > 0)
            for (int i = 0; i < arr.length; i++) {
                //System.out.println(arr[i]);
                arr[i] = Character.toUpperCase(arr[i].charAt(0)) + arr[i].substring(1);
                stringBuffer.append(arr[i]);
            }
            return stringBuffer.toString();
    }
}
