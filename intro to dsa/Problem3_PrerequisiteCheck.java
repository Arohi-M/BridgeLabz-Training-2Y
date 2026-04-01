import java.util.*;

class Problem3_PrerequisiteCheck {

    // Nested Loop
    static boolean checkA(int[] completed, int[] pre){
        for(int p: pre){
            boolean found=false;
            for(int c: completed){
                if(p==c){
                    found=true;
                    break;
                }
            }
            if(!found) return false;
        }
        return true;
    }

    // HashSet
    static boolean checkB(int[] completed, int[] pre){
        HashSet<Integer> set=new HashSet<>();
        for(int c:completed) set.add(c);

        for(int p:pre){
            if(!set.contains(p)) return false;
        }
        return true;
    }
}