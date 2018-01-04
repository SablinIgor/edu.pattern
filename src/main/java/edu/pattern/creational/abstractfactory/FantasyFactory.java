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
        GetCharacters elfSquad = new GetCharacters();

        if (elfSquad.mage == null){
            System.out.println("Empty");
        } else {
            System.out.println("Ready");
        }
            ;
        elfSquad.createSquadron(new ElfSquadronFactory());

        if (elfSquad.mage == null){
            System.out.println("Empty");
        } else {
            System.out.println("Ready");
        }

        elfSquad.mage.cast();
        elfSquad.archer.shoot();
        elfSquad.warrior.attack();
    }
}
