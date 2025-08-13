import java.util.Scanner;
public class CalcSimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int principal = sc.nextInt();
        int rate = sc.nextInt();
        int time = sc.nextInt();

        int SimpleInterest = (principal * rate * time) / 100;

        System.out.println(SimpleInterest);
    }
}
