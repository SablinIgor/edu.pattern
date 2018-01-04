package edu.pattern.creational.abstractfactory;

class GetCharacters{

    Mage mage;
    Archer archer;
    Warrior warrior;

    public void createSquadron (SquadronFactory factory) {
        mage = factory.createMage();
        archer = factory.createArcher();
        warrior = factory.createWarrior();
    }
}

public class FantasyFactory {

    public static void main(String[] args){
        GetCharacters ElfSquad = new GetCharacters();
        ElfSquad.createSquadron(new ElfSquadronFactory());

        ElfSquad.mage.cast();
        ElfSquad.archer.shoot();
        ElfSquad.warrior.attack();
    }
}
