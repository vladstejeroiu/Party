/**
 * Main class for file reader
 * @author Vlad Stejeroiu
 * @version 1.0
 * 25.04.2019
 */
public class FileReaderMain {

    public static void main(String[] args){
    	BST bT = new  BST();
        bT = FileReader.readProfileSet("profiles");
        System.out.println(bT.getRoot().getProfile());
        System.out.println(bT.getRoot().getR().getProfile());
        System.out.println(bT.getRoot().getL().getProfile());

    }
}