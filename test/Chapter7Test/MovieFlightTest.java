package Chapter7Test;

import Chapter7.MovieFlight;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MovieFlightTest {
    @Test
    void MovieFlightCanBeCreated(){
        MovieFlight movieFlight = new MovieFlight();
        assertNotNull(movieFlight);
    }
    @Test
    void userCanWatchTwoDifferentMovies(){
        int [] moviesDurations = {30,40,60,10,50,70,50,80,20,90,100};
        assertTrue(MovieFlight.isMoviesDurationEqualToFlightDuration(moviesDurations,100));
    }
}
