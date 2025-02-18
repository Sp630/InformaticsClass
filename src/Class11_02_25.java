import java.util.Scanner;

public class Class11_02_25 {
    public static void main(String[] args) {
        String[] students = {"Nikoleta", "Vasil", "Martin","Svetoslav","Irina", "Aleksandar"};
        int[] grades = {99, 49, 89, 45, 35, 78 };

        /* Implement a switch case for the menu:
         * 1. Calculate Average
         * 2. Display the student with the highest grade
         * 3. Display the student with the lowest grade
         * 4. Display the count of students who are failing (>50 is failing)
         * 5. Look up student grade with user input.
         * 6. Exit. */
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        switch(num){
            case 1:
                System.out.println(calculateAverage(grades));
                break;
            case 2:
                System.out.println(findHighestGradeStudent(students, grades));
                break;
            case 3:
                System.out.println(findLowestGradeStudent(students, grades));
                break;
            case 4:
                System.out.println(countFailedStudents(grades));
                break;
            case 5:
                System.out.print("Input name:");
                String name = scanner.next();
                System.out.println(lookupStudentGrade(students, grades, name));
                break;
            case 6:
                System.exit(0);
        }
    }

    private static double calculateAverage(int[] grades) {
        double sum = 0;
        for (int i = 0; i < grades.length; i++) {
            sum += grades[i];
        }
        return sum / grades.length;
    }

    private static String findHighestGradeStudent(String[] studentNames, int[] grades) {
        int max = grades[0];
        int index = 0;
        for (int i = 0; i < studentNames.length; i++) {
            if (max < grades[i]) {
                max = grades[i];
                index = i;
            }
        }
        return studentNames[index];
    }

    private static String findLowestGradeStudent(String[] studentNames, int[] grades) {
        int min = grades[0];
        int index = 0;
        for (int i = 0; i < studentNames.length; i++) {
            if (min > grades[i]) {
                min = grades[i];
                index = i;
            }
        }
        return studentNames[index];
    }

    private static int countFailedStudents(int[] grades) {
        int count = 0;
        for (int i = 0; i < grades.length; i++) {
            if(grades[i] < 50){
                count++;
            }
        }
        return count;
    }

    private static int lookupStudentGrade(String[] studentNames, int[] grades, String studentToLookup) {
        int index = 0;
        for (int i = 0; i < studentNames.length; i++) {
            if (studentNames[i].equals(studentToLookup)) {
                index = i;
            }
        }
        return grades[index];
    }
}