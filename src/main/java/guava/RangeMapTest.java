package guava;

import com.google.common.collect.*;

public class RangeMapTest {

    public static void main(String[] args) {

        RangeMap<Double, RangeMap<Integer, Integer>> map = TreeRangeMap.create();


        map.put(Range.closedOpen(0.0, 1.0), ImmutableRangeMap.<Integer, Integer>builder()
                .put(Range.closedOpen(0,20), 5)
                .put(Range.closedOpen(20,50), 5)
                .put(Range.closedOpen(50,70), 8)
                .put(Range.closedOpen(70,100), 10)
                .build());


        System.out.println(map.get(0.2).get(50));



    }



}
