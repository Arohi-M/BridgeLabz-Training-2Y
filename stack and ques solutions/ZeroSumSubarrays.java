import java.util.*;
class ZeroSumSubarrays {
    static List<int[]> find(int[] arr){
        Map<Integer,List<Integer>> map=new HashMap<>();
        List<int[]> res=new ArrayList<>();
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            if(sum==0) res.add(new int[]{0,i});
            if(map.containsKey(sum)){
                for(int idx:map.get(sum)){
                    res.add(new int[]{idx+1,i});
                }
            }
            map.computeIfAbsent(sum,k->new ArrayList<>()).add(i);
        }
        return res;
    }
}