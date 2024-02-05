

//final class A {
//
//}
//
//class B extends A {
//
//}

sealed class C permits D,E {

}

final class D extends C  {

}

sealed class E extends C permits F  {

}

final class F extends E {

}



public class Main {
    public static void main(String[] args) {

        System.out.println("Sealed Class\n\n");


    }
}