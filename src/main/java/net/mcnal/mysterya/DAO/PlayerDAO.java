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
public class PlayerDAO implements IPlayerDAO {
	
	@Autowired
	private DataSource dataSource;
	private Connection conn = null;
	private ResultSet rs = null;
	private PreparedStatement pstmt = null;
	private Statement stmt = null;
	
	
	public PlayerDAO() {
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
	public List<HashMap<String, Object>> getPlayerList(String cat, String input) {
		System.out.println("getPlayerList");
		/* String sql = "SELECT * FROM player"; */
		String sql = String.format("select * from player where %s like '%%%s%%'",cat,input);
		List<HashMap<String, Object>> list = querySTResult(sql);
		return list;
	}

	public List<HashMap<String, Object>> getSummaryLeague(int number){
		System.out.println("getSummaryLeague");
		String sql = "SELECT * FROM league_summary WHERE number = ?";
		List<HashMap<String, Object>> list = queryPSTResult(sql, number);
		return list;
	}

	public List<HashMap<String, Object>> getSummaryYear(int number){
		System.out.println("getSummaryYear");
		String sql = "SELECT * FROM year_summary WHERE number = ?";
		List<HashMap<String, Object>> list = queryPSTResult(sql, number);
		return list;
	}

	@Override
	public List<HashMap<String, Object>> getSummary(int number) {
		System.out.println("getSummary");
		String sql = "SELECT * FROM summary WHERE number = ?";
		List<HashMap<String, Object>> list = queryPSTResult(sql, number);
		return list;
	}

	@Override
	public List<HashMap<String, Object>> getPaBalltotal(int number) {
		System.out.println("getPaBalltotal");
		String sql = "SELECT * FROM pa_balltotal WHERE number = ?";
		List<HashMap<String, Object>> list = queryPSTResult(sql, number);
		return list;
	}

	@Override
	public List<HashMap<String, Object>> getPaDirection(int number) {
		System.out.println("getPaDirection");
		String sql = "SELECT * FROM pa_direction WHERE number = ?";
		List<HashMap<String, Object>> list = queryPSTResult(sql, number);
		return list;
	}

	@Override
	public List<HashMap<String, Object>> getPaOut(int number) {
		System.out.println("getPaOut");
		String sql = "SELECT * FROM pa_out WHERE number = ?";
		List<HashMap<String, Object>> list = queryPSTResult(sql, number);
		return list;
	}

	@Override
	public List<HashMap<String, Object>> getPaTobase(int number) {
		System.out.println("getPaTobase");
		String sql = "SELECT * FROM pa_tobase WHERE number = ?";
		List<HashMap<String, Object>> list = queryPSTResult(sql, number);
		return list;
	}

	@Override
	public List<HashMap<String, Object>> getPaTurn(int number) {
		System.out.println("getPaTurn");
		String sql = "SELECT * FROM pa_turn WHERE number = ?";
		List<HashMap<String, Object>> list = queryPSTResult(sql, number);
		return list;
	}

	@Override
	public List<HashMap<String, Object>> getPaETC(int number) {
		System.out.println("getPaETC");
		String sql = "SELECT * FROM pa_etc WHERE number = ?";
		List<HashMap<String, Object>> list = queryPSTResult(sql, number);
		return list;
	}

	public List<HashMap<String, Object>> getPaBallcount(int number){
		System.out.println("getPaBallcount");
		String sql = "SELECT * FROM pa_ballcount WHERE number = ?";
		List<HashMap<String, Object>> list = queryPSTResult(sql, number);
		return list;
	}

	@Override
	public HashMap<String, Object> getPlayerDetail(int number) {
		System.out.println("getPlayerDetail");
		String sql = "SELECT * FROM player where number = ?";
		List<HashMap<String, Object>> list = queryPSTResult(sql, number);
		return list.get(0);
	}

	@Override
	public List<List<HashMap<String, Object>>> getPaHowbase(int number) {
		
		String sql1 = "SELECT * FROM pa_howbase2o3 WHERE number = ?";
		String sql2 = "SELECT * FROM pa_howbase0o1 WHERE number = ?";
		String sql3 = "SELECT * FROM pa_howbase WHERE number = ?";
		List<List<HashMap<String, Object>>> list = new ArrayList<>();
		System.out.println("getPaHowbase");
		List<HashMap<String, Object>> list1 = queryPSTResult(sql1, number);
		System.out.println("getPaHowbase2o3");
		List<HashMap<String, Object>> list2 = queryPSTResult(sql2, number);
		System.out.println("getPaHowbase0o1");
		List<HashMap<String, Object>> list3 = queryPSTResult(sql3, number);
		list.add(list1);
		list.add(list2);
		list.add(list3);
		return list;
	}


}
