public class StringBuff {

    public static void main(String []args){

        StringBuffer buffer = new StringBuffer("Hello");
        System.out.println(buffer.capacity());
        buffer.append(" World");
        System.out.println(buffer);

        StringBuilder buffer2 = new StringBuilder("Hello");
        System.out.println(buffer2.capacity());
        buffer2.append(" World");
        System.out.println(buffer2);




    }
}
