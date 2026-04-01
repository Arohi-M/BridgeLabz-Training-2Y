import java.util.*;
class CustomHashMap {
    class Node{int k,v; Node(int k,int v){this.k=k;this.v=v;}}
    List<Node>[] map;
    int size=10;
    CustomHashMap(){
        map=new LinkedList[size];
        for(int i=0;i<size;i++) map[i]=new LinkedList<>();
    }
    int hash(int k){return k%size;}
    void put(int k,int v){
        int h=hash(k);
        for(Node n:map[h]) if(n.k==k){n.v=v;return;}
        map[h].add(new Node(k,v));
    }
    Integer get(int k){
        for(Node n:map[hash(k)]) if(n.k==k) return n.v;
        return null;
    }
    void remove(int k){
        map[hash(k)].removeIf(n->n.k==k);
    }
}