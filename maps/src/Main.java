import java.util.EnumMap;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Main {
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

        enum Size {
            SMALL, MEDIUM, LARGE, EXTRALARGE
        }

        EnumMap<Size, Integer> sizes = new EnumMap<Size, Integer>(Size.class);
        sizes.put(Size.SMALL, 10);
        sizes.put(Size.MEDIUM, 20);
        sizes.put(Size.LARGE, 30);
        sizes.put(Size.EXTRALARGE, 40);

        System.out.println(sizes);
        System.out.println(sizes.keySet());
        System.out.println(sizes.values());
        System.out.println(sizes.entrySet());
        System.out.println(sizes.entrySet());




    }
}