package collocationUtil;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorTest {

    public static void main(String[] args) {
        List<String> c = new ArrayList<>();
        c.add("1");
        c.add("2");
        c.add("3");
        c.add("4");
        c.add("5");
        System.out.println(c.toString());
        Iterator<String> it = c.iterator();
        System.out.println(it.toString());
        it.next();
        it.remove();
        System.out.println(it.toString());
    }
}
