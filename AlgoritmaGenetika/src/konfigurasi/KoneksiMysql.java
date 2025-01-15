package konfigurasi;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;

public class KoneksiMysql {
	/*
	static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
	static final String DB_URL = "jdbc:mysql://localhost:8080/timetable";
	static final String USER = "root";
	static final String PASS = "";
	
	static Connection conn;
	//static Statement stmt;
	//static ResultSet rs;
	*/
	public static void main(String args[]) {
		
		//String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
		String DB_URL = "";
		String USER = "root";
		String PASS = "";
		
		
		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			Connection con = DriverManager.getConnection(DB_URL, USER, PASS);
			
			Statement stt = con.createStatement();
			//buat dan pilih db
			stt.execute("CREATE DATABASE IF NOT EXISTS test");
			stt.execute("USE test");
			
			//buat tabel
			stt.execute("DROP TABLE IF EXISTS dosen");
			stt.execute("CREATE TABLE dosen (" +
					"kd_dosen BIGINT NOT NULL AUTO_INCREMENT,"
					+ "nama VARCHAR(50),"
					+ "PRIMARY KEY(kd_dosen)"
					+ ")");
			
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
		/*
		//melakukan koneksi ke DB harus dibungkus dalam try/catch
		try {
			//register driver yg akan dipakai
			Class.forName(JDBC_DRIVER);
			//buat koneksi ke database
			conn = DriverManager.getConnection(DB_URL, USER, PASS);
			
			
			//buat objek statement
			//stmt = conn.createStatement();
			//buat query ke database
			//String sql = "SELECT * FROM dosen";
			//eksekusi query dan simpan hasilnya di obj ResulSet
			//rs = stmt.executeQuery(sql);
			//tampil hasil query
			//while(rs.next()){
			//	System.out.println("Kode Dosen: "+ rs.getInt("kode"));
			//	System.out.println("Nama Dosen: "+ rs.getString("nama"));
			//}
			//stmt.close();
			//conn.close();
		}catch(Exception ex) {
			ex.printStackTrace();
			
		}*/
		
	}
	
}
