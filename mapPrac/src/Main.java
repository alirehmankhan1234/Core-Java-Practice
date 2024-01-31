import com.sun.org.apache.bcel.internal.generic.LineNumberGen;

import java.util.*;

public class Main {
    enum Size {
        SMALL, MEDIUM, LARGE, EXTRALARGE
    }
    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap<Integer, String>();
        map.put(101, "Ali Rehman");
        map.put(102, "Wali Khan");
        map.put(103, "Saad Shaikh");
        map.put(104, "Shahzaib");

        for(Map.Entry<Integer, String> m: map.entrySet()){
            System.out.println(m.getKey()+ " : "+m.getValue());
        }

        System.out.println(map.get(101));

        System.out.println(map.get(102));

        System.out.println(map.keySet());

        System.out.println(map.values());

        System.out.println(map.entrySet());

        System.out.println(map.remove(101));


        map.clear();

        System.out.println(map);

        System.out.println("\n\n LinkedHashMap : \n\n");
        Map<String, Integer> evenNum = new LinkedHashMap<String, Integer>();
        evenNum.put("Two", 2);
        evenNum.put("Four", 4);
        evenNum.put("Six", 6);

        System.out.println(evenNum);

        evenNum.putIfAbsent("Eight", 8);
        evenNum.putIfAbsent("Six", 6);

        System.out.println(evenNum);

        System.out.println("\n\n EnumMap \n\n");

        EnumMap<Size, Integer> sizes = new EnumMap<Size, Integer>(Size.class);
        sizes.put(Size.SMALL, 10);
        sizes.put(Size.MEDIUM, 20);
        sizes.put(Size.LARGE, 30);
        sizes.put(Size.EXTRALARGE, 40);

        System.out.println(sizes);
        System.out.println(sizes.keySet());
        System.out.println(sizes.values());
        System.out.println(sizes.entrySet());

        System.out.println("\n\n SortedMap \n\n");

        SortedMap<String, Integer> numbers = new TreeMap<String, Integer>();
        numbers.put("One", 1);
        numbers.put("Two", 2);
        numbers.put("Three", 3);
        numbers.put("Four", 4);

        System.out.println(numbers);
        System.out.println(numbers.firstKey());
        System.out.println(numbers.lastKey());
        System.out.println(numbers.remove("One"));

        System.out.println("\n\n NavigableMap \n\n");
        NavigableMap<String, Integer> numbers2 = new TreeMap<String, Integer>();
        numbers2.put("One", 1);
        numbers2.put("Three", 3);
        numbers2.put("Two", 2);
        numbers2.put("Four", 4);

        System.out.println(numbers2);
        System.out.println(numbers2.firstEntry());
        System.out.println(numbers2.lastEntry());
        System.out.println(numbers2.pollFirstEntry());
        System.out.println(numbers2.pollLastEntry());

        System.out.println("\n\n TreeMap \n\n");
        TreeMap<String, Integer> numbers3 = new TreeMap<String, Integer>();

        numbers3.put("ONE", 1);
        numbers3.put("TWO", 2);
        numbers3.put("THREE", 3);

        numbers3.putIfAbsent("THREE", 3);
        numbers3.putIfAbsent("FOUR", 4);
        numbers3.putIfAbsent("FIVE", 5);

        System.out.println(numbers3);
        System.out.println(numbers3.keySet());
        System.out.println(numbers3.values());
        System.out.println(numbers3.entrySet());



    }
}