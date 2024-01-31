
import java.util.logging.Logger;

public class Student {
  int id = 11;
  String name = "Ali Rehman";
  String courseName = "Java";
  int fees = 1000;
  // Logger logger = Logger.getLogger(getClass().getName());

  public void showDetails() {
    // logger.log(null, "Id: {0}", id);
    // logger.log(null, "name: {0}", name);
    // logger.log(null, "courseName: {0}", courseName);
    // logger.log(null, "fees: {0}", fees);

    System.out.println("Id: "+ id);
    System.out.println("name: "+ name);
    System.out.println("courseName: "+ courseName);
    System.out.println("fees: "+ fees);
    


  }

  public static void main(String[] args) {
    Student s1 = new Student();
    s1.showDetails();

  }

}
