import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class ParticipantsArea extends JPanel {

    DefaultListModel<String> l1 = new DefaultListModel<>();

    public ParticipantsArea(){
        this.setLayout(new BorderLayout());

        JTextArea textArea = new JTextArea("Online Users : ");
        textArea.setEditable(false);
        textArea.setBackground(Color.green);
        Border border = BorderFactory.createLineBorder(Color.gray);
        textArea.setBorder(border);
        this.add(textArea,BorderLayout.NORTH);

        for(int i=1 ; i<=10 ; i++){
            l1.addElement("User " + i );
        }

        JList<String> jList = new JList<>(l1);
        jList.setBackground(Color.lightGray);
        Border border1 = BorderFactory.createLineBorder(Color.gray);
        jList.setBorder(border1);
        this.add(jList,BorderLayout.CENTER);

    }

    public void addOnlineUser (String onlineUser){
        l1.addElement(onlineUser);
    }

    public void removeOnlineUser (String onlineUser){
        l1.removeElement(onlineUser);
    }

}
