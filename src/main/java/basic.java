import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class basic {

    public static void main(String[] args) {
        List<Integer> a = new ArrayList<>();
        List<Integer> b = new ArrayList<>();
        a.add(1);
        a.add(2);
        a.add(3);
        a.add(4);
        a.add(5);

        Integer mixing_delivery_type = a.stream().filter(i -> i.equals(11)).findAny().orElse(null);


//        b = a.stream().filter(integer -> integer>1).collect(Collectors.toList());
        System.out.println(mixing_delivery_type);
    }
}
