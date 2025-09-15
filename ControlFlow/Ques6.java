import java.util.Scanner;

public class Ques6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if (num <= 0) {
            System.out.println("enter a positive integer.");
        } else {
            for (int i = 1; i < num; i++) {
                if (number % i == 0) {
                    System.out.println(i);
                }
            }
        }
    }
}
