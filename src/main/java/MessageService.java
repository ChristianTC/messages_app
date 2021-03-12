import java.util.Scanner;

public class MessageService {
    public static void createMessage(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Write your message");
        String message = sc.nextLine();

        System.out.println("Your name");
        String name = sc.nextLine();

        Message reg = new Message();
        reg.setMessage(message);
        reg.setAuthorMessage(name);

        MessageDAO.createMessageDB(reg);

    }
    public static void listMessage(){

    }
    public static void deleteMessage(){

    }
    public static void editMessage(){

    }
}
