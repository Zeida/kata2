package kata2;
import java.util.*;

public class Histogram {
    private final int[] data;

    public Histogram(int[] data) {
        this.data = data;
    }

    public int[] getData() {
        return data;
    }

    public Map<Integer, Integer> getHistogram(){

        Map<Integer, Integer> histogram = new HashMap<Integer, Integer>();

        for (int value : data) {
            histogram.put(value, histogram.containsKey(value) ? histogram.get(value)+ 1:1);
        }
        return histogram;
    }
}