package com.kodilla.rps;

import java.util.Scanner;

import static com.kodilla.rps.Command.*;

public class RpsRunner {
    public static void main(String[] args) {
        System.out.println(ANSI_PURPLE+ "PAPER SCISSORS ROCK GAME" );

        int[] valuesTable;
        Scanner table = new Scanner(System.in);

        System.out.println(ANSI_BLUE+"How many games you want to play: ");
        int gamesValue = table.nextInt();
        valuesTable = new int[ gamesValue];

        for(int i=0; i<valuesTable.length; i++)
            valuesTable[i] = i+1;

        int licznik=0;
        while(licznik<valuesTable.length){
            licznik++;
        }
        System.out.println(ANSI_BLUE+"Insert nickname and press Enter");


        Scanner scanner = new Scanner(System.in);

            int playerWins = 0;
            int computerWins = 0;
            int games = 1;

            scanner.nextLine();

            while (games <=  gamesValue+1) {
                System.out.println("Round " + games);
                games++;

                if (games ==  gamesValue+1) {
                    System.out.println(ANSI_GREEN+"player wins count is  " + playerWins + "\n" + ANSI_RED+ "computer wins count is " + computerWins);
                    System.out.println(ANSI_BLUE+"To quit the game, please press 'x'. To restart the game, please press 'n'.");
                    String line = scanner.nextLine();
                    if (line.equals("x")) {
                        System.out.println("Are you sure about that? Press y or n");
                        String areYouSure = scanner.nextLine();
                        if (areYouSure.equals("y")) {
                            break;

                        }

                    } else if (line.equals("n")) {
                        System.out.println("Restarting the game");
                        playerWins = 0;
                        computerWins = 0;
                        games = 1;
                        continue;
                    }

                }


                System.out.println("Please choose rock press 1, paper press 2 ,scissors press 3");
                System.out.println(ANSI_GREEN+"player wins " + playerWins + "\n" + ANSI_RED+"computer wins " + computerWins);

                String line = scanner.nextLine();
                Command command = Command.of(line);
                Command computer = aIcommand();


                if (draw(command, computer)) {
                    System.out.println(ANSI_YELLOW+"Draw");
                } else if (command == SCISSORS) {
                    if (computer == ROCK) {
                        System.out.println(ANSI_RED+"Computer wins");
                        computerWins++;
                    } else if (computer == PAPER) {
                        System.out.println(ANSI_GREEN+"Player wins");
                        playerWins++;
                    }
                } else if (command == ROCK) {
                    if (computer == PAPER) {
                        System.out.println(ANSI_RED+"Computer wins");
                        computerWins++;
                    } else if (computer == SCISSORS) {
                        System.out.println(ANSI_GREEN+"Player wins");
                        playerWins++;
                    }
                } else if (command == PAPER) {
                    if (computer == SCISSORS) {
                        System.out.println(ANSI_RED+"Computer wins");
                        computerWins++;
                    } else if (computer == ROCK) {
                        System.out.println(ANSI_GREEN+"Player wins");
                        playerWins++;
                    }
                }

                System.out.println("you choose " + command + " computer choose " + computer);


            }
        }
    }










