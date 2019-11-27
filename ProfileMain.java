/**
 * Main class for Profile.java
 * @author Vlad Stejeroiu
 * @version 1.0
 * 20.04.2019.
 */
public class ProfileMain {

    public static void main(String[] args){

        String[] interests = {"Rest", "Play Chess","Train"};
        Profile magnus = new Profile("Carlsen","Magnus", 30, 2, 1990, "Oslo", "Norway", "Norwegian","magnus@yahoo.com", interests);

        System.out.println("Name:" + magnus.getName());
        System.out.println("Born on:" + magnus.getDateOfBirth());
        System.out.println("Is " + magnus.getNationality());
        System.out.print("Overall info: \n" + magnus.toString());
    }
}
