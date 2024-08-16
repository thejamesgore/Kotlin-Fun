fun main() {
/*
    1.
In MaryPoppins.kt, below the initialization of the given variable, reassign the value of word to the result of word.capitalize(). Make sure to do this on one line.

Checkpoint 2 Passed
2.
On the following line, declare a variable, wordSize and initialize it with the result of appending the length property on word.

Next, use a String template or String concatenation within a print statement to output the following text:

[word] has [wordSize] letters.

Replace the brackets with the correct notation.
*/

  var word = "supercalifragilisticexpialidocious"
  
  // Write your code below ☂️

  word = word.capitalize()
  var wordSize = word.length 

  println("$word has $wordSize letters.")
}