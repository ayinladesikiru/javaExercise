package chapterThree;

import java.util.Scanner;

public class HeartRateMonitor {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your First Name: ");
        String firstName = input.nextLine();

        System.out.println("Enter your last Name: ");
        String lastName = input.nextLine();

        System.out.println("Enter your birth year: ");
        int birthYear = input.nextInt();

        HeartRates heartRate1 = new HeartRates(firstName, lastName, birthYear);

        System.out.printf("passed in names and date is %s %s %d%n", heartRate1.getFirstName(), heartRate1.getLastName(), heartRate1.getBirthYear());
        int userAge = heartRate1.userAgeCalculation(birthYear);
        int heartRate = heartRate1.heartRatecalculator(userAge);
        double targetHeartRate = heartRate1.targetHeartRate(heartRate);
        double maxTargetRate = heartRate1.maxTargetHeartRate(heartRate);

        System.out.printf("The user age is %d, the user heart rate is %d, and the user target heart rate is %.2f and the max target heart rate is %.2f", userAge, heartRate, targetHeartRate, maxTargetRate);

    }

}
