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


// If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.

// Finish the solution so that it returns the sum of all the multiples of 3 or 5 below the number passed in.

// Note: If the number is a multiple of both 3 and 5, only count it once.

function solution(number){
    let arr = [];
    for (let i = 0; i < number; i++) {
      if (i % 3 == 0 || i % 5 == 0) {
        arr.push(i);
      }
    }
    let sum = arr.reduce((a,b) => a+b, 0);
    return sum;
  }

  // Easier solution found after the fact...

  function solution(number){
    var sum = 0;
    
    for(var i = 1;i< number; i++){
      if(i % 3 == 0 || i % 5 == 0){
        sum += i
      }
    }
    return sum;
  }


//   Given an array of integers.

//   Return an array, where the first element is the count of positives numbers and the second element is sum of negative numbers.
  
//   If the input array is empty or null, return an empty array.
  
//   Example
//   For input [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14, -15], you should return [10, -65].

function countPositivesSumNegatives(input) {  
let positiveSum = 0;
let negativeSum = 0;
if (input != null && input != undefined && input.length > 0){
  for (let i = 0; i < input.length; i++){
    if(input[i] > 0) {
      positiveSum += 1;
    } else if (input[i] < 0) {
      negativeSum += input[i];
    }   
  }
} else {    
  return [];  
} 
return [positiveSum, negativeSum];  
}


// Your online store likes to give out coupons for special occasions. Some customers try to cheat the system by entering invalid codes or using expired coupons.

// Your mission: 
// Write a function called checkCoupon to verify that a coupon is valid and not expired. If the coupon is good, return true. Otherwise, return false.

// A coupon expires at the END of the expiration date. All dates will be passed in as strings in this format: "June 15, 2014"

function checkCoupon(enteredCode, correctCode, currentDate, expirationDate){
  var cr = currentDate.split(',').join('')
  var er = expirationDate.split(',').join('')
  var currentDateDate = new Date(cr);
  var expirationDateDate = new Date(er);
  if(enteredCode !== correctCode)  {
    return false;
  }if(currentDateDate > expirationDateDate){
    return false;
  }
  return true
}


// Return the number (count) of vowels in the given string.

// We will consider a, e, i, o, and u as vowels for this Kata.

// The input string will only consist of lower case letters and/or spaces.

function getCount(str) {
  var vowelsCount = 0;
     for (var i = 0; i < str.length; i++) {
       if ( str.charAt(i) == 'a') {
         vowelsCount++;
       } else if ( str.charAt(i) == 'e' ) {
         vowelsCount++;
       } else if ( str.charAt(i) == 'i' ) {
         vowelsCount++;
       } else if ( str.charAt(i) == 'o' ) {
        vowelsCount++;
       } else if ( str.charAt(i) == 'u' ) {
         vowelsCount++;
       }
     }
  return vowelsCount;
 }


//  Define a method hello that returns "Hello, Name!" to a given name, or says Hello, World! if name is not given (or passed as an empty String).

//  Assuming that name is a String and it checks for user typos to return a name with a first capital letter (Xxxx).
 
//  Examples:
 
//  hello "john"   => "Hello, John!"
//  hello "aliCE"  => "Hello, Alice!"
//  hello          => "Hello, World!" # name not given
//  hello ''       => "Hello, World!" # name is an empty String

 function hello(name) {
  if (name == ''){
    return "Hello, World!";
  }

  if(name != null || name != undefined){
    return "Hello, " + name.charAt(0).toUpperCase() + name.slice(1).toLowerCase() + "!";
    } else {
    return "Hello, World!";
    }
}