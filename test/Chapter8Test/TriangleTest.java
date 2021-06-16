package Chapter8Test;

import Chapter8.Triangle;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class TriangleTest {
    Triangle triangle;
    @BeforeEach
    void startEachTestWith(){
        triangle = new Triangle();
    }
    @Test
    void canCreateTriangleTest(){
        Triangle triangle = new Triangle();
        assertNotNull(triangle);
    }
    @Test
    void canCalculatePerimeterOfTriangleTest(){
        triangle.setLength(5);
        assertEquals(5,triangle.getLength());
        triangle.setWidth(10);
        assertEquals(10,triangle.getWidth());
        assertEquals(30,triangle.calculatePerimeter(5,10));
    }
    @Test
    void canCalculateAreaOfTriangleTest(){
        triangle.setLength(5);
        assertEquals(5,triangle.getLength());
        triangle.setWidth(10);
        assertEquals(10,triangle.getWidth());
        assertEquals(50, triangle.calculateArea());
    }
}
