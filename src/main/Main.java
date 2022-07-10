package main;

import command.CommandReader;
import command.CommandReaderImpl;

public class Main {



    public static void main(String[] args) {
        System.out.println("Добро пожаловать ветклинику!");

        //      authenticate();
        CommandReader commandReader = new CommandReaderImpl();
        commandReader.startReading();

    }
}
