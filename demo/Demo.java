import java.util.ArrayList;

public class Demo {
    public static void main(String[] args) {
        final int a =1;
        ArrayList list = new ArrayList();
        list.add("java");
        list.add("aaa");
        list.add("bb");
        list.add("java");
//        for(int i = list.size()-1;i>=0;i--){
//            if ("java".equals(list.get(i))){
//                list.remove(i);
//            }
//        }
//        list.remove("java"); //只能删除一个“java”
//       // list.removeAll("java"); //报错
//        System.out.println(list);
        int aa =1;
        int bb = (aa++) + (++aa);
        //System.out.println(bb);
        byte x =10;
        while (x<20){
            x = (byte) (x -1);
            System.out.println(x);
        }
        System.out.println( Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);

    }
}
