package com.liren.autoera.model;

class DefaultPet implements Pet {
    private int health;
    private String name;

    DefaultPet(int health, String name) {
        this.health = health;
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getHealth() {
        return health;
    }

    @Override
    public void setHealth(int health) {
        this.health = health;
    }

    @Override
    public void attack(Pet pet) {
        pet.setHealth(Math.max(0, pet.getHealth() - 10));
    }

}
