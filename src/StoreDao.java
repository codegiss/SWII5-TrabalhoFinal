// Giselle Souza CB3020339
// Lucas Gomes   CB3021777

import java.util.*;
import java.sql.*;

public class StoreDao {
	public static Connection getConnection(){
		Connection con=null;
		
		try{
			String dbDriver = "com.mysql.cj.jdbc.Driver";
			String dbURL = "jdbc:mysql://localhost:3306/";
			
			// Database name to access
			String dbName = "inventory?useTimezone=true&serverTimezone=America/Sao_Paulo";
			String dbUsername = "admin";
			String dbPassword = "root";
			Class.forName(dbDriver);
			
			con = DriverManager.getConnection(dbURL + dbName, dbUsername, dbPassword);
		} catch (Exception e) {System.out.println(e);}
		return con;
	}
	
	public static int saveSalesman(Salesman s){
		int status=0;
		
		try{
			Connection con=StoreDao.getConnection();
			PreparedStatement ps=con.prepareStatement("insert into salesman(name,city,commission) values (?,?,?)");
			ps.setString(1,s.getName());
			ps.setString(2,s.getCity());
			ps.setBigDecimal(3,s.getCommission());
			System.out.print(ps);
			status=ps.executeUpdate();
			
			con.close();
		} catch(Exception ex) {ex.printStackTrace();}
		
		return status;
	}
	
	public static int updateSalesman(Salesman s){
		int status=0;
		try{
			Connection con=StoreDao.getConnection();
			PreparedStatement ps=con.prepareStatement("update salesman set salesman_id=?,name=?,city=?,comission=? where salesman_id=?");
			ps.setInt(1,s.getId());
			ps.setString(2,s.getName());
			ps.setString(3,s.getCity());
			ps.setBigDecimal(4,s.getCommission());
			
			status=ps.executeUpdate();
			
			con.close();
		} catch(Exception ex) {ex.printStackTrace();}
		
		return status;
	}
	
	public static int deleteSalesman(int id){
		int status=0;
		
		try{
			Connection con=StoreDao.getConnection();
			PreparedStatement ps=con.prepareStatement("delete from salesman where salesman_id=?");
			ps.setInt(1,id);
			status=ps.executeUpdate();
			
			con.close();
		} catch(Exception e) {e.printStackTrace();}
		
		return status;
	}
	
	public static Salesman getSalesmanById(int id){
		Salesman s=new Salesman();
		
		try{
			Connection con=StoreDao.getConnection();
			PreparedStatement ps=con.prepareStatement("select * from salesman where id=?");
			ps.setInt(1,id);
			ResultSet rs=ps.executeQuery();
			
			if(rs.next()){
				s.setId(rs.getInt(1));
				s.setName(rs.getString(2));
				s.setCity(rs.getString(3));
				s.setCommission(rs.getBigDecimal(4));
			}
			
			con.close();
		} catch(Exception ex) {ex.printStackTrace();}
		
		return s;
	}
	
	public static List<Salesman> getAllSalesmen(){
		List<Salesman> list=new ArrayList<Salesman>();
		
		try{
			Connection con=StoreDao.getConnection();
			PreparedStatement ps=con.prepareStatement("select * from salesman");
			ResultSet rs=ps.executeQuery();
			
			while(rs.next()){
				Salesman e=new Salesman();
				e.setId(rs.getInt(1));
				e.setName(rs.getString(2));
				e.setCity(rs.getString(3));
				e.setCommission(rs.getBigDecimal(4));
				list.add(e);
			}
			
			con.close();
		}catch(Exception e){e.printStackTrace();}
		
		return list;
	}
}
