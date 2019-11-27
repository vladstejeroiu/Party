/**
 * Main class for BST.java
 * @author Vlad Stejeroiu
 * @version 1.0
 * 22.04.2019
 */
public class BSTMain {

    public static void main(String[] args) {
        String[] interests = {"Rest", "Play Chess","Train"};
        Profile an = new Profile("Frlsen","Bagnus", 30, 5, 1989, "Oslo", "Norway", "Norwegian","magnus@yahoo.com", interests);
        Profile magnus = new Profile("Garlsen","Magnus", 30, 2, 1990, "Oslo", "Norway", "Norwegian","magnus@yahoo.com", interests);
        Profile fabi = new Profile("Daruana","Fabiano", 30, 7, 1992, "Rome", "Italy", "Italian","fabiano@yahoo.com", interests);
        Profile p1 = new Profile("Airen","Aing", 24, 10, 1992, "Beijing", "China", "Chinese","ding@yahoo.com", interests);
        Profile p2 = new Profile("Xiren","Xing", 24, 10, 1992, "Beijing", "China", "Chinese","ding@yahoo.com", interests);
        Profile p3 = new Profile("Liren","Ling", 24, 10, 1992, "Beijing", "China", "Chinese","ding@yahoo.com", interests);
        Profile ding = new Profile("Miren","Ming", 24, 10, 1992, "Beijing", "China", "Chinese","ding@yahoo.com", interests);
        BST newBt = new BST();
        BSTNode node1=new BSTNode(magnus);
        BSTNode node2=new BSTNode(fabi);
        BSTNode node3=new BSTNode(ding);
        BSTNode node4=new BSTNode(an);
        BSTNode node5=new BSTNode(p1);
        BSTNode node6=new BSTNode(p2);
        BSTNode node7=new BSTNode(p3);
        newBt.insertProfile(magnus);
        newBt.insertProfile(fabi);
        newBt.insertProfile(ding);
        newBt.insertProfile(an);
        newBt.insertProfile(p1);
        newBt.insertProfile(p2);
        newBt.insertProfile(p3);
        System.out.println(newBt.getRoot().getProfile().getName());
        System.out.println(newBt.getRoot().getL().getProfile().getName());
        System.out.println(newBt.getRoot().getL().getL().getProfile().getName());
        System.out.println(newBt.getRoot().getL().getR().getProfile().getName());
        System.out.println(newBt.getRoot().getR().getProfile().getName());
        System.out.println(newBt.getRoot().getR().getL().getProfile().getName());
        System.out.println(newBt.getRoot().getR().getR().getProfile().getName());
        System.out.println();
        newBt.printAlphabetical();
    }
}
