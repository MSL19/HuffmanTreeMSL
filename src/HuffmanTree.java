/**
 * Name: Max Lewis
 * Lab Name: HuffmanTree
 * Lab Purpose: Create a Huffman tree using a modded Node class, priority queue, and queue
 * Date: 12/05/18
 * Collaborators: None
 */
import java.util.*;

public class HuffmanTree {
    Queue<Node> pQ;
    //String s;
    //Node root;
    public HuffmanTree() {
        pQ = new PriorityQueue<>();
        //s = new String();


    }
    public void compress(String s){
        setOrder(s);
        orderTree();
    }
    private void setOrder(String inputS){
        String seenChars = "";
        for(int i = 0; i<inputS.length(); i++) {

            if (!seenChars.contains(inputS.substring(i, i+1))) {
                int numIns = 0;

                char cha = inputS.charAt(i);
                seenChars += cha;
                for (int j = 0; j < inputS.length(); j++){
                    if(cha == inputS.charAt(j)){
                        numIns++;
                    }
            }
            pQ.add(new Node(cha, numIns));

        }
        }
    }

    private void orderTree(){
        int sTemp = pQ.size();
        for(int i = 0; i<sTemp-1; i++){
            Node temp1 = pQ.poll();
            Node temp2 = pQ.poll();
            Node temp3 = new Node('*', temp1.getFreq()+temp2.getFreq());
            temp3.setLeft(temp1);
            temp3.setRight(temp2);
            pQ.add(temp3);
        }
    }

    public Node peek(){
        return pQ.peek();
    }
//if stuff really doesn't work, use queue
    public String toString(){
        //Queue<Node> pQTemp = new PriorityQueue(pQ);
        //String input = pQ.peek().toString();
        //String s = new String();
        //return pQ.peek().toString()+ toStringRec(pQ.peek().getLeft(),pQ.peek().getRight());
      /*  ArrayList<Node> RnodeArr = new ArrayList<Node>();
        RnodeArr.add(pQ.peek());
        Node n1 = pQ.peek();
        while(!n1.isLeaf()){
            n1 = n1.getRight();
            RnodeArr.add(n1);
        }
    //    ArrayList<Node> nodeArr = new ArrayList<Node>();
        return RnodeArr;*/
        //ArrayList<Node> nodeArr = new ArrayList<Node>();
        String masterS = new String();
        Queue<Node> q = new LinkedList<>();
        Node n1 = pQ.peek();
        q.add(n1);
        while(q.peek()!=null){
            masterS += q.peek().toString();
            Node temp1 = q.poll();
            if(temp1.getLeft()!=null||temp1.getRight()!=null) {
                q.add(temp1.getLeft());
                q.add(temp1.getRight());
            }
        }
        return masterS;

    }
    public String toStringRec(Node n1, Node n2){ //depreciated

      /*  if(n1 == null || n2==null){// || pQ.poll().getLeft() == null || pQ.poll().getRight()==null){
            return s;
        }
       /* else if(n.getRight()==null || n.getLeft()==null){
            return s;// +=n.toString();
        }*/
       /* else {
          /*  Node temp1 = n.getLeft();
            Node temp2 = n.getRight();
*/
         /*   s += n1.toString() + n2.toString();
      /*      s += toStringRec(temp1);
            s += toStringRec(temp2);*/
           /*return toStringRec(n1.getLeft(), n1.getRight()) + toStringRec(n2.getLeft(), n2.getRight());

        }*/
        return "my name jeff";

    }
    public String toStringTest(){ //also depreciated
        String out = new String();
        Queue<Node> pQTemp = new PriorityQueue(pQ);
        int size = pQ.size();
        for(int i = 0; i<size-1; i++){
            out+=pQTemp.poll().toString();
        }
        return out;
    }

}
