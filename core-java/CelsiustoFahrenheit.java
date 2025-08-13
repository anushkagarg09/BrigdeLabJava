import java.util.Scanner;
public class CelsiustoFahrenheit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int temp = sc.nextInt();
        int fahrenheit = (temp * 9/5) + 32;
        System.out.println(fahrenheit);
    }
}
