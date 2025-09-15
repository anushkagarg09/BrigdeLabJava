import java.util.Scanner;

public class Ques3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double disinfeet = sc.nextDouble();

        double disinyard = disinfeet / 3;
        double disinmile =  disinyard / 1760;

        System.out.println(disinyard);
        System.out.println(disinmile);
    }
}
