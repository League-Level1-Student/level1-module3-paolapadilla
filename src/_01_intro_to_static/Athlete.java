package _01_intro_to_static;

public class Athlete {
    static int nextBibNumber;
    static String raceLocation = "New York";
    static String raceStartTime = "9.00am";

    String name;
    int speed;
    int bibNumber;

    Athlete(String name, int speed) {
        this.name = name;
        this.speed = speed;
    }

    public static void main(String[] args) {
    	Athlete paola = new Athlete("paola", 14); 
    	
    	Athlete alfredo = new Athlete("alfredo", 18);
        //create two athletes
        //print their names, bibNumbers, and the location of their race. 
    }
}
