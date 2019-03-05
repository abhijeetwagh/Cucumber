package Temp;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DB_Connection {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver").newInstance();
		java.sql.Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/finsys","root","admin");
		Statement st = conn.createStatement();
		ResultSet res = st.executeQuery("select * from cities");
		
		 while(res.next()){
			 System.out.println(res.getString("cityname"));
			 System.out.println(res.getString(4)+""+res.getString(6));
		 }

	}
}
