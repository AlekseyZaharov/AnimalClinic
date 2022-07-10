package command;

import command.executor.AnimalDoctorCreator;
import command.executor.AppointmentToDoctorCreator;
import command.executor.PatientCreator;

import java.util.Scanner;

public class CommandReaderImpl implements CommandReader {

    private AnimalDoctorCreator creator = new AnimalDoctorCreator();

    private AppointmentToDoctorCreator doctorCreator = new AppointmentToDoctorCreator();

    private PatientCreator patientCreator = new PatientCreator();

    @Override
    public void startReading()  {
        try(Scanner scanner = new Scanner(System.in)){
            System.out.println("введите команду");
            String scannerCommand = scanner.nextLine();
            readCommand(scannerCommand);
        } catch (Exception e) {
            System.out.println("Комманда не известна");
        }
    }

    @Override
    public void readCommand(String command) {

        switch (command) {
            case "create Doctor":
                creator.create();
                break;
            case "create Patient":
                patientCreator.create();
                break;
            case "create Appointment":
                doctorCreator.create();
                break;
        }

    }
}
