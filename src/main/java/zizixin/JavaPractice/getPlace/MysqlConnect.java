package zizixin.JavaPractice.getPlace;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;

import com.mysql.jdbc.Driver;

import zizixin.JavaPractice.util.FileKeyValueInfoGet;

public class MysqlConnect {

	public static Connection conn;

	public static Connection getConnection() throws SQLException{
		return  DriverManager.getConnection(FileKeyValueInfoGet.defaultInstance.getValue(Constant.MYSQLLOCATION),
                FileKeyValueInfoGet.defaultInstance.getValue(Constant.MYSQLUSERNAME),
                FileKeyValueInfoGet.defaultInstance.getValue(Constant.MYSQLPASSWORD));
	}
	
	private MysqlConnect() {

	}
  
	static {
		try {
			FileKeyValueInfoGet.defaultInstance.init();
			//Class.forName(Constant.DRIVER);// 加载MySql驱动
			Driver driver;
			conn = DriverManager.getConnection(FileKeyValueInfoGet.defaultInstance.getValue(Constant.MYSQLLOCATION),
					                            FileKeyValueInfoGet.defaultInstance.getValue(Constant.MYSQLUSERNAME),
					                            FileKeyValueInfoGet.defaultInstance.getValue(Constant.MYSQLPASSWORD));
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (Exception e) {
			e.printStackTrace();
		}
		// DriverManager.registerDriver(new org.gjt.mm.mysql.Driver());
		// //这句话可需可不需
		// DriverManager.registerDriver(new com.mysql.jdbc.Driver()); //同上
		
	}
	
	/**
	 * @param args
	 * this main is use for mysqlConnnect tion test
	 */
	public static void main(String[] args) {
		ArrayList<Connection> connections = new ArrayList<>();
		for(int i=0;i<10;i++){
			try {
				Connection connection = getConnection();
				connection.getClass().getName();
				DatabaseMetaData metaData = connection.getMetaData();
				System.out.println(metaData.getDatabaseMajorVersion());
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		while(true){
			
		}
	}
	
}
