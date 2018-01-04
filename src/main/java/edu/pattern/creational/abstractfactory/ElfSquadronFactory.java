package edu.pattern.creational.abstractfactory;

public class ElfSquadronFactory extends SquadronFactory {
    public Mage createMage() {
        return new ElfMage();
    }

    public Archer createArcher() {
        return new ElfArcher();
    }

    public Warrior createWarrior() {
        return new ElfWarrior();
    }
}

class ElfMage implements Mage {
    public void cast() {
        // использовать магию эльфов
    }
}

class ElfWarrior implements Warrior {
    public void attack() {
        // использовать меч эльфов
    }
}

class ElfArcher implements Archer {
    public void shoot() {
        // использовать лук эльфов
    }
}