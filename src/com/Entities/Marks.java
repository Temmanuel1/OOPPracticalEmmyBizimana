package com.Entities;

public class Marks {
    public static void main(String[] args) {
    	
        String[] students = {"Claire", "Sano", "Theogene"};
        
        int[] mathsMarks = {55, 63, 52};
        int[] programmingMarks = {87, 85, 77};
        int[] designMarks = {47, 63, 47};
        int[] artMarks = {85, 45, 80};

        System.out.printf("%-15s%-15s%-15s%-15s%-15s%-15s%-15s%-15S%-15s\n",
                "Student", "Maths", "Programming", "Design", "Art", "Percentage", "Average", "Min", "Max");
       
        for (int i = 0; i < students.length; i++) {
            int maths = mathsMarks[i];
            int programming = programmingMarks[i];
            int design = designMarks[i];
            int art = artMarks[i];

            int totalMarks = maths + programming + design + art;
            double percentage = (double) totalMarks / 4;
            double average = (double) totalMarks / 4;

            int minMaths = Math.min(maths, Math.min(programming, Math.min(design, art)));
            int maxMaths = Math.max(maths, Math.max(programming, Math.max(design, art)));

            System.out.printf("%-15s%-15d%-15d%-15d%-15d%-15.2f%-15.2f%-15d%-15d\n",
                    students[i], maths, programming, design, art, percentage, average, minMaths, maxMaths);
        }
    }

}


