/**
 * Name: Max Lewis
 * Lab Name: Driver
 * Lab Purpose: create a dictionary class with two array lists
 * Date: 10/02/18
 * Collaborators: None
 */
import java.util.*;

public class dictionary<E,T> {
    ArrayList<E> keys = new ArrayList<>();
    ArrayList<T> values = new ArrayList<>();
  //  int index = 0;
    //add an key-value pair to the dictionary
    void put(E key, T value){
        keys.add(key);
        values.add(value);
//        index++;
    }

    //get the value associated with a given key
    T get(E key){
        int index = 0;
        for(int i = 0; i<keys.size();i++){
            if(keys.get(i).equals(key)){
                return values.get(i);
            }
        }
        return null;

    }

    //remove a key-value pair and return its value
    T remove(E key){
        for(int i = 0; i<keys.size();i++){
            if(keys.get(i).equals(key)){
                keys.remove(i);
                T temp = values.get(i);
                values.remove(i);
                return temp;
            }
        }
        return null;

    }

    //returns true if the given key has an associated value
    boolean contains(E key){
        for(int i = 0; i<keys.size();i++){
            if(keys.get(i).equals(key)){
                return true;
            }
        }
        return false;

    }
    boolean containsVal(T value){
        for(int i = 0; i<values.size();i++){
            if(values.get(i).equals(value)){
                return true;
            }
        }
        return false;

    }
    //returns true if the dictionary is empty
    boolean isEmpty(){
        return keys.size()==0&&values.size()==0;
    }

    //returns the number of key-value pairs in the dictionary
    int size(){
        return keys.size();
    }

    //returns a Collection¹ of keys
    Collection<E> keys(){
            ArrayList <E> temp = new ArrayList<E>();
            for(int i = 0; i<keys.size(); i++){
                temp.add((E)keys.get(i));
            }//copy the outter not th inner
        return temp;
    }

    //returns a Collection of values
    Collection<T>  values(){
        ArrayList <T> temp = new ArrayList<T>();
        for(int i = 0; i<values.size(); i++){
            temp.add((T)values.get(i));
        }//copy the outter not th inner
        return temp;
    }
}
