package repository;

import model.AnimalDoctor;

import java.util.Set;

public interface AnimalDoctorRepository {

    Set<AnimalDoctor> findAll();

    void save();

    void remove();

}
