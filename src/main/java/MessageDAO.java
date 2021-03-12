import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class MessageDAO {
    public static void createMessageDB(Message message){
        Connect dbConnect = new Connect();
        try(Connection connection = dbConnect.getConnection()) {
            PreparedStatement ps = null;
            try{
                String query = "INSERT INTO `message` (`message`, `author_message`) VALUES (?, ?);";
                ps = connection.prepareStatement(query);
                ps.setString(1, message.getMessage());
                ps.setString(2, message.getAuthorMessage());
                ps.executeUpdate();
                System.out.println("Message created");
            }catch (SQLException ex){
                System.out.println(ex);
            }
        }catch(SQLException e){
            System.out.println(e);
        }
    }

    public static void readMessageDB(){

    }

    public static void deleteMessageDB(int idMessage){

    }

    public static void updateMessageDB(Message message){

    }
}
