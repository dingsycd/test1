package algorithm;

/**
 * String str ="aabbcddee......:,找出单字符c的位置，不能使用for循环
 */
public class FindPlaceOfC {
    public static void main(String[] args) {
        System.out.println(add(3));
        System.out.println(findC("aabbceedd"));
        System.out.println("aabbcdd".indexOf('c'));
    }
    static int findC(String str){

        int i;
        for(i=0; i<str.length(); i++){
            if(str.charAt(i)=='c'){
                break;
            }
        }
        return i;

    }
    static int add(int i){
        if(i==1){
            return i;
        }
       return i+add(i-1);
    }
}
