package repository.impl;

import model.AppointmentToDoctor;

import java.util.HashSet;
import java.util.Set;

public class AppointmentRecord {
    static Set<AppointmentToDoctor> appointmentToDoctors= new HashSet<>();

    public static void save(AppointmentToDoctor appointmentToDoctor) {
        appointmentToDoctors.add(appointmentToDoctor);
//        System.out.println("Пациент " + appointmentToDoctor.getNameOwnerAnimal() + "добавлен в список");
//метод в место add, до выеснения.
    }
}
