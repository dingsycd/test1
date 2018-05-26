import java.util.HashSet;
import java.util.Vector;

public class Test {
    public static void main(String[] args) {
        Vector data = new Vector();
        data.add("apple");
        data.add("mango");
        data.add("papaya");
        data.add("apple");
        System.out.println(getData(data));
    }

    private static Vector getData(Vector v) {
        return new Vector(new HashSet(v));
    }
}
