import java.io.File;
import java.util.ArrayList;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * This is a file reader to read files needed for Binary Search Tree and Graph
 * @author Vlad Stejeroiu
 * @version 1.0
 */
public class FileReader {
    /**
     * Default day/year/month in case of wrong output
     */
    private static final int DEFAULT_DATE = 1;
    /**
     * Scans file with profiles.
     * @param filename name of file
     * @return bst with profiles
     */
    public static BST readProfileSet(String filename) {

        File inFile = new File(filename);

        Scanner in = null;
        try {
            in = new Scanner(inFile);
        } catch (FileNotFoundException e) {
            System.out.print("The file does not exist!");
        }
        return FileReader.readData(in);
    }
    
    /**
     * Constructs bst with profiles.
     * @param in scanner with profile data
     * @return constructed bst
     */
    private static BST readData(final Scanner in) {
        BST bt = new BST();
        String line = null;
        while (in.hasNextLine()) {
            line = in.nextLine();
            if (line.length() > 1) {
                Scanner lineSc = new Scanner(line);
                bt.insertProfile(createProfile(lineSc));
            }
        }
        return bt;
    }

    /**
     * Take all data from file, splits it on variables and creates profile.
     * @param line scanner with one line from file
     * @return profile object
     */
    public static Profile createProfile(final Scanner line) {
        String lastname,firstname, town, country, nationality,email;
        int day, month, year; // Variables representing date(dd/mm/yyyy)
       
        String[] interests;
        line.useDelimiter(",");
        lastname = line.next();
        firstname = line.next();
        try {
            day = Integer.parseInt(line.next());
        } catch (NumberFormatException e) {
            System.out.println("Not an integer, so it is set to " + DEFAULT_DATE);
            day = DEFAULT_DATE;
        }
        try {
            month = Integer.parseInt(line.next());
        } catch (NumberFormatException e) {
            System.out.println("Not an integer, so it is set to " + DEFAULT_DATE);
            month = DEFAULT_DATE;
        }
            try {
                year = Integer.parseInt(line.next());
            } catch (NumberFormatException e) {
                System.out.println("Not an integer, so it is set to " + DEFAULT_DATE);
                year = DEFAULT_DATE;
            }
        town = line.next();
        country = line.next();
        nationality = line.next();
        email = line.next();
        interests = groupInterests(line);
        Profile p = new Profile(lastname,firstname, day, month, year, town, country,
                nationality,email, interests);
        return p;
    }

    /**
     * Creates an array of interests.
     * @param in scanner with interests for one profile only
     * @return array of interests
     */
    private static String[] groupInterests(final Scanner in) {
        in.useDelimiter(";");
        ArrayList<String> interestArrayList = new ArrayList<>();
        String interest = in.next();
        interest = interest.substring(1,interest.length());
        interestArrayList.add(interest);
        while (in.hasNext())
        {
        	interestArrayList.add(in.next());
        }
        // We change the arraylist to array.
        String[] interestArray = new String[interestArrayList.size()];
        interestArray = interestArrayList.toArray(interestArray);
        return interestArray;
    }

}
