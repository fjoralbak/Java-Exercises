package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);
        //Exercises

        /**
        // 3.1 Solve quadratic equations

        System.out.print("Enter a,b,c: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        double discriminant = Math.pow(b,2) - 4*a*c;

        double r1 = (-b + Math.pow (discriminant,0.5))/(2*a);
        double r2 = (-b - Math.pow (discriminant,0.5))/(2*a);

        if(discriminant < 0){
            System.out.print("The equation has no real roots!");
        } else if(discriminant == 0){
            System.out.print("The equation has one root " + r1);
        }else{
            System.out.print("The equation has two roots " + r1 + " " + r2);
        }
        */

        /**
        // 3.2 Add three numbers

        int number1 = (int) (System.currentTimeMillis() % 10);
        int number2 = (int) (System.currentTimeMillis()/7 % 10);
        int number3 = (int) (System.currentTimeMillis()/4 % 10);

        int sum = number1 + number2 + number3;

        System.out.print("Enter sum " + number1 + " + " + number2 + " + " + number3 + " = ");
        int sumInput = input.nextInt();

        if(sumInput == sum){
            System.out.print("Correct!");
        }else{
            System.out.print("Wrong! The correct answer is " + sum);
        }
        */

        /**
        // 3.2 Add three numbers

        int number1 = (int)(Math.random() * 10);
        int number2 = (int)(Math.random() * 10);
        int number3 = (int)(Math.random() * 10);

        int sum = number1 + number2 + number3;

        System.out.print("Enter sum " + number1 + " + " + number2 + " + " + number3 + " = ");
        int sumInput = input.nextInt();

        if(sumInput == sum){
            System.out.print("Correct!");
        }else{
            System.out.print("Wrong! The correct answer is " + sum);
        }
        */

        /**
        //3.3 Solve 2x2 linear equations

        System.out.print("Enter a,b,c,d,e,f ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double d = input.nextDouble();
        double e = input.nextDouble();
        double f = input.nextDouble();

        double condition = a*d - b*c;

        if(condition == 0){
            System.out.print("The equation has no solution!");
        }else{
            double x = ((e*d - b*f) / condition);
            double y = ((a*f - e*c) / condition);
            System.out.print("x= " + x + " y= " + y);
        }
         */

        /**
         //3.4 Random month
        int monthIndex = (int)(Math.random() * 12) + 1;

        switch (monthIndex){
            case 1 :
                System.out.print("January");
                break;
            case 2 :
                System.out.print("February");
                break;
            case 3 :
                System.out.print("March");
                break;
            case 4 :
                System.out.print("April");
                break;
            case 5 :
                System.out.print("May");
                break;
            case 6 :
                System.out.print("June");
                break;
            case 7 :
                System.out.print("July");
                break;
            case 8 :
                System.out.print("August");
                break;
            case 9 :
                System.out.print("September");
                break;
            case 10 :
                System.out.print("October");
                break;
            case 11 :
                System.out.print("November");
                break;
            case 12 :
                System.out.print("December");
                break;
            default:
                System.out.print("There is no month with this index");
        }
         */

        /**
        // 3.5 Find future dates

        System.out.print("Enter today's day ");
        int today = input.nextInt();

        System.out.print("Enter the number of days elapsed since today ");
        int futureDay = input.nextInt();

        if(futureDay > 6 && futureDay < 0){
            System.out.print("Please enter a number between 0 - 6 ");
        } else {

            int theDay = (today + futureDay) % 7;

            String dayName = "";

            switch (theDay) {
                case 0:
                    dayName = "Sunday";
                    break;
                case 1:
                    dayName = "Monday";
                    break;
                case 2:
                    dayName = "Tuesday";
                    break;
                case 3:
                    dayName = "Wednesday";
                    break;
                case 4:
                    dayName = "Thursday";
                    break;
                case 5:
                    dayName = "Friday";
                    break;
                case 6:
                    dayName = "Saturday";
                    break;
            }

            System.out.print("The day is " + dayName);
        }
        */

        /**
        // 3.8 Sort three integers

        System.out.print("Enter three integers: ");
        int x = input.nextInt();
        int y = input.nextInt();
        int z = input.nextInt();

        if(x > y){
            int swap = x;
            x = y;
            y = swap;
        }

        if(x > z){
            int swap = x;
            x = z;
            z = swap;
        }

        if(y > z){
            int swap = y;
            y = z;
            z = swap;
        }

        System.out.print("Non-decreasing order " + x + " "+ y + " "+ z + " ");
        */

        /**
        // 3.9 Check ISBN-10

        System.out.print("Enter 9 digits: ");
        int d1 = input.nextInt();
        int d2 = input.nextInt();
        int d3 = input.nextInt();
        int d4 = input.nextInt();
        int d5 = input.nextInt();
        int d6 = input.nextInt();
        int d7 = input.nextInt();
        int d8 = input.nextInt();
        int d9 = input.nextInt();

        int checksum = (d1 * 1 + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5 + d6 * 6 + d7 * 7 + d8 * 8 + d9 * 9) % 11;

        if (checksum == 10){
            System.out.print(d1+""+d2+""+d3+""+d4+""+d5+""+d6+""+d7+""+d8+""+d9+"X");

        }else{
            System.out.print(d1+""+d2+""+d3+""+d4+""+d5+""+d6+""+d7+""+d8+""+d9+""+checksum);
        }
         */

        /**
        //  3.10 Addition quiz
        int number1 = (int)(Math.random() * 100);
        int number2 = (int)(Math.random() * 100);

        int addition = number1 + number2;

        System.out.print("Enter addition " + number1 + " + " + number2 + " = ");
        int sum = input.nextInt();

        if (sum == addition){
            System.out.print("Correct!");
        }else{
            System.out.print("Wrong! The result is " + addition);
        }
         */

        /**
        // 3.11 Find the number of days in a month

        System.out.print("Enter month and year ex. 2 2021: ");
        int month = input.nextInt();
        int year = input.nextInt();

        String monthName = "";
        int days = 0;

        switch (month){
            case 1:
                monthName = "January ";
                days = 31;
                break;
            case 2:
                monthName = "February ";
                if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
                    days = 29;
                }else{
                    days = 28;
                }
                break;
            case 3:
                monthName = "March ";
                days = 31;
                break;
            case 4:
                monthName = "April ";
                days = 30;
                break;
            case 5:
                monthName = "May ";
                days = 31;
                break;
            case 6:
                monthName = "June ";
                days = 30;
                break;
            case 7:
                monthName = "July ";
                days = 31;
                break;
            case 8:
                monthName = "August ";
                days = 31;
                break;
            case 9:
                monthName = "September ";
                days = 30;
                break;
            case 10:
                monthName = "October ";
                days = 31;
                break;
            case 11:
                monthName = "November ";
                days = 30;
                break;
            case 12:
                monthName = "December ";
                days = 31;
                break;
        }


        if (month == 2){
            if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
                days = 29;
            }else{
                days = 28;
            }
        }else if (month == 1 || month == 3 || month == 5 || month == 7 ||
                month == 8 || month == 10 || month == 12) {
            days = 31;
        } else{
            days = 30;
        }

        System.out.print(monthName +" "+ year+" had "+days +" days");

         */

        /**
        // 3.12 Palindrome number

        System.out.print("Enter a three digit integer ");
        int number = input.nextInt();

        int d1 = number / 100;
        number = number % 100;

        int d2 = number / 10;
        number = number % 10;

        if(d1 == number){
            System.out.print("The number is palindrome");
        }else{
            System.out.print("The number is not palindrome");
        }
    */

        /**
        // 3.14 heads or tails
        int headOrTail = (int)(Math.random() * (1+1));

        System.out.print("Guess if it is HEAD - 0 or TAIL - 1 ");
        int guess0or1 = input.nextInt();

        if (guess0or1 == headOrTail){
            System.out.print("Your guess is right ");
        }else{
            System.out.print("Your guess is not right " + headOrTail);
        }
         */

        /**
        // 3.17 Game: scissor,rock, paper

        System.out.print("scissors (0), rock (1), paper(2): ");
        int user = input.nextInt();

        if (user != 0 && user != 1 && user != 2){
            System.out.print("You should type just 0 or 1 or 2");
        }

        String userN = "";
        switch (user) {
            case 0:
                userN = "scissor";
                break;
            case 1:
                userN = "rock";
                break;
            case 2:
                userN = "paper";
                break;
        }

        int computer = (int)(Math.random() * (2 + 1));

        String computerN = "";
        switch (computer) {
            case 0:
                computerN = "scissor";
                break;
            case 1:
                computerN = "rock";
                break;
            case 2:
                computerN = "paper";
                break;
        }

        if (user == computer){
            System.out.print("The computer is " + computerN + ". You are " + userN + " too. It's a draw");
        } else if (user == 0 && computer == 2){
            System.out.print("The computer is " + computerN + ". You are " + userN + " You won");
        }else if (user == 1 && computer == 0){
            System.out.print("The computer is " + computerN + ". You are " + userN + " You won");
        }else if (user == 2 && computer == 1){
            System.out.print("The computer is " + computerN + ". You are " + userN + " You won");
        }else{
                System.out.print("The computer is " + computerN + ". You are " + userN + ". You lost");
        }
        */

        /**
        // 3.18 Cost of shipping

        System.out.print("Enter the packages weight in pounds: ");
        double weight = input.nextDouble();

        double cost = 0;
        if(weight > 50){
            System.out.print("The package cannot be shipped.");
        }else if(weight > 0 && weight <= 1){
            cost = 3.5;
        }else if(weight > 1 && weight <= 3){
            cost = 5.5;
        }else if(weight > 3 && weight <= 10){
            cost = 8.5;
        }else if(weight > 10 && weight <= 20){
            cost = 10.5;
        }
        System.out.print("The cost of your shipping is: " + cost);
    */

        /**
        // 3.19 Compute the perimeter of a triangle

        System.out.print("Enter the first edge of the triangle: ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();

        System.out.print("Enter the second edge of the triangle: ");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();

        System.out.print("Enter third edge of the triangle: ");
        double x3 = input.nextDouble();
        double y3 = input.nextDouble();

        double distance1 = Math.pow((Math.pow((x3 - x1) , 2) + Math.pow((y3 - y1), 2)),0.5);
        double distance2 = Math.pow((Math.pow((x3 - x2) , 2) + Math.pow((y3 - y2), 2)),0.5);
        double distance3 = Math.pow((Math.pow((x2 - x1) , 2) + Math.pow((y2 - y1), 2)),0.5);

        if (distance1 + distance2 < distance3 || distance1 + distance3 < distance2 || distance2 + distance3 < distance1){
            System.out.print("Invalid input");
        }else {
            System.out.print("Perimeter is " + (distance1+distance2+distance3));
        }
        */

        /**
        //3.20  Wid-chill temperature

        System.out.print("Enter the temperature in Fahrenheit : ");
        double temperature = input.nextDouble();

        System.out.print("Enter wind speed : ");
        double speed = input.nextDouble();

        double windChillTemperature = 0;
        if(temperature > -58 && temperature < 41 && speed > 2){
            windChillTemperature = 35.74 + (0.6215 * temperature) - (3.75 * Math.pow(speed,0.16)) + (0.4275 * temperature * Math.pow(speed,0.16));
            System.out.print("Wind chill temperature is: " + windChillTemperature);

        }else{
            System.out.print("Invalid Inputs");
        }
         */

        /**
        //3.21 Day of the week

        System.out.print("Enter year ");
        int year = input.nextInt();

        System.out.print("Enter month ");
        int month = input.nextInt();

        System.out.print("Enter the day of the month ");
        int monthDay = input.nextInt();

        if(month == 1){
            month = 13;
            year = year - 1;
        }else if(month == 2){
            month = 14;
            year = year - 1;
        }

        double century = year / 100;
        double yearOfCentury = year % 100;
        double dayOfTheWeekAsNumber = (monthDay + (26 * (month + 1)) / 10.0 + yearOfCentury + (yearOfCentury/4.0) + (century/4.0) + 5* century);

        int dayOfTheWeekAsIndex = (int)dayOfTheWeekAsNumber % 7;
        System.out.print("Day of the week " + dayOfTheWeekAsIndex);
        */

        /**
        // 3.24 Pick a card

        int card = (int)(Math.random()* (52 + 1));
        String cardName = "";

        switch (card % 13) {
            case 1:
                cardName = "Ace";
                break;
            case 2:
                cardName = "2";
                break;
            case 3:
                cardName = "3";
                break;
            case 4:
                cardName = "4";
                break;
            case 5:
                cardName = "5";
                break;
            case 6:
                cardName = "6";
                break;
            case 7:
                cardName = "7";
                break;
            case 8:
                cardName = "8";
                break;
            case 9:
                cardName = "9";
                break;
            case 10:
                cardName = "9";
                break;
            case 11:
                cardName = "Jack";
                break;
            case 12:
                cardName = "Queen";
                break;
            case 0:
                cardName = "King";
                break;
        }

        String suit = "";

        if(card <=13){
            suit = "Clubs";
        }else if(card <=26){
            suit = "Diamonds";
        }else if(card <= 39){
            suit = "Hearts";
        }else{
            suit = "Spades";
        }

        System.out.print("The card you picked is " + cardName + " of " + suit);
        */

        /**
        // 3.26

        System.out.print("Enter an integer ");
        int integer = input.nextInt();

        boolean fiveAndSix = integer % 5 == 0 && integer % 6 == 0;
        boolean fiveOrSix = integer % 5 == 0 || integer % 6 == 0;
        boolean fiveSixNotBoth = integer % 5 == 0 ^ integer % 6 == 0;

        System.out.println( "Is " + integer + " divisible by 6 and 5? " + fiveAndSix);
        System.out.println( "Is " + integer + " divisible by 6 or 5? " + fiveOrSix);
        System.out.println( "Is " + integer + " divisible by 6 or 5 but not both? " + fiveSixNotBoth);
    */

        // Examples
        /**
            // Ex.1 Addition Quiz

            long number1 = System.currentTimeMillis() % 10;
            long number2 = (System.currentTimeMillis() /7) % 10;

            System.out.print(number1 + " + " + number2 + " = ");
            int result = input.nextInt();

            System.out.print("The result is " + (result == (number1 + number2)));
        */

        /**
    //Ex.2 Simple If demo
        System.out.print("Enter a number ");
        int number = input.nextInt();

        if(number % 5 == 0){
            System.out.println("HiFive");
        }

        if (number % 2 == 0){
            System.out.println("HiEven");
        }
         */

        /**
        //Ex.3 Area of a circle
        double area = 1;

        System.out.print("Enter the radius ");
        double radius = input.nextDouble();

        if (radius < 0){
            System.out.println("The value for radius should be grater than zero!");
        } else {
            area = Math.PI * Math.pow(radius, 2);
        }

        System.out.println("Area of the circle with radius " + radius + " is " + area);
        */

        /**
        //Ex.4
        System.out.print("Enter Pay ");
        double pay = input.nextDouble();

        System.out.print("Enter Scores ");
        double scores = input.nextDouble();


        if(scores > 90){
            pay = pay + (3*pay/100);
        }else{
            pay = pay + (1*pay/100);
        }

        System.out.print(pay);
         */

        /**
        //Ex. 5 Check if number is odd

        System.out.print("Enter a number ");
        int number = input.nextInt();

        if(number % 2 == 0) {
            System.out.print("The number is even!");
        }else {
            System.out.print("The number is odd!");
        }
         */

        /**
        //Ex.6 Print letter grade according to the score

        System.out.print("Enter scores ");
        double scores = input.nextDouble();

        if(scores >= 90){
            System.out.print("A");
        }else if(scores >= 80){
            System.out.print("B");
        }else if(scores >= 70){
            System.out.print("C");
        }else if(scores >= 60){
            System.out.print("D");
        }else if(scores >= 50){
            System.out.print("E");
        }else{
            System.out.print("F");
        }
         */

        /**
        //Ex.7 Subtraction of two numbers for first graders

        int number1 = (int)(Math.random() * 10);
        int number2 = (int)(Math.random() * 10);

        if(number2 > number1){
            int swap = number1;
            number1 = number2;
            number2 = swap;
        }

        System.out.print(number1 + " - " + number2 + " = ");
        int result = input.nextInt();

        if(result == (number1 - number2)){
            System.out.println("Correct!");
        }else{
            System.out.println("Incorrect!");
        }
    */
        /**
        //Ex.7 Computing body mass index

        System.out.print("Enter your weight in pounds ");
        double weightInPounds = input.nextDouble();
        System.out.print("Enter your height in inches ");
        double heightInInches = input.nextDouble();

        double poundsToKilogram = weightInPounds * 0.45359237;
        double inchesToMeters = heightInInches * 0.0254;

        double bmi = poundsToKilogram/Math.pow(inchesToMeters,2);

        if(bmi < 18.5){
            System.out.print("Underweight");
        }else if(bmi < 25.0){
            System.out.print("Normal");
        }else if(bmi <30){
            System.out.print("Overweight");
        }else{
            System.out.print("Obese");
        }
         */

        //Ex.8 Computing tax

        /**
        //Ex.9 Determining leap year

        System.out.print("Year ");
        int year = input.nextInt();

        if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0){
            System.out.println(year + " is leap year ");
        }else{
            System.out.println(year + " is not leap year ");
        }
         */

        //Ex. 10 Lottery

        /**
        System.out.print("Enter a two digit number ");
        int number = input.nextInt();

        int randomNumber = (int)(Math.random()*100);
        System.out.print("Random number is " + randomNumber);

        int guessNumber1 = number / 10;
        int guessNumber2 = number % 10;

        int randomNumber1 = randomNumber / 10;
        int randomNumber2 = randomNumber % 10;

        if(randomNumber == number){
            System.out.print("You won 10000$");
        }else if(guessNumber1 == randomNumber2 && guessNumber2 == randomNumber1){
            System.out.print("You won 3000$");
        }
        else if(guessNumber1 == randomNumber2 && guessNumber2 == randomNumber1){
            System.out.println("You won 3000$");
        }else if(guessNumber1 == randomNumber1 || guessNumber1 == randomNumber2 || guessNumber2 == randomNumber1 || guessNumber2 == randomNumber2){
            System.out.println("You Won 1000$");
        }else{
            System.out.println("No match");
        }
    */
    }
}
