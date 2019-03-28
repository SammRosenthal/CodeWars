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