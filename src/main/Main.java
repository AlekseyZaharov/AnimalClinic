package main;

import command.CommandReader;

import static main.Authentication.authenticate;

public class Main {
    public static void main(String[] args) {
        System.out.println("Добро пожаловать ветклинику!" );

 //       authenticate();

        CommandReader.startReading();

    }
}
