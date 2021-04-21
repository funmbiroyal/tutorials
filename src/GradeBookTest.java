public class GradeBookTest {
    public static void main(String[] args) {
        int[][] ArrayGrades = { {34, 56, 67},
                                {14, 36, 67},
                                {44, 54, 61},
                                {34, 56, 60},
                                {24, 51, 48},
                                {64, 26, 32},
                                {54, 16, 57},
                                {24, 36, 54},
                                {44, 56, 32},
                                {34, 46, 25},
                                              };
        GradeBook myGradeBook = new GradeBook("Java Programming",ArrayGrades);

        System.out.printf("Welcome to Grade Book for %n%s%n%n",myGradeBook.getCourseName());
        myGradeBook.processGrades();
    }
}
