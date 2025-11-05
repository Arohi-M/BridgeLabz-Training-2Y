import java.util.*;
public class NumericSum {
    public static double sumNumbers(List<? extends Number> list) {
        double sum = 0;
        for (Number n : list) sum += n.doubleValue();
        return sum;
    }
    public static void main(String[] args) {
        List<Integer> ints = Arrays.asList(1,2,3,4);
        List<Double> doubles = Arrays.asList(1.1,2.2,3.3);
        System.out.println("Integer Sum: " + sumNumbers(ints));
        System.out.println("Double Sum: " + sumNumbers(doubles));
    }
}