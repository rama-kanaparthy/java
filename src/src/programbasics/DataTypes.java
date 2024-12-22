package programbasics;

public class DataTypes {

    public static void main(String[] args) {

        byte b = 100; // small number
        short s = 32000; // larger than byte
        int i = 200000; // default for integers
        long l = 9000000000L; // very large number

        System.out.println("Byte value: " + b);
        System.out.println("Short value: " + s);
        System.out.println("Int value: " + i);
        System.out.println("Long value: " + l);

        float piApprox = 3.14F; // single-precision
        double pi = 3.141592653589793; // double-precision

        System.out.println("Float value: " + piApprox);
        System.out.println("Double value: " + pi);

        char letter = 'A';
        char unicodeChar = '\u2764'; // Unicode for heart symbol ❤

        System.out.println("Character: " + letter);
        System.out.println("Unicode Character: " + unicodeChar);

        boolean isJavaFun = true;
        boolean isFishTasty = false;

        System.out.println("Is Java fun? " + isJavaFun);
        System.out.println("Is fish tasty? " + isFishTasty);

        String message = "Hello, World!";
        System.out.println(message);

        // String concatenation
        String name = "John";
        String greeting = "Hello, " + name + "!";
        System.out.println(greeting);

        int[] numbers = {10, 20, 30, 40};
        String[] fruits = {"Apple", "Banana", "Cherry"};

        System.out.println("First number: " + numbers[0]);
        System.out.println("First fruit: " + fruits[0]);

        // Loop through the array
        for (int number : numbers) {
            System.out.println("Number: " + number);
        }

        enum Day {
            MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
        }

        Day today = Day.FRIDAY;

        switch (today) {
            case MONDAY:
                System.out.println("Start of the workweek.");
                break;
            case FRIDAY:
                System.out.println("TGIF!");
                break;
            default:
                System.out.println("Just another day.");
        }

        Integer intObj = Integer.valueOf(100); // Wrapping int
        Double doubleObj = Double.valueOf(3.14); // Wrapping double

        // Unboxing: converting back to primitives
        int num = intObj.intValue();
        double pi1 = doubleObj.doubleValue();

        System.out.println("Integer object: " + intObj);
        System.out.println("Primitive int: " + num);
        System.out.println("Double object: " + doubleObj);
        System.out.println("Primitive double: " + pi1);

        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        System.out.println("Element at (1, 1): " + matrix[0][0]);

        // Print the entire matrix
        for ( i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        String name1 = "Alice";
        int age = 25;
        double salary = 55000.75;
        char grade = 'A';
        boolean isActive = true;

        System.out.println("Name: " + name1);
        System.out.println("Age: " + age);
        System.out.println("Salary: $" + salary);
        System.out.println("Grade: " + grade);
        System.out.println("Is Active: " + isActive);
    }
}
