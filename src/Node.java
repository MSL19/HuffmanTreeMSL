/**
 * Name: Max Lewis
 * Lab Name: Node
 * Lab Purpose: Modify the Node class to work with a huffman codon by adding compareTo, isLeaf, toString, frequency, and char
 * Date: 12/05/18
 * Collaborators: None
 */
public class Node implements Comparable<Node>{

    private char cha;
    private int freq;
    private Node left;
    private Node right;

    public Node(char cha, int freq) {
        this.cha = cha;

        this.freq = freq;
    }

    public String toString() {
        return "Node{" +
                "Char=" + cha +
                ", freq=" + freq+
                '}';
    }

    public int compareTo(Node n) {
       /* if (key > n.getKey()) return 1;
        else if (key < n.getKey()) return -1;
        else return 0;*/

       return freq - n.getFreq();
    }
    public int getFreq(){
        return freq;
    }

    public void setFreq(int freq) {
        this.freq = freq;
    }

    public char getChar() {
        return cha;
    }

    public void setChar(char cha) {
        this.cha = cha;
    }
    public boolean isLeaf(){
        if(getLeft()==null || getRight()==null){
            return true;
        }
        else{
            return false;
        }
    }
    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }
}


