import javax.swing.*;

public class WordQuiz extends JFrame{
    private JPanel QuizPanel;
    private JButton button1Button;
    private JButton button2Button;
    private JButton button3Button;
    private JButton button4Button;
    private JLabel questionLabel;
    private JLabel statementLabel;

    WordQuiz(){
        add(QuizPanel);
        setSize(500,200);
        setTitle("WordQuiz");
        //        String sql = "SELECT t_words, e_words FROM new_table ORDER BY RAND() LIMIT 5";

    }
}
