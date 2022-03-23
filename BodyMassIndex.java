import java.util.Scanner;

public class BodyMassIndex {
    public static void main(String[] args) {
        Scanner userInfo = new Scanner(System.in);
        //double age = userInfo.nextDouble();
        System.out.println("Enter your weight in kg");
        double weight = userInfo.nextDouble();
        System.out.println("Enter your height in square meters");
        double height = userInfo.nextDouble();
        double bodyMassIndex = (weight / (height *= height));
        System.out.println("Your BMI is: " + bodyMassIndex);

    }
}