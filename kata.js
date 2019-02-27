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
   for (var i = 0; i < array.length; i++) {
      sum = sum + array[i];
   }
   if (sum % 2 === 0) {
      return "even";
   } else {
      return "odd";
   }
}

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
   return Math.ceil(year / 100);
}

// If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.

// Finish the solution so that it returns the sum of all the multiples of 3 or 5 below the number passed in.

// Note: If the number is a multiple of both 3 and 5, only count it once.

function solution(number) {
   let arr = [];
   for (let i = 0; i < number; i++) {
      if (i % 3 == 0 || i % 5 == 0) {
         arr.push(i);
      }
   }
   let sum = arr.reduce((a, b) => a + b, 0);
   return sum;
}

// Easier solution found after the fact...

function solution(number) {
   var sum = 0;

   for (var i = 1; i < number; i++) {
      if (i % 3 == 0 || i % 5 == 0) {
         sum += i;
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
   if (input != null && input != undefined && input.length > 0) {
      for (let i = 0; i < input.length; i++) {
         if (input[i] > 0) {
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

function checkCoupon(enteredCode, correctCode, currentDate, expirationDate) {
   var cr = currentDate.split(",").join("");
   var er = expirationDate.split(",").join("");
   var currentDateDate = new Date(cr);
   var expirationDateDate = new Date(er);
   if (enteredCode !== correctCode) {
      return false;
   }
   if (currentDateDate > expirationDateDate) {
      return false;
   }
   return true;
}

// Return the number (count) of vowels in the given string.

// We will consider a, e, i, o, and u as vowels for this Kata.

// The input string will only consist of lower case letters and/or spaces.

function getCount(str) {
   var vowelsCount = 0;
   for (var i = 0; i < str.length; i++) {
      if (str.charAt(i) == "a") {
         vowelsCount++;
      } else if (str.charAt(i) == "e") {
         vowelsCount++;
      } else if (str.charAt(i) == "i") {
         vowelsCount++;
      } else if (str.charAt(i) == "o") {
         vowelsCount++;
      } else if (str.charAt(i) == "u") {
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
   if (name == "") {
      return "Hello, World!";
   }

   if (name != null || name != undefined) {
      return (
         "Hello, " +
         name.charAt(0).toUpperCase() +
         name.slice(1).toLowerCase() +
         "!"
      );
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

function vowelIndices(word) {
   let vowels = ["a", "e", "i", "o", "u", "y", "A", "E", "I", "O", "U", "Y"];
   let answer = [];
   for (let i = 0; i < word.length; i++) {
      for (let v = 0; v < vowels.length; v++) {
         if (word[i] == vowels[v]) {
            answer.push(i + 1);
         }
      }
   }
   return answer;
}

// You will be given an array and a limit value. You must check that all values in the array are below or equal to the limit value. If they are, return true. Else, return false.

// You can assume all values in the array are numbers.

function smallEnough(a, limit) {
   for (let i = 0; i < a.length; i++) {
      if (a[i] > limit) {
         return false;
      }
   }
   return true;
}

// Write a function called repeatStr which repeats the given string string exactly n times.

function repeatStr(n, s) {
   let repeatedStr = "";
   for (let i = 0; i < n; i++) {
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

   for (let i = 0; i < walk.length; i++) {
      if (walk[i] == "n" || walk[i] == "N") {
         countN++;
      } else if (walk[i] == "s" || walk[i] == "S") {
         countS--;
      } else if (walk[i] == "e" || walk[i] == "E") {
         countE++;
      } else if (walk[i] == "w" || walk[i] == "W") {
         countW--;
      }
   }

   if (countN + countS + countE + countW == 0 && walk.length == 10) {
      return true;
   } else {
      return false;
   }
}

// Make a program that filters a list of strings and returns a list with only your friends name in it.

// If a name has exactly 4 letters in it, you can be sure that it has to be a friend of yours! Otherwise, you can be sure he's not...

// Ex: Input = ["Ryan", "Kieran", "Jason", "Yous"], Output = ["Ryan", "Yous"]

// Note: keep the original order of the names in the output.

function friend(friends) {
   let answer = [];
   for (let i = 0; i < friends.length; i++) {
      if (friends[i].length == 4) {
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

function spinWords(string) {
   let wordArr = string.split(" ");
   for (let i = 0; i < wordArr.length; i++) {
      if (wordArr[i].length > 4) {
         let reverseStr = wordArr[i];
         wordArr[i] = reverseStr
            .split("")
            .reverse()
            .join("");
      }
   }
   return wordArr.join(" ");
}

// Given an array, find the int that appears an odd number of times.

// There will always be only one integer that appears an odd number of times.

function findOdd(A) {
   var count = 0;
   for (var i = 0; i < A.length; i++) {
      for (var j = 0; j < A.length; j++) {
         if (A[i] == A[j]) {
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

function wave(word) {
   let arr = [];
   if (word != null || word != undefined) {
      for (let i = 0; i < word.length; i++) {
         if (word.charAt(i) != " ") {
            let wordArr = word.split("");
            wordArr[i] = word.charAt(i).toUpperCase();
            arr.push(wordArr.join(""));
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

function validParentheses(parens) {
   let arr = parens.split("");
   let left = 0;
   let right = 0;

   if (arr[0] === ")") return false;
   if (arr[arr.length - 1] === "(") return false;

   console.log(parens);
   for (let i = 0; i < arr.length; i++) {
      if (arr[i] === "(") {
         left++;
      } else {
         right++;
      }
   }

   if (left === right) {
      return true;
   } else {
      return false;
   }
}

// Pete likes to bake some cakes. He has some recipes and ingredients. Unfortunately he is not good in maths. Can you help him to find out, how many cakes he could bake considering his recipes?

// Write a function cakes(), which takes the recipe (object) and the available ingredients (also an object) and returns the maximum number of cakes Pete can bake (integer). For simplicity there are no units for the amounts (e.g. 1 lb of flour or 200 g of sugar are simply 1 or 200). Ingredients that are not present in the objects, can be considered as 0.

// Examples:

// // must return 2
// cakes({flour: 500, sugar: 200, eggs: 1}, {flour: 1200, sugar: 1200, eggs: 5, milk: 200});
// // must return 0
// cakes({apples: 3, flour: 300, sugar: 150, milk: 100, oil: 100}, {sugar: 500, flour: 2000, milk: 2000});

function cakes(recipe, available) {
   let recipeKeys = Object.keys(recipe);
   let answer = 0;

   function removeIngredients(recipe, available) {
      console.log("remove is running", answer);
      for (let i = 0; i < recipeKeys.length; i++) {
         if (available[recipeKeys[i]] - recipe[recipeKeys[i]] >= 0) {
            available[recipeKeys[i]] =
               available[recipeKeys[i]] - recipe[recipeKeys[i]];
         } else {
            return null;
         }
      }
      answer++;
      return removeIngredients(recipe, available);
   }

   removeIngredients(recipe, available);

   return answer;
}

// Once upon a time, on a way through the old wild west,…
// … a man was given directions to go from one point to another. The directions were "NORTH", "SOUTH", "WEST", "EAST". Clearly "NORTH" and "SOUTH" are opposite, "WEST" and "EAST" too. Going to one direction and coming back the opposite direction is a needless effort. Since this is the wild west, with dreadfull weather and not much water, it's important to save yourself some energy, otherwise you might die of thirst!

// How I crossed the desert the smart way.
// The directions given to the man are, for example, the following:

// ["NORTH", "SOUTH", "SOUTH", "EAST", "WEST", "NORTH", "WEST"].
// or

// { "NORTH", "SOUTH", "SOUTH", "EAST", "WEST", "NORTH", "WEST" };
// or (haskell)

// [North, South, South, East, West, North, West]
// You can immediatly see that going "NORTH" and then "SOUTH" is not reasonable, better stay to the same place! So the task is to give to the man a simplified version of the plan. A better plan in this case is simply:

// ["WEST"]
// or

// { "WEST" }
// or (haskell)

// [West]
// or (rust)

// [WEST];
// Other examples:
// In ["NORTH", "SOUTH", "EAST", "WEST"], the direction "NORTH" + "SOUTH" is going north and coming back right away. What a waste of time! Better to do nothing.

// The path becomes ["EAST", "WEST"], now "EAST" and "WEST" annihilate each other, therefore, the final result is [] (nil in Clojure).

// In ["NORTH", "EAST", "WEST", "SOUTH", "WEST", "WEST"], "NORTH" and "SOUTH" are not directly opposite but they become directly opposite after the reduction of "EAST" and "WEST" so the whole path is reducible to ["WEST", "WEST"].

// Task
// Write a function dirReduc which will take an array of strings and returns an array of strings with the needless directions removed (W<->E or S<->N side by side).

// The Haskell version takes a list of directions with data Direction = North | East | West | South. The Clojure version returns nil when the path is reduced to nothing. The Rust version takes a slice of enum Direction {NORTH, SOUTH, EAST, WEST}.

// Examples
// dirReduc(["NORTH", "SOUTH", "SOUTH", "EAST", "WEST", "NORTH", "WEST"]) => ["WEST"]
// dirReduc(["NORTH", "SOUTH", "SOUTH", "EAST", "WEST", "NORTH"]) => []
// See more examples in "Example Tests"
// Note
// Not all paths can be made simpler. The path ["NORTH", "WEST", "SOUTH", "EAST"] is not reducible. "NORTH" and "WEST", "WEST" and "SOUTH", "SOUTH" and "EAST" are not directly opposite of each other and can't become such. Hence the result path is itself : ["NORTH", "WEST", "SOUTH", "EAST"].

function dirReduc(arr) {
   for (let i = 0; i < arr.length; i++) {
      if (arr[i] === "NORTH" && arr[i + 1] === "SOUTH") {
         arr.splice(i, 2);
         i--;
      }

      if (arr[i] === "SOUTH" && arr[i + 1] === "NORTH") {
         arr.splice(i, 2);
         i--;
      }

      if (arr[i] === "EAST" && arr[i + 1] === "WEST") {
         arr.splice(i, 2);
         i--;
      }

      if (arr[i] === "WEST" && arr[i + 1] === "EAST") {
         arr.splice(i, 2);
         i--;
      }
   }

   for (let i = 0; i < arr.length; i++) {
      if (arr[i] === "NORTH" && arr[i + 1] === "SOUTH") {
         arr.splice(i, 2);
         i--;
      }

      if (arr[i] === "SOUTH" && arr[i + 1] === "NORTH") {
         arr.splice(i, 2);
         i--;
      }

      if (arr[i] === "EAST" && arr[i + 1] === "WEST") {
         arr.splice(i, 2);
         i--;
      }

      if (arr[i] === "WEST" && arr[i + 1] === "EAST") {
         arr.splice(i, 2);
         i--;
      }
   }
   return arr;
}

// You are given an array (which will have a length of at least 3, but could be very large) containing integers. The array is either entirely comprised of odd integers or entirely comprised of even integers except for a single integer N. Write a method that takes the array as an argument and returns this "outlier" N.

// Examples
// [2, 4, 0, 100, 4, 11, 2602, 36]
// Should return: 11 (the only odd number)

// [160, 3, 1719, 19, 11, 13, -21]
// Should return: 160 (the only even number)

function findOutlier(integers) {
   let even = [];
   let odd = [];

   for (let i = 0; i <= integers.length - 1; i++) {
      if (integers[i] % 2 === 0) {
         even.push(integers[i]);
      } else {
         odd.push(integers[i]);
      }
   }

   if (even.length === 1) {
      return even[0];
   } else {
      return odd[0];
   }
}

// Polycarpus works as a DJ in the best Berland nightclub, and he often uses dubstep music in his performance. Recently, he has decided to take a couple of old songs and make dubstep remixes from them.

// Let's assume that a song consists of some number of words (that don't contain WUB). To make the dubstep remix of this song, Polycarpus inserts a certain number of words "WUB" before the first word of the song (the number may be zero), after the last word (the number may be zero), and between words (at least one between any pair of neighbouring words), and then the boy glues together all the words, including "WUB", in one string and plays the song at the club.

// For example, a song with words "I AM X" can transform into a dubstep remix as "WUBWUBIWUBAMWUBWUBX" and cannot transform into "WUBWUBIAMWUBX".

// Recently, Jonny has heard Polycarpus's new dubstep track, but since he isn't into modern music, he decided to find out what was the initial song that Polycarpus remixed. Help Jonny restore the original song.

// Input
// The input consists of a single non-empty string, consisting only of uppercase English letters, the string's length doesn't exceed 200 characters

// Output
// Return the words of the initial song that Polycarpus used to make a dubsteb remix. Separate the words with a space.

// Examples
// songDecoder("WUBWEWUBAREWUBWUBTHEWUBCHAMPIONSWUBMYWUBFRIENDWUB")
//   // =>  WE ARE THE CHAMPIONS MY FRIEND

function songDecoder(song) {
   let noWub = song.replace(/WUB/gi, " ");
   return noWub.replace(/[ ]{2,}/gi, " ").trim();
}

// You probably know the "like" system from Facebook and other pages. People can "like" blog posts, pictures or other items. We want to create the text that should be displayed next to such an item.

// Implement a function likes :: [String] -> String, which must take in input array, containing the names of people who like an item. It must return the display text as shown in the examples:

// likes [] // must be "no one likes this"
// likes ["Peter"] // must be "Peter likes this"
// likes ["Jacob", "Alex"] // must be "Jacob and Alex like this"
// likes ["Max", "John", "Mark"] // must be "Max, John and Mark like this"
// likes ["Alex", "Jacob", "Mark", "Max"] // must be "Alex, Jacob and 2 others like this"
// For 4 or more names, the number in and 2 others simply increases.

function likes(names) {
   if (!names.length) {
      return "no one likes this";
   } else if (names.length === 1) {
      return `${names[0]} likes this`;
   } else if (names.length === 2) {
      return `${names[0]} and ${names[1]} like this`;
   } else if (names.length === 3) {
      return `${names[0]}, ${names[1]} and ${names[2]} like this`;
   } else {
      return `${names[0]}, ${names[1]} and ${names.length -
         2} others like this`;
   }
}
