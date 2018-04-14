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
        String[] arr = s.trim().split("\\b");
        StringBuffer stringBuffer = new StringBuffer();
        if (s.length() > 0)
            for (int i = 0; i < arr.length; i++) {
                arr[i] = Character.toUpperCase(arr[i].charAt(0)) + arr[i].substring(1);
                stringBuffer.append(arr[i]);
            }
            return stringBuffer.toString();
    }
}
