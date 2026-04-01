import java.util.*;

class Problem2_SearchComparison {

    // Linear Search
    static boolean linear(int[] arr, int target){
        for(int x: arr){
            if(x == target) return true;
        }
        return false;
    }

    // Binary Search
    static boolean binary(int[] arr, int target){
        int l=0, r=arr.length-1;
        while(l<=r){
            int mid=(l+r)/2;
            if(arr[mid]==target) return true;
            else if(arr[mid]<target) l=mid+1;
            else r=mid-1;
        }
        return false;
    }

    // HashSet Search
    static boolean hashSearch(HashSet<Integer> set, int target){
        return set.contains(target);
    }
}