package programbasics;

public class Loops {

    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {
            System.out.println("Iteration: " + i);
        }

        int[] numbers = {10, 20, 30, 40};
        for (int num : numbers) {
            System.out.println("Number: " + num);
        }

        int i = 1;
        while (i <= 5) {
            System.out.println("Iteration: " + i);
            i++;
        }

        i = 1;
        do {
            System.out.println("Iteration: " + i);
            i++;
        } while (i <= 5);

        for (i = 1; i <= 10; i++) {
            if (i == 5) {
                System.out.println("Breaking at: " + i);
                break;
            }
            System.out.println(i);
        }

        for ( i = 1; i <= 5; i++) {
            if (i == 3) {
                System.out.println("Skipping " + i);
                continue;
            }
            System.out.println("Iteration: " + i);
        }

        for ( i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                System.out.println("i: " + i + ", j: " + j);
            }
        }

        String[] fruits = {"Apple", "Banana", "Cherry"};
        for ( i = 0; i < fruits.length; i++) {
            System.out.println(fruits[i]);
        }

       /* while (true) {
            System.out.println("Running...");
            break; // Prevent actual infinite looping
        }*/


    }
}
