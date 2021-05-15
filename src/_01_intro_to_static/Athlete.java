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
    	paola.nextBibNumber = 15;
    	Athlete alfredo = new Athlete("alfredo", 18);
    	alfredo.nextBibNumber = 19;
    	System.out.println(paola.name + "'s bib number is "+ paola.nextBibNumber + " and the location is " + paola.raceLocation);
    	System.out.println(alfredo.name + "'s bib number is "+ alfredo.nextBibNumber + " and the location is "+ alfredo.raceLocation);
        //create two athletes
        //print their names, bibNumbers, and the location of their race. 
    }
}
