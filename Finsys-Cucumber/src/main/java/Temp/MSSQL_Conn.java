package Temp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MSSQL_Conn {

//	Connection conn = null;
//	Statement st = null;
//	ResultSet res = null;
	
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException {

		Connection conn=null;
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").newInstance();
            conn = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=test", "DESKTOP-2TR3QCD\\LENOVO", "");

            if(conn!=null)
                System.out.println("Database Successfully connected");

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
	}


