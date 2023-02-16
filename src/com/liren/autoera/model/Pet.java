package com.liren.autoera.model;

public interface Pet {
    String getName();

    int getHealth();

    void setHealth(int health);

    void attack(Pet pet);

    static Pet getDefaultPet(int health, String name) {
        return new DefaultPet(health, name);
    }

}
