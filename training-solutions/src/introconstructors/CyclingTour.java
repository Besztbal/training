package introconstructors;

import java.time.LocalDateTime;

public class CyclingTour {

    private String description;
    private LocalDateTime startTime;
    private int numberOfPeople;
    private double kms;

    public CyclingTour(String description, LocalDateTime startTime) {
        this.description = description;
        this.startTime = startTime;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalDateTime startTime) {
        this.startTime = startTime;
    }

    public int getNumberOfPeople() {
        return numberOfPeople;
    }

    public void setNumberOfPeople(int numberOfPeople) {
        this.numberOfPeople = numberOfPeople;
    }

    public double getKms() {
        return kms;
    }

    public void setKms(double kms) {
        this.kms = kms;
    }


    public void registerPerson(int person){
        this.numberOfPeople += person;
    }

    public void ride(double km){
        this.kms += km;
    }

    public static void main(String[] args) {

        CyclingTour cyclingTour=new CyclingTour("Kerekes Kékes",LocalDateTime.now());

        System.out.println("description: " + cyclingTour.getDescription()+"\n"+
                            "Start time: " + cyclingTour.getStartTime() +"\n"+
                            "Number of people: " + cyclingTour.getNumberOfPeople()+"\n"+
                            "Kms: "+ cyclingTour.getKms());

        cyclingTour.registerPerson(5);
        cyclingTour.ride(200);

        System.out.println("description: " + cyclingTour.getDescription()+"\n"+
                "Start time: " + cyclingTour.getStartTime() +"\n"+
                "Number of people: " + cyclingTour.getNumberOfPeople()+"\n"+
                "Kms: "+ cyclingTour.getKms());


    }
}
