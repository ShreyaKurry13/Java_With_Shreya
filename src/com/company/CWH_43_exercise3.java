package com.company;
import java.util.Scanner;
import java.util.Random;
class Game{
    public int noOfguesses = 0;
    public int userInput;
    public int randomNumber;

    //    Here Random Number Is Generated using random class
    //    Constructor GuessNumGame is going to be created down below
    public Game(){
        Random r = new Random();
        randomNumber = r.nextInt(100);
    }

    //    Method to take user input
     public void takeUserInput(){
         System.out.println("Guess the number: ");
         Scanner sc = new Scanner(System.in);
         userInput = sc.nextInt();
     }

     //  Here create a boolean method to check all the conditions
     public boolean isCorrectNumber(){
        noOfguesses++;
        if (noOfguesses==5){
            System.out.format("Better luck next time, You lost in %d attempts, the number was %d",noOfguesses,randomNumber);
            return true;
        }
        else if(randomNumber == userInput){
            System.out.println("You won!!!!!!!!!!!");
            return true;
        }
        else if(randomNumber > userInput){
            System.out.println("Too less..........");
        }
        else{
            System.out.println("Too high.........");
        }
        return false;
     }
}
public class CWH_43_exercise3 {
    public static void main(String[] args) {
        Game g = new Game();
        boolean b = false;
        while (!b){
            g.takeUserInput();
            b = g.isCorrectNumber();
        }
    }
}