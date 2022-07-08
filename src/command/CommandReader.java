package command;

import command.executor.AbstractCommandExecutor;
import command.executor.AnimalDoctorCreator;
import model.Patient;

import java.util.Map;
import java.util.Scanner;

public class CommandReader {


    public static void startReading() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите команду");
        String scannerCommand = scanner.nextLine();
        readCommand(scannerCommand);
        scanner.close();
    }

        public static void readCommand(String command) {

             switch (command) {
                case "create Doctor":
                    AnimalDoctorCreator.create();
                    break;
                 case "create Patient":

            }
        }

}
