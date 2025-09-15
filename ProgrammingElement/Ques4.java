import java.util.Scanner;

public class Ques4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double price = sc.nextDouble();
        int quantity = sc.nextInt();

        double total = price * quantity;

        System.out.println(total);
    }
}
