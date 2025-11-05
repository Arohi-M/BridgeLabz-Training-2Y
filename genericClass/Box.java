public class Box<T> {
    private T value;
    public void set(T value) { this.value = value; }
    public T get() { return value; }
    public static void main(String[] args) {
        Box<Integer> intBox = new Box<>();
        intBox.set(10);
        Box<String> strBox = new Box<>();
        strBox.set("Hello");
        Box<Double> dblBox = new Box<>();
        dblBox.set(3.14);
        System.out.println(intBox.get() + " " + strBox.get() + " " + dblBox.get());
    }
}