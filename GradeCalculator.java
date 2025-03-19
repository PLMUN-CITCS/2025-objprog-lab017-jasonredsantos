
import java.util.Scanner;

public class GradeCalculator {

    public static void main(String[] args) {
        double score = getStudentScore();
        String grade = calculateGrade(score);
        System.out.println("Your grade is: " + grade);
    }

    public static double getStudentScore() {
        double score;
        Scanner y = new Scanner(System.in);
        System.out.print("Your Score is: ");
        score = y.nextDouble();
        return score;
    }

    public static String calculateGrade(double score) {
        if (score >= 90) {
            return "A";
        } else if (score >= 80) {
            return "B";
        } else if (score >= 70) {
            return "C";
        } else if (score >= 60) {
            return "D";
        } else if(score >= 0){
            return "F";
        } else {
            return "Invalid score";
        }
    }

}
