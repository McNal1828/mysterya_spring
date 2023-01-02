package net.mcnal.mysterya.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class RankingDAO implements IRankingDAO{
	@Autowired
	private DataSource dataSource;
	private Connection conn = null;
	private ResultSet rs = null;
	private PreparedStatement pstmt = null;
	private Statement stmt = null;
	
	public RankingDAO() {
		// TODO Auto-generated constructor stub
	}
	public List<HashMap<String, Object>> querySTResult(String sql) {
		List<HashMap<String, Object>> list = new ArrayList<HashMap<String, Object>>();
		try {
			conn = dataSource.getConnection();
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			ResultSetMetaData rsmd = rs.getMetaData();
			while (rs.next()) {
				HashMap<String, Object> data = new HashMap<String, Object>();
				for (int i =1; i <rsmd.getColumnCount()+1;i++){
					String columName = rsmd.getColumnName(i);
					Object value = rs.getObject(i);
					data.put(columName, value);
				}
				System.out.println(data);
				list.add(data);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null) {
					rs.close();
				}
				if (pstmt != null) {
					pstmt.close();
				}
				if (stmt != null) {
					stmt.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return list;
	}
	public List<HashMap<String, Object>> queryPSTResult(String sql, int number) {
		List<HashMap<String, Object>> list = new ArrayList<HashMap<String, Object>>();
		try {
			conn = dataSource.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, number);
			rs = pstmt.executeQuery();
			ResultSetMetaData rsmd = rs.getMetaData();
			while (rs.next()) {
				HashMap<String, Object> data = new HashMap<String, Object>();
				for (int i =1; i <rsmd.getColumnCount()+1;i++){
					String columName = rsmd.getColumnName(i);
					Object value = rs.getObject(i);
					data.put(columName, value);
				}
				System.out.println(data);
				list.add(data);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null) {
					rs.close();
				}
				if (pstmt != null) {
					pstmt.close();
				}
				if (stmt != null) {
					stmt.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return list;
	}

	@Override
	public List<HashMap<String, Object>> getYearList() {
		System.out.println("getYearList");
		String sql = "select * from ra_yearlist";
		List<HashMap<String, Object>> list = querySTResult(sql);
		return list;
	}

	@Override
	public List<HashMap<String, Object>> getLeagueList() {
		System.out.println("getLeagueList");
		String sql = "select * from ra_leaguelist";
		List<HashMap<String, Object>> list = querySTResult(sql);
		return list;
	}

	@Override
	public List<HashMap<String, Object>> getYearRanking(int number) {
		System.out.println("getYearList");
		String sql = "select * from ra_year";
		List<HashMap<String, Object>> list = queryPSTResult(sql, number);
		return list;
	}

	@Override
	public List<HashMap<String, Object>> getLeagueRanking(int number) {
		System.out.println("getYearList");
		String sql = "select * from ra_league";
		List<HashMap<String, Object>> list = queryPSTResult(sql, number);
		return list;
	}
	


}
