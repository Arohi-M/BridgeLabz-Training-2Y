import java.util.*;
class PairSum {
    static boolean exists(int[] arr,int target){
        Set<Integer> set=new HashSet<>();
        for(int x:arr){
            if(set.contains(target-x)) return true;
            set.add(x);
        }
        return false;
    }
}