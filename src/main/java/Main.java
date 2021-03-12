import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int opc = 0;

        do{
            System.out.println("--------------");
            System.out.println(" Messages App");
            System.out.println(" 1. Create message");
            System.out.println(" 2. Messages list");
            System.out.println(" 3. Edit Message");
            System.out.println(" 4. Delete Message");
            System.out.println(" 5. Exit");

            //Read the user's option
            opc = parseInt(sc.nextLine());

            switch (opc){
                case 1:
                    MessageService.createMessage();
                    break;
                case 2:
                    MessageService.listMessage();
                    break;
                case 3:
                    MessageService.editMessage();
                    break;
                case 4:
                    MessageService.deleteMessage();
                    break;
                default:
                    break;
            }

        }while (opc!=5);


        Connect connect = new Connect();
        try(Connection cnx = connect.getConnection()){

        }catch (SQLException e){
            System.out.println(e);
        }

    }
}
