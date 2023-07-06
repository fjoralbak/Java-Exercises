package com.company;

import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        /**
        int counter = 0;
        while(counter < 100){
            System.out.println("Welcome to java!");
            counter++;
        }
        */
        /**
        int i = 1;
        int sum = 0;
        while(i < 10){
            sum += i;
            i++;
        }
        System.out.println(sum);
        */
        /**
        int number1 = (int)(Math.random() * 10);
        int number2 = (int)(Math.random() * 10);

        int sum = number1 + number2;

        System.out.println(number1 + " + " + number2 + " = ");
        int answer = input.nextInt();

        while(answer != sum){
            System.out.println("Wrong answer! Try again!");

            System.out.println(number1 + " + " + number2 + " = ");
            answer = input.nextInt();
        }
        System.out.println("Well Done!");
         */
        /**
        int magicNumber = (int)(1 + Math.random() * 100);

        int guess = -1;
        while(guess != magicNumber){
            System.out.print("Enter a guess number: ");
            guess = input.nextInt();

            if(guess == magicNumber){
                System.out.println("Your guess is right!");
            }else if(guess > magicNumber){
                System.out.println("Your guess is too high!");
            }else{
                System.out.println("Your guess is too low!");
            }
        }
         */
        /**
        int count = 1;
        int correctAnswer = 0;
        int wrongAnswer = 0;
        long beginTime = System.currentTimeMillis();
        while(count <= 5){
            int number1 = (int)(Math.random() * 10);
            int number2 = (int)(Math.random() * 10);

            if(number1 < number2){
                int temp = number1;
                number1 = number2;
                number2 = temp;
            }

            int subtraction = number1 - number2;

            System.out.println(number1 + " - " + number2 + " = ");
            int answer = input.nextInt();

            if(answer == subtraction){
                System.out.println("Correct!");
                correctAnswer++;
            }else{
                System.out.println("Wrong!");
                wrongAnswer++;
            }
            count++;
        }
        long endTime = System.currentTimeMillis();

        long totalTime = (endTime - beginTime)/1000;

        System.out.println("Correct answers: " + correctAnswer);
        System.out.println("Wrong answers: " + wrongAnswer);
        System.out.println("Duration: " + totalTime + " seconds");
    }
         */
        /**
        System.out.print("Enter a input (input ends with zero): ");
        int data = input.nextInt();

        int sum = 0;

        while(data!= 0){
            sum += data;

            System.out.print("Enter a input (input ends with zero): ");
            data = input.nextInt();
        }
        System.out.println(sum);
         */
        /**
        int data;
        int sum = 0;
        do{
            System.out.print("Enter a data (input ends with 0): ");
            data = input.nextInt();

            sum += data;
        }while(data != 1);

        System.out.println(sum);
         */
        /**
        int k = 1;
        int gcd = k;

        System.out.print("Enter number 1: ");
        int number1 = input.nextInt();

        System.out.print("Enter number 2: ");
        int number2 = input.nextInt();

        while(k <= number1 && k <= number2){
            if(number1 % k == 0 && number2 % k == 0){
                gcd = k;
            }
            k++;
        }

        System.out.print(gcd);
         */
        /**
        int decimalNumber = input.nextInt();
        String hexVal = "";
        while(decimalNumber != 0){
            char hex;
            int number = decimalNumber % 16;
            if(number >=1 && number <= 9){
                hex =(char)(number + '0');
            }else{
                hex =(char)(number + 'A' - 10);
            }
            hexVal = hex + hexVal;
            decimalNumber = decimalNumber / 16;
        }
        System.out.print(hexVal);
        */
        /**
        System.out.print("Enter a word ");
        String word = input.next();

        int high = word.length() - 1;
        int low = 0;
        boolean palindrome = true;

        while(low < high){
            if(word.charAt(low) != word.charAt(high)){
                palindrome = false;
                break;
            }
            low++;
            high--;
        }
        System.out.print(palindrome);
         */

        /**
         * 51
        System.out.print("Enter the first string: ");
        String str1 = input.nextLine();
        int firstLength = str1.length();

        System.out.print("Enter the second string: ");
        String str2 = input.nextLine();
        int secondLength = str2.length();

        if(str1.charAt(0) != str2.charAt(0)){
            System.out.print(str1 + " and " + str2 + " have no common prefix");
        }else{
            int index = 0;

            for(int i = 0; i < Math.max(firstLength,secondLength);i++){
                if(str1.charAt(i)==str2.charAt(i)){
                    index = i;
                }else{
                    break;
                }
            }
            System.out.print("The common prefix is: " + str1.substring(0,index + 1));
        }
         */
        /** 50
        System.out.print("Enter a string: ");
        String string = input.nextLine();

        int upperCount = 0;
        for(int i = 0; i < string.length(); i++){
            if(Character.isUpperCase(string.charAt(i))){
                upperCount++;
            }
        }
        System.out.print("The number of uppercase letters is: " + upperCount);
         */
        /** 49
        final String vowelsToString = "AEIOU";

        System.out.print("Enter a string: ");
        String string = input.nextLine();
        String stringToUpper = string.toUpperCase();

        int vowels = 0;
        int consonants = 0;

        for(int i = 0; i < stringToUpper.length(); i++){
            if(Character.isLetter(stringToUpper.charAt(i))){
                if(vowelsToString.contains(String.valueOf(stringToUpper.charAt(i)))){
                    vowels++;
                }else{
                    consonants++;
                }
            }
        }

        System.out.println("The number of vowels is: " + vowels);
        System.out.println("The number of consonants is: " + consonants);
        */
        /** 48
        System.out.print("Enter a string: ");
        String string = input.nextLine();

        for(int i = 0; i < string.length(); i+=2){
            if(Character.isLetter(string.charAt(i))) {
                System.out.print(string.charAt(i));
            }
        }
        */
        /** 46
        System.out.print("Enter a string: ");
        String string = input.next();

        for(int i = string.length() - 1; i >= 0; i--){
            System.out.print(string.charAt(i));
        }
        */
        /** 44
        System.out.print("Enter a integer: ");
        short integer = input.nextShort();

        String toBinary = Integer.toBinaryString(integer);
        String binary16 = "";

        for(int i = 0; i< (16 - toBinary.length()); i++){
             binary16+="0";
        }

        System.out.print(binary16+toBinary);
         */
        /** 43
        int count = 0;
        for (int n = 1; n < 7; n++) {
            for (int j = n + 1; j <= 7; j++) {
                System.out.println(n + " " + j);
                count++;
            }
        }
        System.out.println("Total combinations -> " + count);
         */
        /** 41
        int n;
        int max = 0;
        int count = 0;
        do{
            n = input.nextInt();
            if(n > max){
                max = n;
                count = 1;
                continue;
            }

            if(max == n){
                count ++;
            }
        }while(n != 0);

        System.out.println(max);
        System.out.print(count);
         */
        /** 40
        int heads = 0;
        int tails = 0;
        int n = 0;
        while(n < 1000000){
            double random = Math.random();

            if(random > 0.5){
                tails++;
            }else{
                heads++;
            }

            n++;
        }

        System.out.print(tails + " " + heads);
         */
        /** 32
        int number1 = (int)(Math.random() * (99 - 10)+1);
        int number2 = (int)(Math.random() * (99 - 10)+1);

        while (number1 == number2){
            number2 = (int)(Math.random() * (99 - 10)+1);
        }
         */
        /** 33
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        int k = 1;
        int sum = 0;
        while(k < number){
            if(number % k == 0){
                sum += k;
            }
            k++;
        }

        if(sum == number){
            System.out.print(number + "is perfect number");
        }
        */

}
}
