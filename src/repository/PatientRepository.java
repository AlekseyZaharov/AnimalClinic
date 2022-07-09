package repository;

import model.Patient;

import java.util.Set;

public interface PatientRepository {

    Set<Patient> findAll();

    void add(Patient patient);

    void remove(Patient patient);
}
