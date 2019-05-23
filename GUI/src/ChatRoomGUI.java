import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class ChatRoomGUI extends JFrame{

    private final String WINDOWS_TITLE = "AUT Chat Room";
    private final int WIDTH = 500, HEIGHT = 500;
    private final int X = 100, Y = 100;

    ChatArea chatArea = new ChatArea();
    ParticipantsArea participantsArea = new ParticipantsArea();

    public ChatRoomGUI() {
        super();
        this.setTitle(WINDOWS_TITLE);
        this.setLayout(new BorderLayout());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(WIDTH, HEIGHT);
        this.setLocation(X, Y);

        UsernameFrame usernameFrame = new UsernameFrame();

        ChatArea chatBox = new ChatArea();
        this.add(new JScrollPane(chatBox),BorderLayout.CENTER);

        ParticipantsArea participantsArea = new ParticipantsArea();
        this.add(participantsArea,BorderLayout.WEST);

        MessageArea messageArea = new MessageArea();
        this.add(messageArea,BorderLayout.PAGE_END);

        this.setVisible(true);
    }

    public void addNewMessage(String user , String text){
        chatArea.addMessage(user,text);
    }

    public void addNewParticipant(String onlineUser){
        participantsArea.addOnlineUser(onlineUser);
    }

    public void removeParticipant(String onlineUser){
        participantsArea.removeOnlineUser(onlineUser);
    }


}
