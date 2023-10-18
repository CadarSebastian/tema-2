package ro.rubickscube.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import ro.rubickscube.helpers.DBHelper;
import ro.rubickscube.pojo.Cube;

public class cubeDAO {

	public static ArrayList<Cube> getAll() throws SQLException {
		ArrayList<Cube> result = new ArrayList<Cube>();

		Connection conn = DBHelper.getConnection();
		Statement stmt = conn.createStatement();

		String query = "select * from Cubei";
		ResultSet rs = stmt.executeQuery(query);

		while (rs.next()) {
			Cube c = new Cube();
			c.setBrand(rs.getInt("brand"));
			c.setWeight(rs.getString("weight"));
			c.setSides(rs.getString("sides"));
			c.setManufactured(rs.getInt("manufactured"));
			result.add(c);
		}
		return result;
	}
	
	public static Cube getById(int id) throws SQLException {
		Cube result = null;
		Connection conn = DBHelper.getConnection();
		
		String query = "select * from Cubei where id = ?";
		PreparedStatement stmt = conn.prepareStatement(query);
		stmt.setInt(1, id);
		
		ResultSet rs = stmt.executeQuery();
		if(rs.next()) {
			result = new Cube();
			result.setBrand(rs.getInt("brand"));
			result.setWeight(rs.getString("weight"));
			result.setSides(rs.getString("sides"));
			result.setManufactured(rs.getInt("Manufactured"));
		}
		return result;
	}
	
	public static boolean update(Cube c) throws SQLException {
		
		Connection c1 = DBHelper.getConnection();
		String query = "update rubikscube set brand = ?, weight = ?, sides = ? where manufactured = ? ";
		PreparedStatement ps = c1.prepareStatement(query);
		ps.setString(1, ((Cube) c1).getBrand());
		ps.setDouble(2, ((Cube) c1).getWeight());
		ps.setInt(3, ((Cube) c1).getSides());
		ps.setInt(4, ((Cube) c1).getManufactured());
		
		int ar = ps.executeUpdate();
		
		//ternary operation
		return ar == 0 ? false : true;
	}
	
	public static String delete(String brand) throws SQLException {
		Connection conn = DBHelper.getConnection();
		String query = "delete from rubikscube where brand = ?";
		
		PreparedStatement ps = conn.prepareStatement(query);
		ps.setString(1, brand);
		
		int ar = ps.executeUpdate();
		return ar == 0 ? "Nu au fost sterse inregistrari" : "Au fost sterse " + ar + " inregistrari";
	}

//	public static boolean create(Cube s) throws SQLException {
//		Connection conn = DBHelper.getConnection();
//		String query = "insert into Cube( brand, weight, sides, manufactured) values + " + "('" + s.getBrand() + "','" + s.getWeight() +"','" + s.getSides()+ "','" + s.getManufactured() + "')"; 
//		PreparedStatement ps = conn.prepareStatement(query);
//		
//		ps.setString(1, s.getBrand());
//		ps.setDouble(2, s.getWeight());
//		ps.setInt(3, s.getSides());
//		ps.setInt(4, s.getManufactured());
//		
//		int ar = ps.executeUpdate();
//		return ar == 0 ? false : true;
//	}
	
	public static void create(Cube s) throws SQLException {
		Connection c = DBHelper.getConnection();
		String query = "insert into rubiksCube(Brand, Weight, Sides) values (?,?,?)";
		PreparedStatement ps = c.prepareStatement(query);
		ps.setString(1, c.getBrand());
		ps.setInt(2, c.getWeight());
		ps.setInt(3, c.getSides());
		
		ps.executeUpdate();
		System.out.println("S-a inserat cu succes " + s.getBrand());
	}
	
	public static int delete2(String Brand) throws SQLException {
		Connection c = DBHelper.getConnection();
		PreparedStatement ps = c.prepareStatement("delete from stuenti where brand = ?");
		ps.setString(1, Brand);
		return ps.executeUpdate();
	}
}
