import javax.swing.*;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class WordQuiz extends JFrame{
    private JPanel QuizPanel;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JLabel questionLabel;
    private JLabel statementLabel;

    WordQuiz() throws SQLException {
        add(QuizPanel);
        setSize(500,300);
        setTitle("WordQuiz");


        SelectQuery selectQuery = new SelectQuery();
        selectQuery.SelectQuesiton();
        String turkish  = selectQuery.getTurkish();
        String english = selectQuery.getEnglish();

        //kelimeleri getir
        selectQuery.selectAndShuffleEnglishWords();
        String englishOne = selectQuery.getEnglishOne();
        String englishTwo = selectQuery.getEnglishTwo();
        String englishThree = selectQuery.getEnglishThree();

        //rastgele atama için listeler oluştur
        JButton[] buttons = {button1, button2, button3, button4};
        String[] variables = {english, englishOne, englishTwo, englishThree};

        //değişkenleri karıştır
        List<String> variableList = Arrays.asList(variables);
        Collections.shuffle(variableList);

        //atamayı yap
        questionLabel.setText(turkish);
        for(int i=0;i<buttons.length;i++){
           buttons[i].setText(variables[i]);
        }


//        button1.setText(turkish);
//        button2.setText(englishOne);
//        button3.setText(englishTwo);
//        button4.setText(englishThree);


    }
}
