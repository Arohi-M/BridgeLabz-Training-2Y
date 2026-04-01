import java.util.*;
class LongestConsecutive {
    static int longest(int[] arr){
        Set<Integer> set=new HashSet<>();
        for(int x:arr) set.add(x);
        int max=0;
        for(int x:set){
            if(!set.contains(x-1)){
                int len=1;
                while(set.contains(x+len)) len++;
                max=Math.max(max,len);
            }
        }
        return max;
    }
}