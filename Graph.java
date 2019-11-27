import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * This class represents Graph.
 * @author Vlad Stejeroiu
 * @version 1.0
 */
public class Graph {

    /**
     * Name of file.
     */
    private String filename;

    /**
     * Binary search tree where all profiles are going to be added.
     */
    private BST bt;
    /**
     * Constructor.
     * @param fileName name of file
     * @param tree bst with all profiles
     */
    public Graph(final String fileName, final BST tree) {
        this.filename = fileName;
        this.bt = tree;
    }
    /**
     * Scans file with friendships.
     * @param filename name of file
     * @param bt bst with all profiles
     * @return constructed graph with friend connections created
   */
    public static Graph readFriends(final String filename, final BST bt) {
        File inFile = new File(filename);

        Scanner in = null;
        try {
            in = new Scanner(inFile);
        } catch (FileNotFoundException e) {
            System.out.print("The file does not exist!");
        }
        return readData(filename, in, bt);
    }

    /**
     * Constructs a graph with friendships.
     * @param filename name of file
     * @param in scanner with file data
     * @param bt binary search tree with all profiles
     * @return graph with friends connections
     */
    private static Graph readData(final String filename, final Scanner in,
                                  final BST bt) {
        in.useDelimiter(",");
        String line = null;
        while (in.hasNextLine()) {
            line = in.nextLine();
            if (line.length() > 1) {
                Scanner lineSc = new Scanner(line);
                createFriendship(lineSc, bt);
            }
        }
        Graph g = new Graph(filename, bt);
        return g;
    }

    /**
     * Make friendships between profiles.
     * @param in scanner with friendships
     * @param bt bst with all profiles
     */
    private static void createFriendship(final Scanner in, final BST bt) {
        in.useDelimiter(",");
        String profileOne, profileTwo;
        profileOne = in.next();
        profileTwo = in.next();
        if (bt.find(profileOne) != null && bt.find(profileTwo) != null) {
            bt.find(profileOne).addFriend(bt.find(profileTwo));
            bt.find(profileTwo).addFriend(bt.find(profileOne));
        } else {
            System.out.println("cannot find a name");
        }
    }
    /**
     * Checks if two profiles are already friends.
     * @param p1 profile number 1
     * @param p2 profile number 2
     */
    private boolean Friends(Profile p1, Profile p2)
    {
    	int numFriends=p1.numOfFriends();
    	boolean alreadyFriends=false;
    	if(numFriends>0)
    	{
    		for(int i=0;i<numFriends;i++)
    		{
    			if(p1.getFriend(i).equals(p2))
    				alreadyFriends=true;	
    		}
    	}
    	if(alreadyFriends)
    		{ return true;
    	} else  {
    		 return false;
    		}
    }
    /**
     * If two profiles are not already friends, make them.
     * @param p1 profile number 1
     * @param p2 profile number 2
     */
    private void addFriend(Profile p1,Profile p2)
    {
    	if(Friends(p1,p2)==true)
    	{
    		p1.addFriend(p2);
    	}
    }
    /**
     * Function to give suggestion for friends
     * @param users profile array
     * @return recommendations of common friends
     */
    public BST[] friendRecommendations(Profile[] users) {
    	BST[] recommendations = new BST[users.length];
        for (int i = 0; i < recommendations.length; i++) {
        	recommendations[i]=new BST();
        }
        for (int i = 0; i < users.length; i++) {
            for (int j = 0; j < users[i].numOfFriends(); j++) {
            	for (int k = 0; k < users[i].getFriend(j).numOfFriends(); k++) {
                if (Friends(users[i],users[i].getFriend(j).getFriend(k)) && users[i].equals(users[i].getFriend(j).getFriend(k)))
                		recommendations[i].insertProfile(users[i].getFriend(j).getFriend(k));   
                }
            }
        }
        return recommendations;
    }
  }
