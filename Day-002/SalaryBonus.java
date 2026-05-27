import java.util.Scanner;

public class SalaryBonus {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter salary: ");

        double salary = sc.nextDouble();

        double bonus = salary * 0.10;

        System.out.println("Bonus = " + bonus);

        sc.close();

    }

}