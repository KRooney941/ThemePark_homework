package stalls;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class TobaccoStallTest {

    TobaccoStall tobaccoStall;

    Visitor visitor1;
    Visitor visitor2;

    @Before
    public void setUp() throws Exception {
        tobaccoStall = new TobaccoStall ("Jacks Drum", "Jack Jarvis", ParkingSpot.B1, 1);
        visitor1 = new Visitor(19, 180, 20);
        visitor2 = new Visitor(12, 120, 5);
    }

    @Test
    public void hasName() {
        assertEquals("Jacks Drum", tobaccoStall.getName());
    }

    @Test
    public void hasOwner() {
        assertEquals("Jack Jarvis", tobaccoStall.getOwnerName());
    }

    @Test
    public void hasParkingSpot() {
        assertEquals(ParkingSpot.B1, tobaccoStall.getParkingSpot());
    }

    @Test
    public void isAllowedToBuyIsTrue(){
        assertEquals(true, tobaccoStall.isAllowedTo(visitor1));
    }

    @Test
    public void isAllowedToBuyIsFalse(){
        assertEquals(false, tobaccoStall.isAllowedTo(visitor2));
    }

    @Test
    public void hasRating(){
        assertEquals(1, tobaccoStall.getRating());
    }

}
