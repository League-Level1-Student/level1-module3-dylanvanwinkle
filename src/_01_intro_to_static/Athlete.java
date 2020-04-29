package _01_intro_to_static;

public class Athlete {
    static int nextBibNumber = 0;
    static String raceLocation = "New York";
    static String raceStartTime = "9.00am";

    String name;
    int speed;
    int bibNumber;

    Athlete (String name, int speed){
    	nextBibNumber++;
    	this.bibNumber = nextBibNumber;
        this.name = name;
        this.speed = speed;
    }

    public static void main(String[] args) {
        //create two athletes
        //print their names, bibNumbers, and the location of their race. 
    	Athlete a = new Athlete("Bob", 6);
    	Athlete at = new Athlete("Fred", 12);
    	System.out.println(a.name);
    	System.out.println(a.bibNumber);
    	System.out.println(raceLocation);
    	System.out.println(at.name);
    	System.out.println(at.bibNumber);
    	System.out.println(raceLocation);
    }
}