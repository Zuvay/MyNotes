import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class InsertQuery {
    public static void insertQuery() throws SQLException {
        Connection connection = null;
        DbHelper helper = new DbHelper();

        PreparedStatement statement = null;
        ResultSet resultSet;

        try{
            connection = helper.getConnection();
            String sql = "INSERT INTO `dictionary`.`dict_table_new` (t_words,e_words) VALUES (?,?)";
            statement = connection.prepareStatement(sql);
            //her bir index sql string'indeki soru işaretine denk geliyor. İlk soru işareti için kara elf ikincisi için drow yerleştirilecek.
            statement.setString(1,"kara elf");
            statement.setString(2,"drow");
            statement.executeUpdate();
            System.out.println("Kayıt eklendi");
        }catch (SQLException exception){
            helper.showErrorException(exception);
        }finally {
            if (statement != null) {
                statement.close();
            }
            if (connection != null) {
                connection.close();
            }
        }
    }
}

