import java.util.*;

class FileNode {
    String name;
    int size;
    boolean isFile;
    List<FileNode> children;

    FileNode(String name, int size, boolean isFile){
        this.name = name;
        this.size = size;
        this.isFile = isFile;
        children = new ArrayList<>();
    }
}

class DirectorySize {
    static int getSize(FileNode node){
        if(node.isFile) return node.size;

        int total = 0;
        for(FileNode child : node.children){
            total += getSize(child);
        }
        return total;
    }
}