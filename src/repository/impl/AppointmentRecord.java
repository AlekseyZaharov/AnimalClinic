package repository.impl;

import main.AppointmentToDoctor;
import model.Patient;

import java.util.HashSet;
import java.util.Set;

import static repository.impl.PatientRepositoryImpl.Patients;

public class AppointmentRecord {
    static Set<AppointmentToDoctor> appointmentToDoctors= new HashSet<>();

    public static void save(AppointmentToDoctor appointmentToDoctor) {
        appointmentToDoctors.add(appointmentToDoctor);
//        System.out.println("Пациент " + appointmentToDoctor.getNameOwnerAnimal() + "добавлен в список");
//метод в место add, до выеснения.
    }
}
