package command.executor;

import model.Patient;

import java.util.Scanner;

public class AppointmentToDoctorCreator {
    public static void create(){
        Scanner scanner = new Scanner(System.in);
        int id = 1;
        System.out.println("Введите имя доктора");
        String nameDoctor = scanner.nextLine();
        //todo
        System.out.println("Введите имя владельца животного");
        String animal = scanner.nextLine();
        //todo
        System.out.println("Выберете дату приема");
        String nameAnimal = scanner.nextLine();
        new Patient(id, nameDoctor, animal, nameAnimal);
        System.out.println(animal + " по кличке \"" + nameAnimal + " \"создан как пациент");
        ++id;
    }
}
