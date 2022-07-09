package main;

import command.CommandReaderImpl;

public class Main {
    public static void main(String[] args) {
        System.out.println("Добро пожаловать ветклинику!");

        //       authenticate();

        CommandReaderImpl.startReading();

    }
}
