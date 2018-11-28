package util.ListTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class SubListTest {

    public static void main(String[] args) {
        List<String> al = new ArrayList<>();
        al.add("1");
        al.add("2");
        al.add("3");
        al.add("4");
        al.add("5");
//        List<String> sb = al.subList(0, 3);
//        System.out.println(al);
//        System.out.println(sb);
//        System.out.println(al);
//        List sub=al.subList(1,3);
//        List two=new ArrayList(sub);
//        sub.clear();
//        System.out.println(al);
//        System.out.println(two);

//        Iterator<String> iter = al.iterator();
//        while(iter.hasNext()){
//            String str = iter.next();
//            if (str.contains("1")){
//                iter.remove();
//            }
//        }
//        System.out.println(al);
//        System.out.println(iter);


        String[] str = new String[] { "you", "wu" };
        List list = Arrays.asList(str);
        System.out.println(list);
    }


}
