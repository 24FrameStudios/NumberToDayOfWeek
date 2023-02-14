import java.util.Scanner;

public class FirstClass {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        System.out.print("Enter a number to convert to the corresponding day of the week: ");
        int userNum = scnr.nextInt();

        System.out.print("\n" + userNum + " is " + getDayOfWeek(userNum));

    }

    public static String getDayOfWeek(int userNum) {
        return switch (userNum) {
            case 1 -> {yield "Sunday";}
            case 2 -> "Monday";
            case 3 -> "Tuesday";
            case 4 -> "Wednesday";
            case 5 -> "Thursday";
            case 6 -> "Friday";
            case 7 -> "Saturday";
            default -> {yield "Bad Day Input";}
        };
    }
}
