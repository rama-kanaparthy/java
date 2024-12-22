package programbasics;

public class Conditions {

    public static void main(String[] args) {
        int number = 10;
        if (number > 0) {
            System.out.println("The number is positive.");
        }

        number = -5;
        if (number > 0) {
            System.out.println("The number is positive.");
        } else {
            System.out.println("The number is negative.");
        }

        number = 0;
        if (number > 0) {
            System.out.println("The number is positive.");
        } else if (number < 0) {
            System.out.println("The number is negative.");
        } else {
            System.out.println("The number is zero.");
        }

        int day = 3;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            default:
                System.out.println("Weekend");
        }

        number = 5;
        String result = (number % 2 == 0) ? "Even" : "Odd";
        System.out.println("The number is " + result);


        int age = 25;
        if (age > 18) {
            if (age < 30) {
                System.out.println("Young adult.");
            }
        }

        int a = 10, b = 20, c = 30;
        if (a < b && b < c) {
            System.out.println("a is less than b, and b is less than c.");
        }
        if (a > b || b < c) {
            System.out.println("Either a is greater than b, or b is less than c.");
        }

    }
}
