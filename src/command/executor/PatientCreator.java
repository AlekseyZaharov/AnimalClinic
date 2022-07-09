package command.executor;

import model.AnimalDoctor;
import model.Patient;
import repository.impl.PatientRepositoryImpl;

import java.util.Scanner;

public class PatientCreator {
    public static void create() {
        Scanner scanner = new Scanner(System.in);
        int id = 1;
        System.out.println("Введите имя владельца животного");
        String nameOwenAnimal = scanner.nextLine();
        System.out.println("Введите род животного");
        String animal = scanner.nextLine();
        System.out.println("Введите кличку животного");
        String nameAnimal = scanner.nextLine();
        PatientRepositoryImpl.save(new Patient(id, nameOwenAnimal, animal, nameAnimal));
        System.out.println("Пациент " + nameOwenAnimal + "с" +  animal + " по кличке \"" + nameAnimal + " \"создан");
        ++id;
    }
}
