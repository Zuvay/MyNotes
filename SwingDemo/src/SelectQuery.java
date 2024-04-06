import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collections;

public class SelectQuery {

    private String turkish;
    private String english;
    private String englishOne;
    private String englishTwo;
    private String englishThree;
    public void SelectQuesiton() throws SQLException {

        Connection connection = null;
        DbHelper dbHelper = new DbHelper();

        Statement statement;
        ResultSet resultSet;

        try {
            connection = dbHelper.getConnection();
            statement = connection.createStatement();
            resultSet = statement.executeQuery("SELECT t_words, e_words FROM dict_table_new ORDER BY RAND() LIMIT 1");
            if (resultSet.next()) {
                turkish = resultSet.getString("t_words");
                english = resultSet.getString("e_words");
            } else {
                System.out.println("ResultSet boş.");
            }

        } catch (SQLException exception) {
            dbHelper.showErrorException(exception);
        } finally {
            if (connection != null) {
                connection.close();
            }

        }
    }

    public void selectAndShuffleEnglishWords() throws SQLException {
        DbHelper dbHelper = new DbHelper();
        try (Connection connection = dbHelper.getConnection();
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery("SELECT e_words FROM dict_table_new ORDER BY RAND() LIMIT 3")) {

            //ingilizce kelimelerin tutulacağı liste
            ArrayList<String> englishWordsList = new ArrayList<>();
            int count = 0;
            while (resultSet.next() && count < 3) {
                englishWordsList.add(resultSet.getString("e_words"));
                count++;
            }

            //değişkenleri atama işi
            if (englishWordsList.size() >= 3) {
                englishOne = englishWordsList.get(0);
                englishTwo = englishWordsList.get(1);
                englishThree = englishWordsList.get(2);
            } else {
                throw new SQLException("Yeterli sayıda İngilizce kelime bulunamadı.");
            }
        } catch (SQLException exception) {
            // SQLException'ı daha anlamlı bir şekilde işleyin veya iletişim kutuları gibi bir kullanıcı arabirimiyle kullanıcıya geri bildirim sağlayın
            dbHelper.showErrorException(exception);
        }
    }

    //Getter'lar
    public String getTurkish() {
        return turkish;
    }

    public String getEnglish() {
        return english;
    }

    public String getEnglishOne() {
        return englishOne;
    }

    public String getEnglishTwo() {
        return englishTwo;
    }

    public String getEnglishThree() {
        return englishThree;
    }
}

