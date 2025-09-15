import java.util.Scanner;

public class QuotientRemainder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        if (num2!=0) {
            int quotient = num1 / num2;
            int rem = num1 % num2;
            System.out.println(quotient);
            System.out.println(remainder);
        } 
    }
}
