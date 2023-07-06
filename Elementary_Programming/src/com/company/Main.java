package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

    //CHAPTER 2 - ELEMENTARY PROGRAMMING

    Scanner input = new Scanner(System.in);

    /**
        //2.1 Convert Celsius To Fahrenheit

        Scanner input = new Scanner(System.in);

        System.out.print("Enter degree in celsius ");
        double celsius = input.nextDouble();

        double fahrenheit = ((9.0/5) * celsius) + 32;

        System.out.println(celsius + " Celsius is " + fahrenheit + " Fahrenheit.");
     */

    /**
        //2.2 Compute the volume of cylinder

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the radius of the cylinder ");
        double radius = input.nextDouble();

        System.out.print("Enter the length of the cylinder ");
        double length = input.nextDouble();

        double area = Math.PI * Math.pow(radius,2);
        double volume = area * length;

        System.out.println("The area is " + area);
        System.out.println("The volume is " + volume);
    */

    /**
        //2.3 Convert feet into meters

        System.out.print("Enter feet ");
        double feet = input.nextDouble();

        double meters = feet * 0.305;
         System.out.println(feet + " feet have " + meters + " meters ");
    */

    /**
        //2.4 Convert pounds into kilogram

        System.out.print("Enter the value for pounds");
        double pounds = input.nextDouble();

        double kilograms = pounds * 0.454;

        System.out.print(pounds + " pounds have " + kilograms +" kilograms ");
    */

    /**
    //2.5 Financial application: calculate tips

        System.out.print("Enter the value for subtotal: ");
        double subtotal = input.nextDouble();
        System.out.print("Enter the value for gratuity in percentage: ");
        double gratuityRate = input.nextDouble();

        double gratuity = (gratuityRate/100)*subtotal;
        double total = gratuity + subtotal;

        System.out.println("Gratuity is " + gratuity);
        System.out.println("Total is " + total);
     */

    /**
     //2.6 Sum the digits in an integer

        System.out.print("Enter an integer between 0-1000 ");
        int integer = input.nextInt();

        int miles = integer / 1000;
        integer = integer % 1000;

        int hundreds = integer / 100;
        integer = integer % 100;

        int tens = integer / 10;
        integer = integer % 10;

        int sum = miles + hundreds + tens + integer;
        System.out.println("The sum of digits in the integer is " + sum);
     */

    /**
    //2.7 Find the number of years

        System.out.print("Enter minutes ");
        double minutes = input.nextDouble();

        int hours = (int) (minutes / 60);
        int days = hours / 24;
        int years = days / 365;
        int day = days % 365;

        System.out.print(years + " years and " + day);
    */

    /**
        //2.8 Current time

        System.out.print("Please enter the timezone offset to GMT ");
        int offset = input.nextInt();

        long milliseconds = System.currentTimeMillis();
        long toSeconds = milliseconds / 1000;

        long currentSeconds = toSeconds % 60;

        long getMinutes = toSeconds / 60;
        long currentMinutes = getMinutes % 60;

        long getHours = getMinutes / 60;
        long currentHours = getHours % 24;

        currentHours = currentHours + offset;

        System.out.print(currentHours + ":" + currentMinutes + ":" + currentSeconds);
    */

    /**
        //2.9 Acceleration

        System.out.print("Enter v0, v1 and t ");
        double velocity0 = input.nextDouble();
        double velocity1 = input.nextDouble();
        double time = input.nextDouble();

        double acceleration = (velocity1 - velocity0)/time;

        System.out.print("Acceleration is " + acceleration);
     */

    /**
    // 2.11 Population Projection

        int currentPopulation = 312_032_486;

        System.out.print("Enter the number of years ");
        int years = input.nextInt();

        int yearToSeconds =  years * 365 * 24 * 60 * 60;

        int birthsPerYear =  yearToSeconds / 7;
        int deathsPerYear =  yearToSeconds / 13;
        int immigrantsPerYear = yearToSeconds / 45;

        currentPopulation += birthsPerYear + immigrantsPerYear - deathsPerYear;

        System.out.println("The population in " + years + " is " + currentPopulation);
    */

    /**
    //2.13 Financial Application : Compound Value

        System.out.print("Enter savings per month");
        double monthlyDeposit = input.nextDouble();
        double monthlyInterest = 5.0/100/12;
        double interest = 1 + monthlyInterest;

        double total = 0;
        double count = 6;

        while(count != 0){
            total = (total + monthlyDeposit) * interest;
            count--;
        }
        System.out.print(((int)(total * 100))/100.0);
    */

    /**
        //2.14 Computing BMI

        System.out.print("Enter your weight in pounds ");
        double weightInPounds = input.nextDouble();
        System.out.print("Enter your height in inches ");
        double heightInInches = input.nextDouble();

        double poundsToKilogram = weightInPounds * 0.45359237;
        double inchesToMeters = heightInInches * 0.0254;

        double bmi = poundsToKilogram/Math.pow(inchesToMeters,2);

        System.out.print("BMI is " + bmi);
     */

    /**
    //2.17 Science : wind-chill temperature ; How cold is outside?

        System.out.print("Enter the temperature in Fahrenheit between -58F and 41F ");
        double temperature = input.nextDouble();
        System.out.print("Enter the wind speed >=2 in miles per hour ");
        double windSpeed = input.nextDouble();

        double windChill = 35.74 + (0.6215 * temperature) - (35.75 * Math.pow(windSpeed,0.16)) + (0.4275 * temperature *Math.pow(windSpeed,0.16));

        System.out.print("Wind Chill is " + windChill);
     */

    /**
    //2.21 Calculate future investment value

        System.out.print("Enter investment amount ");
        double investmentAmount = input.nextDouble();

        System.out.print("Enter annual interest rate ");
        double annualInterestRate = input.nextDouble();

        System.out.print("Enter number of years ");
        double numberOfYears = input.nextDouble();

        double monthlyInterestRate = annualInterestRate/100/12.0;

        double futureInvestmentValue = investmentAmount * Math.pow((1+monthlyInterestRate),(numberOfYears*12));

        System.out.print(futureInvestmentValue);
     */



    /**
        //Compute the area of a circle

        double area;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the value of radius ");
        double radius = input.nextDouble();

        area = 3.14 * radius * radius;

        System.out.println("Area of the circle is " + area);
     */


    /**
        //Compute average of three numbers

        double average;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter three numbers: ");
        double number1 = input.nextDouble();
        double number2 = input.nextDouble();
        double number3 = input.nextDouble();

        average = (number1 + number2 + number3) / 3;

        System.out.println("The average of three numbers is " + average);
     */


    /**
        //Compute area with constant

        final double PI = 3.14;

        Scanner input = new Scanner(System.in);

        System.out.print("Radius = ");
        double radius = input.nextDouble();

        double area = PI * radius * radius;

        System.out.println("The area of the circle is " + area);
    */


    /**
        //Display time

        Scanner input = new Scanner(System.in);

        System.out.print("Enter seconds ");
        int seconds = input.nextInt();

        int minutes = seconds / 60;
        int remainingSeconds = seconds % 60;

        System.out.println(seconds + " has " + minutes + " minutes and " + remainingSeconds + " seconds");
     */


    /**
        //If today is Tuesday, what will be in 100 days?

        //0.Monday 1.Tuesday 2.Wednesday 3.Thursday 4.Friday 5.Saturday 6.Sunday

        System.out.println((1+100)%7);
     */


    /**
     //Fahrenheit to celsius
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a degree in Fahrenheit ");
        double fahrenheit = input.nextDouble();

        double celsius = (5.0/9)*(fahrenheit-32);

        System.out.println(fahrenheit + " Fahrenheit has " + celsius + " Celsius");
    */


    /**
        //Display current time
    long milliseconds = System.currentTimeMillis();
    long secondsFromMilli = milliseconds/100;

    long minutes = secondsFromMilli/60;
    long hours = minutes/60;
    long seconds = secondsFromMilli % 60;

    System.out.println(hours + " " + minutes + " " + seconds);

    long CurrentMinutes = minutes % 60;
    long CurrentHours = hours % 24;
    System.out.println(CurrentHours + " " + CurrentMinutes + " " + seconds);
    */


    /**
    //Sales Tax

        Scanner input = new Scanner(System.in);

        System.out.println("Enter purchase amount: ");
        double purchaseAmount = input.nextDouble();

        double tax = purchaseAmount * 0.06;
        System.out.println((int)(tax * 100)/100.0);
    */


    /**
        //Compute Loan

        Scanner input = new Scanner(System.in);

        System.out.println("Enter loan amount: ");
        double loanAmount = input.nextDouble();

        System.out.println("Enter annual interest rate in percentage: ");
        double annualInterestRate = input.nextDouble();

        System.out.println("Enter number of years: ");
        double numberOfYears = input.nextDouble();

        double monthlyInterestRate = ((annualInterestRate/100.0)/12.0);

        double monthlyPayment =
            loanAmount * monthlyInterestRate / (1- 1/Math.pow((1+monthlyInterestRate),(numberOfYears*12)));

        System.out.println("Monthly Payment " + monthlyPayment);
    */


    /**
        //Counting monetary units

        //dollars quarters dimes nickles pennies

        Scanner input = new Scanner(System.in);

        System.out.println("Enter total amount: ");
        double totalAmount = input.nextDouble();

        int remainingAmount = (int) (totalAmount * 100);

        int numberOfDollars = remainingAmount / 100;
        remainingAmount = remainingAmount % 100;

        int numberOfQuarters = remainingAmount / 25;
        remainingAmount = remainingAmount % 25;

        int numberOfDimes = remainingAmount / 10;
        remainingAmount = remainingAmount % 10;

        int numberOfPickles = remainingAmount / 5;
        remainingAmount = remainingAmount % 5;

        int numberOfPennies = remainingAmount;

        System.out.println(numberOfDollars);
        System.out.println(numberOfQuarters);
        System.out.println(numberOfDimes);
        System.out.println(numberOfPickles);
        System.out.println(numberOfPennies);
    */

    }
}
