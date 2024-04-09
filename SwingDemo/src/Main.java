import javax.swing.*;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws UnsupportedLookAndFeelException, ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException {

        UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                WordQuiz wordQuiz = null;
                try {
                    wordQuiz = new WordQuiz();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
                wordQuiz.setVisible(true);
                wordQuiz.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            }
        });



    }
}
