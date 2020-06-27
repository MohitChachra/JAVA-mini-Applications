import java.sql.*;
public class dbase
{
    public static void main(String args[])
    {
        try
        {
            //Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost/test?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC","root","");
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery("select * from emp");
            while(rs.next())
                System.out.println(rs.getString(1)+"  "+rs.getInt(2)+"  "+rs.getString(3));
            con.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}