import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DeleteQuery {
    public static void deleteQuery() throws SQLException{
        Connection connection = null;
        DbHelper helper = new DbHelper();

        PreparedStatement statement = null;
        ResultSet resultSet;

        try{
            connection = helper.getConnection();
            String sql = "DELETE FROM dictionary.dict_table_new where id=?;";
            statement = connection.prepareStatement(sql);
            //1. index için 740 verisi. sql sorgusundaki ilk ? için 740 girilecek demek oluyor. 
            statement.setInt(1,740);
            statement.executeUpdate();
            System.out.println("Kayıt Silindi");
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

