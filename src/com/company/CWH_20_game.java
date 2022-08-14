package com.company;

import java.util.Scanner;
import java.util.Random;

public class CWH_20_game {
    public static void main(String[] args) {

        System.out.println("********WELCOME TO THIS GAME!!********");
        System.out.println("***ROCK PAPER SCISSOR***");

        System.out.println("\nPlease choose : \n\t0.ROCK\n\t1.PAPER\n\t2.SCISSOR");

        Scanner sc = new Scanner(System.in);
        Random ra = new Random();

        System.out.print("\nIt's your turn:");
        int user_input = sc.nextInt();
        switch (user_input)
        {
            case 0:
                System.out.println("You selected ROCK");
                break;

            case 1:
                System.out.println("You selected ROCK");
                break;
            case 2:
                System.out.println("You selected ROCK");
                break;
        }

        System.out.print("\nIt's Computer's turn:");
        int computer_input = ra.nextInt(3);
        System.out.println(computer_input);
        switch (computer_input)
        {
            case 0:
                System.out.println("They selected ROCK");
                break;

            case 1:
                System.out.println("They selected ROCK");
                break;
            case 2:
                System.out.println("They selected ROCK");
                break;
        }

        if (user_input==computer_input)
        {
            System.out.println("\nOoops! Match draw");
        }
        else if (user_input==0 && computer_input==1)
        {
            System.out.println("\nComputer won");
            System.out.println("You lost,better luck next time :(");
        }
        else if (user_input==1 && computer_input==2)
        {
            System.out.println("\nComputer won");
            System.out.println("You lost,better luck next time :(");
        }
        else if (user_input==2 && computer_input==0)
        {
            System.out.println("\nComputer won");
            System.out.println("You lost,better luck next time :(");
        }
        else if (user_input==0 && computer_input==2)
        {
            System.out.println("\nCongratulatios! You won :)");
        }
        else if (user_input==2 && computer_input==1)
        {
            System.out.println("\nCongratulatios! You won :)");
        }
        else if (user_input==1 && computer_input==0)
        {
            System.out.println("\nCongratulatios! You won :)");
        }


        System.out.println("\nThankyou for participating :)");

    }
}
