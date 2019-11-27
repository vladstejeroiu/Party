/**
 * Main class for Graph.
 * @author Vlad Stejeroiu
 * @version 1.0
 * 5.05.2019
 */

public class GraphMain {

    public static void main(String[] args) {
        
    	
        
        String[] interests = {"Rest", "Play Chess","Train"};
        Profile p1 = new Profile("Frlsen","Bagnus", 30, 2, 1990, "Oslo", "Norway", "Norwegian","magnus@yahoo.com", interests);
        Profile p2 = new Profile("Garlsen","Magnus", 30, 2, 1990, "Oslo", "Norway", "Norwegian","magnus@yahoo.com", interests);
        Profile p3 = new Profile("Daruana","Fabiano", 30, 7, 1992, "Rome", "Italy", "Italian","fabiano@yahoo.com", interests);
        Profile p4 = new Profile("Airen","Aing", 24, 10, 1992, "Beijing", "China", "Chinese","ding@yahoo.com", interests);
        Profile p5 = new Profile("Xiren","Xing", 24, 10, 1992, "Beijing", "China", "Chinese","ding@yahoo.com", interests);
        Profile p6 = new Profile("Liren","Ling", 24, 10, 1992, "Beijing", "China", "Chinese","ding@yahoo.com", interests);
        Profile p7 = new Profile("Miren","Ming", 24, 10, 1992, "Beijing", "China", "Chinese","ding@yahoo.com", interests);
        Profile[] users= new Profile[] {p1, p2, p3, p4, p5, p6, p7};
        
        BST bt = FileReader.readProfileSet("profiles");
        Graph x = new Graph("friendships", bt);
        Graph g = x.readFriends("friendships", bt);
        BST[] invitations = g.friendRecommendations(users);
        
        users[0].addFriend(users[1]);
        users[1].addFriend(users[0]);
        users[0].addFriend(users[2]);
        users[2].addFriend(users[0]);
        users[1].addFriend(users[2]);
        users[2].addFriend(users[1]);
        users[1].addFriend(users[4]);
        users[4].addFriend(users[1]);
        users[2].addFriend(users[5]);
        users[5].addFriend(users[2]);
        users[3].addFriend(users[6]);
        users[6].addFriend(users[3]);
        users[5].addFriend(users[6]);
        users[6].addFriend(users[5]);
       
        
        for(int i=0;i<invitations.length;i++)
        {
        	try {
        	System.out.println(users[i].getName() + " friend recommendations are: ");
        	invitations[i].printAlphabetical();
        	} catch (NullPointerException e)
        	{
        		System.out.println(users[i].getName() + " no friend can be recommended. ");
        	}
        	//System.out.println("\n");
    }
}
}
