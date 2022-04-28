package junit5assert;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DragonTest {

    @Test
    void testName(){
        Dragon dragon=new Dragon("Süsü",1,150);

        assertEquals("Süsü",dragon.getName());
        assertNotEquals("Tűzokádó",dragon.getName());
    }

    @Test
    void testNumberOfHeads(){
        Dragon dragon=new Dragon("Süsü",7,150);

        assertEquals(7,dragon.getNumberOfHeads());
        assertTrue(dragon.getNumberOfHeads()==7);
        assertFalse(dragon.getNumberOfHeads()==6);
    }

    @Test
    void testHeight(){
        Dragon dragon=new Dragon("Süsü",7,150);
        assertEquals(150,dragon.getHeight());
    }

    @Test
    void testNull(){
        Dragon dragon=new Dragon("Süsü",7,150);
        Dragon anotherDragon=new Dragon(null,0,0);

        assertNotNull(dragon.getName());
        assertNull(anotherDragon.getName());


    }

    @Test
    void testSameObjects(){
        Dragon dragon=new Dragon("Süsü",7,150);
        Dragon anotherDragon=dragon;

        assertSame(dragon,anotherDragon);
    }

    @Test
    void testNotSameObjects(){
        Dragon dragon=new Dragon("Süsü",7,150);
        Dragon anotherDragon=new Dragon("Süsü",7,150);

        assertNotSame(dragon,anotherDragon);
    }
}
