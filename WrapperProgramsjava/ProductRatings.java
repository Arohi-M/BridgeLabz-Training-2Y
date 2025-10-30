import java.util.*;
import java.util.stream.*;
public class ProductRatings {
    public static void main(String[] args) {
        int[] arr = {4, 5, 3};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(2, null, 5));
        ArrayList<Integer> merged = new ArrayList<>();
        for (int n : arr) merged.add(n);
        for (Integer n : list) if (Objects.nonNull(n)) merged.add(n);
        double avg = merged.stream().mapToInt(Integer::intValue).average().orElse(0);
        System.out.println("Average rating: " + avg);
    }
}