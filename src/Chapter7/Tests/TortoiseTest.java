package Chapter7.tortoiseTest;

import Chapter7.tortoise.Hare;
import Chapter7.tortoise.Player;
import Chapter7.tortoise.Tortoise;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RaceTest {
   Player hare;
   Player tortoise;
    @Test
    void setUp(){
         hare  = new Hare();
         tortoise  = new Tortoise();
        assertNotNull(hare);
        assertNotNull(tortoise);
    }
    @Test
    void tortoiseCanRunOnFastPlodTest(){
      assertEquals(0, Tortoise.getPosition());
      assertEquals(3,Tortoise.fastPlod());
      Tortoise.setPosition(3);

    }
    @Test
    void tortoiseCanRunOnSlowPlodTest(){
        assertEquals(0, Tortoise.getPosition());
        assertEquals(3,Tortoise.fastPlod());
        Tortoise.setPosition(3);
        assertEquals(3,Tortoise.getPosition());
        assertEquals(4,Tortoise.slowPod());
        Tortoise.setPosition(4);

    }
    @Test
    void tortoiseCanRunOnFastPlodMoreThanOnceTest(){
        assertEquals(0, Tortoise.getPosition());
        assertEquals(3,Tortoise.fastPlod());
        Tortoise.setPosition(3);
        assertEquals(3,Tortoise.getPosition());
        assertEquals(4,Tortoise.slowPod());
        Tortoise.setPosition(4);
        //run on fast plod again
        assertEquals(7,Tortoise.fastPlod());
        Tortoise.setPosition(7);

    }
    @Test
    void tortoiseCanSlipTest__Oops(){
        assertEquals(0, Tortoise.getPosition());
        assertEquals(3,Tortoise.fastPlod());
        Tortoise.setPosition(3);
        assertEquals(3,Tortoise.getPosition());
        assertEquals(4,Tortoise.slowPod());
        Tortoise.setPosition(4);
        //run on fast plod again
        assertEquals(7,Tortoise.fastPlod());
        Tortoise.setPosition(7);
        int position = Tortoise.getPosition();
        assertEquals(position-6,Tortoise.slip());

    }
}
