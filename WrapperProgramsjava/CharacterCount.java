import java.util.Scanner;
public class CharacterCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int letters = 0, digits = 0, specials = 0;
        for (char c : s.toCharArray()) {
            if (Character.isLetter(c)) letters++;
            else if (Character.isDigit(c)) digits++;
            else if (!Character.isWhitespace(c)) specials++;
        }
        System.out.println("Letters: " + letters);
        System.out.println("Digits: " + digits);
        System.out.println("Special characters: " + specials);
    }
}