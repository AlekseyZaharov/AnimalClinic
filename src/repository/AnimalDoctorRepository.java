package repository;

import model.AnimalDoctor;

import java.util.Set;

public interface AnimalDoctorRepository {

    Set<AnimalDoctor> findAll();

    void add(AnimalDoctor animalDoctor);

    void remove(AnimalDoctor animalDoctor);

}
