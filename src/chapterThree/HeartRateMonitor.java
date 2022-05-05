package chapterThree;

import java.util.Scanner;

public class HeartRateMonitor {
    public static void main(String[] args) {

        HeartRates heartRate1 = new HeartRates("asa", "ameerah", 22);
        HeartRates heartRate2 = new HeartRates("muhammed", "messi", 23);

        System.out.printf("passed in names and date is %s %s %d%n", heartRate1.getFirstName(), heartRate1.getLastName(), heartRate1.getBirthYear());
        System.out.printf("passed in names and date is %s %s %d%n", heartRate2.getFirstName(), heartRate2.getLastName(), heartRate2.getBirthYear());

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your First Name: ");
        String firstName = input.nextLine();
        System.out.printf("%n adding patient name %sasa", firstName);
        heartRate1.setFirstName(firstName);

//        System.out.println("Enter your Last Name: ");
//        String lastName = input.nextLine();
//        System.out.println("Enter your year of Birth: ");
//        int birthYear = input.nextInt();

    }

}
