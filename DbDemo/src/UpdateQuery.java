import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UpdateQuery{
    public static void updateQuery() throws SQLException{
        Connection connection = null;
        DbHelper helper = new DbHelper();

        PreparedStatement statement = null;
        ResultSet resultSet;

        try{
            connection = helper.getConnection();
            String sql = "UPDATE dictionary.dict_table_new set t_words='Kara Elf' where id=?;";
            statement = connection.prepareStatement(sql);
            statement.setInt(1,739);
            statement.executeUpdate();
            System.out.println("Kayıt güncellendi");
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