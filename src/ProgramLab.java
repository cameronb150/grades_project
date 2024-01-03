// First import Scanner
import java.util.Scanner;

public class ProgramLab {
   public static void main(String[] args) {
      final double HOMEWORK_MAX = 800.0;
      final double QUIZZES_MAX = 400.0;
      final double MIDTERM_MAX = 150.0;
      final double FINAL_MAX = 200.0;

      Scanner scnr = new Scanner(System.in);

      // TODO (step 1) Assign the valid statuses to variables
      //   example undergrad = "UG";
      final String UNDERGRAD = "UG";
      final String GRAD = "G";
      final String DISTANCE_LEANER = "DL";

      // TODO (step 1) - Read from input student status (String)
      //   use the scanner for user input
      String studentStatus = scnr.next();

      // TODO (step 1) - Read from input homework points (double)
      double homeworkPoints = scnr.nextDouble();

      // TODO (step 1) - Read from input quiz points (double)
      double quizPoints = scnr.nextDouble();

      // TODO (step 1) - Read from input midterm (double)
      double midtermPoints = scnr.nextDouble();

      // TODO (step 1) - Read from input final (double)
      double finalPoints = scnr.nextDouble();

      // TODO (step 1) - calculate % average
      //  homework, quiz, midterm, final
      //  (points / HOMEWORK_MAX) * 100
      double homework = (homeworkPoints / HOMEWORK_MAX) * 100;
      double quizzes = (quizPoints / QUIZZES_MAX) * 100;
      double midterm = (midtermPoints / MIDTERM_MAX) * 100;
      double finalExam = (finalPoints / FINAL_MAX) * 100;

      // TODO (step 2) - IF value > 100 THEN value = 100;
      homework = Math.min(homework, 100.0);
      quizzes = Math.min(quizzes, 100.0);
      midterm = Math.min(midterm, 100.0);
      finalExam = Math.min(finalExam, 100.0);

      // TODO (step 1) IF studentStatus is not valid
      // TODO (step 1) Output error
      //  Error: student status must be UG, G or DL
      //  System.out.println("..")
      if (!studentStatus.equals(UNDERGRAD) &&
              !studentStatus.equals(GRAD) &&
              !studentStatus.equals(DISTANCE_LEANER)
      ) {
         System.out.println("Error: student status must be UG, G or DL");
         return;
      }

      // TODO (step 1) output the % for homework, quiz, midterm, final
      //   System.out.printf("Homework: %.1f%%", homework)
      System.out.printf("Homework: %.1f%%\n", homework);
      System.out.printf("Quizzes: %.1f%%\n", quizzes);
      System.out.printf("Midterm: %.1f%%\n", midterm);
      System.out.printf("Final Exam: %.1f%%\n", finalExam);

      // TODO (step 3) calculate average percentage
      //   use a switch to identify which student type
      //   UG
      //   avg = (homework * 0.20) + (quizzes * 0.20) + (midterm * 0.30) + (finalExam * 0.30)
      double avg = 0.0;
      switch (studentStatus) {
         case UNDERGRAD:
            // TODO (step 3) - assign avg for UG
            avg = (homework * 0.20) +
                    (quizzes * 0.20) +
                    (midterm * 0.30) +
                    (finalExam * 0.30);
            break;
         case GRAD:
            // TODO (step 3) - assign avg for G
            avg = (homework * 0.15) +
                    (quizzes * 0.05) +
                    (midterm * 0.35) +
                    (finalExam * 0.45);
            break;
         case DISTANCE_LEANER:
            // TODO (step 3) - assign avg for DL
            avg = (homework * 0.05) +
                    (quizzes * 0.05) +
                    (midterm * 0.40) +
                    (finalExam * 0.50);
            break;
      }
      // TODO (step 3) print out avg
      System.out.printf("%s average: %.1f%%\n", studentStatus, avg);

      // TODO (step 4) if else if letter grade
      // TODO (step 4) print out the grade
      char grade = 'F';

      if (avg >= 90.0) {

         grade = 'A';

      } else if (avg >= 80.0) {

         grade = 'B';

      } else if (avg >= 70.0) {

         grade = 'C';

      } else if (avg >= 60.0) {

         grade = 'D';

      }

// TODO (step 4) print out the grade

      System.out.println("Course grade: " + grade);
   }
}