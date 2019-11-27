/**
 * This class represents a binary search tree.
 * @author Vlad Stejeroiu
 * @version 1.0
 */
import java.util.Stack;
public class BST {

    /**
     * Root node of a binary search tree.
     */
    private BSTNode root;

    /**
     * Constructor which set root to null.
     */
    public BST() {
        this.root = null;
    }

    /**
     * This method calls private method insertProfile.
     * @param p A profile which is needed to be added
     */
    public void insertProfile(final Profile p) {
        root = insertProfile(root, new BSTNode(p));
    }

    /**
     * This method adds new profile to binary search tree.
     * @param currentParent root node of binary search tree
     * @param newNode a node with new profile created in it
     * @return final node with profile added either to the right or left
     */
    private BSTNode insertProfile(final BSTNode currentParent,
                                  final BSTNode newNode) {
        int compareResult;
        BSTNode newParent = null;
        if (currentParent == null) {
            return newNode;
        }
        compareResult = currentParent.getProfile().getName().
                compareTo(newNode.getProfile().getName());
        if (compareResult > 0) {
            newParent = currentParent.getL();
            currentParent.setL(insertProfile(newParent, newNode));
        } else if (compareResult < 0) {
            newParent = currentParent.getR();
            currentParent.setR(insertProfile(newParent, newNode));
        }
        return currentParent;
    }
    
    /**
     * Get method returning the root of the binary search tree
     * @return root of the binary search tree.
     */
    public BSTNode getRoot() 
    { 
    	return root;
    }
    
    /**
     * This method calls a private method printAlpha.
     * It is done not to access root from outside of this class.
      */
        public void printAlphabetical() throws NullPointerException
        {
        printAlpha(this.root);
    }
    /**
     * In order traversal for binary search tree.
     * @param node a starting point for in order traversal
     */
    private void printAlpha(BSTNode node) {
    	// Traverse the left node
        if (node.getL() != null) {
            printAlpha(node.getL());
        }
        System.out.println(node.getProfile().getName());
        // Traverse the right node
        if (node.getR() != null) {
            printAlpha(node.getR());
        }
    }
    /**
     * This method finds node by profile name.
     * @param name name of a profile which is needed to find
     * @return node with profile required
     */
    public Profile find(final String name) {
        BSTNode current = root;
        while (current != null) {
            if (current.getProfile().getName().compareTo(name) == 0) {
                return current.getProfile();
            } else if (current.getProfile().getName().compareTo(name) > 0) {
                current = current.getL();
            } else if (current.getProfile().getName().compareTo(name) < 0) {
                current = current.getR();
            }
        }
        return current.getProfile();
    }
}
