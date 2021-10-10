package com.helloworld;

import java.awt.*;
import java.sql.SQLOutput;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /*
            *** Java conventions
            * Classes = Pascal case
            * Methods = Camel case
            * Constants = Upper case
         */
        // primitive data types a passed by value
        byte myAge = 30;
        byte yourAge = myAge;
        float pi = 3.14F;
        long viewsCount = 321_4556_554L;
        myAge = 50;
//        System.out.println(myAge);

        // Reference data types are passed by reference
        Point point1 = new Point(10,30);
        Point point2 = point1;
        point1.x = 20;
//        System.out.println(point2);

        //Strings
        String message = "Hello, to the other world";
        //System.out.println(message.replace("Hello", "Hi"));
        //Strings are immutable
//        System.out.println(Arrays.toString(message.split(",")));

        //Escape sequence
        String path ="c:\\chrisbone\\desktop\\Java project";
        String nameWithDoubleQoute = "Vincent \"Tetteh \"";
        String nameWithTab = "\t Kwame";
//        System.out.println(nameWithDoubleQoute);
//        System.out.println(nameWithTab);
//        System.out.println(path);

        // Arrays
        int[] numbers = {9,2,8,4,5};
        Arrays.sort(numbers);
        //System.out.println(Arrays.toString(numbers));

        //Multi-dimensional Arrays
        int[] [] multiNumbers = {{1,2,3},{1,2,3}};
        // Use deepToString to print values of a multi dimensional arrays
//        System.out.println(Arrays.deepToString(multiNumbers));

        //Constants
        final float PI = 3.14F;
        //Arithmetics
        int addTwoNumber  = 3 + 5;
        //Increment addTwoNumber by 6
        addTwoNumber += 6;
        //decrement addTwoNumber by 2
        addTwoNumber -= 2;
        //More examples
        int hisAge = 40;
//        int herAge = ++hisAge;
        int herAge2 = hisAge++;
//        System.out.println(herAge2);
//        System.out.println(hisAge);
//        System.out.println(herAge);

        // other of operation
        //PMDAS
        float salary = (20 + 60) * 6 + 7 / 3F;
        //System.out.println(salary);

        //Casting
        //Implicit casting happens automatically when there would not be any data loss
        // byte -> short -> int -> long -> float -> double
        short age = 20;
        int addAge = age + 2;

        // Explicit casting
        double tax = 1.02;
        int net = (int)tax + 20;
        //casting strings
        String balance = "30";
        //Parsing string to integer
        int calBalance = Integer.parseInt(balance) * 2;
        //System.out.println(calBalance);
        //Using the math class
        int randomNumber = (int)(Math.random() * 100);
        //System.out.println(randomNumber);

        //Number format
        NumberFormat percentage = NumberFormat.getPercentInstance();
        //String getCurrency = percentage.format(232.4);
        //In simple terms you can use method chaining
        //String currency = NumberFormat.getCurrencyInstance().format(25.336);
        //System.out.println(currency);

        //Reading user input
        Scanner scanner = new Scanner(System.in);
        //System.out.print("Enter you age: ");
//        byte getAge = scanner.nextByte();
        //System.out.println("Enter you name ");
        //String userName = scanner.nextLine().trim();
       // System.out.println("you are " + getAge + " years old");
       // System.out.println("You are " + userName);

//        //Control flow
        int x = 50;
        int y = 60;
        //System.out.println(x <= y);
        // Logical operator &&
        int temperature = 5;
        if(temperature > 30)
            System.out.println("It is hot \nDrink water");
        else if(temperature >= 20 && temperature <= 30)
            System.out.println("Its a nice day");
        else System.out.println("Its cold");
        boolean isWarm = temperature > 50 && temperature < 100;
        //System.out.println(isWarm);
        // Logical operator ||
        boolean hasHighIncome = true;
        boolean hasGoodCredit = true;
        boolean hasCriminalRecords = false;
        boolean isEligible = (hasGoodCredit || hasHighIncome) && hasCriminalRecords;
        System.out.println(isEligible);

        //simplified condition
        int income = 160;
        boolean hasHigherIncome = (income > 500);
        //tenary operator
        String className = (income > 100_000 ? "First": "Economy");
        System.out.println(className);

        // switch statement
        int yearOfTheMonth = 12;
        switch (yearOfTheMonth){
            case 1:
                System.out.println("Jan");
                break;
            case 2:
                System.out.println("Feb");
                break;
            case 3:
                System.out.println("April");
                break;
            default:
                System.out.println("dec");
        }
        String[] stars = {"*","**","***"};
        //for loops
//        for(int i = 0; i < stars.length; i++){
//            for (int j = stars.length - 1; j > 0; j--){
//                System.out.println(stars[i] +" " + stars[j]);
//            }
//        }
        //while loops
        int randomNumbers = (int)(Math.random() * 100);
        System.out.println(randomNumbers);
        int input = 0;
//        while(input != randomNumbers){
//            System.out.println("Enter a random number");
//            input = scanner.nextInt();
//            if (input > randomNumbers)
//                System.out.println(input + " is too high");
//            if (input < randomNumbers)
//                System.out.println(input + " is too low");
//        }

        //break and continue
        int count = 0;
        while(true){
            System.out.println("guess count or press 1 to quit");
            count = scanner.nextInt();
            if(count == randomNumbers)
                break;
            else if(count == 1)
                break;
        }

    }
}
