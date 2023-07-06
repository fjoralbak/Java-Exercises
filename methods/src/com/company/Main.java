package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        /**
        int sum = 0;
        for(int i = 0; i < 10; i++){
            sum+=i;
        }
        System.out.print(sum);
        */
        /** Exercises
        System.out.print(sum(1,10));

        int max = max(6,8);
        System.out.print(max);

        getGrade(95);

        System.out.print(getReturnGrade(25));

        System.out.print(hexToDecimal("ABBC"));
         */

        /**
        // 6.1
        for(int i = 1; i <= 100; i++){
            int k = pentagonalNumber(i);
            System.out.print(k + " ");
            if(i % 10 == 0){
                System.out.println();
            }
        }
         */

        /**
        //6.2
        System.out.print("Enter an integer: ");
        long integer = input.nextInt();
        System.out.println(sumDigits(integer));
        */

        /**
        //6.3
        System.out.println(isPalindrome(555));
         */

        /**
        //6.4
        reverse(654);
         */

        /** //6.5
        System.out.println("Enter three numbers : ");
        double num1 = input.nextDouble();
        double num2 = input.nextDouble();
        double num3 = input.nextDouble();
        displaySortedNumbers( num1,  num2,  num3);
         */

        /**
        //6.13
        System.out.println(sumSeries(20));
         */
        /**
        //6.16
        int sumOfDays = 0;
        for(int i = 2000; i <= 2020; i++){
            sumOfDays = sumOfDays + numberOfDaysInAYear(i);
        }
        System.out.println(sumOfDays);
         */
        /**
        // 6.18
        checkPassword("1");
         */
        /**
        // 6.19
        System.out.println( area(10,17,3));
         */
        /**
        //6.20
        System.out.println(countLetters("fjoralba1"));
         */
        System.out.println(getPhoneNumber("1800FLOWERS"));
    }

    /**
    // 6.1 Pentagonal numbers

        public static int pentagonalNumber(int n){
        return ((n * ((3 * n) - 1))/ 2);
        }
     */

    /**
    // 6.2  Sum the digits in an integer

    public static long sumDigits(long integer){
     long remainingInteger = integer / 10;
     long digit = integer % 10;
     long sum = digit;
     while (remainingInteger != 0){
         digit = remainingInteger % 10;
         remainingInteger = remainingInteger / 10;
         sum += digit;
     }
     return sum;
    }
     */

    /**
    //6.3 Palindrome Integer
    public static int reverse(int number){
        String numberToString = Integer.toString(number);
        String stringToNumeric = "";
        for(int i = numberToString.length()-1; i>=0 ; i--){
            stringToNumeric += numberToString.charAt(i);
        }
        int finalNumber = Integer.parseInt(stringToNumeric);
        return finalNumber;
    }

    public static boolean isPalindrome(int number){
        int reverse = reverse(number);
        boolean isPalindrome = false;
        if(number == reverse){
            isPalindrome = true;
        }
        return isPalindrome;
    }
     */

    /**
     * //6.4 Display an integer reversed
    public static void reverse(int number){
        String numberToString = Integer.toString(number);
        String stringToNumeric = "";
        for(int i = numberToString.length()-1; i>=0 ; i--){
            stringToNumeric += numberToString.charAt(i);
        }
        int finalNumber = Integer.parseInt(stringToNumeric);

        System.out.println(finalNumber);
    }
     */

    /**
    //6.5 Sort three numbers

    public static void displaySortedNumbers(double num1, double num2, double num3){
        if(num1 > num2){
            double temp = num1;
            num1 = num2;
            num2 = temp;
        }

        if(num1 > num3){
            double temp = num1;
            num1 = num3;
            num3 = temp;
        }

        if(num2 > num3){
            double temp = num2;
            num2 = num3;
            num3 = temp;
        }

        System.out.println(num1 + " " + num2 + " " + num3);
    }
    */

    /**
    //6.13 Sum series

    public static double sumSeries(int i){
        int m = 0;
        for(int j = 1; i <= i ; j++){
            m += (j / (j + 1.0));
        }
        return m;
    }
     */

    /**
    //6.16 Number of days in a year

    public static int numberOfDaysInAYear(int year){
        int days = 7 * 31 + 4 * 30;

        if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
            days = days + 29;
        }else{
            days = days + 28;
        }
        return days;
    }
     */

    /**
    //6.18 Check password

    public static boolean passwordLength(String password){
        if(password.length() < 8)
            return false;
        else
            return true;
    }

    public static boolean passwordContent(String password) {
        boolean value = false;
        for (int i = 0; i < password.length(); i++) {
            if (Character.isLetter(password.charAt(i)) || Character.isDigit(password.charAt(i)))
                value = true;
        }
        return value;
    }

    public static boolean checkPasswordDigits(String password) {
        int k = 0;
        boolean value = true;
        for(int i = 0; i < password.length(); i++){
            if(Character.isDigit(password.charAt(i))){
                k++;
            }
        }
        if( k < 2){
            value = false;
        }
        return value;
    }
    public static void checkPassword(String password){
        boolean passwordLength = passwordLength(password);
        boolean passwordContent = passwordContent(password);
        boolean checkPasswordDigits = checkPasswordDigits(password);

        if(passwordLength == false || passwordContent == false || checkPasswordDigits == false){
            System.out.println("Invalid");
        }else{
            System.out.println("Valid");
        }
    }
     */

    /**
    // 6.19 area of triangle
    public static boolean isValid(double side1, double side2, double side3){
        boolean isValid = false;

        if((side1 + side2 > side3)&(side1 + side3 > side3)&(side2 + side3 > side1)){
            isValid = true;
        }
        return isValid;
    }
    public static double area(double side1, double side2, double side3){
        boolean isValid = isValid(side1, side2, side3);
        double area = 0;
        double semiPerimeter;
        if(isValid == true){
            semiPerimeter = (side1 + side2 + side3) / 2;
            area =
                    Math.sqrt(semiPerimeter * (semiPerimeter - side1) * (semiPerimeter - side2) * (semiPerimeter - side2));
        }
        return area;
    }
     */

    /** //6.20 Count the letters in a string
    public static int countLetters(String string){
        int counter = 0;
        for(int i = 0; i < string.length(); i++){
            if(Character.isLetter(string.charAt(i))){
                counter++;
            }
        }
        return counter;
    }
    /** Exercises
    public static int sum(int number1, int number2){
        int sum = 0;
        for(int i = number1; i < number2; i++){
            sum+=i;
        }
        return sum;
    }

    public static int max(int number1, int number2){
        if(number1 > number2)
            return number1;
        else
            return number2;
    }

    public static void getGrade(double scores){
        if(scores < 50 || scores > 100){
            System.out.print("Invalid scores");
        }else if(scores >= 90){
            System.out.print("A");
        }else if(scores >= 80){
            System.out.print("B");
        }else if(scores >= 70){
            System.out.print("C");
        }else if(scores >= 60){
            System.out.print("D");
        }else{
            System.out.print("E");
        }
    }

    public static char getReturnGrade(double scores){
        if(scores < 50 || scores > 100){
            return 'F';
        }else if(scores >= 90){
            return 'A';
        }else if(scores >= 80){
            return 'B';
        }else if(scores >= 70){
            return 'C';
        }else if(scores >= 60){
            return 'D';
        }else{
            return 'E';
        }
    }

    public static int gcd(int number1, int number2){
        int k = 1;
        int gcd = 1;

        while(k <= number1 && k <= number2){
            if(number1 % k == 0 && number2 % k == 0){
                gcd = k;

            }
            k++;
        }
        return gcd;
    }

    public static double hexToDecimal(String hex){
        double decimalValue = 0;
        for (int i = 0; i < hex.length(); i++){
            char ch = hex.charAt(i);
            decimalValue = decimalValue * 16 + hexCharToDecimal(ch);
        }
        return decimalValue;
    }

    public static int hexCharToDecimal(char ch){
        if(ch >= 'A' && ch <= 'F'){
            return 10 + ch - 'A';
        }else{
            return ch - '0';
        }
    }
     */

    //6.21 Phone keypads
    //


    public static int getNumber(char uppercaseLetter){
        int number = -1;
        switch(uppercaseLetter){
            case 'A':
            case 'B':
            case 'C':
                number = 2;
                break;
            case 'D':
            case 'E':
            case 'F':
                number = 3;
                break;
            case 'G':
            case 'H':
            case 'I':
                number = 4;
                break;
            case 'J':
            case 'K':
            case 'L':
                number = 5;
                break;
            case 'M':
            case 'N':
            case 'O':
                number = 6;
                break;
            case 'P':
            case 'Q':
            case 'R':
            case 'S':
                number = 7;
                break;
            case 'T':
            case 'U':
            case 'V':
                number = 8;
                break;
            case 'W':
            case 'X':
            case 'Y':
            case 'Z':
                number = 9;
                break;
        }
        return number;
    }

    public static int getPhoneNumber(String phoneNumber){
        String phone = "";
        int toDigit = 0;
        for(int i = 0; i < phoneNumber.length(); i++){
            if(Character.isLetter(phoneNumber.charAt(i))){
                toDigit =  getNumber(phoneNumber.charAt(i));
                phone += toDigit;
            }else if(Character.isDigit(phoneNumber.charAt(i))){
                phone += phoneNumber.charAt(i);
            }
        }
        int phoneToInt = Integer.parseInt(phone);
        return phoneToInt;
    }
}
