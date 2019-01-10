package kata2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Kata2 {

    public static void main(String[] args) {
        int[] data = {1,1,1,100,2,4,5,6,8,8,4,5,6,2,-4};         
        Map<Integer, Integer> histogram = new HashMap<>(); 
 
        for (int value : data) {
            histogram.put(value, histogram.containsKey(value) ? histogram.get(value)+ 1:1);
        }
        histogram.keySet().forEach((key) -> {
            System.out.println(key + " --> " + histogram.get(key));
        });

        System.out.println(Arrays.asList(histogram));
    }
}
