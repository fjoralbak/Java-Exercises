package com.company;
import java.util.*;

public class Main {

    public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);

	    //Programming exercises

        /**
        //4.1 Area of pentagon

        System.out.println("Enter the length from the center of pentagon to a vertex: ");
        double radius = input.nextDouble();

        double side = 2 * radius * Math.sin(Math.PI/5);

        double area = (5 * Math.pow(side,2) )/ (4 * Math.tan(Math.PI/5));

        System.out.printf("The area of pentagon is %.2f " , area);
         */

        /**
        //4.2 Great circle distance

        final double EARTH_RADIUS_KM = 6371.01;

        System.out.print("Enter point 1 in degrees : ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();

        System.out.print("Enter point 2 in degrees : ");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();

        double distance =
                EARTH_RADIUS_KM * Math.acos((Math.sin(Math.toRadians(x1)) * Math.sin(Math.toRadians(x2)) )
                        + (Math.cos(Math.toRadians(x1)) * Math.cos(Math.toRadians(x2)) * Math.cos(Math.toRadians(y1-y2))));

        System.out.println("The distance between two points is " + distance);
         */

        /**
        //4.5 Estimate areas
        final double RADIUS = 40;

        double randomAngle1 = Math.random() * (Math.PI + 1);
        double x1 = RADIUS * Math.cos(randomAngle1);
        double y1 = RADIUS * Math.sin(randomAngle1);

        double randomAngle2 = Math.random() * (Math.PI + 1);
        double x2 = RADIUS * Math.cos(randomAngle2);
        double y2 = RADIUS * Math.sin(randomAngle2);

        double randomAngle3 = Math.random() * (Math.PI + 1);
        double x3 = RADIUS * Math.cos(randomAngle3);
        double y3 = RADIUS * Math.sin(randomAngle3);

        double sideA = Math.sqrt(((x2-x1) * (x2-x1)) + ((y2-y1) * (y2-y1)));
        double sideB = Math.sqrt(((x3-x1) * (x3-x1)) + ((y3-y1) * (y3-y1)));
        double sideC = Math.sqrt(((x2-x3) * (x2-x3)) + ((y2-y3) * (y2-y3)));

        double part = (sideA * sideA) - (sideB * sideB) - (sideC * sideC);
        double angleA =  Math.toDegrees(Math.acos(part / (-2 * sideB * sideC)));
        double angleB = Math.toDegrees(Math.acos(part / (-2 * sideA * sideC)));
        double angleC = Math.toDegrees(Math.acos(part / (-2 * sideA * sideB)));

        System.out.println(angleA + " " +angleB+ " " + angleC);
         */

        /**
        // 4.8 Find the character of an ascii
        System.out.println("Enter an ASCII code: ");
        int integer = input.nextInt();

        if(integer < 0 || integer > 127){
            System.out.println("Invalid Input. You should type an integer between 0 and 127. ");
            System.exit(1);
        }else{
            char toASCII = (char) integer ;
            System.out.print("The character for ASCII code " + integer + " is " + toASCII);
        }
        */

        /**
        // 4.9 Find a unicode of a character

        System.out.print("Enter a character ");
        String character = input.next();

        char ch = character.charAt(0);
        int toUNICODE = ch;

        System.out.print("The unicode for the character " + ch + " is " + toUNICODE);
        */

        /**
        // 4.10 Guess Birthday

        String set1 =
                "1  3  5   7\n" +
                " 9 11 13 15\n" +
                "17 19 21 23\n" +
                "25 27 29 31";

        String set2 =
                "2  3  6   7\n" +
                "10 11 14 15\n" +
                "18 19 22 23\n" +
                "26 27 30 31";

        String set3 =
                "4  5  6   7\n" +
                "12 13 14 15\n" +
                "20 21 22 23\n" +
                "28 29 30 31";

        String set4 =
                "8  9  10 11\n" +
                "12 13 14 15\n" +
                "24 25 26 27\n" +
                "28 29 30 31";

        String set5 =
                "16 17 18 19\n" +
                "20 21 22 23\n" +
                "24 25 26 27\n" +
                "28 29 30 31";

        int day = 0;

        System.out.println("Is your birthday in set 1?\n If YES: type Y, if NO: type N");
        System.out.println(set1);
        String answer = input.next();
        String toUpperAnswer = answer.toUpperCase();
        char yesORno = toUpperAnswer.charAt(0);
        if (yesORno != 'Y' && yesORno != 'N'){
            System.out.print("Invalid Answer");
            System.exit(1);
        }

        if (yesORno == 'Y'){
            day += 1;
        }

        System.out.println("Is your birthday in set 2?\n If YES: type Y, if NO: type N");
        System.out.println(set2);
        answer = input.next();
        String toUpperAnswer1 = answer.toUpperCase();
        char yesORno1 = toUpperAnswer1.charAt(0);
        if (yesORno1 != 'Y' && yesORno1 != 'N'){
            System.out.print("Invalid Answer");
            System.exit(1);
        }

        if (yesORno1 == 'Y'){
            day += 2;
        }

        System.out.println("Is your birthday in set 3?\n If YES: type Y, if NO: type N");
        System.out.println(set3);
        answer = input.next();
        String toUpperAnswer2 = answer.toUpperCase();
        char yesORno2 = toUpperAnswer2.charAt(0);
        if (yesORno2 != 'Y' && yesORno2 != 'N'){
            System.out.print("Invalid Answer");
            System.exit(1);
        }

        if (yesORno2 == 'Y'){
            day += 4;
        }

        System.out.println("Is your birthday in set 4?\n If YES: type Y, if NO: type N");
        System.out.println(set4);
        answer = input.next();
        String toUpperAnswer3 = answer.toUpperCase();
        char yesORno4 = toUpperAnswer3.charAt(0);
        if (yesORno4 != 'Y' && yesORno4 != 'N'){
            System.out.print("Invalid Answer");
            System.exit(1);
        }

        if (yesORno4 == 'Y'){
            day += 8;
        }

        System.out.println("Is your birthday in set 5?\n If YES: type Y, if NO: type N");
        System.out.println(set5);
        answer = input.next();
        String toUpperAnswer4 = answer.toUpperCase();
        char yesORno5 = toUpperAnswer4.charAt(0);
        if (yesORno5 != 'Y' && yesORno5 != 'N'){
            System.out.print("Invalid Answer");
            System.exit(1);
        }

        if (yesORno5 == 'Y'){
            day += 16;
        }

        System.out.print(day);

         */

        /**
        // 4.11 Decimal to Hex

        System.out.print("Enter a decimal between 0 and 15 ");
        int decimal = input.nextInt();

        if (decimal > 0 && decimal <10){
            System.out.print(decimal);
        }
        switch(decimal){
            case 10:
                System.out.println("A");
                break;
            case 11:
                System.out.println("B");
                break;
            case 12:
                System.out.println("C");
                break;
            case 13:
                System.out.println("D");
                break;
            case 14:
                System.out.println("E");
                break;
            case 15:
                System.out.println("F");
                break;

        }
         */

        /**
        //4.13 Vowel or consonant
        System.out.println("Enter a letter ");
        String letter = input.nextLine();
        char character = letter.charAt(0);

        if(Character.isLetter(character)){
            String str = ""+character ;
            if("aeiou".contains(str)){
                System.out.println(character +" is a vowel");
            }else {
                System.out.println(character +" is a consonant");
            }

        }else{
            System.out.println(character + " is invalid Input");
            System.exit(1);
         }
        */

        /**
        //4.14 Letter Grade to number

        System.out.print("Enter letter grade: ");
        String grade = input.next();
        char chGrade = Character.toUpperCase(grade.charAt(0));

        if(chGrade < 'A' && chGrade > 'E'){
            System.out.print("Invalid input");
        }else{
            int numberGrade = 'A' - chGrade + 4;
            System.out.print(numberGrade);
        }
        */

        /**
        // 4.15 Phone keypad
        System.out.println("Enter a letter ");
        String letter = input.next();

        char character = Character.toLowerCase(letter.charAt(0));

        String characterToString = ""+character;
        int digit = 0;

        if("abc".contains(characterToString)){
            digit = 2;
        }else if("def".contains(characterToString)){
            digit = 3;
        }else if("ghi".contains(characterToString)){
            digit = 4;
        }else if("jkl".contains(characterToString)){
            digit = 5;
        }else if("mno".contains(characterToString)){
            digit = 6;
        }else if("pqrs".contains(characterToString)){
            digit = 7;
        }else if("tuv".contains(characterToString)){
            digit = 8;
        }else if("wxyz".contains(characterToString)){
            digit = 9;
        }else{
            System.out.println("Invalid Input");
        }

        if(digit == 0){
        }else{
            System.out.println("The corresponding number is " + digit);
        }
        */

        /**
        // 4.16 Random UpperCase Character

        int RandomCharacterCode = (int) (Math.random() *(90 - 65 + 1)) + 65;

        char toChar = (char)RandomCharacterCode;

        System.out.println(toChar);
         */

        /**
        // 4.17 Days of a month

        System.out.println("Enter year: ");
        int year = input.nextInt();

        System.out.println("Enter the first three letters of the month eg. Feb ");
        String month = input.next();

        String validatedMonth = month.trim();
        int days = 0 ;

        switch(validatedMonth){
            case "Jan":
            case "Mar":
            case "May":
            case "Jul":
            case "Aug":
            case "Oct":
            case "Dec":
                days = 31;
                break;
            case "Apr":
            case "Jun":
            case "Sep":
            case "Nov":
                days = 30;
                break;
            case "Feb":
                if(year % 4 == 0 && year % 100 !=0 || year % 400 == 0){
                    days = 29;
                }else {
                    days = 28;
                }
                break;
        }

        System.out.println(month + " " + year + " has " + days + " days");
         */

        /**
         // 4.18 Student major and status

        System.out.print("Enter two characters: ");
        String majorStatus = input.next();

        char major = Character.toUpperCase(majorStatus.charAt(0));
        char status = majorStatus.charAt(1);

        String majorString = "";

        switch (major){
            case 'M':
                majorString = "Mathematics";
                break;
            case 'C':
                majorString = "Computer Science";
                break;
            case 'I':
                majorString = "Information Technology";
                break;
            default:
                majorString = "Invalid Input";
        }

        String statusString = "";
        switch (status){
            case '1':
                statusString = "Freshman";
                break;
            case '2':
                statusString = "Sophomore";
                break;
            case '3':
                statusString = "Junior";
                break;
            case '4':
                statusString = "Senior";
                break;
            default:
                statusString = "Invalid Input";
        }

        if(statusString.equals("Invalid Input") || majorString.equals("Invalid Input")){
            System.out.print("Invalid Input");
        }else{
            System.out.print(majorString + " " + statusString);
        }
         */

        /**
        // 4.21 Check SSN

        System.out.print("Enter SSN eg. DDD-DD-DDDD ");
        String SSN = input.next();

        String substr1 = SSN.substring(0,3);
        String substr2 = SSN.substring(4,6);
        String substr3 = SSN.substring(7);

        char ch1 = SSN.charAt(3);
        char ch2 = SSN.charAt(6);

        if(SSN.length() != 11 || substr1.length() !=3 || ch1 != '-' || ch2 != '-' || substr2.length() !=2 || substr3.length() !=4){
            System.out.print("Invalid Input");
        }else{
            System.out.print(SSN);
        }
        */

        /**
        // 4.22 Check a substring
        System.out.print("Enter String 1 ");
        String string1 = input.next();
        System.out.print("Enter String 2 ");
        String string2 = input.next();

        if(string1.contains(string2)){
            System.out.print(string2 + " is a substring of " + string1);
        }else{
            System.out.print(string2 + " is not a substring of " + string1);
        }
         */

        /**
        // 4.24 Order three cities

        System.out.print("Enter first city ");
        String city1 = input.nextLine();

        System.out.print("Enter second city ");
        String city2 = input.nextLine();

        System.out.print("Enter third city ");
        String city3 = input.nextLine();
        String cityTemp ="";
        if(city1.compareToIgnoreCase(city2) > 0){
            cityTemp = city2;
            city2= city1;
            city1 = cityTemp;
        }

        if(city1.compareToIgnoreCase(city3) > 0){
            cityTemp = city3;
            city3= city1;
            city1 = cityTemp;
        }

        if(city2.compareToIgnoreCase(city3) > 0){
            cityTemp = city3;
            city3= city2;
            city2 = cityTemp;
        }

        System.out.print(city1 + " " + city2 + " "  + city3);
        */

        /**
         // 4.25 Generate vehicle plate number

        int fourDigitNumber = (int)(Math.random() * (9999 - 1000 + 1) + 1000);

        char randomChar1 = (char)(Math.random() * (90 - 65 + 1) + 65);
        char randomChar2 = (char)(Math.random() * (90 - 65 + 1) + 65);
        char randomChar3 = (char)(Math.random() * (90 - 65 + 1) + 65);

        System.out.print(randomChar1+""+randomChar2+""+randomChar3+""+fourDigitNumber);
         */
        //Exercises

        /**
        // 1. Computing angles of the triangle

        System.out.print("Enter first point e.g x1 y1: ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        System.out.print("Enter second point e.g x2 y2: ");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        System.out.print("Enter third point e.g x3 y3: ");
        double x3 = input.nextDouble();
        double y3 = input.nextDouble();

        double distance1 = Math.sqrt(Math.pow(x2-x1,2) + Math.pow(y2-y1,2));
        double distance2 = Math.sqrt(Math.pow(x3-x2,2) + Math.pow(y3-y2,2));
        double distance3 = Math.sqrt(Math.pow(x3-x1,2) + Math.pow(y3-y1,2));

        double angleA = Math.acos((Math.pow(distance1,2)-Math.pow(distance2,2)-Math.pow(distance3,2))/(-2 * distance2 * distance3));
        double angleB = Math.acos((Math.pow(distance2,2)-Math.pow(distance1,2)-Math.pow(distance3,2))/(-2 * distance1 * distance3));
        double angleC = Math.acos((Math.pow(distance3,2)-Math.pow(distance2,2)-Math.pow(distance1,2))/(-2 * distance2 * distance1));

        double angleAtoDegree = Math.toDegrees(angleA);
        double angleBtoDegree = Math.toDegrees(angleB);
        double angleCtoDegree = Math.toDegrees(angleC);

        System.out.print(Math.round(angleAtoDegree * 100)/100.0 + " " + Math.round(angleBtoDegree * 100)/100.0 + " " + Math.round(angleCtoDegree * 100)/100.0);
        */

        /**
        // 2. Comparing characters

        char letter = 'a';

        if(letter >= 'A' && letter<= 'Z'){
            System.out.print("Letter is uppercase char. ");
        }else if(letter >= 'a' && letter <= 'z'){
            System.out.print("Letter is lowercase char. ");
        }else{
            System.out.print("Letter is numeric char. ");
        }
        */

        /**
        // 3. Generating random lower case letter

        char randomCharacter = (char)(97 + Math.random() * (122 - 97 + 1));

        System.out.print(randomCharacter);
         */

        /**
        // 4. Order two cities

        System.out.print("Enter first city ");
        String city1 = input.nextLine();

        System.out.print("Enter second city ");
        String city2 = input.nextLine();

        if(city1.compareTo(city2) < 0){
            System.out.print("The cities in alphabetical order are " + city1 + " " + city2);
        }else{
            System.out.print("The cities in alphabetical order are " + city2 + " " + city1);
        }
         */

        /**
        // 5. Guessing birthdays

        String set1 =
                "1   3  5  7\n"+
                " 9 11 13 15\n"+
                "17 19 21 23\n"+
                "25 27 29 31\n";

        String set2 =
                " 2   3  6 7\n"+
                "10 11 14 15\n"+
                "18 19 22 23\n"+
                "26 27 30 31\n";

        String set3 =
                "4  5  6   7\n"+
                "12 13 14 15\n"+
                "20 21 22 23\n"+
                "28 29 30 31\n";

        String set4 =
                "8  9  10 11\n"+
                "12 13 14 15\n"+
                "24 25 26 27\n"+
                "28 29 30 31\n";

        String set5 =
                "16 17 18 19\n"+
                "20 21 22 23\n"+
                "24 25 26 27\n"+
                "28 29 30 31\n";

        int day = 0;

        System.out.print("Is your birthday in set1? ");
        System.out.println(set1);
        System.out.println("Enter 0 for NO and 1 for yes.");
        int yOrn= input.nextInt();

        if (yOrn == 1){
            day = day + 1;
        }

        System.out.print("Is your birthday in set2? ");
        System.out.println(set2);
        System.out.println("Enter 0 for NO and 1 for yes.");
        yOrn= input.nextInt();

        if (yOrn == 1){
            day = day + 2;
        }

        System.out.print("Is your birthday in set3? ");
        System.out.println(set3);
        System.out.println("Enter 0 for NO and 1 for yes.");
        yOrn= input.nextInt();

        if (yOrn == 1){
            day = day + 4;
        }

        System.out.print("Is your birthday in set4? ");
        System.out.println(set4);
        System.out.println("Enter 0 for NO and 1 for yes.");
        yOrn= input.nextInt();

        if (yOrn == 1){
            day = day + 8;
        }

        System.out.print("Is your birthday in set5? ");
        System.out.println(set5);
        System.out.println("Enter 0 for NO and 1 for yes.");
        yOrn= input.nextInt();

        if (yOrn == 1){
            day = day + 16;
        }

        System.out.println(day);
         */

        /**
        // 6. Converting hex to decimal

        System.out.print("Enter a hex digit: ");
        String hexDigit = input.next();

        String upperHexDigit = hexDigit.toUpperCase();
        if(hexDigit.length() != 1){
            System.out.println("You must enter exactly one character");
            System.exit(1);
        }
        char ch = upperHexDigit.charAt(0);
        if(ch >= 'A' && ch <= 'F'){
            int value = ch - 'A' + 10;
            System.out.print("The decimal value of hex digit is " + value);
        }else if(Character.isDigit(ch)){
            System.out.print("The decimal value of hex digit is " + ch);
        }else{
            System.out.println("Invalid input" +
                    "");
        }
         */

        /**
        // 7. Revising lottery programs using strings

        String lottery = "" + (int)(Math.random() * 10) + (int)(Math.random() * 10);

        System.out.println("Enter your lottery pick (two digits): ");
        String guess = input.nextLine();

        char lotteryDigit1 = lottery.charAt(0);
        char lotteryDigit2 = lottery.charAt(1);

        char guessDigit1 = guess.charAt(0);
        char guessDigit2 = guess.charAt(1);



        System.out.println("The lottery number is: " + lottery);
        if(guess.equals(lottery)){

            System.out.println("Exact match: You won $10.000");
        }else if(lotteryDigit1 == guessDigit2 && lotteryDigit2 == guessDigit1){
            System.out.println("Match all digits: You won $3.000");
        }else if(lotteryDigit1 == guessDigit2 || lotteryDigit1 == guessDigit1|| lotteryDigit2 == guessDigit1 || lotteryDigit2 == guessDigit2){
            System.out.println("Match one digits: You won $1.000");
        }else{
            System.out.println("Sorry, no match");
        }
         */


    }
}
