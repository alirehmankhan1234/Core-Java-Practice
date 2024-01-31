import java.util.*;
import java.util.function.IntToLongFunction;

public class Main {
    enum Size {
        SMALL, MEDIUM, LARGE, EXTRALARGE
    }
    public static void main(String[] args) {

        System.out.println("\n\n Set \n\n");
        Set<Integer> setVar = new HashSet<Integer>();

        setVar.add(100);
        setVar.add(200);
        setVar.add(300);
        setVar.add(400);

        System.out.println(setVar);
        Iterator<Integer> iterate = setVar.iterator();

        while(iterate.hasNext()){
            System.out.println(iterate.next());
        }

        System.out.println(setVar.remove(300));
        System.out.println(setVar.removeAll(setVar));

        HashSet<Integer> set1 = new HashSet<Integer>();
        set1.add(100);
        set1.add(200);
        set1.add(300);
        set1.add(400);

        HashSet<Integer> set2 = new HashSet<Integer>();
        set2.add(100);
        set2.add(200);
        set2.add(300);
        set2.add(400);
        set2.add(500);

//        set1.addAll(set2);
        System.out.println(set1);

        set1.retainAll(set2);
        System.out.println(set1);

        set2.removeAll(set1);
        System.out.println(set2);


        System.out.println("\n\n EnumSet \n\n");

//        System.out.println(Size.class);

        EnumSet<Size> sizes = EnumSet.allOf(Size.class);
        System.out.println(sizes);

        EnumSet<Size> sizes2 = EnumSet.noneOf(Size.class);
        System.out.println(sizes2);

        EnumSet<Size> sizes3 = EnumSet.range(Size.MEDIUM, Size.EXTRALARGE);
        System.out.println(sizes3);

        EnumSet<Size> sizes4 = EnumSet.of(Size.SMALL, Size.LARGE);
        System.out.println(sizes4);

        Iterator<Size> iterateSet = sizes4.iterator();

        while(iterateSet.hasNext()){
            System.out.println(iterateSet.next());
        }


        System.out.println("\n\n LinkedHashedSet \n\n");

        ArrayList<Integer> evenNumber = new ArrayList<Integer>();
        evenNumber.add(2);
        evenNumber.add(4);
        evenNumber.add(6);
        evenNumber.add(8);

        System.out.println(evenNumber);

        LinkedHashSet<Integer> numbers = new LinkedHashSet<Integer>();
        numbers.addAll(evenNumber);
        numbers.add(10);

        System.out.println(numbers);

        Iterator<Integer> iterateLinkHashSet = numbers.iterator();

        while(iterateLinkHashSet.hasNext()){
            System.out.println(iterateLinkHashSet.next());
        }

        System.out.println("\n\n SortedHashedSet \n\n");

        SortedSet<String> set = new TreeSet<String>();
        set.add("India");
        set.add("Australia");
        set.add("South Africa");
        set.add("Japan");
        set.add("India");

        System.out.println(set);
        Iterator<String> iterator = set.iterator();

        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println(set.contains("India"));
        System.out.println(set.first());
        System.out.println(set.last());

        System.out.println(set.remove("Japan"));
        System.out.println(set.removeAll(set));


        System.out.println("\n\n NavigableHashedSet \n\n");

        NavigableSet<Integer> navSet = new TreeSet<Integer>();

        navSet.add(10);
        navSet.add(20);
        navSet.add(30);
        navSet.add(40);
        navSet.add(50);
        navSet.add(60);

        NavigableSet<Integer> reverseNavSet = navSet.descendingSet();

        System.out.println(navSet);
        System.out.println(reverseNavSet);

        NavigableSet<Integer> threeOrMore = navSet.tailSet(30, true);
        System.out.println(threeOrMore);
        System.out.println("Returns the greatest element in this set strictly less than the given element, or null if there is no such element.: "+navSet.lower(3));


        System.out.println(navSet.pollFirst());
        System.out.println(navSet);

        System.out.println("\n\n TreeSet \n\n");

        NavigableSet<String> treeSetEx = new TreeSet<String>();
        treeSetEx.add("A");
        treeSetEx.add("B");
        treeSetEx.add("C");
        treeSetEx.add("C");

        System.out.println(treeSetEx);
        System.out.println(treeSetEx.contains("D"));
        System.out.println(treeSetEx.first());
        System.out.println(treeSetEx.last());
        System.out.println(treeSetEx.higher("B"));
        System.out.println(treeSetEx.lower("B"));

        System.out.println(treeSetEx.pollFirst());
        System.out.println(treeSetEx.pollLast());
















    }
}