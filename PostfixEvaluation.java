import java.util.*;

public class PostfixEvaluation {

    // Function to check operator
    static boolean isOperator(char ch) {
        return ch == '+' || ch == '-' || ch == '*' || ch == '/' || ch == '^';
    }

    // Function to apply operation
    static int applyOperation(int a, int b, char op) {
        switch (op) {
            case '+': return a + b;
            case '-': return a - b;
            case '*': return a * b;
            case '/': return a / b;
            case '^': return (int)Math.pow(a, b);
        }
        return 0;
    }

    // Function to evaluate postfix
    static int evaluatePostfix(String exp) {
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < exp.length(); i++) {
            char c = exp.charAt(i);

            // If operand → push
            if (Character.isDigit(c)) {
                stack.push(c - '0'); // convert char to int
            }

            // If operator
            else if (isOperator(c)) {
                int b = stack.pop(); // second operand
                int a = stack.pop(); // first operand

                int result = applyOperation(a, b, c);
                stack.push(result);
            }
        }

        return stack.pop();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Postfix Expression: ");
        String postfix = sc.nextLine();

        int result = evaluatePostfix(postfix);

        System.out.println("Result: " + result);
    }
}