public class lx extends Point {
    public void move(int dx, int dy) {
        System.out.println("SlowPoint move parameter");
        move();
    }
    public static void main(String[] args) {
        lx sp=new lx();
        sp.move(10,20);
    }
}
class Point {
    public void move(int dx, int dy) {
        System.out.println("Point move parameter");
    }
    public void move(){
        System.out.println("Point move ");
    }
}