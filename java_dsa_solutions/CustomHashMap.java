import java.util.*;

class CustomHashMap {
    class Node {
        int key, value;
        Node(int k, int v) {
            key = k;
            value = v;
        }
    }

    List<Node>[] map;
    int size;

    CustomHashMap(int size) {
        this.size = size;
        map = new LinkedList[size];
        for (int i = 0; i < size; i++) {
            map[i] = new LinkedList<>();
        }
    }

    int hash(int key) {
        return key % size;
    }

    void put(int key, int value) {
        int h = hash(key);
        for (Node node : map[h]) {
            if (node.key == key) {
                node.value = value;
                return;
            }
        }
        map[h].add(new Node(key, value));
    }

    Integer get(int key) {
        int h = hash(key);
        for (Node node : map[h]) {
            if (node.key == key) return node.value;
        }
        return null;
    }

    void remove(int key) {
        int h = hash(key);
        map[h].removeIf(node -> node.key == key);
    }
}