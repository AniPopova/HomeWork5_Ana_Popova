import java.util.Scanner;
public class SpringSeason {
    public static void main(String[] args) {
        Scanner userChoice = new Scanner(System.in);
        int day = userChoice.nextInt();
        System.out.println("The day is " + day);
        int month = userChoice.nextInt();
        System.out.println("The month is " + month);

        boolean correctDay = day <= 20 && day > 0 ? true : false;
        boolean correctMonth = month >= 3 && month <=6 ? true : false;
        boolean correctDate = correctDay && correctMonth ? true : false;
        System.out.println("So it is " + correctDate);

    }
}
