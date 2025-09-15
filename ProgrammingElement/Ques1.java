import java.util.Scanner;

public class Ques1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double base = sc.nextDouble();
        double height = sc.nextDouble();

        double areacm = 0.5 * base * height;
        double areain = areaCm / (2.54 * 2.54); 

        System.out.println(areain);
        System.out.println(areacm);
      
    }
}
