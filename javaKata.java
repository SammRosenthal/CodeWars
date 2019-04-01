// Write a method named area with one double parameter named radius.
// The method needs to return a double value that represents the area of a circle.
// If the parameter radius is negative then return -1.0 to represent an invalid value.
// Write another overloaded method with 2 parameters x and y (both doubles), where x and y represent the sides of a rectangle.
// The method needs to return an area of a rectangle.
// If either or both parameters is/are a negative return -1.0 to indicate an invalid value.
// For formulas and PI value please check the tips below.
// Examples of input/output:
// * area(5.0); should return 78.53975
// * area(-1);  should return -1 since the parameter is negative
// * area(5.0, 4.0); should return 20.0 (5 * 4 = 20)
// * area(-1.0, 4.0);  should return -1 since first the parameter is negative

// TIP: The formula for calculating the area of a rectangle is x * y.
// TIP: The formula for calculating a circle area is radius * radius * PI.
// TIP: For PI use a constant from Math class e.g. Math.PI
// NOTE: All methods need to be defined as public static like we have been doing so far in the course.
// NOTE: Do not add a main method to your solution code!

public class AreaCalculator {
    public static double area (double radius) {
        if (radius < 0) {
            return -1.0;
        }
        
        return radius * radius * Math.PI;
    }
    
    public static double area (double x, double y) {
        if (x < 0 || y < 0) {
            return -1.0;
        }
        
        return x * y;
    }
}


// COUNT THE SMILEYS JAVA
// Description:
// Given an array (arr) as an argument complete the function countSmileys that should return the total number of smiling faces.
// Rules for a smiling face:
// -Each smiley face must contain a valid pair of eyes. Eyes can be marked as : or ;
// -A smiley face can have a nose but it does not have to. Valid characters for a nose are - or ~
// -Every smiling face must have a smiling mouth that should be marked with either ) or D.
// No additional characters are allowed except for those mentioned.
// Valid smiley face examples:
// :) :D ;-D :~)
// Invalid smiley faces:
// ;( :> :} :] 

// Example cases:

// countSmileys([':)', ';(', ';}', ':-D']);       // should return 2;
// countSmileys([';D', ':-(', ':-)', ';~)']);     // should return 3;
// countSmileys([';]', ':[', ';*', ':$', ';-D']); // should return 1;

// Note: In case of an empty array return 0. You will not be tested with invalid input (input will always be an array). Order of the face (eyes, nose, mouth) elements will always be the same
// Happy coding!


public class SmileFaces {
  
  public static int countSmileys(List<String> arr) {
    int smileyCount = 0;
      for (String smiley : arr) {
    System.out.println(smiley);
        if (smiley.length() < 3 ) {
       
          if( (Character.toString(smiley.charAt(0)).compareTo(":") == 0) || (Character.toString(smiley.charAt(0)).compareTo(";") == 0) ) {
        
            if ( (smiley.length() == 2) && (Character.toString(smiley.charAt(1)).compareTo(")") == 0) || (Character.toString(smiley.charAt(1)).compareTo("D") == 0) ) {
          
              System.out.println("passed");
              smileyCount++;
            }
          }
        } else {
          if (smiley.length() < 4) {
            if( (Character.toString(smiley.charAt(0)).compareTo(":") == 0) || (Character.toString(smiley.charAt(0)).compareTo(";") == 0) ) {
              if ( (Character.toString(smiley.charAt(1)).compareTo("-") == 0) || (Character.toString(smiley.charAt(1)).compareTo("~") == 0) ) {
                if ( (Character.toString(smiley.charAt(2)).compareTo(")") == 0) || (Character.toString(smiley.charAt(2)).compareTo("D") == 0)) {
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
// The method should not return anything (void) and it needs to calculate the years and days from the minutes parameter.
// If the parameter is less than 0, print text "Invalid Value".
// Otherwise, if the parameter is valid then it needs to print a message in the format "XX min = YY y and ZZ d".
// XX represents the original value minutes.
// YY represents the calculated years.
// ZZ represents the calculated days.


// EXAMPLES OF INPUT/OUTPUT:
// * printYearsAndDays(525600);  → should print "525600 min = 1 y and 0 d"
// * printYearsAndDays(1051200); → should print "1051200 min = 2 y and 0 d"
// * printYearsAndDays(561600);  → should print "561600 min = 1 y and 25 d"


// TIPS:
// * Be extra careful about spaces in the printed message.
// * Use the remainder operator
// * 1 hour = 60 minutes
// * 1 day = 24 hours
// * 1 year = 365 days

// NOTES
// * The printYearsAndDays method needs to be defined as public static like we have been doing so far in the course.
// * Do not add main method to solution code.
// * The solution will not be accepted if there are extra spaces

public class MinutesToYearsDaysCalculator {
    public static void printYearsAndDays (long minutes){
        
        if (minutes < 0) { 
            System.out.println("Invalid Value"); 
            return ;
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


// Write a method printEqual with 3 parameters of type int. The method should not return anything (void).
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
// * The method printEqual needs to be defined as public static like we have been doing so far in the course.
// * Do not add main method to solution code.

public class IntEqualityPrinter {
    public static void printEqual (int x, int y, int z) {
        if (x < 0 || y < 0 || z < 0) {
            System.out.println("Invalid Value");
            return ;
        }
        
        if (x == y && x == z && y == z) {
            System.out.println("All numbers are equal");
            return ;
        }
        
        if ( x != y && x != z && y != z) {
            System.out.println("All numbers are different");
            return ;
        }
        
        System.out.println("Neither all are equal or different");
    }
}


// The cats spend most of the day playing. In particular, they play if the temperature is between 25 and 35 (inclusive). Unless it is summer, then the upper limit is 45 (inclusive) instead of 35.

// Write a method isCatPlaying that has 2 parameters. Method needs to return true if the cat is playing, otherwise return false

// 1st parameter should be of type boolean and be named summer it represents if it is summer.
// 2nd parameter represents the temperature and is of type int with the name temperature.

// EXAMPLES OF INPUT/OUTPUT:
// * isCatPlaying(true, 10); should return false since temperature is not in range 25 - 45 
// * isCatPlaying(false, 36); should return false since temperature is not in range 25 - 35 (summer parameter is false)
// * isCatPlaying(false, 35); should return true since temperature is in range 25 - 35 

// NOTES
// * The isCatPlaying method needs to be defined as public static like we have been do

public class PlayingCat {
    public static boolean isCatPlaying(boolean summer, int temperature){
        if (summer && temperature >= 25 && temperature <= 45) {
            return true;
        } else if (!summer && temperature >= 25 && temperature <= 35) {
            return true;
        } else {
            return false;
        }
    }
}


// Write a switch statement that checks for letters between A - D inclusive

char switchChar = 'A';

        switch (switchChar) {
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

  public static void printDayOfTheWeek(int day){
      switch(day){
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

  public static void printDayOfTheWeekElse(int day){
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


// Write a method called printNumberInWord. The method has one parameter number which is the whole number. The method needs to print "ZERO", "ONE", "TWO", ... "NINE", "OTHER" if the int parameter number is 0, 1, 2, .... 9 or other for any other number including negative numbers. You can use if-else statement or switch statement whatever is easier for you.


// NOTE: Method printNumberInWord needs to be public static for now, we are only using static methods.

// NOTE: Do not add main method to solution code.

public class NumberInWord {
    public static void printNumberInWord(int num){
        switch(num){
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

// The parameter needs to be greater than or equal to 1 and less than or equal to 9999.

// If the parameter is not in that range return false. 

// Otherwise, if it is in the valid range, calculate if the year is a leap year and return true if it is, otherwise return false. 

// A year is a leap year if it is divisible by 4 but not by 100, or it is divisible by 400.

// Examples of input/output:

// * isLeapYear(-1600); →  should return false since the parameter is not in the range (1-9999)

// * isLeapYear(1600); → should return true since 1600 is a leap year

// * isLeapYear(2017); → should return false since 2017 is not a leap year

// * isLeapYear(2000); → should return true because 2000 is a leap year 

// ​NOTE:  The solution to the Leap Year coding exercise earlier in the course created the isLeapYear method. You can use that solution if you wish.

// Write another method getDaysInMonth with two parameters month and year.  ​Both of type int.

// If parameter month is < 1 or > 12 return -1. ​
// If parameter year is < 1 or > 9999 then return -1.

// This method needs to return the number of days in the month. Be careful about leap years they have 29 days in month 2 (February).

// You should check if the year is a leap year using the method isLeapYear described above.

// Examples of input/output:

// * getDaysInMonth(1, 2020); → should return 31 since January has 31 days.

// * getDaysInMonth(2, 2020); → should return 29 since February has 29 days in a leap year and 2020 is a leap year.

// * getDaysInMonth(2, 2018); → should return 28 since February has 28 days if it's not a leap year and 2018 is not a leap year.

// * getDaysInMonth(-1, 2020); → should return -1 since the parameter month is invalid.

// * getDaysInMonth(1, -2020); → should return -1 since the parameter year is outside the range of 1 to 9999.


// HINT: Use the switch statement.

// NOTE: Methods isLeapYear and getDaysInMonth need to be public static like we have been doing so far in the course.

// NOTE: Do not add a main method to solution code.

public class NumberOfDaysInMonth {
    public static boolean isLeapYear(int year){
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
    
    public static int getDaysInMonth(int month, int year){
        if (month < 1 || month > 12 || year < 1 || year > 9999) {
            return -1;
        }
        
        boolean leapYear = isLeapYear(year);
        
        if (month == 2 && leapYear) {
            return 29;
        }
        
        switch(month){
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


//    Create a for statement using any range of numbers
//    Determine if the number is a prime number using the isPrime method
//    if it is a prime number, print it out AND increment a count of the
//    number of prime numbers found
//    if that count is 3 exit the for loop
//    hint: use the break; statement to exit

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

         for (int i=2; i <= n/2; i++) {
             if(n % i == 0){
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

// After breaking out of the loop print the sum of the numbers that met the above conditions.

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

            if (numbersFound == 5){
                break;
            }
        }

        System.out.println("The sum of the numbers found is " + sum);

    }

}


// Write a method called isOdd with an int parameter and call it number. The method needs to return a boolean.

// Check that number is > 0, if it is not return false.

// If number is odd return true, otherwise  return false.

// Write a second method called sumOdd that has 2 int parameters start and end, which represent a range of numbers.

// The method should use a for loop to sum all odd numbers  in that range including the end and return the sum.

// It should call the method isOdd to check if each number is odd.

// The parameter end needs to be greater than or equal to start and both start and end parameters have to be greater than 0.

// If those conditions are not satisfied return -1 from the method to indicate invalid input. 

// Example input/output:

// * sumOdd(1, 100); → should return 2500

// * sumOdd(-1, 100); →  should return -1

// * sumOdd(100, 100); → should return 0

// * sumOdd(13, 13); → should return 13 (This set contains one number, 13, and it is odd)

// * sumOdd(100, -100); → should return -1

// * sumOdd(100, 1000); → should return 247500


// TIP: use the remainder operator to check if the number is odd

// NOTE: Both methods  needs to be defined as public static like we have been doing so far in the course.
// NOTE: Do not add a  main method to solution code.

public class SumOddRange {

    public static boolean isOdd (int number) {
        if (number <= 0) {
            return false;
        }
        
        if (number % 2 != 0) {
            return true;
        }
        
        return false;
    }
    
    public static int sumOdd(int start, int end){
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