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
    public static boolean isEqual(int flightTime, int [] movieDuration ){
        boolean isEqual = false;
        for (int i = 0; i < movieDuration.length; i++){
            for(int j = 1; j < movieDuration.length;j++){
                if (movieDuration[i] + movieDuration[j] == flightTime){
                    isEqual = true;
                }
                if (isEqual){
//                    System.out.println("you can watch two movies " + "movie " +movieDuration[i] +"movie " + movieDuration[j]);
                    break;
                }

            }
        }
       return isEqual;
    }

    public static void main(String[] args) {
        int [] movieDuration = {100,30,70,11,45,63};
        System.out.println(isEqual(100,movieDuration));
    }
}
