package Chapter7.Tests;

import Chapter7.tortoise.Hare;
import Chapter7.tortoise.Player;
import Chapter7.tortoise.Tortoise;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TortoiseTest {
   Player tortoise;
    @Test
    void setUp(){
         tortoise  = new Tortoise();
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
    @Test
    void givesOneAfterExhaustingAllThePosition(){
        assertEquals(0, Tortoise.getPosition());
        assertEquals(3,Tortoise.fastPlod());
        Tortoise.setPosition(3);
        assertEquals(3,Tortoise.getPosition());
        assertEquals(4,Tortoise.slowPod());
        Tortoise.setPosition(4);
        assertEquals(4, Tortoise.getPosition());
        assertEquals(7,Tortoise.fastPlod());
        Tortoise.setPosition(7);
        assertEquals(7,Tortoise.getPosition());
        //run on fast plod again
        assertEquals(10,Tortoise.fastPlod());
        Tortoise.setPosition(10);
        assertEquals(4,Tortoise.slip());
        Tortoise.setPosition(4);
        assertEquals(1,Tortoise.slip());
        Tortoise.setPosition(1);


    }
}
