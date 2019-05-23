import javax.swing.*;
import java.awt.*;

public class UsernameFrame extends JFrame {

    private static final String BTN_TXT = " Start Chatting ...";
    private static final String LABEL_TXT = " Choose Your UserName ";
    private static final int WIDTH = 300, HEIGHT = 100;
    JTextField textField;
    JButton btn;

    public UsernameFrame() throws HeadlessException {
        super();
        this.setLayout(new BorderLayout());
        JLabel label = new JLabel("Choose Your UserName");
        add(label, BorderLayout.PAGE_START);
        textField = new JTextField();
        add(textField, BorderLayout.CENTER);
        btn = new JButton(LABEL_TXT);
        add(btn, BorderLayout.PAGE_END);
        setSize(WIDTH, HEIGHT);
        setVisible(true);

    }
}
