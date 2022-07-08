package command.executor;

import model.AnimalDoctor;

import java.util.Scanner;

public class AnimalDoctorCreator {
    public static void create() {
        Scanner scanner = new Scanner(System.in);
        int id = 1;
        System.out.println("Введите имя доктора");
        String nameDoctor = scanner.nextLine();
        new AnimalDoctor(id, nameDoctor);
        System.out.println("Doctor" + nameDoctor + "create!");
    }
}
