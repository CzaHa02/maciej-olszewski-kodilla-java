package com.kodilla.rps;

import java.util.Arrays;
import java.util.List;

public enum Command {
PAPER("2"), ROCK("1"), SCISSORS("3"),EndGame("x"), GamesValue("1");
    private final String value;

    Command(String value){
        this.value = value;
    }
    public static Command of (String value){
        for(Command command : values()){
            if (command.value.equals(value)){
                return  command;
            }
        }
        throw new IllegalArgumentException("Wrong command"+value );

    }
    static Command aIcommand() {
        List<Command>commandsTogame = Arrays.asList(Command.ROCK, Command.PAPER,Command.SCISSORS);

        return commandsTogame.get(getRandom(0,3));
    }
   static int getRandom(int min , int max){
        return (int) ((Math.random() *(max-min))+min);
    }
    static boolean draw(Command a, Command b){
        return a==b;
    }

    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";

    }




