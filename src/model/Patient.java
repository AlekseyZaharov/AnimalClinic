package model;

import java.time.Instant;

public class Patient {

    private final int id;

    private String nameOwnerAnimal;

    private final String animal;

    private final String nameAnimal;

    private final Instant creationDate;


    public Patient(int id, String nameOwnerAnimal, String animal, String nameAnimal) {
        this.id = id;
        this.nameOwnerAnimal = nameOwnerAnimal;
        this.animal = animal;
        this.nameAnimal = nameAnimal;
        creationDate = Instant.now();
    }

    public String getNameOwnerAnimal() {
        return nameOwnerAnimal;
    }
}
