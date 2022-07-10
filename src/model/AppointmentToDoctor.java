package model;

import main.RecordStatus;
import model.AnimalDoctor;
import model.Patient;

import java.time.LocalDateTime;

public class AppointmentToDoctor {

    private AnimalDoctor nameDoctor;
    private Patient patient;
    private LocalDateTime dateTimeAppointment;
    private RecordStatus recordStatus;

    public AppointmentToDoctor() {
    }

    public AnimalDoctor getNameDoctor() {
        return nameDoctor;
    }

    public void setNameDoctor(AnimalDoctor nameDoctor) {
        this.nameDoctor = nameDoctor;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public LocalDateTime getDateTimeAppointment() {
        return dateTimeAppointment;
    }

    public void setDateTimeAppointment(LocalDateTime dateTimeAppointment) {
        this.dateTimeAppointment = dateTimeAppointment;
    }

    public RecordStatus getRecordStatus() {
        return recordStatus;
    }

    public void setRecordStatus(RecordStatus recordStatus) {
        this.recordStatus = recordStatus;
    }
}
