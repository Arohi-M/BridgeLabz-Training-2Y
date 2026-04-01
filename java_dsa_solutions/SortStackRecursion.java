import java.util.*;

class SortStackRecursion {
    static void insert(Stack<Integer> stack, int x) {
        if (stack.isEmpty() || stack.peek() <= x) {
            stack.push(x);
            return;
        }
        int temp = stack.pop();
        insert(stack, x);
        stack.push(temp);
    }

    static void sort(Stack<Integer> stack) {
        if (!stack.isEmpty()) {
            int temp = stack.pop();
            sort(stack);
            insert(stack, temp);
        }
    }
}