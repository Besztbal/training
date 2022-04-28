package junit5fixture;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ShipTest {

    Ship ship;

    @BeforeEach
    void init(){
        ship=new Ship("Gőzös Gizi",1978,30.25);

    }

    @Test
    void testName(){
        assertEquals("Gőzös Gizi",ship.getName());
        assertNotEquals("Gőzös Géza",ship.getName());
    }

    @Test
    void testYearOfConstruction(){
        assertEquals(1978,ship.getYearOfConstruction());
        assertTrue(ship.getYearOfConstruction()==1978);
    }

    @Test
    void testLength(){
        assertEquals(30.25,ship.getLength());
    }

    @Test
    void testNull(){
        Ship anotherShip=new Ship(null,0,0);

        assertNull(anotherShip.getName());
        assertNotNull(ship.getName());
    }

    @Test
    void testSameObjects(){
        Ship anotherShip=ship;

        assertSame(ship,anotherShip);
    }

    @Test
    void testNotSameObjects(){
        Ship anotherShip=new Ship("Gőzös Gizi",1978,30.25);

        assertNotSame(ship,anotherShip);
    }
}
