// Jacob Her
// CSCI 2001-52
// HW1 (Ch5) - Test Average and Grade

import java.util.Scanner;

public class TestAverageAndGrade
{
    public static void main(String[] args)
    {
    Scanner kb = new Scanner(System.in);
    char letterGrade = 'A';
// Creating input method to obtain the test scores
    System.out.print("Enter the first test score: ");
    double score1 = kb.nextDouble();
    System.out.print("Enter the second test score: ");
    double score2 = kb.nextDouble();
    System.out.print("Enter the third test score: ");
    double score3 = kb.nextDouble();
    System.out.print("Enter the fourth test score: ");
    double score4 = kb.nextDouble();
    System.out.print("Enter the fifth test score: ");
    double score5 = kb.nextDouble();
// Creating output method to display the test scores.
    System.out.print(" The letter grades for each test are as follows:\n");
    System.out.println("  Test 1: "+ determineGrade(score1));
    System.out.println("  Test 2: "+ determineGrade(score2));
    System.out.println("  Test 3: "+ determineGrade(score3));
    System.out.println("  Test 4: "+ determineGrade(score4));
    System.out.println("  Test 5: "+ determineGrade(score5));

    double average = calcAverage(score1,score2,score3,score4,score5);
    System.out.printf("The average grade is: %.2f\n",average);
    }
// Creating method to display letter grade using double from kb entry.
    public static char determineGrade(double score)
    {
    char grade;
    if(score <60)
        grade = 'F';
    else if(score <70)
        grade = 'D';
    else if(score <80)
        grade ='C';
    else if(score <90)
        grade = 'B';
    else
        grade ='A';

    return grade;
    }
// Creating method to calculate the average score of all five tests.
public static double calcAverage(double sc1,double sc2,double sc3, double sc4,double sc5)
    {
    double av = (double)(sc1+sc2+sc3+sc4+sc5)/5;
    return av;
    }


}