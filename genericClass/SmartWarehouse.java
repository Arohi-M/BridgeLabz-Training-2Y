import java.util.*;
abstract class WarehouseItem { String name; WarehouseItem(String n){name=n;} public String toString(){return name;} }
class Electronics extends WarehouseItem { Electronics(String n){super(n);} }
class Groceries extends WarehouseItem { Groceries(String n){super(n);} }
class Furniture extends WarehouseItem { Furniture(String n){super(n);} }
class Storage<T extends WarehouseItem> {
    List<T> items = new ArrayList<>();
    public void addItem(T item){items.add(item);}
    public static void displayAll(List<? extends WarehouseItem> list){for(WarehouseItem i:list)System.out.println(i);}
}
public class SmartWarehouse {
    public static void main(String[] args){
        Storage<Electronics> e = new Storage<>();
        e.addItem(new Electronics("TV"));
        e.addItem(new Electronics("Laptop"));
        Storage.displayAll(e.items);
    }
}