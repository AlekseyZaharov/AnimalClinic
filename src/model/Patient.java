package model;

import command.CommandType;

import java.time.Instant;

public class Patient {

    private final int id;

    private String nameOwnerAnimal;

    private final String animal;

    private final String nameAnimal;

    private final Instant creationDate;

    private CommandType type;

    public Patient(int id,
                   String nameOwnerAnimal,
                   String animal,
                   String nameAnimal) {
        this.id = id;
        this.nameOwnerAnimal = nameOwnerAnimal;
        this.animal = animal;
        this.nameAnimal = nameAnimal;
        creationDate = Instant.now();
    }

    public String getNameOwnerAnimal() {
        return nameOwnerAnimal;
    }

    public int getId() {
        return id;
    }

    public void setNameOwnerAnimal(String nameOwnerAnimal) {
        this.nameOwnerAnimal = nameOwnerAnimal;
    }

    public String getAnimal() {
        return animal;
    }

    public String getNameAnimal() {
        return nameAnimal;
    }

    public Instant getCreationDate() {
        return creationDate;
    }

    public CommandType getType() {
        return type;
    }

    public void setType(CommandType type) {
        this.type = type;
    }
}
