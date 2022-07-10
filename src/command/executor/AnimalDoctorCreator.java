package command.executor;

import model.AnimalDoctor;
import repository.AnimalDoctorRepository;
import repository.impl.AnimalDoctorRepositoryImpl;

import java.util.Scanner;

public class AnimalDoctorCreator {

   private AnimalDoctorRepository repository = new AnimalDoctorRepositoryImpl();

    public void create() {
        Scanner scanner = new Scanner(System.in);
        int id = 1;
        System.out.println("Введите имя доктора");
        String nameDoctor = scanner.nextLine();
        repository.add(new AnimalDoctor(id, nameDoctor));
        System.out.println("Doctor" + nameDoctor + "create!");
        ++id;
    }
}
