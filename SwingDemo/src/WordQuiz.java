import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
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
    private JLabel streakLabel;
    private JLabel lastStreak;
    private JButton backMainMenu;
    private String english;
    private String turkish;
    private int streak=0;


    WordQuiz() throws SQLException {
        add(QuizPanel);
        setSize(600, 500);
        setTitle("WordQuiz");

        getQuestion(); //Soruları getiren method.

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    checkAnswer(button1,english); //Cevabın doğru olup olmadığını kontrol eden method. Sonunda ilgili db işlemlerini yapar ve getQuestion'u tekrar çağırır.
                } catch (SQLException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    checkAnswer(button2,english);
                } catch (SQLException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    checkAnswer(button3,english);
                } catch (SQLException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });
        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    checkAnswer(button4,english);
                } catch (SQLException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });

        backMainMenu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                WordQuiz.this.setVisible(false);
                MainMenu mainMenu  = null;
                mainMenu = new MainMenu();
                mainMenu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                mainMenu.setLocationRelativeTo(null);
                mainMenu.setVisible(true);
            }
        });
    }


    private void getQuestion() throws SQLException{
        SelectQuery selectQuery = new SelectQuery();
        selectQuery.selectQuesiton();
        turkish = selectQuery.getTurkish();
        english = selectQuery.getEnglish();

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
        for (int i = 0; i < buttons.length; i++) {
            buttons[i].setText(variables[i]);
        }
    }

    private void checkAnswer(JButton selectedButton, String correctAnswer) throws SQLException {
        if (selectedButton.getText().equals(correctAnswer)){ //Seçilen buton doğru cevaba yani english değişkenine eş mi?
            statementLabel.setText("Doğru cevap");
            streak+=1; //Doğru yapılan her soru için seri 1 arttırılır. (High score mantığında tekrar db'li bir işlem yapılabilir)
            streakLabel.setText("Art arda Doğru sayısı: " + streak);
            SelectQuery selectQuery = new SelectQuery();
            selectQuery.insertQueryToCorrectTable(turkish, correctAnswer); //Doğru işaretlendiğinde satırın ilgili db'e eklenmesi
            selectQuery.deleteQuery(english); //Doğru bilinen satırın ana tablodan çıkarılması.
            getQuestion();
        }else{
            statementLabel.setText("Yanlış cevap! Doğrusu => " + correctAnswer);
            lastStreak.setText("Son seri sayısı: " + streak);
            streak=0; //Yanlış bilindiğinde seri sıfırlanır.
            streakLabel.setText(String.valueOf(streak));
            SelectQuery selectQuery = new SelectQuery();
            selectQuery.insertQueryToInCorrectTable(turkish,correctAnswer); //Yanlış bilinen satırı yanlışlar listesine eklemek
            getQuestion();
        }
    }
}
