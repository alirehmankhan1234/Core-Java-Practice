import java.util.Objects;

//class Alien
//{
//    private final  int id;
//    private final  String name;
//
//    public int getId() {
//        return id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Alien alien = (Alien) o;
//        return id == alien.id && Objects.equals(name, alien.name);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(id, name);
//    }
//
//    @Override
//    public String toString() {
//        return "Alien{" +
//                "id=" + id +
//                ", name='" + name + '\'' +
//                '}';
//    }
//
//
//    Alien(int id, String name) {
//        this.id = id;
//        this.name = name;
//    }
//}


// Data Carrier Class
// behind the scene it will have all the function defined above

record Alien (int id, String name) {

}

public class Main {
    public static void main(String[] args) {

        System.out.println("Data Carrier Class\n\n");

        Alien a1 = new Alien(1, "Navin");
        Alien a2 = new Alien(1, "Navin");

        System.out.println(a1);

        // compare
        System.out.println(a1.equals(a2));




    }
}