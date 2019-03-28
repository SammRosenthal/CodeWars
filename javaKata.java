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

import java.util.*;

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