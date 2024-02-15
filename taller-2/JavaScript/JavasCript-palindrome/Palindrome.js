function palindrome(word) {
     var reversed_word = "";
 
     for (var i = word.length - 1; i >= 0; i--) {
         reversed_word += word.charAt(i);
     }
 
     if (reversed_word === word) {
         return "palindrome";
     } else {
         return "Not palindrome";
     }
 }
 
 console.log(palindrome("ala"));
 