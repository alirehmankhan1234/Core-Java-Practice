import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        List<Integer> linkedList = new LinkedList<Integer>();
        List<Integer> arrayList = new ArrayList<Integer>();
        List<Integer> vector  = new Vector<Integer>();

        List<String> arrayLst = new ArrayList<String>();
        arrayLst.add("Ali");

        arrayLst.add("Rehman");

        arrayLst.add("Khan");

        arrayLst.add("Naeem");

        arrayLst.add("Ayesha");

        System.out.println(arrayLst.size());

        for(String value : arrayLst){
            System.out.println(value);
        }


        arrayLst.remove(1);

        System.out.println("After Removing: \n\n");

        for(String value : arrayLst){
            System.out.println(value);
        }


        List<String> linkedLst = new LinkedList<String>();
        linkedLst.add("Python");
        linkedLst.add("Javascript");
        linkedLst.add("C++");
        linkedLst.add("Python");
        linkedLst.add("Scala");
        linkedLst.add("Rust");

        System.out.println("\n\nSize of Linked List: "+linkedLst.size());

        for(String value: linkedLst){
            System.out.println(value);
        }

        linkedLst.remove(0);
        linkedLst.remove("Scala");

        System.out.println("After Removing: \n\n");

        for(String value: linkedLst){
            System.out.println(value);
        }


        List<String> vec = new Vector<String>();
        vec.add("Programming");
        vec.add("DataBase");
        vec.add("Theory of Automata");
        vec.add("Discrete Mathematics");
        vec.add("Networking");
        vec.add("Data Structures");

        System.out.println("\n\nSize of Vector List: "+vec.size());

        for(String value: vec){
            System.out.println(value);
        }

        vec.remove(0);
        vec.remove("Networking");

        System.out.println("After Removing: \n\n");

        for(String value: vec){
            System.out.println(value);
        }

        System.out.println("\n\nSize of Vector List After Removing: "+vec.size());

    }
}