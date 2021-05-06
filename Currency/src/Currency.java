import java.util.Scanner;
public class Currency {
    public static void main(String[] args) {
        double usd;
       Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount in USD: ");
        usd = sc.nextDouble();
        double rate = usd * 23000;
        System.out.println("The amount of VND is: "+ rate);
    }
}
