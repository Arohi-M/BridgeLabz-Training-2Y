import java.util.Scanner;
class main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a=sc.nextInt(), b=sc.nextInt(), c=sc.nextInt();
    double h1=sc.nextDouble(), h2=sc.nextDouble(), h3=sc.nextDouble();

    String youngest = (a<=b && a<=c) ? "Amar" : (b<=a && b<=c) ? "Akbar" : "Anthony";
    String tallest = (h1>=h2 && h1>=h3) ? "Amar" : (h2>=h1 && h2>=h3) ? "Akbar" : "Anthony";

    System.out.println("Youngest friend: "+youngest);
    System.out.println("Tallest friend: "+tallest);
  }
}
