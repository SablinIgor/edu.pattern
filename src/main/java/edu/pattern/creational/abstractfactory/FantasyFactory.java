package edu.pattern.creational.abstractfactory;

class GetCharacters{
    public void createSquadron (SquadronFactory factory) {
        Mage mage = factory.createMage();
        Archer archer = factory.createArcher();
        Warrior warrior = factory.createWarrior();
    }
}

public class FantasyFactory {

    public static void main(String[] args){
        ElfSquadronFactory f = new ElfSquadronFactory();
        GetCharacters chars = new GetCharacters();

        chars.createSquadron(f);
    }
}
