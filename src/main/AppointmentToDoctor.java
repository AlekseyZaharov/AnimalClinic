package main;

import main.RecordStatus;
import model.AnimalDoctor;
import model.Patient;

import java.time.LocalDateTime;

public class AppointmentToDoctor {
    private AnimalDoctor nameDoctor;
    private Patient namePatient;
    private LocalDateTime dateTimeAppointment;
    private RecordStatus recordStatus;

    public AppointmentToDoctor(AnimalDoctor nameDoctor, Patient namePatient, LocalDateTime dateTimeAppointment, RecordStatus recordStatus) {
        this.nameDoctor = nameDoctor;
        this.namePatient = namePatient;
        this.dateTimeAppointment = dateTimeAppointment;
        this.recordStatus = recordStatus;
    }

}
