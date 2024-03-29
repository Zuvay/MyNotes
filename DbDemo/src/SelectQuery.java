import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class SelectQuery {
    public static void selectQuery() throws SQLException {
        Connection connection = null;
        DbHelper helper = new DbHelper();

        Statement statement;
        ResultSet resultSet;
        try {
            connection = helper.getConnection();
            statement = connection.createStatement();
            resultSet = statement.executeQuery("SELECT t_words,e_words FROM dict_table_new");

            ArrayList<DbContent> allWords = new ArrayList<DbContent>();

            while (resultSet.next()){
                allWords.add(new DbContent( resultSet.getString("t_words"),
                        resultSet.getString("e_words")));
            }

            System.out.println(allWords.size());


        } catch (SQLException exception) {
            helper.showErrorException(exception);
        } finally {
            if (connection != null) {
                connection.close();
            }
        }
    }
}
