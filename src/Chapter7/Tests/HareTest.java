package Chapter7.Tests;

import Chapter7.tortoise.Hare;
import Chapter7.tortoise.Player;
import Chapter7.tortoise.Tortoise;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class HareTest {
    Player hare;

    @Test
    void setUp() {
        hare = new Hare();
        assertNotNull(hare);
    }

    @Test
    void hareCanRunOnBigHopTest() {
        assertEquals(0, Hare.getPosition());
        assertEquals(9, Hare.bigHop());
        Hare.setPosition(9);
    }

    @Test
    void hareCanRunOnSmallHopTest() {
        assertEquals(0, Hare.getPosition());
        assertEquals(9, Hare.bigHop());
        Hare.setPosition(9);
        int position = Hare.getPosition();
        int newPosition = position + 1;
        assertEquals(newPosition, Hare.smallHop());
        Hare.setPosition(10);
    }

    @Test
    void hareCanRunOnBigHopMoreThanOnceTest() {
        assertEquals(0, Hare.getPosition());
        assertEquals(9, Hare.bigHop());
        Hare.setPosition(9);
        int position = Hare.getPosition();
        int newPosition = position + 1;
        assertEquals(newPosition, Hare.smallHop());
        Hare.setPosition(10);
        int positn = Hare.getPosition();
        assertEquals(positn + 9, Hare.bigHop());
        Hare.setPosition(positn + 9);
        assertEquals(19, Hare.getPosition());
    }

    @Test
    void canRunOnBigSlipTest() {
        assertEquals(0, Hare.getPosition());
        assertEquals(9, Hare.bigHop());
        Hare.setPosition(9);
        int position = Hare.getPosition();
        int newPosition = position + 1;
        assertEquals(newPosition, Hare.smallHop());
        Hare.setPosition(10);
        int positn = Hare.getPosition();
        assertEquals(positn + 9, Hare.bigHop());
        Hare.setPosition(positn + 9);
        assertEquals(19, Hare.getPosition());
        Hare.setPosition(position + 9);
        assertEquals(6, Hare.bigSlip());
        Hare.setPosition(6);

    }

    @Test
    void hareCanRunOnSmallSlipTest() {
        assertEquals(0, Hare.getPosition());
        assertEquals(9, Hare.bigHop());
        Hare.setPosition(9);
        int position = Hare.getPosition();
        int newPosition = position + 1;
        assertEquals(newPosition, Hare.smallHop());
        Hare.setPosition(10);
        int positn = Hare.getPosition();
        assertEquals(positn + 9, Hare.bigHop());
        Hare.setPosition(positn + 9);
        assertEquals(19, Hare.getPosition());
        Hare.setPosition(position + 9);
        assertEquals(6, Hare.bigSlip());
        Hare.setPosition(6);
        assertEquals(4, Hare.smallSlip());
        Hare.setPosition(4);
    }

        @Test
        void givesOneAfterExhaustingThePositions(){
        assertEquals(0, Hare.getPosition());
        assertEquals(9,Hare.bigHop());
        Hare.setPosition(9);
        int position = Hare.getPosition();
        int newPosition = position +1;
        assertEquals(newPosition,Hare.smallHop());
        Hare.setPosition(10);
        int positn = Hare.getPosition();
        assertEquals(positn+9,Hare.bigHop());
        Hare.setPosition(positn + 9);
        assertEquals(19,Hare.getPosition());
        Hare.setPosition(position+9);
        assertEquals(6,Hare.bigSlip());
        Hare.setPosition(6);
        assertEquals(4,Hare.smallSlip());
        Hare.setPosition(4);
        assertEquals(4,Hare.getPosition());
        assertEquals(2,Hare.smallSlip());
        Hare.setPosition(2);
        assertEquals(2,Hare.getPosition());
        assertEquals(1,Hare.smallSlip());
        Hare.setPosition(1);
      assertEquals(1,Hare.getPosition());
      assertEquals(1,Hare.smallSlip());
        Hare.setPosition(1);
        assertEquals(1,Hare.getPosition());
    }
    }


