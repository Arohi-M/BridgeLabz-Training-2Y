import java.util.*;
public class PerformanceTest {
    public static void main(String[] args) {
        int size = 1000000;
        long start, end;
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) arr[i] = i;
        start = System.currentTimeMillis();
        long sum1 = 0;
        for (int i : arr) sum1 += i;
        end = System.currentTimeMillis();
        System.out.println("int[] time: " + (end - start) + " ms");

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < size; i++) list.add(i);
        start = System.currentTimeMillis();
        long sum2 = 0;
        for (int i : list) sum2 += i;
        end = System.currentTimeMillis();
        System.out.println("ArrayList<Integer> time: " + (end - start) + " ms");
    }
}