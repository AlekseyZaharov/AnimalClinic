package command;

import command.executor.AnimalDoctorCreator;
import command.executor.AppointmentToDoctorCreator;
import command.executor.PatientCreator;

import java.util.Scanner;

public class CommandReaderImpl implements CommandReader {


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
                PatientCreator.create();
                break;
            case "create Appointment":
                AppointmentToDoctorCreator.create();
                break;

        }
    }

}
