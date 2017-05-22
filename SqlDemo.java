package javaapplication1;
import java.sql.*;
import java.util.*;
public class SqlDemo 
{
    public static void main(String arg[])throws Exception
    {
        Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jay");
        Statement s=con.createStatement();
        ResultSet rs=s.executeQuery("select * from stu_it");
        while(rs.next())
        {
            int i=rs.getInt(0);
            String name=rs.getString(1);
            int j=rs.getInt(2);
        }
    }
}
