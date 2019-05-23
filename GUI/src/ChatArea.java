import javax.swing.*;

public class ChatArea extends JTextArea {

    private String user;
    private String textMessage;
    private static final int ROWS = 10, COLUMNS = 30;

    public ChatArea() {
        super(ROWS, COLUMNS);
        this.setEditable(false);
        this.setLineWrap(true);
    }

    public void addMessage(String user, String textMessage){
        this.user = user;
        this.textMessage = textMessage;
        append(user + " : " + textMessage);
    }


}
