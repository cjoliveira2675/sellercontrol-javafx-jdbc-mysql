package db;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class DB {

	private static Connection conn = null;
	
	public static Connection getConn() {
		if (conn == null) {
			try {
				Properties props = inputProps();
				String url = props.getProperty("dburl");
				conn = DriverManager.getConnection(url, props);
				System.out.println("Conectado como "+ props.getProperty("user"));

			} catch (SQLException e) {
				throw new DbException(e.getMessage());
			}
		}
		return conn;
	}
	
	public static void closeConn() {
		if (conn != null) {
			try {
				conn.close();
				System.out.println("Desconectado!");
			} catch (SQLException e) {
				throw new DbException(e.getMessage());
			}
		}
	}
	
	
	private static Properties inputProps() {
		
		try (FileInputStream file = new FileInputStream("db.properties")){
			Properties props = new Properties();
			props.load(file);
			return props;

		} catch (IOException e) {
			throw new DbException(e.getMessage());
		}
	}
	
	public static void closeStatement(Statement st) {
		if (st != null) {
			try {
				st.close();
			} catch (SQLException e) {
				throw new DbException(e.getMessage());
			}
		}
	}

	public static void closeResultSet(ResultSet rs) {
		if (rs != null) {
			try {
				rs.close();
			} catch (SQLException e) {
				throw new DbException(e.getMessage());
			}
		}
	}
}
