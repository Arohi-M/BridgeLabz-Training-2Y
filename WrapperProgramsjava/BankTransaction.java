public class BankTransaction {
    public static double remainingLimit(Double limit) {
        if (limit == null) return 0.0;
        return limit - 100.0;
    }
    public static void main(String[] args) {
        System.out.println(remainingLimit(500.0));
        System.out.println(remainingLimit(null));
    }
}