import java.util.Scanner;

class CGPA {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of subjects");

        int subjectNumber = sc.nextInt();

        double[] gradesList = new double[subjectNumber];

        System.out.println("Enter grades");

        for (int i = 0; i < subjectNumber; i++) {
            gradesList[i] = sc.nextDouble();
        }

        double[] creditsList = new double[subjectNumber];

        System.out.println("Enter credits");

        for (int i = 0; i < subjectNumber; i++) {
            creditsList[i] = sc.nextInt();
        }

        double cgpa = 0, sumGrade = 0, totalCredits = 0;

        for (int i = 0; i < subjectNumber; i++) {
            sumGrade += (gradesList[i] * creditsList[i]);
            totalCredits += creditsList[i];
        }

        cgpa += sumGrade / totalCredits;

        System.out.printf("Your CGPA is: %,.2f",cgpa);

    }
}
