/**
 * Class representing a node of a binary search tree.
 * @author Vlad Stejeroiu
 * @version 1.0
 */
public class BSTNode {

    /**
     * Profile inserted into node.
     */
    private Profile data;
    /**
     * Left node.
     */
    private BSTNode l;
    /**
     * Right node.
     */
    private BSTNode r;

    /**
     * Constructor.
     * @param profile profile contained into this node
     */
    public BSTNode(final Profile profile) {
        this.data = profile;
    }

    /**
     * Getter for profile.
     * @return profile
     */
    public Profile getProfile() {
        return data;
    }

    /**
     * Getter for left node.
     * @return left node
     */
    public BSTNode getL() {
        return l;
    }

    /**
     * Setter for left node.
     * @param leftNode node which is needed to be inserted to the left
     */
    public void setL(final BSTNode l) {
        this.l = l;
    }

    /**
     * Getter for right node.
     * @return right node
     */
    public BSTNode getR() {
        return r;
    }

    /**
     * Setter for right node.
     * @param rightNode node which is needed to be inserted to the right
     */
    public void setR(final BSTNode r) {
        this.r = r;
    }
}
