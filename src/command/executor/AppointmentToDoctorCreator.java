package command.executor;

import main.RecordStatus;
import model.AppointmentToDoctor;
import model.Patient;

import java.util.Scanner;

public class AppointmentToDoctorCreator {

    public void create(){
        Scanner scanner = new Scanner(System.in);
        int id = 1;
        System.out.println("Введите имя доктора");
        String nameDoctor = scanner.nextLine();
        //TODO Добавить функционал
        System.out.println("Введите имя владельца животного");
        String animal = scanner.nextLine();
        //todo
        System.out.println("Выберете дату приема");
        String nameAnimal = scanner.nextLine();

        System.out.println(animal + " по кличке \"" + nameAnimal + " \"создан как пациент");
        ++id;

        AppointmentToDoctor appointment = new AppointmentToDoctor();
        appointment.setPatient(new Patient(id, nameDoctor, animal, nameAnimal));
        appointment.setRecordStatus(RecordStatus.NEW);
    }
}
