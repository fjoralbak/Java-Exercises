package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        /**
         // Initializing array with input values
         int [] array = new int[5];

         for(int i = 0; i < array.length; i++){
         System.out.print("Element " + (i + 1) + ": ");
         array[i] = input.nextInt();

         }
         */

        /**
         // Initializing array with random values

         int [] array = new int[10];

         for(int i = 0; i < array.length; i++){
         array[i] = (int) (1 +Math.random() * 90 + 10);
         System.out.print(array[i] + " ");
         }
         */

        /**
         // Summing all elements

         int array [] = new int[5];

         int sum = 0;
         for(int i = 0; i < array.length; i++){
         sum = sum + i;
         }

         System.out.print(sum);
         */

        /**
         // Finding the largest element

         int array[] = new int[10];

         for(int i = 0; i < array.length; i++){
         System.out.print("Element " + (i + 1) + ": ");
         array[i] = input.nextInt();
         }

         System.out.print("The array: ");
         for(int i = 0; i < array.length; i++){
         System.out.print(array[i] + " ");
         }
         System.out.println();

         int max = array[0];
         int min = array[0];
         for(int i = 0; i < array.length; i++){
         if(array[i] > max){
         max = array[i];
         }

         if(array[i] < min){
         min = array[i];
         }
         }

         System.out.println("The max and min respectively value of the array are: " + max + " " + min);
         */

        /**
         // Random shuffling
         for(int i = array.length - 1; i > 0; i--){

         int j = (int)(Math.random() * (i + 1));

         double temp = array[i];
         array[i] = array[j];
         array[j] = array[i];
         }
         System.out.print("The shuffeled array: ");
         for(int i = 0; i < array.length; i++){
         System.out.print(array[i] + " ");
         }

         */

        /**
         // Shifting elements

         int array[] = new int[5];

         for(int i = 0; i < array.length; i++){
         System.out.print("Element " + (i + 1) + ": ");
         array[i] = input.nextInt();
         }

         int temp = array[0];
         for(int i = 1; i < array.length; i++){
         array[i - 1] = array[i];
         }
         array[array.length-1]=temp;
         */

        /**
         // for-each
         int array [] = new int [10];
         for(int i = 0; i < 10; i++){
         array[i] = i;
         }

         for(int element : array){
         System.out.print(element + " ");
         }
         */

        /**
         // CASE STUDY: Analysing numbers

         System.out.print("Enter the size of the array: ");
         int arraySize = input.nextInt();

         int[] array = new int[arraySize];

         int sum = 0;
         for (int i = 0; i < arraySize; i++){
         array[i] = i;
         sum += array[i];
         }
         System.out.println("The sum is " + sum);

         double average = sum / arraySize;
         System.out.println("The average is " + average);

         int count = 0;
         for (int i = 0; i < arraySize; i++) {
         if (array[i] > average) {
         count++;
         }
         }
         System.out.println("The number of elements above the average are " + count);
         */

        /**
         // CASE STUDY: Deck of Cards

         int cards[] = new int[52];
         for (int i = 0; i < cards.length; i++){
         cards[i] = i;
         }

         String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
         String[] ranks = {"Ace", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};

         for(int i = 0; i < cards.length - 1; i++){

         int j = (int) (Math.random() * cards.length);

         int temp = cards[i];
         cards[i] = cards[j];
         cards[j] = temp;
         }

         for (int i = 0; i < 4 ; i++){
         String suit = suits[cards[i] / 13];
         String rank = ranks[cards[i] % 13];
         System.out.println("Card number " + cards[i]+ ": "+ rank + " of " + suit);
         }
         */

        /**
         // Copying arrays

         int[] sourceArray = new int[5];
         int[] targetArray = new int[sourceArray.length];

         for(int i = 0; i < sourceArray.length; i++){
         targetArray[i] = sourceArray[i];
         }
         */

        /**
         // Calling the method reverseArray(int[] array)
         int[] array = new int[5];
         for(int i  = 0; i < 5 ; i++){
         array[i] = i;
         }

         int [] reverseArray = reverseArray(array);

         for(int i = 0;i < reverseArray.length; i++){
         System.out.print(reverseArray[i] + " ");
         }
         */

        /**
         displayCharacters(randomCharacters());

         displayCounts(countChars(randomCharacters()));
         */

        /** 7.1
        System.out.print("Enter the numbers of student: ");
        int numberOfStudents = input.nextInt();

        double[] scores = new double[numberOfStudents];

        System.out.print("Enter four scores: ");
        for(int i = 0; i < scores.length; i++){
            scores[i] = input.nextDouble();
        }


        findGrades(scores, bestScores(scores));
        */

        /** 7.3
        int numbers[] = new int[100];

        int temp;
        int count = 0;
        do{
            temp = input.nextInt();
            numbers[count] = temp;
            count++;
        }while(temp != 0);



        for(int i = 1; i <= 100 ; i++){
            int counter = 0;
            for(int j = 0; j < numbers.length; j++){
                if(numbers[j] == i){
                    counter++;
                }
            }
            if(counter != 0){
                System.out.println(i + " occurs " + counter + " times");
            }
        }
         */

        /** 7.5
        int[] numbers = new int[10];

        for(int i = 0; i < numbers.length; i++){
            numbers[i] = input.nextInt();
        }
        int countDistinct = 0;
        for(int i = 0; i < numbers.length; i++){
            int count = 0;

            for(int j = 0; j < numbers.length; j++){
                if(numbers[i] == numbers[j]){
                    count++;
                }
            }
            if(count == 1){
                System.out.print(numbers[i] + " ");
                countDistinct++;
            }
        }
        System.out.println();
        System.out.print(countDistinct);
         */

        /** 7.7
        int[] hundredNumbers = new int[100];

        for(int i = 0; i < hundredNumbers.length; i++){
            hundredNumbers[i] = (int)(Math.random() * 10);
        }

        int[] count = new int[10];
        for (int i = 0; i < hundredNumbers.length; i++){
            count[hundredNumbers[i]]++;
        }

        for(int i = 0; i < 10; i++){
            System.out.println(i + " occurs " + count[i]);
        }
    }

    /** 7.1
    //Best scores method
    public static double bestScores(double[] scores){

        double bestScores = scores[0];
        for(int i = 0; i < scores.length; i++){
            if(scores[i] > bestScores){
                bestScores = scores[i];
            }
        }
        return bestScores;
    }

    //Find grade method
    public static void findGrades(double[] scores, double bestScore){

        for(int i = 0; i < scores.length; i++){
            char grade;

            if(scores[i] >= (bestScore - 10)){
                grade = 'A';
            }else if(scores[i] >= (bestScore - 20)){
                grade = 'B';
            }else if(scores[i] >= (bestScore - 30)){
                grade = 'C';
            }else if(scores[i] >= (bestScore - 40)){
                grade = 'D';
            }else{
                grade = 'F';
            }
            System.out.println("Student " + i + " score is " + scores[i] + " and grade is " + grade);
        }
    }
     */

    /**
     * // Method: reverse array
     * public static int[] reverseArray(int[] array){
     * int[] reverseArray = new int[array.length];
     * <p>
     * for(int i = 0, j = array.length - 1; i < array.length; i++, j--){
     * reverseArray[j] = array[i];
     * }
     * return reverseArray;
     * }
     */

    /**
    // Get random characters method
    public static char[] randomCharacters() {
        char[] randomCharacters = new char[100];

        for (int i = 0; i < 100; i++) {
            randomCharacters[i] = (char) ((int) (Math.random() * (122 - 97) + 98));
        }
        return randomCharacters;
    }

    public static void displayCharacters(char[] randomCharacters) {
        for (int i = 0; i < randomCharacters.length; i++) {
            if ((i + 1) % 20 == 0) {
                System.out.println(randomCharacters[i]);
            } else {
                System.out.print(randomCharacters[i] + " ");
            }
        }
    }

    public static int[] countChars(char[] randomCharacters) {

        int[] counts = new int[26];

        for (int i = 0; i < randomCharacters.length; i++) {
            counts[randomCharacters[i] - 'a']++;
        }
        return counts;
    }

    public static void displayCounts(int[] counts) {
        for (int i = 0; i < counts.length; i++) {
            System.out.print(" " + counts[i] + " " + (char) (i + 'a'));
        }
    }
     */




}
