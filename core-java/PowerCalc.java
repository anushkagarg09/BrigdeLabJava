import java.util.Scanner;
public class PowerCalc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int base = sc.nextInt();
        int exponent = sc.nextInt();

        double power = Math.pow(base, exponent);

        System.out.println((int)power);

    }
}
