package com.company;
import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        System.out.println("0 is for Rock");
        System.out.println("1 is for Paper");
        System.out.println("2 is for Scissor");

        int myChoice=0;
        int computerChoice;
        int myTotalWin = 0;
        int computerTotalWin = 0;
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);

        while(myChoice != -1)
        {
            System.out.print("Enter Your Choice (Press -1 for Exit) : ");
            myChoice = sc.nextInt();

            switch (myChoice)
            {
                case 0:
                    System.out.println("you choose Rock");
                    break;
                case 1:
                    System.out.println("you choose Paper");
                    break;
                case 2:
                    System.out.println("you choose Scissor");
                    break;
                case -1:
                    break;
                default:
                    System.out.println("Invalid Choice");
                    break;
            }

            computerChoice = rand.nextInt(3);

            switch (computerChoice)
            {
                case 0:
                    System.out.println("Computer choose Rock");
                    break;
                case 1:
                    System.out.println("Computer choose Paper");
                    break;
                case 2:
                    System.out.println("Computer choose Scissor");
                    break;
            }

            if(myChoice == 0 && computerChoice == 0)
            {
                System.out.println("Match Tie");
            }
            else if (myChoice == 0 && computerChoice == 1)
            {
                System.out.println("Computer Won!");
                computerTotalWin++;
            }
            else if (myChoice == 0 && computerChoice == 2)
            {
                System.out.println("You Won!");
                myTotalWin++;
            }
            else if (myChoice == 1 && computerChoice == 0)
            {
                System.out.println("You Won!");
                myTotalWin++;
            }
            else if (myChoice == 1 && computerChoice == 1)
            {
                System.out.println("Match Tie");
            }
            else if (myChoice == 1 && computerChoice == 2)
            {
                System.out.println("Computer Won!");
                computerTotalWin++;
            }
            else if (myChoice == 2 && computerChoice == 0)
            {
                System.out.println("Computer Won!");
                computerTotalWin++;
            }
            else if (myChoice == 2 && computerChoice == 1)
            {
                System.out.println("You Won!");
                myTotalWin++;
            }
            else if (myChoice == 2 && computerChoice == 2)
            {
                System.out.println("Match Tie");
            }

            System.out.println("--------------------------------------------");
        }
        System.out.println("--------------------------------------------");
        System.out.println("Total Computer Wins : "+computerTotalWin);
        System.out.println("Total You Wins : "+myTotalWin);
    }
}
