package model;

import java.time.Instant;

public class Patient {

    private final int id;

    private String nameOwnerAnimal;

    private final String animal;

    private final Instant creationDate;


    public Patient (int id, String nameOwnerAnimal, String animal) {
        this.id = id;
        this.nameOwnerAnimal = nameOwnerAnimal;
        this.animal = animal;
        creationDate = Instant.now();
    }


}
