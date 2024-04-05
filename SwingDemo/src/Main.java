import javax.swing.*;

public class Main {
    public static void main(String[] args) throws UnsupportedLookAndFeelException, ClassNotFoundException, InstantiationException, IllegalAccessException {

        UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                WordQuiz wordQuiz = new WordQuiz();
                wordQuiz.setVisible(true);
                wordQuiz.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            }
        });



    }
}