import java.util.Scanner;
public class AreaOfTheCircle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int radius = sc.nextInt();
        
        float Area = 22/7 * (radius* radius);
        System.out.println(Area);   
    }
}