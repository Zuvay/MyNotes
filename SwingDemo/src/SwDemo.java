import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwDemo extends JFrame{
    private JButton btnMessage;
    private JPanel panelOne;
    private JLabel lblMessage;

    SwDemo(){
        add(panelOne);
        setSize(500,250);
        setTitle("İlk Swing denemesi");
        String sql = "SELECT t_words, e_words FROM new_table ORDER BY RAND() LIMIT 5";


        btnMessage.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lblMessage.setText("╭∩╮( •̀_•́ )╭∩╮");
            }
        });
    }
}
