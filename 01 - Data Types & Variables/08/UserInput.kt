fun main() {

/*

In order to work with user input, the output terminal on the right side of our screen has been changed to a terminal running the Bash shell. We use this new terminal to type input into our program as well as use it to compile and run our program.

In order to run our program in this exercise we will follow these 3 steps:

Click the Run button when the code is complete
Use the following command in the terminal:
kotlinc myCode.kt -include-runtime -d myCode.jar

Followed by this final command:
java -jar myCode.jar

The first step ensures the Kotlin file is saved. The second step compiles the Kotlin file, myCode.kt, into bytecode and saves it in a .jar file. The third step runs the compiled application.

*/

  println("Please type your name and hit Enter.")
  // Write your code below
  val myName = readLine()
  
  println("Your name is $myName!")
}