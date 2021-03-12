import java.sql.Connection;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {

        Connect connect = new Connect();
        try(Connection cnx = connect.get_connection()){

        }catch (SQLException e){
            System.out.println(e);
        }

    }
}
