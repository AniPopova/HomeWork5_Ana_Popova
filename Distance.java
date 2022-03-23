import java.util.Scanner;
public class Distance {
    public static void main(String[] args) {
        Scanner userChoice = new Scanner(System.in);
        double x = userChoice.nextDouble();
        x *=x;
        double y = userChoice.nextDouble();
        y*=y;
        double result = Math.sqrt(x+y);
        System.out.println("The result is: "+ result);

    }
}
