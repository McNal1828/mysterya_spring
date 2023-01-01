package net.mcnal.mysterya.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import net.mcnal.mysterya.entity.PlayerHitEntity;
import net.mcnal.mysterya.entity.RankingEntity;

public class RankingDAO implements IRankingDAO{
	
	private DataSource dataSource;
//	dispatcher-servlet 안쓸때
//	private String driver = "org.mariadb.jdbc.Driver";
//	private String url = "jdbc:mariadb://192.168.0.251:3336/mysterya";
//	private String username = "dbwj";
//	private String password = "votmdnjem";
	private Connection conn = null;
	private ResultSet rs = null;
	private PreparedStatement pstmt = null;
	private Statement stmt = null;
	
	public RankingDAO() {
		// TODO Auto-generated constructor stub
	}
	
	
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}


	@Override
	public List<RankingEntity> getLeagueList() {
		String sql = "SELECT * FROM ra_leaguelist";
		List<RankingEntity> listranking = new ArrayList<RankingEntity>();
		try {
			conn = dataSource.getConnection();
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			while (rs.next()) {
				String league_name = rs.getString("name");
				String division = rs.getString("division");
				String year = Integer.toString(rs.getInt("start_year"));
				int league_index = rs.getInt("league_index");
				RankingEntity rankingentity = new RankingEntity(league_name+" "+division+"("+year+")", league_index, 0, 0, 0, 0, 0, 0, 0, 0);
				listranking.add(rankingentity);
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

		return listranking;
	}

	@Override
	public List<RankingEntity> getYearList() {
		String sql = "SELECT * FROM ra_yearlist;";
		List<RankingEntity> listranking = new ArrayList<RankingEntity>();
		try {
			conn = dataSource.getConnection();
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			while (rs.next()) {
				int year = rs.getInt("year");
				RankingEntity rankingentity = new RankingEntity("", year, 0, 0, 0, 0, 0, 0, 0, 0);
				listranking.add(rankingentity);
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

		return listranking;
	}

	@Override
	public List<RankingEntity> getSummary() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<PlayerHitEntity> getPaDirection() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<PlayerHitEntity> getPaHowbase() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<PlayerHitEntity> getPaTurn() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<PlayerHitEntity> getPaBallcount() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<PlayerHitEntity> getPaBalltotal() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<PlayerHitEntity> getPaOut() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<PlayerHitEntity> getPaTobase() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<PlayerHitEntity> getPaETC() {
		// TODO Auto-generated method stub
		return null;
	}

}
