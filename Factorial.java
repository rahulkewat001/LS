import java.util.*;

public class Factorial {
    public static void factorialOfNumber(int n) {
        int product = 1;
        for (int i = 1; i <= n; i++) {
            product = product * i;
        }
        System.out.println(product);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        factorialOfNumber(n);

        sc.close();
    }
}
