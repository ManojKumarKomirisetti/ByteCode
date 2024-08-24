import java.sql.*;
class JdbcEx
{
    static Connection con;

    public static void getConnection() throws SQLException
    {
            //Registering the driver
            try
            {
                Class.forName("oracle.jdbc.driver.OracleDriver");
                //Creating the Connection
                con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","123");
                    System.out.println("Connection Created:"+con);

            }
            catch(ClassNotFoundException e)
            {
                e.printStackTrace();
            }
            

    }
    public static void main(String args[]) throws SQLException
    {
        getConnection();
    }
}