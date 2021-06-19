package Chapter7;

public class MovieFlight {
    public static boolean isMoviesDurationEqualToFlightDuration(int [] movieTime, int flightDuration) {
       int numbersOfMoviesWatched = 0;
       boolean isTrue = false;
         for (int i = 0; i < movieTime.length; i++) {
            for (int j = 0; j < i ; j++) {
               if (movieTime[i] + movieTime[j] == flightDuration){
              System.out.println("You watched " + numbersOfMoviesWatched + " movies " + movieTime [i] + " and " + movieTime[j]);
                    numbersOfMoviesWatched++;
                    isTrue = true;
               }

            }

        }
        return isTrue;
    }
}
