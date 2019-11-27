/**
 * Main class for BSTNode.java
 * @author Vlad Stejeroiu
 * @version 1.0
 * 21.04.2019.
 */
public class BSTNodeMain {

    public static void main(String[] args) {

        String[] interests = {"Rest", "Play Chess","Train"};
        Profile magnus = new Profile("Carlsen","Magnus", 30, 2, 1990, "Oslo", "Norway", "Norwegian","magnus@yahoo.com", interests);
        Profile fabi = new Profile("Daruana","Fabiano", 30, 7, 1992, "Rome", "Italy", "Italian","fabiano@yahoo.com", interests);

        BSTNode node1 = new BSTNode(magnus);
        BSTNode node2 = new BSTNode(fabi);
        node1.setR(node1);
        node2.setL(node2);

        //Get profile data from right node
        System.out.println(node1.getR().getProfile());

        //Get profile data from left node
        System.out.println(node2.getL().getProfile());

        }
    }
