public class AgeValidation {
    public static boolean isValidAge(String input) {
        try {
            int age = Integer.parseInt(input);
            return age >= 18;
        } catch (NumberFormatException e) {
            return false;
        }
    }
    public static void main(String[] args) {
        String[] tests = {"20", "abc", "17"};
        for (String t : tests) System.out.println(t + ": " + isValidAge(t));
    }
}