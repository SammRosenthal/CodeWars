// Implement function ToLowerCase() that has a string parameter str, and returns the same string in lowercase.

 

// Example 1:

// Input: "Hello"
// Output: "hello"
// Example 2:

// Input: "here"
// Output: "here"
// Example 3:

// Input: "LOVELY"
// Output: "lovely"

class Solution {
    public String toLowerCase(String str) {
        
        Map<Character, Character> library = new HashMap<Character, Character>();
        
        library.put('A', 'a');
        library.put('B', 'b');
        library.put('C', 'c');
        library.put('D', 'd');
        library.put('E', 'e');
        library.put('F', 'f');
        library.put('G', 'g');
        library.put('H', 'h');
        library.put('I', 'i');
        library.put('J', 'j');
        library.put('K', 'k');
        library.put('L', 'l');
        library.put('M', 'm');
        library.put('N', 'n');
        library.put('O', 'o');
        library.put('P', 'p');
        library.put('Q', 'q');
        library.put('R', 'r');
        library.put('S', 's');
        library.put('T', 't');
        library.put('U', 'u');
        library.put('V', 'v');
        library.put('W', 'w');
        library.put('X', 'x');
        library.put('Y', 'y');
        library.put('Z', 'z');
        
        String answer = "";
            
        for (int i = 0; i < str.length(); i++){
            char current = str.charAt(i);
            if (Character.isUpperCase(current)) {
                answer += library.get(current);
            } else { 
                answer+=current;
            }
        }
        return answer;
    }
}


// Write a class with the name Person. The class needs three fields (instance variables) with the names firstName, lastName of type String and age of type int. 
// Write the following methods (instance methods):

// *Method named getFirstName without any parameters, it needs to return the value of the firstName field.
// *Method named getLastName without any parameters, it needs to return the value of the lastName field.
// *Method named getAge without any parameters, it needs to return the value of the age field.
// *Method named setFirstName with one parameter of type String, it needs to set the value of the firstName field.
// *Method named setLastName with one parameter of type String, it needs to set the value of the lastName field.
// *Method named setAge with one parameter of type int, it needs to set the value of the age field. If the parameter is less than 0 or greater than 100, it needs to set the age field value to 0.
// *Method named isTeen without any parameters, it needs to return true if the value of the age field is greater than 12 and less than 20, otherwise, return false.
// *Method named getFullName without any parameters, it needs to return the full name of the person.
//     *In case both firstName and lastName fields are empty, Strings return an empty String.
//     *In case lastName is an empty String, return firstName.
//     *In case firstName is an empty String, return lastName.
    
// To check if s String is empty, use the method isEmpty from the String class. For example, firstName.isEmpty() returns true if the String is empty or in other words, when the String does not contain any characters.

// TEST CODE:
// Person person = new Person();
// person.setFirstName("");   // firstName is set to empty string
// person.setLastName("");    // lastName is set to empty string
// person.setAge(10);
// System.out.println("fullName= " + person.getFullName());
// System.out.println("teen= " + person.isTeen());
// person.setFirstName("John");    // firstName is set to John
// person.setAge(18);
// System.out.println("fullName= " + person.getFullName());
// System.out.println("teen= " + person.isTeen());
// person.setLastName("Smith");    // lastName is set to Smith
// System.out.println("fullName= " + person.getFullName());

// OUTPUT
// fullName=
// teen= false
// fullName= John
// teen= true
// fullName= John Smith

// NOTE: All methods should be defined as public NOT public static.
// NOTE: In total, you have to write 8 methods.
// NOTE: Do not add the main method to the solution code.

public class Person {
    private String firstName;
    private String lastName;
    private int age;
    
    public String getFirstName(){
        return this.firstName;
    }
    
    public String getLastName(){
        return this.lastName;
    }
    
    public int getAge(){
        return this.age;
    }
    
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    
    public void setAge(int age){
        if (age < 0 || age > 100) {
            this.age = 0;
        } else {
            this.age = age;
        }
    }
    
    public boolean isTeen(){
        if (this.age > 12 && this.age < 20) {
            return true;
        } else {
            return false;
        }
    }
    
    public String getFullName(){
        if (this.firstName.isEmpty() && this.lastName.isEmpty()){
            return "";
        } else if (this.firstName.isEmpty()) {
            return this.lastName;
        } else if (this.lastName.isEmpty()){
            return this.firstName;
        } else {
            return this.firstName + " " + this.lastName;
        }
        
    }
}


// Write a class with the name SimpleCalculator. The class needs two fields (instance variables) with names firstNumber and secondNumber both of type double.
// Write the following methods (instance methods):

// *Method named getFirstNumber without any parameters, it needs to return the value of firstNumber field.
// *Method named getSecondNumber without any parameters, it needs to return the value of secondNumber field.
// *Method named setFirstNumber with one parameter of type double, it needs to set the value of the firstNumber field.
// *Method named setSecondNumber with one parameter of type double, it needs to set the value of the secondNumberfield.
// *Method named getAdditionResult without any parameters, it needs to return the result of adding the field values of firstNumber and secondNumber.
// *Method named getSubtractionResult without any parameters, it needs to return the result of subtracting the field values of secondNumber from the firstNumber.
// *Method named getMultiplicationResult without any parameters, it needs to return the result of multiplying the field values of firstNumber and secondNumber.
// *Method named getDivisionResult without any parameters it needs to return the result of dividing the field values of firstNumber by the secondNumber. In case the value of secondNumber is 0 then return 0.

// TEST CODE:

// SimpleCalculator calculator = new SimpleCalculator();
// calculator.setFirstNumber(5.0);
// calculator.setSecondNumber(4);
// System.out.println("add= " + calculator.getAdditionResult());
// System.out.println("subtract= " + calculator.getSubtractionResult());
// calculator.setFirstNumber(5.25);
// calculator.setSecondNumber(0);
// System.out.println("multiply= " + calculator.getMultiplicationResult());
// System.out.println("divide= " + calculator.getDivisionResult());

// OUTPUT

// add= 9.0
// subtract= 1.0
// multiply= 0.0
// divide= 0.0

// TIPS:

// *add= 9.0 is printed because 5.0 + 4 is 9.0
// *subtract= 1.0 is printed because 5.0 - 4 is 1.0
// *multiply= 0.0 is printed because 5.25 * 0 is 0.0
// *divide= 0.0 is printed because secondNumber is set to 0

// NOTE: All methods should be defined as public NOT public static.
// NOTE: In total, you have to write 8 methods.
// NOTE: Do not add the main method to the solution code.

public class SimpleCalculator {
    private double firstNumber;
    private double secondNumber;
    
    public double getFirstNumber(){
        return this.firstNumber;
    }
    
    public double getSecondNumber(){
        return this.secondNumber;
    }
    
    public void setFirstNumber(double firstNumber){
        this.firstNumber = firstNumber;
    }
    
    public void setSecondNumber(double secondNumber){
        this.secondNumber = secondNumber;
    }
    
    public double getAdditionResult(){
        return (this.firstNumber + this.secondNumber);
    }
    
    public double getSubtractionResult(){
        return this.firstNumber - this.secondNumber;
    }
    
    public double getMultiplicationResult(){
        return this.firstNumber * this.secondNumber;
    }
    
    public double getDivisionResult(){
        if (this.secondNumber == 0) {
            return 0;
        }
        
        return this.firstNumber / this.secondNumber;
    }
}


// Write a method called inputThenPrintSumAndAverage that does not have any parameters.
// The method should not return anything (void) and it needs to keep reading int numbers from the keyboard.
// When the user enters something that is not an int then it needs to print a message in the format "SUM = XX AVG = YY".
// Bob is a wall painter and he needs your help. You have to write a program that helps Bob calculate how many buckets of paint he needs to buy before going to work. Bob might also have some extra buckets at home. He also knows the area that he can cover with one bucket of paint.
// 1. Write a method named getBucketCount with 4 parameters. The first parameter should be named width of type double. This parameter represents the width of the wall.
// The second parameter should be named height of type double. This parameter represents the height of the wall.
// The third parameter should be named areaPerBucket. This parameter represents the area that can be covered with one bucket of paint.
// The fourth parameter should be named extraBuckets. This parameter represents the bucket count that Bob has at home.
// The method needs to return a value of type int that represents the number of buckets that Bob needs to buy before going to work. To calculate the bucket count, refer to the notes below.
// If one of the parameters width, height or areaPerBucket is less or equal to 0 or if extraBuckets is less than 0, the method needs to return -1 to indicate an invalid value.
// If all parameters are valid, the method needs to calculate the number of buckets and return it.

// Examples of input/output:
// *getBucketCount(-3.4, 2.1, 1.5, 2); → should return -1 since the width parameter is invalid
// *getBucketCount(3.4, 2.1, 1.5, 2); → should return 3 since the wall area is 7.14, a single bucket can cover an area of 1.5 and Bob has 2 extra buckets home.
// *getBucketCount(2.75, 3.25, 2.5, 1); → should return 3 since the wall area is 8.9375, a single bucket can cover an area of 2.5 and Bob has 1 extra bucket at home.

// 2. Bob does not like to enter 0 for the extraBuckets parameter so he needs another method.
// Write another overloaded method named getBucketCount with 3 parameters namely width, height, and areaPerBucket (all of type double).
// This method needs to return a value of type int that represents the number of buckets that Bob needs to buy before going to work. To calculate the bucket count, refer to the notes below.
// If one of the parameters width, height or areaPerBucket is less or equal to 0, the method needs to return -1 to indicate an invalid value.
// If all parameters are valid, the method needs to calculate the number of buckets and return it.

// Examples of input/output:
// *getBucketCount(-3.4, 2.1, 1.5); → should return -1 since the width parameter is invalid
// *getBucketCount(3.4, 2.1, 1.5); → should return 5 since the wall area is 7.14, and a single bucket can cover an area of 1.5.
// *getBucketCount(7.25, 4.3, 2.35); → should return 14 since the wall area is 31.175, and a single bucket can cover an area of 2.35.

// 3. In some cases, Bob does not know the width and height of the wall but he knows the area of a wall. He needs you to write another method.
// Write another overloaded method named getBucketCount with 2 parameters namely, area and areaPerBucket (both of type double).
// The method needs to return a value of type int that represents the number of buckets that Bob needs to buy before going to work. To calculate the bucket count, refer to the notes below.
// If one of the parameters area or areaPerBucket is less or equal to 0, the method needs to return -1to indicate an invalid value.
// If all parameters are valid, the method needs to calculate the number of buckets and return it.

// Examples of input/output:
// *getBucketCount(3.4, 1.5); → should return 3 since the area is 3.4 and a single bucket can cover an area of 1.5
// *getBucketCount(6.26, 2.2); → should return 3 since the wall area is 6.26 and a single bucket can cover an area of 2.2.
// *getBucketCount(3.26, 0.75); → should return 5 since the wall area is 3.26, and a single bucket can cover an area of 0.75 .
// Do your best to help Bob.

// NOTE: Use the method Math.ceil to round the number of calculated buckets (double) then convert it into an int before returning the value from the methods.
// NOTE: All methods should be defined as public static like we have been doing so far in the course.
// NOTE: Do not add the main method to the solution code.

public class PaintJob {
    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets) {
  
     if ((width <= 0) || (height <= 0) || (areaPerBucket <= 0) || (extraBuckets < 0)) {
         return -1;
     }
     int bucketNeedForJob = (int) Math.ceil((width*height)/areaPerBucket);
     return bucketNeedForJob - extraBuckets;
 }
  
 public static int getBucketCount(double width, double height, double areaPerBucket) {
     return getBucketCount(width, height, areaPerBucket, 0);
 }
  
 public static int getBucketCount(double area, double areaPerBucket) {
     if ((area <= 0) || (areaPerBucket <= 0)){
         return -1;
     }
     return (int) Math.ceil(area/areaPerBucket);
 }
 }

// Write a method called inputThenPrintSumAndAverage that does not have any
// parameters.
// The method should not return anything (void) and it needs to keep reading int
// numbers from the keyboard.
// When the user enters something that is not an int then it needs to print a
// message in the format "SUM = XX AVG = YY".
// XX represents the sum of all entered numbers of type int.
// YY represents the calculated average of all numbers of type long.

// EXAMPLES OF INPUT/OUTPUT:
// EXAMPLE 1:
// INPUT:
// 1
// 2
// 3
// 4
// 5
// a
// OUTPUT
// SUM = 15 AVG = 3

// EXAMPLE 2:
// INPUT:
// hello
// OUTPUT:
// SUM = 0 AVG = 0

// TIP: Use Scanner to read an input from the user.
// TIP: Use casting when calling the round method since it needs double as a
// parameter.
// NOTE: Use the method Math.round to round the calculated average (double). The
// method round returns long.
// NOTE: Be mindful of spaces in the printed message.
// NOTE: Be mindful of users who may type an invalid input right away (see
// example above).
// NOTE: The method inputThenPrintSumAndAverage should be defined as public
// static like we have been doing so far in the course.
// NOTE: Do not add the main method to the solution code.

import java.util.Scanner;

public class InputCalculator {

    public static void inputThenPrintSumAndAverage() {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        long average = 0;
        int count = 0;

        while (true) {
            boolean validInt = scanner.hasNextInt();

            if (!validInt) {
                System.out.println("SUM = " + sum + " AVG = " + average);
                break;
            }

            count++;
            int currentNum = scanner.nextInt();
            sum += currentNum;
            average = Math.round((double) sum / count);

            scanner.nextLine();
        }

        scanner.close();
    }
}

// Write a method named printSquareStar with one parameter of type int named
// number.
// If number is < 5, the method should print "Invalid Value".
// The method should print diagonals to generate a rectangular pattern composed
// of stars (*). This should be accomplished by using loops (see examples
// below).

// EXAMPLE INPUT/OUTPUT:
// EXAMPLE 1
// printSquareStar(5); should print the following:
// → NOTE: For text in Code Blocks below, use code icon {...} on Udemy

// *****
// ** **
// * * *
// ** **
// *****

// Explanation:
// ***** 5 stars
// ** ** 2 stars space 2 stars
// * * * 1 star space 1 star space 1 star
// ** ** 2 stars space 2 stars
// ***** 5 stars

// EXAMPLE 2
// printSquareStar(8); should print the following:
// ********
// ** **
// * * * *
// * ** *
// * ** *
// * * * *
// ** **
// ********

// The patterns above consist of a number of rows and columns (where number is
// the number of rows to print). For each row or column, stars are printed based
// on four conditions (Read them carefully):
// * In the first or last row
// * In the first or last column
// * When the row number equals the column number
// * When the column number equals rowCount - currentRow + 1 (where currentRow
// is current row number)

// HINT: Use a nested loop (a loop inside of a loop).
// HINT: To print on the same line, use the print method instead of println,
// e.g. System.out.print(" "); prints a space and does not "move" to another
// line.
// HINT: To "move" to another line, you can use an empty println call, e.g.
// System.out.println(); .
// NOTE: The method printSquareStar should be defined as public static like we
// have been doing so far in the course.
// NOTE: Do not add a main method to the solution code.

// -Read 10 numbers from the console entered by the user and print the sum of
// those numbers.
// -Create a Scanner like we did in the previous video.
// -Use the hasNextInt() method from the scanner to check if the user has
// entered an int value.
// -If hasNextInt() returns false, print the message gInvalid Numberh.
// Continue reading until you have read 10 numbers.
// -Use the nextInt() method to get the number and add it to the sum.
// -Before the user enters each number, print the message gEnter number #x:h
// where x represents the count, i.e. 1, 2, 3, 4, etc.
// -For example, the first message printed to the user would be gEnter number
// #1:h, the next gEnter number #2: h, and so on.

// Hint:
// -Use a while loop.
// -Use a counter variable for counting valid numbers.
// -Close the scanner after you donft need it anymore.
// -Create a project with the name ReadingUserInputChallenge.

public class DiagonalStar {
    public static void printSquareStar(int number) {
        int i, j;
        if (number < 5) {
            System.out.println("Invalid Value");
        } else
            for (i = 1; i <= number; i++) {
                for (j = 1; j <= number; j++) {
                    if ((j == 1 || j == number) || (i == 1 || i == number) || j == (number - i) + 1 || j == i) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }

    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numbersEntered = 1;
        int sum = 0;

        while (numbersEntered < 11) {
            System.out.println("Enter number #" + numbersEntered + ":");
            boolean validNumber = scanner.hasNextInt();
            int currentNumber = scanner.nextInt();

            if (validNumber) {
                sum += currentNumber;

            } else {
                System.out.println();
            }

            numbersEntered++;
        }

        System.out.println("The sum of your numbers is " + sum + ".");
        scanner.close();

    }
}

// Write a method named getLargestPrime with one parameter of type int named
// number.
// If the number is negative or does not have any prime numbers, the method
// should return -1 to indicate an invalid value.
// The method should calculate the largest prime factor of a given number and
// return it.

// EXAMPLE INPUT/OUTPUT:
// * getLargestPrime (21); should return 7 since 7 is the largest prime (3 * 7 =
// 21)
// * getLargestPrime (217); should return 31 since 31 is the largest prime (7 *
// 31 = 217)
// * getLargestPrime (0); should return -1 since 0 does not have any prime
// numbers
// * getLargestPrime (45); should return 5 since 5 is the largest prime (3 * 3 *
// 5 = 45)
// * getLargestPrime (-1); should return -1 since the parameter is negative

// HINT: Since the numbers 0 and 1 are not considered prime numbers, they cannot
// contain prime numbers.
// NOTE: The method getLargestPrime should be defined as public static like we
// have been doing so far in the course.
// NOTE: Do not add a main method to the solution code.

public class LargestPrime {
    public static int getLargestPrime(int number) {
        if (number <= 1) {
            return -1;
        }
        int i = number;
        while (i > 1) {
            if (number % i == 0) {
                number = i;
            }
            i--;
        }
        return number;

    }
}

// Write a method named canPack with three parameters of type int named
// bigCount, smallCount, and goal.
// The parameter bigCount represents the count of big flour bags (5 kilos each).
// The parameter smallCount represents the count of small flour bags (1 kilo
// each).
// The parameter goal represents the goal amount of kilos of flour needed to
// assemble a package.
// Therefore, the sum of the kilos of bigCount and smallCount must be at least
// equal to the value of goal. The method should return true if it is possible
// to make a package with goal kilos of flour.
// If the sum is greater than goal, ensure that only full bags are used towards
// the goal amount. For example, if goal = 9, bigCount = 2, and smallCount = 0,
// the method should return false since each big bag is 5 kilos and cannot be
// divided. However, if goal = 9, bigCount = 1, and smallCount = 5, the method
// should return true because of 1 full bigCount bag and 4 full smallCount bags
// equal goal, and it's okay if there are additional bags left over.
// If any of the parameters are negative, return false.

// EXAMPLE INPUT/OUTPUT:
// * canPack (1, 0, 4); should return false since bigCount is 1 (big bag of 5
// kilos) and goal is 4 kilos.
// * canPack (1, 0, 5); should return true since bigCount is 1 (big bag of 5
// kilos) and goal is 5 kilos.
// * canPack (0, 5, 4); should return true since smallCount is 5 (small bags of
// 1 kilo) and goal is 4 kilos, and we have 1 bag left which is ok as mentioned
// above
// * canPack (2, 2, 11); should return true since bigCount is 2 (big bags 5
// kilos each) and smallCount is 2 (small bags of 1 kilo), makes in total 12
// kilos and goal is 11 kilos.
// * canPack (-3, 2, 12); should return false since bigCount is negative.

// NOTE: The method canPack should be defined as public static like we have been
// doing so far in the course.
// NOTE: Do not add a main method to the solution code.

public class FlourPacker {
    public static boolean canPack(int bigCount, int smallCount, int goal) {
        int b = bigCount * 5;
        if (b < 0 || smallCount < 0 || goal < 0) {
            return false;
        }
        if ((goal % 5 <= smallCount) && b + smallCount >= goal) {
            return true;
        }

        return false;
    }

}

// Write a method called numberToWords with one int parameter named number.
// The method should print out the passed number using words for the digits.
// If the number is negative, print "Invalid Value".
// To print the number as words, follow these steps:

// 1. Extract the last digit of the given number using the remainder operator.
// 2. Convert the value of the digit found in Step 1 into a word. There are 10
// possible values for that digit, those being 0, 1, 2, 3, 4, 5, 6, 7, 8, 9.
// Print the corresponding word for each digit, e.g. print "Zero" if the digit
// is 0, "One" if the digit is 1, and so on.
// 3. Remove the last digit from the number.
// 4. Repeat Steps 2 through 4 until the number is 0.
// The logic above is correct, but in its current state, the words will be
// printed in reverse order. For example, if the number is 234, the logic above
// will produce the output "Four Three Two" instead of "Two Three Four". To
// overcome this problem, write a second method called reverse.
// The method reverse should have one int parameter and return the reversed
// number (int). For example, if the number passed is 234, then the reversed
// number would be 432. The method reverse should also reverse negative numbers.
// Use the method reverse within the method numberToWords in order to print the
// words in the correct order.
// Another thing to keep in mind is any reversed number with leading zeroes
// (e.g. the reversed number for 100 is 001). The logic above for the method
// numberToWords will print "One", but that is incorrect. It should print "One
// Zero Zero". To solve this problem, write a third method called getDigitCount.
// The method getDigitCount should have one int parameter called number and
// return the count of the digits in that number. If the number is negative,
// return -1 to indicate an invalid value.
// For example, if the number has a value of 100, the method getDigitCount
// should return 3 since the number 100 has 3 digits (1, 0, 0).

// Example Input/Output - getDigitCount method
// * getDigitCount(0); should return 1 since there is only 1 digit
// * getDigitCount(123); should return 3
// * getDigitCount(-12); should return -1 since the parameter is negative
// * getDigitCount(5200); should return 4 since there are 4 digits in the number

// Example Input/Output - reverse method
// * reverse(-121); should return -121
// * reverse(1212); should return 2121
// * reverse(1234); should return 4321
// * reverse(100); should return 1

// Example Input/Output - numberToWords method
// * numberToWords(123); should print "One Two Three".
// * numberToWords(1010); should print "One Zero One Zero".
// * numberToWords(1000); should print "One Zero Zero Zero".
// * numberToWords(-12); should print "Invalid Value" since the parameter is
// negative.

// HINT: Use a for loop to print zeroes after reversing the number. As seen in a
// previous example, 100 reversed becomes 1, but the method numberToWords should
// print "One Zero Zero". To get the number of zeroes, check the difference
// between the digit count from the original number and the reversed number.
// NOTE: When printing words, each word can be in its own line. For example,
// numberToWords(123); can be:

// One
// Two
// Three

// They don't have to be separated by a space.

// NOTE: The methods numberToWords, getDigitCount, reverse should be defined as
// public static like we have been doing so far in the course.
// NOTE: In total, you have to write 3 methods.
// NOTE: Do not add a main method to the solution code.

public class NumberToWords {
    public static int getDigitCount(int number) {
        int i = 0;
        if (number < 0) {
            return -1;
        }

        do {
            i++;
            number = number / 10;
        } while (number != 0);
        return i;
    }

    public static int reverse(int number) {
        int digitReverse = 0;
        while (number != 0) {
            // Extract last digit
            int lastDigit = number % 10;
            // Increase the place by value one
            digitReverse = digitReverse * 10;
            // Add last digit to the number
            digitReverse += lastDigit;
            // remove last digit of number
            number /= 10;
        }
        return digitReverse;
    }

    public static void numberToWords(int number) {
        int rev = reverse(number);
        if (rev < 0) {
            System.out.println("Invalid Value");
        } else {
            int count = getDigitCount(number);
            String digitWord = "";
            String finalResult = "";
            for (int i = 0; i != count; i++) {
                int firstDigit = rev % 10;
                rev /= 10;

                if (firstDigit == 0) {
                    digitWord = "Zero ";
                } else if (firstDigit == 1) {
                    digitWord = "One ";
                } else if (firstDigit == 2) {
                    digitWord = "Two ";
                } else if (firstDigit == 3) {
                    digitWord = "Three ";
                } else if (firstDigit == 4) {
                    digitWord = "Four ";
                } else if (firstDigit == 5) {
                    digitWord = "Five ";
                } else if (firstDigit == 6) {
                    digitWord = "Six ";
                } else if (firstDigit == 7) {
                    digitWord = "Seven ";
                } else if (firstDigit == 8) {
                    digitWord = "Eight ";
                } else if (firstDigit == 9) {
                    digitWord = "Nine ";
                }
                finalResult += digitWord;
            }
            System.out.println(finalResult);
        }

    }
}

// What is the perfect number?
// A perfect number is a positive integer which is equal to the sum of its
// proper positive divisors.
// Proper positive divisors are positive integers that fully divide the perfect
// number without leaving a remainder and exclude the perfect number itself.
// For example, take the number 6:
// Its proper divisors are 1, 2, and 3 (since 6 is the value of the perfect
// number, it is excluded), and the sum of its proper divisors is 1 + 2 + 3 = 6.

// Therefore, 6 is a perfect number (as well as the first perfect number).

// Write a method named isPerfectNumber with one parameter of type int named
// number.
// If number is < 1, the method should return false.
// The method must calculate if the number is perfect. If the number is perfect,
// the method should return true; otherwise, it should return false.

// EXAMPLE INPUT/OUTPUT:
// * isPerfectNumber(6); should return true since its proper divisors are 1, 2,
// 3 and the sum is 1 + 2 + 3 = 6
// * isPerfectNumber(28); should return true since its proper divisors are 1, 2,
// 4, 7, 14 and the sum is 1 + 2 + 4 + 7 + 14 = 28
// * isPerfectNumber(5); should return false since its only proper divisor is 1
// and the sum is 1 not 5
// * isPerfectNumber(-1); should return false since the number is < 1

// HINT: Use a while or for loop.
// HINT: Use the remainder operator.
// NOTE: The method isPerfectNumber should be defined as public static like we
// have been doing so far in the course.
// NOTE: Do not add a main method to the solution code.

public class PerfectNumber {
    public static boolean isPerfectNumber(int number) {

        if (number < 1) {
            return false;
        }

        int sum = 0;

        for (int divisor = 1; divisor < number; divisor++) {

            if (number % divisor == 0) {
                sum = sum + divisor;
            }
        }

        return (sum == number);
    }
}

// Write a method named printFactors with one parameter of type int named
// number.
// If number is < 1, the method should print "Invalid Value".
// The method should print all factors of the number. A factor of a number is an
// integer which divides that number wholly (i.e. without leaving a remainder).
// For example, 3 is a factor of 6 because 3 fully divides 6 without leaving a
// remainder. In other words 6 / 3 = 2.

// EXAMPLE INPUT/OUTPUT:
// * printFactors(6); → should print 1 2 3 6
// * printFactors(32); → should print 1 2 4 8 16 32
// * printFactors(10); → should print 1 2 5 10
// * printFactors(-1); → should print "Invalid Value" since number is < 1

// HINT: Use a while or for loop.
// NOTE: When printing numbers, each number can be in its own line. They don't
// have to be separated by a space.
// For example, the printout for printFactors(10); can be:

// 1
// 2
// 5
// 10

// NOTE: The method printFactors should be defined as public static like we have
// been doing so far in the course.
// NOTE: Do not add a main method to the solution code.

public class FactorPrinter {
    public static void printFactors(int named) {
        if (named < 1) {
            System.out.println("Invalid Value");
        } else {
            for (int i = 1; i <= named; i++) {
                if (named % i == 0) {
                    System.out.println(i);
                }
            }
        }
    }
}

// Write a method named hasSharedDigit with two parameters of type int.
// Each number should be within the range of 10 (inclusive) - 99 (inclusive). If
// one of the numbers is not within the range, the method should return false.
// The method should return true if there is a digit that appears in both
// numbers, such as 2 in 12 and 23; otherwise, the method should return false.

// EXAMPLE INPUT/OUTPUT:
// * hasSharedDigit(12, 23); → should return true since the digit 2 appears in
// both numbers
// * hasSharedDigit(9, 99); → should return false since 9 is not within the
// range of 10-99
// * hasSharedDigit(15, 55); → should return true since the digit 5 appears in
// both numbers

// NOTE: The method hasSharedDigit should be defined as public static like we
// have been doing so far in the course.
// Write a method named getGreatestCommonDivisor with two parameters of type int
// named first and second.
// If one of the parameters is < 10, the method should return -1 to indicate an
// invalid value.
// The method should return the greatest common divisor of the two numbers
// (int).
// The greatest common divisor is the largest positive integer that can fully
// divide each of the integers (i.e. without leaving a remainder).

// For example 12 and 30:
// 12 can be divided by 1, 2, 3, 4, 6, 12
// 30 can be divided by 1, 2, 3, 5, 6, 10, 15, 30
// The greatest common divisor is 6 since both 12 and 30 can be divided by 6,
// and there is no resulting remainder.

// EXAMPLE INPUT/OUTPUT:
// * getGreatestCommonDivisor(25, 15); should return 5 since both can be divided
// by 5 without a remainder
// * getGreatestCommonDivisor(12, 30); should return 6 since both can be divided
// by 6 without a remainder
// * getGreatestCommonDivisor(9, 18); should return -1 since the first parameter
// is < 10
// * getGreatestCommonDivisor(81, 153); should return 9 since both can be
// divided by 9 without a remainder

// HINT: Use a while or a for loop and check if both numbers can be divided
// without a remainder.
// HINT: Find the minimum of the two numbers.

// NOTE: The method getGreatestCommonDivisor should be defined as public static
// like we have been doing so far in the course.
// NOTE: Do not add a main method to the solution code.

public class GreatestCommonDivisor {
    public static int getGreatestCommonDivisor(int first, int second) {
        if (first < 10 || second < 10) {
            return -1;
        }

        int looper = first;
        int check = second;

        if (second > first) {
            looper = second;
            check = first;
        }

        for (int i = looper; i > 0; i--) {
            if (looper % i == 0 && check % i == 0) {
                return i;
            }
        }
        return -1;
    }
}

// Write a method named hasSameLastDigit with three parameters of type int.
// Each number should be within the range of 10 (inclusive) - 1000 (inclusive).
// If one of the numbers is not within the range, the method should return
// false.
// The method should return true if at least two of the numbers share the same
// rightmost digit; otherwise, it should return false.

// EXAMPLE INPUT/OUTPUT:
// * hasSameLastDigit (41, 22, 71); → should return true since 1 is the
// rightmost digit in numbers 41 and 71
// * hasSameLastDigit (23, 32, 42); → should return true since 2 is the
// rightmost digit in numbers 32 and 42
// * hasSameLastDigit (9, 99, 999); → should return false since 9 is not within
// the range of 10-1000

// Write another method named isValid with one parameter of type int.
// The method needs to return true if the number parameter is in range of
// 10(inclusive) - 1000(inclusive), otherwise return false.

// EXAMPLE INPUT/OUTPUT
// * isValid(10); → should return true since 10 is within the range of 10-1000
// * isValid(468); → should return true since 10 is within the range of 10-1000
// * isValid(1051); → should return false since 10 is not within the range of
// 10-1000

// NOTE: All methods need to be defined as public static as we have been doing
// so far in the course.
// NOTE: Do not add a main method to the solution code.

public class LastDigitChecker {
    public static boolean hasSameLastDigit(int a, int b, int c) {

        if (!isValid(a) || !isValid(b) || !isValid(c)) {
            return false;
        }

        a = a % 10;
        b = b % 10;
        c = c % 10;

        if (a == b || a == c || b == c) {
            return true;
        }

        return false;
    }

    public static boolean isValid(int number) {
        if (number > 1000 || number < 10) {
            return false;
        }

        return true;
    }
}

// Write a method named hasSharedDigit with two parameters of type int.
// Each number should be within the range of 10 (inclusive) - 99 (inclusive). If
// one of the numbers is not within the range, the method should return false.
// The method should return true if there is a digit that appears in both
// numbers, such as 2 in 12 and 23; otherwise, the method should return false.

// EXAMPLE INPUT/OUTPUT:
// * hasSharedDigit(12, 23); → should return true since the digit 2 appears in
// both numbers
// * hasSharedDigit(9, 99); → should return false since 9 is not within the
// range of 10-99
// * hasSharedDigit(15, 55); → should return true since the digit 5 appears in
// both numbers

// NOTE: The method hasSharedDigit should be defined as public static like we
// have been doing so far in the course.
// NOTE: Do not add a main method to the solution code.

public class SharedDigit {
    public static boolean hasSharedDigit(int a, int b) {
        if (a < 10 || b < 10 || a > 99 || b > 99) {
            return false;
        }

        int aOne = a % 10;
        System.out.println("aOne" + aOne);
        a = a / 10;
        int aTwo = a;
        System.out.println("aTwo" + aTwo);

        int bOne = b % 10;
        System.out.println("bOne" + bOne);
        b = b / 10;
        int bTwo = b;
        System.out.println("bTwo" + bTwo);

        if (aOne == bOne || aOne == bTwo || aTwo == bOne || aTwo == bTwo) {
            return true;
        }

        return false;
    }
}

// Write a method named getEvenDigitSum with one parameter of type int called
// number.
// The method should return the sum of the even digits within the number.
// If the number is negative, the method should return -1 to indicate an invalid
// value.

// EXAMPLE INPUT/OUTPUT:
// * getEvenDigitSum(123456789); → should return 20 since 2 + 4 + 6 + 8 = 20
// * getEvenDigitSum(252); → should return 4 since 2 + 2 = 4
// * getEvenDigitSum(-22); → should return -1 since the number is negative

// NOTE: The method getEvenDigitSum should be defined as public static like we
// have been doing so far in the course.
// NOTE: Do not add a main method to the solution code.

public class EvenDigitSum {
    public static int getEvenDigitSum(int number) {
        if (number < 0) {
            return -1;
        }

        int sum = 0;

        while (number > 0) {
            int current = number % 10;
            if (current % 2 == 0) {
                sum += current;
            }
            number = number / 10;
        }

        return sum;
    }
}

// Write a method named sumFirstAndLastDigit with one parameter of type int
// called number.
// The method needs to find the first and the last digit of the parameter number
// passed to the method, using a loop and return the sum of the first and the
// last digit of that number.
// If the number is negative then the method needs to return -1 to indicate an
// invalid value.

// Example input/output
// * sumFirstAndLastDigit(252); → should return 4, the first digit is 2 and the
// last is 2 which gives us 2+2 and the sum is 4.
// * sumFirstAndLastDigit(257); → should return 9, the first digit is 2 and the
// last is 7 which gives us 2+7 and the sum is 9.
// * sumFirstAndLastDigit(0); → should return 0, the first digit and the last
// digit is 0 since we only have 1 digit, which gives us 0+0 and the sum is 0.
// * sumFirstAndLastDigit(5); → should return 10, the first digit and the last
// digit is 5 since we only have 1 digit, which gives us 5+5 and the sum is 10.
// * sumFirstAndLastDigit(-10); → should return -1, since the parameter is
// negative and needs to be positive.

// NOTE: The method sumFirstAndLastDigit needs to be defined as public static
// like we have been doing so far in the course.
// NOTE: Do not add a main method to solution code.

public class FirstLastDigitSum {
    public static int sumFirstAndLastDigit(int number) {
        if (number < 0) {
            return -1;
        }

        int first = number % 10;
        int last = 0;

        while (number > 0) {
            if (number < 10) {
                last = number;
            }
            number = number / 10;
        }

        return first + last;

    }
}

// Write a method called isPalindrome with one int parameter called number.
// The method needs to return a boolean.
// It should return true if the number is a palindrome number otherwise it
// should return false.
// Check the tips below for more info about palindromes.
// Example Input/Output
// isPalindrome(-1221); → should return true
// isPalindrome(707); → should return true
// isPalindrome(11212); → should return false because reverse is 21211 and that
// is not equal to 11212.
// Tip: What is a Palindrome number? A palindrome number is a number which when
// reversed is equal to the original number. For example: 121, 12321, 1001 etc.
// Tip: Logic to check a palindrome number
// Find the the reverse of the given number. Store it in some variable say
// reverse. Compare the number with reverse.
// If both are the the same then the number is a palindrome otherwise it is not.
// Tip: Logic to reverse a number
// Declare and initialize another variable to store the reverse of a number, for
// example reverse = 0.

// Extract the last digit of the given number by performing the modulo division
// (remainder).
// Store the last digit to some variable say lastDigit = num % 10.
// Increase the place value of reverse by one.
// To increase place value multiply the reverse variable by 10 e.g. reverse =
// reverse * 10.
// Add lastDigit to reverse.
// Since the last digit of the number is processed, remove the last digit of
// num. To remove the last digit divide number by 10.
// Repeat steps until number is not equal to (or greater than) zero.

// A while loop would be good for this coding exercise.

// Tip: Be careful with negative numbers. They can also be palindrome numbers.

// Tip: Be careful with reversing a number, you will need a parameter for
// comparing a reversed number with the starting number (parameter).

// NOTE: The method isPalindrome needs to be defined as public static like we
// have been doing

public class NumberPalindrome {
    public static boolean isPalindrome(int number) {
        if (number < 0) {
            number = number * -1;
        }

        int original = number;
        int reverse = 0;

        while (number > 0) {
            int lastDigit = number % 10;
            number = number / 10;
            reverse = reverse * 10;
            reverse += lastDigit;
        }

        if (reverse == original) {
            return true;
        } else {
            return false;
        }

    }
}

// Write a method named area with one double parameter named radius.
// The method needs to return a double value that represents the area of a
// circle.
// If the parameter radius is negative then return -1.0 to represent an invalid
// value.
// Write another overloaded method with 2 parameters x and y (both doubles),
// where x and y represent the sides of a rectangle.
// The method needs to return an area of a rectangle.
// If either or both parameters is/are a negative return -1.0 to indicate an
// invalid value.
// For formulas and PI value please check the tips below.
// Examples of input/output:
// * area(5.0); should return 78.53975
// * area(-1); should return -1 since the parameter is negative
// * area(5.0, 4.0); should return 20.0 (5 * 4 = 20)
// * area(-1.0, 4.0); should return -1 since first the parameter is negative

// TIP: The formula for calculating the area of a rectangle is x * y.
// TIP: The formula for calculating a circle area is radius * radius * PI.
// TIP: For PI use a constant from Math class e.g. Math.PI
// NOTE: All methods need to be defined as public static like we have been doing
// so far in the course.
// NOTE: Do not add a main method to your solution code!

public class AreaCalculator {
    public static double area(double radius) {
        if (radius < 0) {
            return -1.0;
        }

        return radius * radius * Math.PI;
    }

    public static double area(double x, double y) {
        if (x < 0 || y < 0) {
            return -1.0;
        }

        return x * y;
    }
}

// COUNT THE SMILEYS JAVA
// Description:
// Given an array (arr) as an argument complete the function countSmileys that
// should return the total number of smiling faces.
// Rules for a smiling face:
// -Each smiley face must contain a valid pair of eyes. Eyes can be marked as :
// or ;
// -A smiley face can have a nose but it does not have to. Valid characters for
// a nose are - or ~
// -Every smiling face must have a smiling mouth that should be marked with
// either ) or D.
// No additional characters are allowed except for those mentioned.
// Valid smiley face examples:
// :) :D ;-D :~)
// Invalid smiley faces:
// ;( :> :} :]

// Example cases:

// countSmileys([':)', ';(', ';}', ':-D']); // should return 2;
// countSmileys([';D', ':-(', ':-)', ';~)']); // should return 3;
// countSmileys([';]', ':[', ';*', ':$', ';-D']); // should return 1;

// Note: In case of an empty array return 0. You will not be tested with invalid
// input (input will always be an array). Order of the face (eyes, nose, mouth)
// elements will always be the same
// Happy coding!

public class SmileFaces {

    public static int countSmileys(List<String> arr) {
        int smileyCount = 0;
        for (String smiley : arr) {
            System.out.println(smiley);
            if (smiley.length() < 3) {

                if ((Character.toString(smiley.charAt(0)).compareTo(":") == 0)
                        || (Character.toString(smiley.charAt(0)).compareTo(";") == 0)) {

                    if ((smiley.length() == 2) && (Character.toString(smiley.charAt(1)).compareTo(")") == 0)
                            || (Character.toString(smiley.charAt(1)).compareTo("D") == 0)) {

                        System.out.println("passed");
                        smileyCount++;
                    }
                }
            } else {
                if (smiley.length() < 4) {
                    if ((Character.toString(smiley.charAt(0)).compareTo(":") == 0)
                            || (Character.toString(smiley.charAt(0)).compareTo(";") == 0)) {
                        if ((Character.toString(smiley.charAt(1)).compareTo("-") == 0)
                                || (Character.toString(smiley.charAt(1)).compareTo("~") == 0)) {
                            if ((Character.toString(smiley.charAt(2)).compareTo(")") == 0)
                                    || (Character.toString(smiley.charAt(2)).compareTo("D") == 0)) {
                                System.out.println("passed");
                                smileyCount++;
                            }
                        }
                    }
                }
            }
        }

        return smileyCount;
    }
}

// Write a method printYearsAndDays with parameter of type long named minutes.
// The method should not return anything (void) and it needs to calculate the
// years and days from the minutes parameter.
// If the parameter is less than 0, print text "Invalid Value".
// Otherwise, if the parameter is valid then it needs to print a message in the
// format "XX min = YY y and ZZ d".
// XX represents the original value minutes.
// YY represents the calculated years.
// ZZ represents the calculated days.

// EXAMPLES OF INPUT/OUTPUT:
// * printYearsAndDays(525600); → should print "525600 min = 1 y and 0 d"
// * printYearsAndDays(1051200); → should print "1051200 min = 2 y and 0 d"
// * printYearsAndDays(561600); → should print "561600 min = 1 y and 25 d"

// TIPS:
// * Be extra careful about spaces in the printed message.
// * Use the remainder operator
// * 1 hour = 60 minutes
// * 1 day = 24 hours
// * 1 year = 365 days

// NOTES
// * The printYearsAndDays method needs to be defined as public static like we
// have been doing so far in the course.
// * Do not add main method to solution code.
// * The solution will not be accepted if there are extra spaces

public class MinutesToYearsDaysCalculator {
    public static void printYearsAndDays(long minutes) {

        if (minutes < 0) {
            System.out.println("Invalid Value");
            return;
        }

        long years = minutes / 525600;
        long minutesAfterYears = minutes % 525600;
        long days = minutesAfterYears / 1440;

        if (days == 365) {
            days = 0;
            years += 1;
        }

        System.out.println(minutes + " min = " + years + " y and " + days + " d");
    }
}

// Write a method printEqual with 3 parameters of type int. The method should
// not return anything (void).
// If one of the parameters is less than 0, print text "Invalid Value".
// If all numbers are equal print text "All numbers are equal"
// If all numbers are different print text "All numbers are different".
// Otherwise, print "Neither all are equal or different".

// EXAMPLES OF INPUT/OUTPUT:
// * printEqual(1, 1, 1); should print text All numbers are equal
// * printEqual(1, 1, 2); should print text Neither all are equal or different
// * printEqual(-1, -1, -1); should print text Invalid Value
// * printEqual(1, 2, 3); should print text All numbers are different

// TIP: Be extremely careful about spaces in the printed message.

// NOTES
// * The solution will not be accepted if there are extra spaces.
// * The method printEqual needs to be defined as public static like we have
// been doing so far in the course.
// * Do not add main method to solution code.

public class IntEqualityPrinter {
    public static void printEqual(int x, int y, int z) {
        if (x < 0 || y < 0 || z < 0) {
            System.out.println("Invalid Value");
            return;
        }

        if (x == y && x == z && y == z) {
            System.out.println("All numbers are equal");
            return;
        }

        if (x != y && x != z && y != z) {
            System.out.println("All numbers are different");
            return;
        }

        System.out.println("Neither all are equal or different");
    }
}

// The cats spend most of the day playing. In particular, they play if the
// temperature is between 25 and 35 (inclusive). Unless it is summer, then the
// upper limit is 45 (inclusive) instead of 35.

// Write a method isCatPlaying that has 2 parameters. Method needs to return
// true if the cat is playing, otherwise return false

// 1st parameter should be of type boolean and be named summer it represents if
// it is summer.
// 2nd parameter represents the temperature and is of type int with the name
// temperature.

// EXAMPLES OF INPUT/OUTPUT:
// * isCatPlaying(true, 10); should return false since temperature is not in
// range 25 - 45
// * isCatPlaying(false, 36); should return false since temperature is not in
// range 25 - 35 (summer parameter is false)
// * isCatPlaying(false, 35); should return true since temperature is in range
// 25 - 35

// NOTES
// * The isCatPlaying method needs to be defined as public static like we have
// been do

public class PlayingCat {
    public static boolean isCatPlaying(boolean summer, int temperature) {
        if (summer && temperature >= 25 && temperature <= 45) {
            return true;
        } else if (!summer && temperature >= 25 && temperature <= 35) {
            return true;
        } else {
            return false;
        }
    }}

    // Write a switch statement that checks for letters between A - D inclusive

    char switchChar = 'A';

    switch(switchChar)
    {
            case 'A':
                System.out.println("The char is A");
                break;
            case 'B':
                System.out.println("The char is B");
                break;
            case 'C':
                System.out.println("The char is C");
                break;
            case 'D':
                System.out.println("The char is D");
                break;
            default:
                System.out.println("The char is not A, B, C, or D");
                        
        }

    // Check the day of the week switch statement

    public class Main {

        public static void main(String[] args) {

            printDayOfTheWeek(4);

        }

        public static void printDayOfTheWeek(int day) {
            switch (day) {
            case 0:
                System.out.println("Sunday");
                break;
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Invalid Day");
            }
        }

        public static void printDayOfTheWeekElse(int day) {
            if (day == 0) {
                System.out.println("Sunday");
            } else if (day == 1) {
                System.out.println("Monday");
            } else if (day == 2) {
                System.out.println("Tuesday");
            } else if (day == 3) {
                System.out.println("Wednesday");
            } else if (day == 4) {
                System.out.println("Thursday");
            } else if (day == 5) {
                System.out.println("Friday");
            } else if (day == 6) {
                System.out.println("Saturday");
            } else {
                System.out.println("Invalid Day");
            }
        }
    }

    // For loop calculating interest printing to console

public static void main(String[] args) {

  for (int i = 2; i <= 8; i++) {
      System.out.println(calculateInterest(10000, i));
  }

}

public static double calculateInterest(double amount, double interestRate){
  return (amount * (interestRate/100));
}

    // Write a method called printNumberInWord. The method has one parameter number
    // which is the whole number. The method needs to print "ZERO", "ONE", "TWO",
    // ... "NINE", "OTHER" if the int parameter number is 0, 1, 2, .... 9 or other
    // for any other number including negative numbers. You can use if-else
    // statement or switch statement whatever is easier for you.

    // NOTE: Method printNumberInWord needs to be public static for now, we are only
    // using static methods.

    // NOTE: Do not add main method to solution code.

    public class NumberInWord {
        public static void printNumberInWord(int num) {
            switch (num) {
            case 0:
                System.out.println("ZERO");
                break;
            case 1:
                System.out.println("ONE");
                break;
            case 2:
                System.out.println("TWO");
                break;
            case 3:
                System.out.println("THREE");
                break;
            case 4:
                System.out.println("FOUR");
                break;
            case 5:
                System.out.println("FIVE");
                break;
            case 6:
                System.out.println("SIX");
                break;
            case 7:
                System.out.println("SEVEN");
                break;
            case 8:
                System.out.println("EIGHT");
                break;
            case 9:
                System.out.println("NINE");
                break;
            default:
                System.out.println("other");
            }
        }
    }

    // Write a method isLeapYear with a parameter of type int named year.

    // The parameter needs to be greater than or equal to 1 and less than or equal
    // to 9999.

    // If the parameter is not in that range return false.

    // Otherwise, if it is in the valid range, calculate if the year is a leap year
    // and return true if it is, otherwise return false.

    // A year is a leap year if it is divisible by 4 but not by 100, or it is
    // divisible by 400.

    // Examples of input/output:

    // * isLeapYear(-1600); → should return false since the parameter is not in the
    // range (1-9999)

    // * isLeapYear(1600); → should return true since 1600 is a leap year

    // * isLeapYear(2017); → should return false since 2017 is not a leap year

    // * isLeapYear(2000); → should return true because 2000 is a leap year

    // ​NOTE: The solution to the Leap Year coding exercise earlier in the course
    // created the isLeapYear method. You can use that solution if you wish.

    // Write another method getDaysInMonth with two parameters month and year. ​Both
    // of type int.

    // If parameter month is < 1 or > 12 return -1. ​
    // If parameter year is < 1 or > 9999 then return -1.

    // This method needs to return the number of days in the month. Be careful about
    // leap years they have 29 days in month 2 (February).

    // You should check if the year is a leap year using the method isLeapYear
    // described above.

    // Examples of input/output:

    // * getDaysInMonth(1, 2020); → should return 31 since January has 31 days.

    // * getDaysInMonth(2, 2020); → should return 29 since February has 29 days in a
    // leap year and 2020 is a leap year.

    // * getDaysInMonth(2, 2018); → should return 28 since February has 28 days if
    // it's not a leap year and 2018 is not a leap year.

    // * getDaysInMonth(-1, 2020); → should return -1 since the parameter month is
    // invalid.

    // * getDaysInMonth(1, -2020); → should return -1 since the parameter year is
    // outside the range of 1 to 9999.

    // HINT: Use the switch statement.

    // NOTE: Methods isLeapYear and getDaysInMonth need to be public static like we
    // have been doing so far in the course.

    // NOTE: Do not add a main method to solution code.

    public class NumberOfDaysInMonth {
        public static boolean isLeapYear(int year) {
            if (year < 1 || year > 9999) {
                return false;
            }

            if (year % 4 == 0 && year % 100 != 0) {
                return true;
            } else if (year % 400 == 0) {
                return true;
            } else {
                return false;
            }
        }

        public static int getDaysInMonth(int month, int year) {
            if (month < 1 || month > 12 || year < 1 || year > 9999) {
                return -1;
            }

            boolean leapYear = isLeapYear(year);

            if (month == 2 && leapYear) {
                return 29;
            }

            switch (month) {
            case 1:
                return 31;
            case 2:
                return 28;
            case 3:
                return 31;
            case 4:
                return 30;
            case 5:
                return 31;
            case 6:
                return 30;
            case 7:
                return 31;
            case 8:
                return 31;
            case 9:
                return 30;
            case 10:
                return 31;
            case 11:
                return 30;
            case 12:
                return 31;
            default:
                return -1;
            }
        }
    }

    // Create a for statement using any range of numbers
    // Determine if the number is a prime number using the isPrime method
    // if it is a prime number, print it out AND increment a count of the
    // number of prime numbers found
    // if that count is 3 exit the for loop
    // hint: use the break; statement to exit

    public class Main {

        public static void main(String[] args) {
            int primeNumbersFound = 0;
            for (int i = 0; i < 10; i++) {
                if (isPrime(i)) {
                    System.out.println(i);
                    primeNumbersFound++;
                }

                if (primeNumbersFound == 3) {
                    break;
                }
            }
        }

        public static boolean isPrime(int n) {
            if (n == 1) {
                return false;
            }

            for (int i = 2; i <= n / 2; i++) {
                if (n % i == 0) {
                    return false;
                }
            }

            return true;
        }

    }

    // Create a for statement using a range of numbers from 1 to 1000 inclusive.

    // Sum all the numbers that can be divided with both 3 and also with 5.

    // For those numbers that met the above conditions, print out the number.

    // break out of the loop once you find 5 numbers that met the above conditions.

    // After breaking out of the loop print the sum of the numbers that met the
    // above conditions.

    // Note: Type all code in main method

    public class Main {

        public static void main(String[] args) {

            int sum = 0;
            int numbersFound = 0;

            for (int i = 1; i <= 1000; i++) {
                if (i % 3 == 0 && i % 5 == 0) {
                    sum += i;
                    numbersFound++;
                    System.out.println(i + " is divisible by 3 and 5");
                }

                if (numbersFound == 5) {
                    break;
                }
            }

            System.out.println("The sum of the numbers found is " + sum);

        }

    }

    // Write a method called isOdd with an int parameter and call it number. The
    // method needs to return a boolean.

    // Check that number is > 0, if it is not return false.

    // If number is odd return true, otherwise return false.

    // Write a second method called sumOdd that has 2 int parameters start and end,
    // which represent a range of numbers.

    // The method should use a for loop to sum all odd numbers in that range
    // including the end and return the sum.

    // It should call the method isOdd to check if each number is odd.

    // The parameter end needs to be greater than or equal to start and both start
    // and end parameters have to be greater than 0.

    // If those conditions are not satisfied return -1 from the method to indicate
    // invalid input.

    // Example input/output:

    // * sumOdd(1, 100); → should return 2500

    // * sumOdd(-1, 100); → should return -1

    // * sumOdd(100, 100); → should return 0

    // * sumOdd(13, 13); → should return 13 (This set contains one number, 13, and
    // it is odd)

    // * sumOdd(100, -100); → should return -1

    // * sumOdd(100, 1000); → should return 247500

    // TIP: use the remainder operator to check if the number is odd

    // NOTE: Both methods needs to be defined as public static like we have been
    // doing so far in the course.
    // NOTE: Do not add a main method to solution code.

    public class SumOddRange {

        public static boolean isOdd(int number) {
            if (number <= 0) {
                return false;
            }

            if (number % 2 != 0) {
                return true;
            }

            return false;
        }

        public static int sumOdd(int start, int end) {
            int sumOfOdd = 0;

            if (end < start || end < 0 || start < 0) {
                return -1;
            }

            for (int i = start; i <= end; i++) {
                if (isOdd(i)) {
                    sumOfOdd += i;
                }
            }

            return sumOfOdd;
        }
    }

    // Write a method with the name sumDigits that has one int parameter called
    // number.

    // If parameter is >= 10 then the method should process the number and return
    // sum of all digits, otherwise return -1 to indicate an invalid value.

    // The numbers from 0-9 have 1 digit so we donft want to process them, also we
    // donft want to process negative numbers, so also return -1 for negative
    // numbers.

    // For example calling the method sumDigits(125) should return 8 since 1 + 2 + 5
    // = 8.

    // Calling the method sumDigits(1) should return -1 as per requirements
    // described above.

    // Add some code to the main method to test out the sumDigits method to
    // determine that it is working correctly for valid and invalid values passed as
    // arguments.

    // Hint:
    // Use n % 10 to extract the least-significant digit.
    // Use n = n / 10 to discard the least-significant digit.
    // The method needs to be static like other methods so far in the course.

    // Tip:
    // Create a project with the name DigitSumChallenge.

public class Main {

    public static void main(String[] args) {
        System.out.println(sumDigits(12345));
    }

    public static int sumDigits ( int number ) {
        int sum = 0;

        while (number > 0) {
            sum += number % 10;
            number = number / 10;
        }


        if ( sum != 0 ){
            return sum;
        } else {
            return -1;
        }

    }
}