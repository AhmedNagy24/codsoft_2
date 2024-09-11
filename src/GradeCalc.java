import java.util.Scanner;

public class GradeCalc {
    public static void main(String[] args) {
        System.out.print("Please enter number of subjects: ");
        int n = new Scanner(System.in).nextInt();
        int totalMarks = 0, maxMarks = n * 100;

        for (int i = 0; i < n; i++) {
            System.out.print(STR."Enter marks in subject \{i+1} out of 100: ");
            int mark = new Scanner(System.in).nextInt();
            totalMarks += mark;
        }
        double percent = ((double) totalMarks / maxMarks) * 100;
        System.out.println(STR."Total marks = \{totalMarks}");
        System.out.println(STR."Average percentage = \{percent}%");

        String grade = getGrade(percent);
        System.out.println(STR."Your grade is \{grade}");
    }

    private static String getGrade(double percent) {
        String grade;
        if (percent >= 90){
            grade = "A+";
        } else if (percent >= 85) {
            grade = "A";
        } else if (percent >= 80) {
            grade = "B+";
        } else if (percent >= 75) {
            grade = "B";
        } else if (percent >= 70) {
            grade = "C+";
        } else if (percent >= 65) {
            grade = "C";
        } else if (percent >= 60) {
            grade = "D+";
        } else if (percent >= 55) {
            grade = "D";
        }else {
            grade = "F";
        }
        return grade;
    }
}