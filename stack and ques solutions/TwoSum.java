import java.util.*;
class TwoSum {
    static int[] solve(int[] arr,int target){
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(target-arr[i])){
                return new int[]{map.get(target-arr[i]),i};
            }
            map.put(arr[i],i);
        }
        return new int[]{};
    }
}