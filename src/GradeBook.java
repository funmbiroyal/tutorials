public class GradeBook {
    private String courseName;
    private int[][] grades;

    public GradeBook(String courseName, int[][] grades) {
        this.courseName = courseName;
        this.grades = grades;
    }





    public String getCourseName() {
        return courseName;
    }

    public void processGrades() {
        outputGrades();
        System.out.printf("%n%s%d%n%s%d%n%n", "The maximum grade is ", getMaximum(),
                "the minimum grade is ", getMinimum());

    }

    public int getMinimum() {
        int lowGrade = grades[0][0];
        for (int[] studentGrades : grades) {
            for (int grade : studentGrades) {
                if (grade < lowGrade)
                    lowGrade = grade;

            }
        }
        return lowGrade;
    }

    public int getMaximum() {
        int highGrade = grades[0][0];
        for (int[] studentGrades : grades) {
            for (int grade : studentGrades) {
                if (grade > highGrade)
                    highGrade = grade;
            }
        }
        return highGrade;
    }
    public double getAverage(int [] setOfGrades ){
        int total = 0;
        for (int grades : setOfGrades){
            total+=grades;
        }
        return (double) total/ setOfGrades.length;
    }

    public void outputGrades() {
        System.out.printf("The grades are: %n%n ");
        System.out.print("               ");
        for (int test = 0; test < grades[0].length; test++)
            System.out.printf("Test %d ", test + 1);
            System.out.println("Average");
            for (int student = 0; student < grades.length; student++) {
                System.out.printf("Student %2d", student + 1);
                for (int score : grades[student])
                    System.out.printf("%8d", score);
                double average = getAverage(grades[student]);
                System.out.printf("%9.2f%n", average);
            }
        }


}