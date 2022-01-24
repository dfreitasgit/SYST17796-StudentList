package studentlist;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * @author David Freitas
 */
public class StudentList {

    /*
     * @param args the command line arguments
     */

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        String grade;
        ArrayList<Double> grades = new ArrayList<>();
        double totalGrades = 0.0;
        
        System.out.println("Enter the student grade('stop' to end): ");
        grade = input.nextLine();
        
        while(!grade.equals("stop")) {
            try {
                double numGrade = Double.parseDouble(grade);
                if(numGrade <= 100 && numGrade >=0) {
                    grades.add(numGrade);
                } else {
                    System.out.println("== Please enter a valid percentage grade. ==");
                }
            } catch(Exception ex) {
                System.out.println("== Please enter a valid number! ==");
            }
            grade = input.nextLine();
        }
        
        System.out.println("Grades Entered: ");
        
        for(double g : grades) {
            System.out.println("> " + g + "%");
            totalGrades += g;
        }
        
        System.out.println("== The average grade is: " + totalGrades/grades.size() + " ==");
    }
}