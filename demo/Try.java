public class Try {
    public static int block(){
        try{
            System.out.println("try block");
            throw new Exception();
        } catch (Exception e) {
            System.out.println("exit block");
            System.exit(0);
            return 0;
        }finally {
            System.out.print("finally block");
            return 1;
        }
    }

    public static void main(String[] args) {
        int i = 0;
        i = block();
        System.out.println(i);
    }
}
