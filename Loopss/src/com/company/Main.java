package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        /**
        // 5.1
        System.out.print("Enter a integer, the input ends if it is 0 ");
        int n = input.nextInt();

        if(n == 0){
            System.out.println("No numbers are entered except 0");
            System.exit(1);
        }

        int countNegative = 0;
        int countPositive = 0;
        int count = 0;
        double sum = 0.0;
        double average = 0;

        while(n != 0){
            count++;
            sum += n;

            if(n > 0){
                countPositive++;
            }else if(n < 0){
                countNegative++;
            }
            n = input.nextInt();
        }

        average = sum/count;

        System.out.println("The number of positives is: " + countPositive);
        System.out.println("The number of negatives is: " + countNegative);
        System.out.println("The total is: " + sum);
        System.out.println("The average is: " + average);
        */

        /**
        //5.7
        double tuition = 10000;
        int sum = 0;

        for(int i = 0; i < 14; i++){
            tuition *= 1.05;

            if(i == 9){
                System.out.println("The tuition in 10 years will be: " + tuition);
            }

            if(i > 9 && i < 14){
                sum += tuition;
            }
        }

        System.out.println("The total cost of four years' worth after the tenth year is " + sum);
        */

        /**
        //5.9

        System.out.print("Enter the number of students ");
        int numberOfStudents = input.nextInt();

        if(numberOfStudents == 0 || numberOfStudents < 0) {
            System.out.print("The number of students should be positive or higher than 0!");
            System.exit(1);
        }
            int compareScores = 0;
            int higherScores = 0;
            int count = 1;
            while(count <= numberOfStudents){
                System.out.println(count + ". Student Name: ");
                String name = input.nextLine();

                System.out.println(count + ". Student Score: ");
                int scores = input.nextInt();

                if(scores > compareScores){
                    higherScores = scores;
                }
                compareScores = scores;
                count++;
            }

            System.out.println( higherScores);
        }
*/

        /**
        //5.14
        System.out.println("Enter two numbers: ");
        int number1 = input.nextInt();
        int number2 = input.nextInt();

        int gcd = 1;
        int k = 2;

        while(k <= number1 && k <= number2){
            if(number1 % k == 0 && number2 % k == 0){
                gcd = k;
            }
            k++;
        }
        System.out.println(gcd);
         */

        /**
        //5.15

        for(char i = '!', j = 1; i <= '~' ; i++, j++){

            if(j % 10 == 0){
                System.out.println();
            }
            System.out.print(i + " ");

        }
         */

        /**
        //5.16
        System.out.println("Enter a number: ");
        int number = input.nextInt();

        int divisor = 2;

        while(divisor <= number){
            while(number % divisor == 0) {
                number = number / divisor;
                System.out.print(divisor + " ");
            }
            divisor++;
        }
         */

        /**
        //5.21

        System.out.print("Loan Amount: ");
        double loanAmount = input.nextDouble();

        System.out.print("Number of years: ");
        int numberOfYears = input.nextInt();

        double interestRate = 5 / 100.0;
        double monthlyInterestRate = 0;

        double monthlyPayment = 0;


        double totalPayment = 0;

        while(interestRate <= (8 / 100.0)){

            monthlyInterestRate = interestRate / 12.0;

            monthlyPayment =
                    (loanAmount * monthlyInterestRate)/(1-(1/Math.pow((1+monthlyInterestRate),(numberOfYears*12))));

            totalPayment = monthlyPayment * numberOfYears * 12;

            interestRate = interestRate + 0.00125;

            System.out.println("Interest Rate \t Monthly Payment \t Total payment \t");
            System.out.println(interestRate + " " + monthlyPayment + " " +totalPayment);
        }
         */

        /**
        // 5.27

        int count = 0;
        for(int i = 101; i<=2100; i++){
            if((i % 4 == 0)  && (i % 100 != 0) || (i % 400 == 0)){
                for(int j = 0; j < 10; j++){
                    System.out.print(i + " ");
                    count++;
                }
            }
            System.out.println();
        }
        System.out.println(count);
        */

        //5.28
        int dayNumber = 0;
        String day = "";


        for(int i = 1 ; i <= 12; i++){
            System.out.print("Enter day: ");
            dayNumber = input.nextInt();
            String month = "";
            System.out.print("Enter year: ");
            int year = input.nextInt();
            switch(dayNumber){
                case 1:
                    day = "Monday";
                    break;
                case 2:
                    day = "Tuesday";
                    break;
                case 3:
                    day = "Wednesday";
                    break;
                case 4:
                    day = "Thursday";
                    break;
                case 5:
                    day = "Friday";
                    break;
                case 6:
                    day = "Saturday";
                    break;
                case 7:
                    day = "Sunday";
                    break;
            }
            switch(i) {
                case 1:
                    month = "January";
                    break;

                case 2:
                    month = "February";
                    break;

                case 3:
                    month = "March";
                    break;

                case 4:
                    month = "April";
                    break;

                case 5:
                    month = "May";
                    break;

                case 6:
                    month = "June";
                    break;

                case 7:
                    month = "July";
                    break;

                case 8:
                    month = "August";
                    break;

                case 9:
                    month = "September";
                    break;

                case 10:
                    month = "October";
                    break;

                case 11:
                    month = "November";
                    break;

                case 12:
                    month = "December";
                    break;
            }

            System.out.println(month + " 1, " + year + " is " + day);

        }
        /**
          //1
        int count = 0;
        while(count < 100){
            System.out.print("Welcome to Java! ");
            count++;
        }


        /**
        // 2

        int i = 1;
        int sum = 0;

        while (i < 10){
            sum += i;
            i++;
        }
        System.out.print(sum);
         */

        /**
        // 3

        int number1 = (int)(Math.random() * 10);
        int number2 = (int)(Math.random() * 10);

        int sum = number1 + number2;

        System.out.println(number1 + " + " + number2 + " = ");
        int answer = input.nextInt();

        while (answer != sum){
            System.out.println("Wrong! Try again.\n" + number1 + " + " + number2 + " = ");
            answer = input.nextInt();
        }

        System.out.println("You got it!");
         */

        /**
        //4 Guessing numbers

        int randomNumber = (int)(Math.random() * (100 + 1));

        int guessNumber = -1;
        while(guessNumber !=randomNumber){

            System.out.print("Enter a number between 0-100: ");
            guessNumber = input.nextInt();

            if(randomNumber == guessNumber){
                System.out.print("Yes the number is " + randomNumber);
            }else if(guessNumber < randomNumber){
                System.out.print("The guess is too low! ");
            }else{
                System.out.print("The guess is too high! ");
            }

        }
        */

        /**
        //5 Subtraction quiz loop

        int count = 0;
        int correct = 0;
        long startTime = System.currentTimeMillis();
        while(count < 5){
            int number1 = (int)(Math.random() * 10);
            int number2 = (int)(Math.random() * 10);

            if(number1 < number2){
                int temValue = number1;
                number1 = number2;
                number2 = temValue;
            }

            int subtraction = number1 - number2;

            System.out.print(number1 + " - " + number2 + " = ");
            int result = input.nextInt();

            if(result == subtraction) {
                System.out.println("You are correct!");
                correct++;
            }else{
                System.out.println("You are wrong! The answer should be " + subtraction);
            }
            count++;
        }
        long endTime = System.currentTimeMillis();
        long testTime = endTime - startTime;

        System.out.println("Correct count is " + correct);
        System.out.println("Test time is " + testTime/1000 + " seconds");
         */

        /**
        // 6 Sentinel value

        System.out.print("Enter an integer (the input ends if it is 0): ");
        int integer = input.nextInt();

        int sum = 0;
        while(integer != 0){

            sum += integer;

            System.out.print("Enter an integer (the input ends if it is 0): ");
            integer = input.nextInt();
        }
         */

        /**
        // 7 do-while

        int number, max;
        number = input.nextInt();
        max = number;

        do {
            number = input.nextInt();
            if(number > max){
                max = number;
            }
        }while(number != 0);

        System.out.print(max + " " + number);
         */

        /**
        // for loop
        for(int i = 0; i< 10; i++){
            System.out.print(i);
        }
         */

        /**
        // 8 Greatest common divisor
        System.out.print("Enter number 1: ");
        int number1 = input.nextInt();

        System.out.print("Enter number 2: ");
        int number2 = input.nextInt();

        int gcd = 1;
        int k = 2;

        while(k <= number1 && k <= number2){
            if(number1 % k == 0 && number2 % k == 0){
                gcd = k;
            }
            k++;
        }
        System.out.print(gcd);
         */

        /**
        // 9 Predicting the future tuition
        int tuition = 10000;
        int year = 0;

        while(tuition < 20000){
            tuition *= 1.07;
            year++;
        }

        System.out.printf("Tuition will be doubled in %d years \n", year);

        System.out.printf("Tuition will  be %d in %d years", tuition,year);
        */

        /**
        // 10 Converting decimals to hexadecimals

        System.out.print("Enter a decimal number : ");
        int decimalNumber = input.nextInt();
        String hex = "";

        while (decimalNumber != 0){

            int reminder = decimalNumber % 16;

            char hexDigit;
            if(reminder >= 0 && reminder <=9){
                hexDigit = (char) (reminder + '0');
            }else{
                hexDigit = (char)(reminder - 10 + 'A');
            }
            hex = hex + hexDigit;
            decimalNumber = decimalNumber / 16;
        }
        System.out.println(hex);*/

        /**
        // 11 Break keyword

        int sum = 0;
        for(int i = 1; i <= 20; i++){
            if (sum > 100){
                break;
            }
            sum += i;
        }
         System.out.print(sum);
         */

        /**
        // 11 Palindrome

        System.out.print("Enter a word: ");
        String word = input.next();

        int low = 0;
        int high = word.length() - 1;

        boolean palindrome = true;
        while(low < high){
            if(word.charAt(low) != word.charAt(high)){
                palindrome = false;
                break;
            }
            low++;
            high--;
        }

        if(palindrome){
            System.out.print("Is Palindrome");
        }else{
            System.out.print("Is not Palindrome");

        }
         */

        // 12 Displaying prime numbers
        
    }}

