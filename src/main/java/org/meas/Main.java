package org.meas;

import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Primitive types
        int myAge = 30;
        long viewsCount = 3_123_456_789L; // 3123456789 L is long
        float price = 10.99F; // F is float
        double reduction = 10.99;
        char letter = 'A';
        boolean isEligible = true;
        String message = "Hello world";
        String message2 = "Hello \"world\"";

        // Reference or non-primitive types
        Date now = new Date();

        System.out.println(now); // shortcut: sout

        System.out.println(message.endsWith("!!"));
        System.out.println(message.endsWith("d"));
        System.out.println(message.length());
        System.out.println(message.indexOf("H"));
        System.out.println(message.indexOf("e"));
        System.out.println(message.indexOf("z"));
        System.out.println(message.replace("l","*"));
        System.out.println(message.toLowerCase());
        System.out.println(message.toUpperCase());
        System.out.println(message.trim()); // to remove all white space at the beginning

        String filePath = "C:\\Windows\\...";
        String message3 = "Part1\nPart2"; // \n is to go to new line
        String message4 = "Part1\tPart2"; // \t is to leave a space in between


        // Arrays

        int[] numbers = new int[5];
        numbers[0] = 17;
        numbers[1] = 3;
        System.out.println(Arrays.toString(numbers));

        int[] numbers2 = {8, 7, 5, 3}; // after creating you cannot add or remove an element
        System.out.println("lenght = "+numbers2.length);

        // 2 dimentional arrays and so on
        int[][] numbersMatrix = new int[3][2];
        numbersMatrix[0][0] = 2;
        System.out.println(Arrays.deepToString(numbersMatrix));

        int[][] numbersMatrix2 = {{3,2,0},{2,8,7}};
        System.out.println(Arrays.deepToString(numbersMatrix2));

        // constant
        final float PI = 3.14F; // this is a constant and the value letter cannot be changed.

        // Arithmetics

        int result = 10 + 3;
        double result2 = (double)10 / (double)3;

        // Implicit casting
        // byte > short > int > long > float > double
        short x = 1;
        int y = x + 3;

        // conversion

        String x2 = "10";
        int z = Integer.parseInt(x2);

        String x3 = "1.1";
        double y2 = Double.parseDouble(x3);


        // Mathematical Operations
        int x4 = Math.round(1.1F); // result = 1
        int x5 = (int) Math.ceil(1.1F); // result = 2
        int x6 = (int) Math.floor(1.1F); // result = 1
        double x7 = Math.random(); // result = a random number between 0 and 1
        int x8 = (int) Math.round(Math.random() * 100); // result = random number between 0 and 100
        int x9 = (int) (Math.random() * 100);


        // Formatting Number
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String x10 = currency.format(1234567.891);
        System.out.println(x10);

        String x11 = NumberFormat.getPercentInstance().format(1234567.891);
        System.out.println(x10);


        // Read input from the user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please Enter your age: "); // you can also use println
        byte age = scanner.nextByte(); // nextDouble, nexxtFloat, ...
        System.out.println("You are " + age);

        System.out.println("Enter your name: ");
        String test = scanner.next(); // Ange Ekossono: it will return Ange.

        System.out.println("Enter your name again: ");
        String name2 = scanner.nextLine(); // returns the whole line


    }
}