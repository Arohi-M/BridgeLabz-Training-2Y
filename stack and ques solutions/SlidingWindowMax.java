import java.util.*;
class SlidingWindowMax {
    static int[] maxWindow(int[] arr,int k){
        Deque<Integer> dq = new LinkedList<>();
        int[] res = new int[arr.length-k+1];
        int idx=0;
        for(int i=0;i<arr.length;i++){
            if(!dq.isEmpty() && dq.peek()<i-k+1) dq.poll();
            while(!dq.isEmpty() && arr[dq.peekLast()]<arr[i]) dq.pollLast();
            dq.offer(i);
            if(i>=k-1) res[idx++]=arr[dq.peek()];
        }
        return res;
    }
}