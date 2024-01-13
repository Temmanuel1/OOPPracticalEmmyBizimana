package student;
public class StudentMarks {
    public static void main(String[] args) {
        String[] students = {"Claire", "Sano", "Theogene"};
        String[] subjects = {"Maths", "Programming", "Design", "Art"};
        int[][] marks = {
            {55, 87, 47, 85},
            {63, 85, 63, 45},
            {52, 77, 47, 80}
        };
        System.out.printf("%-15s", "Student");
        for (String subject : subjects) {
            System.out.printf("%-15s", subject);
        }
        System.out.printf("%-15s%-15s%-15s\n", "Percentage", "Average", "Min/Max");
        for (int i = 0; i < students.length; i++) {
            System.out.printf("%-15s", students[i]);

            for (int j = 0; j < subjects.length; j++) {
                System.out.printf("%-15d", marks[i][j]);
            }

            double percentage = calculatePercentage(marks[i]);
            double average = calculateAverage(marks[i]);
            int min = findMin(marks[i]);
            int max = findMax(marks[i]);

            System.out.printf("%-15.2f%-15.2f%-15d/%d\n", percentage, average, min, max);
        }
    }
    private static double calculatePercentage(int[] marks) {
        int totalMarks = 0;
        for (int mark : marks) {
            totalMarks += mark;
        }
        return (double) totalMarks / marks.length;
    }
    private static double calculateAverage(int[] marks) {
        int totalMarks = 0;
        for (int mark : marks) {
            totalMarks += mark;
        }
        return (double) totalMarks / marks.length;
    }
    private static int findMin(int[] array) {
        int min = array[0];
        for (int value : array) {
            if (value < min) {
                min = value;
            }
        }
        return min;
    }
    private static int findMax(int[] array) {
        int max = array[0];
        for (int value : array) {
            if (value > max) {
                max = value;
            }
        }
        return max;
    }
}

