import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList(4,2,1,6,4,9);

//        Consumer<Integer> con = new Consumer<Integer>() {
//            @Override
//            public void accept(Integer n) {
//                System.out.println(n);
//            }
//        };

//        Consumer<Integer> con = n -> System.out.println(n);
//
//        nums.forEach(con);


//        nums.forEach(n -> System.out.println(n));

//        Stream<Integer> s1 = nums.stream();
//        Stream<Integer> s2 = s1.filter(n->n%2==0);
//        Stream<Integer> s3 = s2.map(n->n*2);
//        int result = s3.reduce(0, (c, e)->c+e);

        Predicate<Integer> p = n->n%2 == 0;

        Function<Integer, Integer> fun = new Function<Integer, Integer>(){
            public Integer apply(Integer n){
                return n*2;
            }
        };

        // stream chaining
//        int result  = nums.stream()
//                        .filter(p)
//                                .map(fun)
//                                        .reduce(0, (c, e)->c+e);


                int result  = nums.stream()
                        .filter(p)
                                .map(fun)
                                        .reduce(0, (c, e)->c+e);



        System.out.println(result);

        Stream<Integer> sortedValues = nums.stream()
                .filter(n->n%2==0)
                        .sorted();
        sortedValues.forEach(n -> System.out.println(n));
        System.out.println("Hello world!");
    }
}