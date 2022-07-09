package repository.impl;

import model.AnimalDoctor;
import model.Patient;

import java.util.HashSet;
import java.util.Set;

public class PatientRepositoryImpl implements repository.PatientRepository {
    static Set<Patient> Patients = new HashSet<>();

    public static void save(Patient patient) {
        Patients.add(patient);
        System.out.println("Пациент " + patient.getNameOwnerAnimal() + "добавлен в список");
//метод в место add, до выеснения.
    }

    @Override
    public Set<Patient> findAll() {
        return null;
    }

    @Override
    public void add(Patient patient) {

    }

    @Override
    public void remove(Patient patient) {

    }
}
