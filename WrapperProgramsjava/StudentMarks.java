import java.util.*;
public class StudentMarks {
    public static void main(String[] args) {
        Object[] inputs = {"85", 95, Integer.valueOf(88), "null"};
        ArrayList<Integer> valid = new ArrayList<>();
        for (Object obj : inputs) {
            try {
                if (obj instanceof String) {
                    String s = (String) obj;
                    if (!s.equals("null")) valid.add(Integer.parseInt(s));
                } else if (obj instanceof Integer) {
                    valid.add((Integer) obj);
                }
            } catch (Exception e) {}
        }
        double avg = valid.stream().mapToInt(Integer::intValue).average().orElse(0);
        System.out.println("Average marks: " + avg);
    }
}