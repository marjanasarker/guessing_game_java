import java.util.Scanner;
import java.util.Random;


public class Game {
  public static void main(String[] args){

    int max = 100;
    int min = 1;

    Scanner input = new Scanner(System.in);
    System.out.println("Howdy! What's your name?");

    String userName = input.next();
    System.out.println("Username is: " + userName);

    
    System.out.println("User guess is:" );

    Random rand = new Random();
    //int number = rand.nextInt(100);
    int randomNum = rand.nextInt(max + 1 - min) + min;
    int userGuess;
    do{
      System.out.println("Guess a number");

      userGuess = input.nextInt();
      if (userGuess == randomNum){
        System.out.println("Correct number!");
      
      }else if (userGuess > randomNum){
        System.out.println("Guess lower!");
      }else{
        System.out.println("Guess higher!");
      }
      
    }while (userGuess != randomNum);

  }

}