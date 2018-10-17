// Task:
// Given an array of numbers (a list in groovy), determine whether the sum of all of the numbers is odd or even.

// Give your answer in string format as 'odd' or 'even'.

// If the input array is empty consider it as: [0] (array with a zero).

// Example:
// oddOrEven([0]) returns "even"
// oddOrEven([2, 5, 34, 6]) returns "odd"
// oddOrEven([0, -1, -5]) returns "even"

function oddOrEven(array) {
    var sum = 0;
    for(var i = 0; i < array.length; i++){
      sum = sum + array[i];
    }
    if (sum%2 === 0){
      return "even"
    } else {
      return "odd"
      }
 };


//  Introduction
//  The first century spans from the year 1 up to and including the year 100, The second - from the year 101 up to and including the year 200, etc.
 
//  Task :
//  Given a year, return the century it is in.
 
//  Input , Output Examples ::
//  centuryFromYear(1705)  returns (18)
//  centuryFromYear(1900)  returns (19)
//  centuryFromYear(1601)  returns (17)
//  centuryFromYear(2000)  returns (20)
//  Hope you enjoy it .. Awaiting for Best Practice Codes
 
//  Enjoy Learning !!!

function century(year) {
    return Math.ceil(year/100);
};
