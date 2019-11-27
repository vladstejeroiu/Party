import java.util.ArrayList;

/**
 * This class represents profile
 * @author Vlad Stejeroiu
 * @version 1.0
 */
public class Profile {

    /**
     * Last name of user.
     */
    private String lastname;
    
    /**
     * First name of user.
     */
    private String firstname;
    /**
     * A day when user was born.
     */
    private int day;

    /**
     * Month when user was born.
     */
    private int month;

    /**
     * Year when user was born.
     */
    private int year;

    /**
     * Town where user was born.
     */
    private String town;

    /**
     * Country when user was born.
     */
    private String country;

    /**
     * Nationality of user.
     */
    private String nationality;

    /**
     * Email of user.
     */
    private String email;
    /**
     * Interests of user.
     */
    private String[] interests;

    /**
     * Friends of user.
     */
    private ArrayList<Profile> friends = new ArrayList<Profile>();

    /**
     * Constructor.
     * @param name Name of a user
     * @param day Day of birthday
     * @param month Month of birthday
     * @param year Year of birth
     * @param town Town of birth
     * @param country Country of birth
     * @param nationality Nationality of user
     * @param interests Interests of user
     */
    public Profile(final String lastname, final String firstname, final int day, final int month,
                   final int year, final String town, final String country,
                   final String nationality, final String email, final String[] interests) {
        this.lastname = lastname;
        this.firstname = firstname;
        this.day = day;
        this.month = month;
        this.year = year;
        this.town = town;
        this.country = country;
        this.nationality = nationality;
        this.email = email;
        this.interests = interests;

    }

    /**
     * Getter for town.
     * @return town of birth
     */
    public String getTown() {
        return town;
    }

    /**
     * Setter for town.
     * @param town of birth
     */
    public void setTown(final String town) {
        this.town = town;
    }

    /**
     * Getter for country.
     * @return country of birth
     */
    public String getCountry() {
        return country;
    }

    /**
     * Setter for country.
     * @param country of birth
     */
    public void setCountry(final String country) {
        this.country = country;
    }

    /**
     * Getter for nationality.
     * @return nationality
     */
    public String getNationality() {
        return nationality;
    }

    /**
     * Setter for nationality.
     * @param nationality of user
     */
    public void setNationality(final String nationality) {
        this.nationality = nationality;
    }

    /**
     * Getter for nationality.
     * @return nationality
     */
    public String getEmail() {
        return email;
    }

    /**
     * Setter for nationality.
     * @param nationality of user
     */
    public void setEmail(final String email) {
        this.email = email;
    }

    /**
     * Getter for interests.
     * @return interests
     */
    public String[] getInterests() {
        return interests;
    }

    /**
     * Setter for interests.
     * @param interests of user
     */
    public void setInterests(final String[] interests) {
        this.interests = interests;
    }

    /**
     * Getter for name.
     * @return name of user
     */
    public String getName() {
        return lastname + " " + firstname;
    }
    
    /**
     * Getter for DoB.
     * @return date of birth in dd/mm/yyyy format
     */
    public String getDateOfBirth() {
        return day + "/" + month + "/" + year;
    }

    /**
     * Adds friend to array list.
     * @param p friend
     */
    public void addFriend(final Profile p) {
        friends.add(p);
    }

    /**
     * Getter for a friend on position i.
     * @param i number of a friend in array list
     * @return friend on position i
     */
    public Profile getFriend(final int i) {
        return friends.get(i);
    }

    /**
     * Returns number of friends.
     * @return number of friends
     */
    public int numOfFriends() {
        return friends.size();
    }
    /**
     * Returns the list of friends of an user.
     * @return names of friends
     */
    public ArrayList<String> getFriendsNames()
    {
        ArrayList<String> names = new ArrayList<String>();
        for (Profile p : friends)
        {
            names.add(p.getName());
        }
        return names;
    }
    /**
     * Prints profile in nice format.
     * @return message with formatted info about profile
     */
    public String toString() {
        String msg;
        msg = "Last Name: " + lastname;
        msg += "\nFirst Name: " + firstname;
        msg += "\nDate of Birth: " + getDateOfBirth();
        msg += "\nNationality: " + nationality;
        msg += "\nTown: " + town ;
        msg += "\nCountry: " + country;
        msg += "\nEmail Address: " + email;
        msg += "\nInterests: \n";
        for (String interest : interests) {
            msg += interest + "\n";
        }
        msg += "Has " + numOfFriends() + " friends.";
        return msg;
    }
}