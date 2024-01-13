package com.Entities;

public class Marks1{
    public static void main(String[] args) {
      
        String[] students = {"Claire", "Sano", "Theogene"};
        
        int[] mathsMarks = {55, 63, 52};
        int[] programmingMarks = {87, 85, 77};
        int[] designMarks = {47, 63, 47};
        int[] artMarks = {85, 45, 80};

        System.out.printf("%-15s%-15s%-15s%-15s%-15s%-15s%-15s%-15s%-15s%-15s%-15s%-15s%-15s\n",
                "Student", "Maths", "Programming", "Design", "Art", "Percentage", "Average", "Min Math", "Max Math", "Min Prog", "Max Prog", "Min Design", "Max Design");

        for (int i = 0; i < students.length; i++) {
            int maths = mathsMarks[i];
            int programming = programmingMarks[i];
            int design = designMarks[i];
            int art = artMarks[i];

            int totalMarks = maths + programming + design + art;
            double percentage = (double) totalMarks / 4;
            double average = (double) totalMarks / 4;

            int minMaths = Math.min(mathsMarks[0], Math.min(mathsMarks[1], mathsMarks[2]));
            int maxMaths = Math.max(mathsMarks[0], Math.max(mathsMarks[1], mathsMarks[2]));

            int minProgramming = Math.min(programmingMarks[0], Math.min(programmingMarks[1], programmingMarks[2]));
            int maxProgramming = Math.max(programmingMarks[0], Math.max(programmingMarks[1], programmingMarks[2]));

            int minDesign = Math.min(designMarks[0], Math.min(designMarks[1], designMarks[2]));
            int maxDesign = Math.max(designMarks[0], Math.max(designMarks[1], designMarks[2]));

            int minArt = Math.min(artMarks[0], Math.min(artMarks[1], artMarks[2]));
            int maxArt = Math.max(artMarks[0], Math.max(artMarks[1], artMarks[2]));
            
            System.out.printf("%-15s%-15d%-15d%-15d%-15d%-15.2f%-15.2f%-15d%-15d%-15d%-15d\n",
                    students[i], maths, programming, design, art, percentage, average, minMaths, maxMaths, minProgramming, maxProgramming);
        }
    }
}



