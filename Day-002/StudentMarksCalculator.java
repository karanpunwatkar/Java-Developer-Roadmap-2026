import java.util.Scanner;

public class StudentMarksCalculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter marks of subject 1: ");
        int s1 = sc.nextInt();

        System.out.print("Enter marks of subject 2: ");
        int s2 = sc.nextInt();

        System.out.print("Enter marks of subject 3: ");
        int s3 = sc.nextInt();

        int total = s1 + s2 + s3;

        double percentage = (total / 300.0) * 100;

        System.out.println("Total = " + total);
        System.out.println("Percentage = " + percentage);

        sc.close();

    }

}