/**
 * Name: Max Lewis
 * Lab Name: Driver
 * Lab Purpose: this is a driver to display the capabilities of the dictionary class
 * Date: 10/02/18
 * Collaborators: None
 */
import javax.xml.transform.Source;
import java.util.*;

public class driver {
    public static void main(String[] args) {
        HuffmanTree tre = new HuffmanTree();
        tre.compress("The dog gandered at the gander."); //compresses the phrase "The dog gandered at the gander."
        System.out.println("peek() test Expected: Node{Char=*, freq=31}");
        System.out.println("peek() result: "+tre.peek()); //test of peek method
        System.out.println("toString() test Expected: wow tree: Node{Char=*, freq=31}Node{Char=*, freq=13}Node{Char=*, freq=18}Node{Char=*, freq=6}Node{Char=*, freq=7}Node{Char=*, freq=8}Node{Char=*, freq=10}Node{Char=a, freq=3}Node{Char=*, freq=3}Node{Char=g, freq=3}Node{Char=*, freq=4}Node{Char=d, freq=4}Node{Char=*, freq=4}Node{Char= , freq=5}Node{Char=e, freq=5}\n");
        System.out.println("toString() result" + tre.toString()); //test of toString
        System.out.println("checking that it doesn't destroy the original: "+tre.toString());

    }
}
