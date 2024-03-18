package sMsys;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CourseTest {
    Course course;

    @BeforeEach
    void setUp() {
        course = new Course(1, "jv101", "java");
    }

    @Test
    void testThatCourseCanBeCreated() {
        assertNotNull(course);
    }

    @Test
    void testThatCourseCanBeDeactivated() {
        assertTrue(course.deactivateCourse(1));
        assertEquals("jv101", course.getCourseCode());
        assertEquals("java", course.getCourseTitle());

    }

    @AfterEach
    void tearDown() {
    }
}
