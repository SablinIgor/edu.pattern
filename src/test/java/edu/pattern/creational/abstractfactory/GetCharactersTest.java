package edu.pattern.creational.abstractfactory;

import org.junit.Test;

import static org.junit.Assert.*;

public class GetCharactersTest {
    @Test
    public void createSquadron() throws Exception {
        GetCharacters elfSquad = new GetCharacters();
        elfSquad.createSquadron(new ElfSquadronFactory());

        assertNotNull(elfSquad.archer);
        assertNotNull(elfSquad.mage);
        assertNotNull(elfSquad.warrior);
    }
}