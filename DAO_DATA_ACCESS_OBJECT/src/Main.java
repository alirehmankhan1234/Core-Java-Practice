
import java.sql.*;

// DAO -> Data Access Object

class Student {
    int id;
    String name;
}

class StudentDAO
{
    Connection con = null;
    public void connect() {
        try{
            String url = "jdbc:sqlserver://localhost:1433;databaseName=javaPractice;encrypt=true;trustServerCertificate=true";
            String uname = "alirehman";
            String pass = "alirehman";

            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            con = DriverManager.getConnection(url, uname, pass);

        }catch(Exception ex){
            System.out.println(ex);
        }
    }

    public void addStudent(Student s) throws SQLException {
        String query = "insert into student values(?)";

        PreparedStatement pst = con.prepareStatement(query);
        pst.setString(1, s.name);
        pst.executeUpdate();

        pst.close();
    }

    public Student getStudent(int rollno){

        try{
            String query = "SELECT * FROM javaPractice.dbo.student where id="+rollno;

            Student s = new Student();
            s.id = rollno;
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query);
            rs.next();
            s.name  = rs.getString("name");
            st.close();

            return s;
        }catch(Exception ex){
            System.out.println(ex);
        }

        return null;
    }

    public void closeConnection() throws SQLException {
        con.close();
    }
}
public class Main {

    public static void main(String[] args) throws SQLException {
        System.out.println("DAO Example\n\n");

        StudentDAO dao =  new StudentDAO();
        dao.connect();
        Student s1 = dao.getStudent(3);
        System.out.println(s1.name);

        System.out.println(" Adding A Student \n\n");
        Student s2 = new Student();
        s2.name = "Aksay Kumar";
        dao.addStudent(s2);

        dao.closeConnection();
    }
}