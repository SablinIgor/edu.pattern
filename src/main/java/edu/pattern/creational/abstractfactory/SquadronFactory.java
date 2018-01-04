package edu.pattern.creational.abstractfactory;

public abstract class SquadronFactory {
    public abstract Mage createMage();

    public abstract Archer createArcher();

    public abstract Warrior createWarrior();
}

interface Archer {
    public void shoot();
}

interface Warrior {
    public void attack();
}

interface Mage {
    public void cast();
}