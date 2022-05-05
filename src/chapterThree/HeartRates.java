package chapterThree;

public class HeartRates {
    private String firstName;
    private String lastName;
    private int birthYear;

    public HeartRates(String firstName, String lastName, int birthYear){
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthYear = birthYear;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public String getFirstName(){
        return firstName;
    }

    public void setlastName(String lastName){
        this.lastName = lastName;
    }

    public String getLastName(){
        return lastName;
    }

    public void setBirthYear(int birthYear){
        this.birthYear = birthYear;
    }

    public int getBirthYear(){
        return birthYear;
    }

    public int userAgeCalculation(int birthYear){
        return 2022 - birthYear;
    }

    public int heartRatecalculator(int userAge){
        return 220 - userAge;
    }

    public double targetHeartRate(double heartRate){
        return 0.2 * heartRate;
    }

    public double maxTargetHeartRate(double heartRate){
        return 0.85 * heartRate;
    }


}

