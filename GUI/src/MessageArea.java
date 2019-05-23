import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class MessageArea extends JPanel {

    public MessageArea() {
        this.setLayout(new BorderLayout());

        JButton button = new JButton("Send Message");
        this.add(button, BorderLayout.EAST);

        JTextArea textArea = new JTextArea();
        textArea.setLineWrap(true);
        textArea.setFont(textArea.getFont().deriveFont(16f));
        Border border = BorderFactory.createLineBorder(Color.gray);
        textArea.setBorder(border);
        this.add(textArea,BorderLayout.CENTER);

    }

}
