package repository.impl;

import model.AnimalDoctor;
import repository.AnimalDoctorRepository;

import java.util.HashSet;
import java.util.Set;

public class AnimalDoctorRepositoryImpl implements AnimalDoctorRepository {

    static Set<AnimalDoctor> animalDoctors = new HashSet<>();

    public void save(AnimalDoctor animalDoctor) {
        animalDoctors.add(animalDoctor);
        System.out.println("Доктор " + animalDoctor.getName() + "добавлен в список");
//метод в место add, до выеснения.
    }

    @Override
    public Set<AnimalDoctor> findAll() {
        return null;
    }

    @Override
    public void add(AnimalDoctor animalDoctor) {
        animalDoctors.add(animalDoctor);
        System.out.println("Доктор " + animalDoctor.getName() + "добавлен в список");
    }

    @Override
    public void remove(AnimalDoctor animalDoctor) {
        if (animalDoctors.contains(animalDoctor)) {
            animalDoctors.remove(animalDoctor);
            System.out.println("Доктор " + animalDoctor.getName() + "удален из списка");
        } else {
            System.out.println("Данного доктора не существует");
        }
    }
}
