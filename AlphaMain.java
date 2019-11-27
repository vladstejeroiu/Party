/**
 * 
 * Testing class for printAlphabetical method.
 * @author Vlad Stejeroiu
 * @version 1.0
 * 26.04.2019
 */
public class AlphaMain {

    public static void main(String[] args){

        BST bt = FileReader.readProfileSet("profiles");
        System.out.println("Printing names in alphabetical order:");
        bt.printAlphabetical();
    }
}
