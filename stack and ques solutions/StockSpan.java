import java.util.*;
class StockSpan {
    static int[] span(int[] arr){
        Stack<Integer> st = new Stack<>();
        int[] res = new int[arr.length];
        for(int i=0;i<arr.length;i++){
            while(!st.isEmpty() && arr[st.peek()]<=arr[i]) st.pop();
            res[i] = st.isEmpty()? i+1 : i-st.peek();
            st.push(i);
        }
        return res;
    }
}