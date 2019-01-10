package kata2;
import java.util.*;
public class Kata2 {

    public static void main(String[] args) {       
        String[] data = {"Rosa", "Pepe", "Juan", "Pepe", "Pepe", "Rosa"};        
        Histogram histo = new Histogram(data);

        Map<String, Integer> histogr = histo.getHistogram();

        System.out.println(Arrays.asList(histogr));
    }
}