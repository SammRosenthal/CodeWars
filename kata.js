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


// We want to know the index of the vowels in a given word, for example, there are two vowels in the word super (the second and fourth letters).

// So given a string "super", we should return a list of [2, 4].

// Some examples:
// Mmmm  => []
// Super => [2,4]
// Apple => [1,5]
// YoMama -> [1,2,4,6]
// NOTE: Vowels in this context refers to English Language Vowels - a e i o u y

// NOTE: this is indexed from [1..n] (not zero indexed!)

function vowelIndices(word){
  let vowels = ["a", "e", "i", "o", "u", "y", "A", "E", "I", "O", "U", "Y"]
  let answer = [];
  for ( let i = 0; i < word.length; i++ ) {
    for ( let v = 0; v < vowels.length; v++ ) {
      if ( word[i] == vowels[v] ) {
        answer.push(i+1);
      }
    }
  }
  return answer;
}


// You will be given an array and a limit value. You must check that all values in the array are below or equal to the limit value. If they are, return true. Else, return false.

// You can assume all values in the array are numbers.

function smallEnough(a, limit){
  for ( let i = 0; i < a.length; i++ ) {
    if (a[i] > limit) {
      return false;
    }
  }
  return true;
}


// Write a function called repeatStr which repeats the given string string exactly n times.

function repeatStr (n, s) {
  let repeatedStr = '';
  for(let i = 0; i < n; i++) {
    repeatedStr = repeatedStr.concat(s);
    }
  return repeatedStr;
}


// You live in the city of Cartesia where all roads are laid out in a perfect grid. You arrived ten minutes too early to an appointment, so you decided to take the opportunity to go for a short walk. The city provides its citizens with a Walk Generating App on their phones -- everytime you press the button it sends you an array of one-letter strings representing directions to walk (eg. ['n', 's', 'w', 'e']). You always walk only a single block in a direction and you know it takes you one minute to traverse one city block, so create a function that will return true if the walk the app gives you will take you exactly ten minutes (you don't want to be early or late!) and will, of course, return you to your starting point. Return false otherwise.
// Note: you will always receive a valid array containing a random assortment of direction letters ('n', 's', 'e', or 'w' only). It will never give you an empty array (that's not a walk, that's standing still!).

function isValidWalk(walk) {
  
  let countN = 0;
  let countS = 0;
  let countE = 0;
  let countW = 0;
  
  for ( let i = 0; i < walk.length; i++ ) {
    if ( walk[i] == 'n' || walk[i] == 'N' ) {
      countN++;
    } else if ( walk[i] == 's' || walk[i] == 'S' ) {
      countS--;
    } else if ( walk[i] == 'e' || walk[i] == 'E' ) {
      countE++;
    } else if ( walk[i] == 'w' || walk[i] == 'W' ) {
      countW--;
    }
  }
  
  if ( countN + countS + countE + countW == 0 && walk.length == 10 ) {
    return true;
  } else {
    return false;
  }
}


// Make a program that filters a list of strings and returns a list with only your friends name in it.

// If a name has exactly 4 letters in it, you can be sure that it has to be a friend of yours! Otherwise, you can be sure he's not...

// Ex: Input = ["Ryan", "Kieran", "Jason", "Yous"], Output = ["Ryan", "Yous"]

// Note: keep the original order of the names in the output.

function friend(friends){
  let answer = [];
  for ( let i = 0; i < friends.length; i++ ) {
    if ( friends[i].length == 4 ) {
      answer.push(friends[i]);
    }
  }
  return answer;
}


// Write a function that takes in a string of one or more words, and returns the same string, but with all five or more letter words reversed (Just like the name of this Kata). Strings passed in will consist of only letters and spaces. Spaces will be included only when more than one word is present.

// Examples:

// spinWords( "Hey fellow warriors" ) => returns "Hey wollef sroirraw" 
// spinWords( "This is a test") => returns "This is a test" 
// spinWords( "This is another test" )=> returns "This is rehtona test"

function spinWords(string){
  let wordArr = string.split(' ')
  for ( let i = 0; i < wordArr.length; i++) {
      if ( wordArr[i].length > 4 ) {
         let reverseStr = wordArr[i];
         wordArr[i] = reverseStr.split('').reverse().join('')
          
      }
  }
  return wordArr.join(" ");
}


// Given an array, find the int that appears an odd number of times.

// There will always be only one integer that appears an odd number of times.

function findOdd(A) { 
  var count = 0;
  for(var i = 0; i < A.length; i++) {
    for(var j = 0; j < A.length; j++) {
          if(A[i] == A[j]) {
            count++;
          }
        }
    if (count % 2 !== 0) {
        return A[i];
    }
  }
  count = 0;
}


// Task
//  	In this simple Kata your task is to create a function that turns a string into a Mexican Wave. You will be passed a string and you must return that string in an array where an uppercase letter is a person standing up.
// Rules
//  	1.  The input string will always be lower case but maybe empty.

// 2.  If the character in the string is whitespace then pass over it as if it was an empty seat.
// Example
// wave("hello") => ["Hello", "hEllo", "heLlo", "helLo", "hellO"]
// Good luck and enjoy!

function wave(word){
  let arr = [];
  if ( word != null || word != undefined ) {
      for ( let i = 0; i < word.length; i++ ) {
          if (word.charAt(i) != ' ') {
              let wordArr = word.split('');
              wordArr[i] = word.charAt(i).toUpperCase();
              arr.push(wordArr.join(''));
          }    
      }
  }
  return arr;
}


// Write a function called that takes a string of parentheses, and determines if the order of the parentheses is valid. The function should return true if the string is valid, and false if it's invalid.

// Examples
// "()"              =>  true
// ")(()))"          =>  false
// "("               =>  false
// "(())((()())())"  =>  true
// Constraints
// 0 <= input.length <= 100

function validParentheses(parens){
  let arr = parens.split("");
  let left = 0;
  let right = 0;
  
  if (arr[0] === ")") return false;
  if (arr[arr.length - 1] === "(") return false;
  
  console.log(parens)
  for (let i = 0; i < arr.length; i++){
    if (arr[i] === "(") {
      left++
    } else {
      right++
    }
  }
  
  if (left === right) {
    return true
  } else {
    return false
  }
}
