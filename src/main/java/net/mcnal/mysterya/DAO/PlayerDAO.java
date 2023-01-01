package net.mcnal.mysterya.DAO;

import java.sql.Array;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.sql.DataSource;

import net.mcnal.mysterya.entity.PlayerEntity;
import net.mcnal.mysterya.entity.PlayerHitEntity;
import net.mcnal.mysterya.entity.PlayerSummaryEntity;

public class PlayerDAO implements IPlayerDAO {
	
	
	private DataSource dataSource;
	private Connection conn = null;
	private ResultSet rs = null;
	private PreparedStatement pstmt = null;
	private Statement stmt = null;
	
	public PlayerDAO() {
	}

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}
	

	public List<PlayerSummaryEntity> getSummaryLeague(int number){
//		conn = getConnection();
		String sql = "SELECT * FROM league_summary WHERE number = ?";
		List<PlayerSummaryEntity> ListLeague = new ArrayList<PlayerSummaryEntity>();
		try {
			conn = dataSource.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, number);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				String league_name = rs.getString("리그");
				String division = rs.getString("분류");
				int G = rs.getInt("경기수");
				int PA = rs.getInt("타석");
				int AB = rs.getInt("타수");
				float AVG = rs.getFloat("타율");
				int H = rs.getInt("안타");
				int _2B = rs.getInt("2루타");
				int _3B = rs.getInt("3루타");
				int HR = rs.getInt("홈런");
				int SO = rs.getInt("삼진");
				int BB = rs.getInt("4구");
				int HBP = rs.getInt("사구");
				float SLG = rs.getFloat("장타율");
				float OBP = rs.getFloat("출루율");
				float OPS = rs.getFloat("OPS");
				PlayerSummaryEntity SummaryLeague_ = new PlayerSummaryEntity(league_name, division, 0, G, PA, AB, AVG, H, _2B, _3B, HR, SO, BB, HBP, SLG, OBP, OPS, number);
				ListLeague.add(SummaryLeague_);
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

		return ListLeague;
	}

	public List<PlayerSummaryEntity> getSummaryYear(int number){
//		conn = getConnection();
		String sql = "SELECT * FROM year_summary WHERE number = ?";
		List<PlayerSummaryEntity> ListYear = new ArrayList<PlayerSummaryEntity>();
		try {
			conn = dataSource.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, number);
			rs = pstmt.executeQuery();

			while (rs.next()) {
				int Year = rs.getInt("년도");
				int G = rs.getInt("경기수");
				int PA = rs.getInt("타석");
				int AB = rs.getInt("타수");
				float AVG = rs.getFloat("타율");
				int H = rs.getInt("안타");
				int _2B = rs.getInt("2루타");
				int _3B = rs.getInt("3루타");
				int HR = rs.getInt("홈런");
				int SO = rs.getInt("삼진");
				int BB = rs.getInt("4구");
				int HBP = rs.getInt("사구");
				float SLG = rs.getFloat("장타율");
				float OBP = rs.getFloat("출루율");
				float OPS = rs.getFloat("OPS");

				PlayerSummaryEntity SummaryYear_ = new PlayerSummaryEntity(null, null, Year, G, PA, AB, AVG, H, _2B, _3B, HR, SO, BB, HBP, SLG, OBP, OPS, number);
				ListYear.add(SummaryYear_);
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
		return ListYear;
	}

	@Override
	public List<PlayerSummaryEntity> getSummary(int number) {
		
		String sql = "SELECT * FROM summary WHERE number = ?";
		List<PlayerSummaryEntity> ListSummary = new ArrayList<PlayerSummaryEntity>();
		try {
			conn = dataSource.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, number);
			rs = pstmt.executeQuery();
			
			while (rs.next()) {
				int G = rs.getInt("경기수");
				int PA = rs.getInt("타석");
				int AB = rs.getInt("타수");
				float AVG = rs.getFloat("타율");
				int H = rs.getInt("안타");
				int _2B = rs.getInt("2루타");
				int _3B = rs.getInt("3루타");
				int HR = rs.getInt("홈런");
				int SO = rs.getInt("삼진");
				int BB = rs.getInt("4구");
				int HBP = rs.getInt("사구");
				float SLG = rs.getFloat("장타율");
				float OBP = rs.getFloat("출루율");
				float OPS = rs.getFloat("OPS");

				PlayerSummaryEntity Summary_ = new PlayerSummaryEntity(null, null, 0, G, PA, AB, AVG, H, _2B, _3B, HR, SO, BB, HBP, SLG, OBP, OPS, number);
				ListSummary.add(Summary_);
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

		return ListSummary;
	}

	@Override
	public List<PlayerHitEntity> getPaBalltotal(int number) {
		String sql = "SELECT * FROM pa_balltotal WHERE number = ?";
		
		List<PlayerHitEntity> ListHIT = new ArrayList<PlayerHitEntity>();
		try {
			conn = dataSource.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, number);
			rs = pstmt.executeQuery();
			
			while (rs.next()) {
				int count1 = rs.getInt(2);
				int count2 = rs.getInt(3);
				float ratio1 = rs.getFloat(4);

				PlayerHitEntity HIT_ = new PlayerHitEntity(count1, count2, 0, 0, 0, 0, 0, 0, 0, 0, ratio1, 0, 0, 0, 0, 0 ,"","");
				ListHIT.add(HIT_);
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

		return ListHIT;
	}

	@Override
	public List<PlayerHitEntity> getPaDirection(int number) {
		String sql = "SELECT * FROM pa_direction WHERE number = ?";
		
		List<PlayerHitEntity> ListHIT = new ArrayList<PlayerHitEntity>();
		try {
			conn = dataSource.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, number);
			rs = pstmt.executeQuery();
			
			while (rs.next()) {
				int count1 = rs.getInt(2);
				String str1 = rs.getString(3);
				float ratio1 = rs.getFloat(6);

				PlayerHitEntity HIT_ = new PlayerHitEntity(count1, 0, 0, 0, 0, 0, 0, 0, 0, 0, ratio1, 0, 0, 0, 0, 0 ,str1,"");
				ListHIT.add(HIT_);
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

		return ListHIT;
	}

	@Override
	public List<PlayerHitEntity> getPaOut(int number) {
		String sql = "SELECT * FROM pa_out WHERE number = ?";
		
		List<PlayerHitEntity> ListHIT = new ArrayList<PlayerHitEntity>();
		try {
			conn = dataSource.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, number);
			rs = pstmt.executeQuery();
			
			while (rs.next()) {
				int count1 = rs.getInt(2);
				int count2 = rs.getInt(3);
				int count3 = rs.getInt(4);
				int count4 = rs.getInt(5);
				int count5 = rs.getInt(6);
				int count6 = rs.getInt(7);
				int count7 = rs.getInt(8);
				int count8 = rs.getInt(9);

				PlayerHitEntity HIT_ = new PlayerHitEntity(count1, count2, count3, count4, count5, count6, count7, count8, 0, 0, 0, 0, 0, 0, 0, 0,"","");
				ListHIT.add(HIT_);
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

		return ListHIT;
	}

	@Override
	public List<PlayerHitEntity> getPaTobase(int number) {
		String sql = "SELECT * FROM pa_tobase WHERE number = ?";
		
		List<PlayerHitEntity> ListHIT = new ArrayList<PlayerHitEntity>();
		try {
			conn = dataSource.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, number);
			rs = pstmt.executeQuery();
			
			while (rs.next()) {
				int count1 = rs.getInt("총 출루");
				int count2 = rs.getInt("안타");
				int count3 = rs.getInt("4구");
				int count4 = rs.getInt("사구");

				PlayerHitEntity HIT_ = new PlayerHitEntity(count1, count2, count3, count4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,"","");
				ListHIT.add(HIT_);
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

		return ListHIT;
	}

	@Override
	public List<PlayerHitEntity> getPaTurn(int number) {
		String sql = "SELECT * FROM pa_turn WHERE number = ?";
		
		List<PlayerHitEntity> ListHIT = new ArrayList<PlayerHitEntity>();
		try {
			conn = dataSource.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, number);
			rs = pstmt.executeQuery();
			
			while (rs.next()) {
				int count1 = rs.getInt(2);
				int count2 = rs.getInt(3);
				int count3 = rs.getInt(4);
				float ratio1 = rs.getFloat(5);
				int count4 = rs.getInt(6);
				int count5 = rs.getInt(7);
				int count6 = rs.getInt(8);
				int count7 = rs.getInt(9);
				int count8 = rs.getInt(10);

				PlayerHitEntity HIT_ = new PlayerHitEntity(count1, count2, count3, count4, count5, count6, count7, count8, 0, 0, ratio1, 0, 0, 0, 0, 0,"","");
				ListHIT.add(HIT_);
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

		return ListHIT;
	}

	@Override
	public List<PlayerHitEntity> getPaETC(int number) {
		String sql = "SELECT * FROM pa_etc WHERE number = ?";
		
		List<PlayerHitEntity> ListHIT = new ArrayList<PlayerHitEntity>();
		try {
			conn = dataSource.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, number);
			rs = pstmt.executeQuery();
			
			while (rs.next()) {
				float ratio1 = rs.getFloat("pa_etc.k% : 타석당 삼진 비율");
				float ratio2 = rs.getFloat("pa_etc.bb% : 타석당 볼넷 비율");
				float ratio3 = rs.getFloat("pa_etc.k-bb% : 삼진-볼넷 비율 격차");


				PlayerHitEntity HIT_ = new PlayerHitEntity(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, ratio1, ratio2, ratio3, 0, 0, 0,"","");
				ListHIT.add(HIT_);
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

		return ListHIT;
	}

	public List<PlayerHitEntity> getPaBallcount(int number){
		String sql = "SELECT * FROM pa_ballcount WHERE number = ?";
		
		List<PlayerHitEntity> ListHIT = new ArrayList<PlayerHitEntity>();
		try {
			conn = dataSource.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, number);
			rs = pstmt.executeQuery();
			
			while (rs.next()) {
				String str1 = rs.getString(2);
				int count1 = rs.getInt(3);
				int count2 = rs.getInt(4);
				float ratio1 = rs.getFloat(5);
				int count3 = rs.getInt(6);
				int count4 = rs.getInt(7);
				int count5 = rs.getInt(8);
				int count6 = rs.getInt(9);
				int count7 = rs.getInt(10);


				PlayerHitEntity HIT_ = new PlayerHitEntity(count1, count2, count3, count4, count5, count6, count7, 0, 0, 0, ratio1, 0, 0, 0, 0, 0,str1,"");
				ListHIT.add(HIT_);
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

		return ListHIT;
	}

	@Override
	public List<PlayerEntity> getPlayerList() {
		String sql = "SELECT * FROM player";
		
		List<PlayerEntity> ListPlayer = new ArrayList<PlayerEntity>();
		ArrayList<List> testlist = new ArrayList<>();
		try {
			conn = dataSource.getConnection();
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			
			while (rs.next()) {
				int number1 = rs.getInt(1);
				String name = rs.getString(2);
				String support = rs.getString(3);
				PlayerEntity players_ = new PlayerEntity(number1, name, 0, 0, 0, " ", " ", " ", " ", " ", support);
				ListPlayer.add(players_);
				ArrayList<String> testlist2 = new ArrayList<>(Arrays.asList(String.valueOf(number1),name,support));
				testlist.add(testlist2);
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
		for(List i : testlist) {
			System.out.println(i);
		}
		return ListPlayer;
	}

	@Override
	public PlayerEntity getPlayerDetail(int number) {
		String sql = "SELECT * FROM player where number = ?";
		PlayerEntity players_ = null;
		try {
			conn = dataSource.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, number);
			rs = pstmt.executeQuery();
			
			while (rs.next()) {
				int number1 = rs.getInt(1);
				String name = rs.getString(2);
				int birth_year = rs.getInt(3);
				int birth_month = rs.getInt(4);
				int birth_day = rs.getInt(5);
				String handed = rs.getString(6);
				String element_school= rs.getString(7);
				String middle_school= rs.getString(8);
				String high_school= rs.getString(9);
				String university= rs.getString(10);
				String support = rs.getString(11);
				players_ = new PlayerEntity(number1, name, birth_year, birth_month, birth_day, handed, element_school, middle_school, high_school, university, support);
				playerss_ = new PlayerEntity(number1, name, birth_year, birth_month, birth_day, handed, element_school, middle_school, high_school, university, support);
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

		;
		return players_;
	}

	@Override
	public List<PlayerHitEntity> getPaHowbase(int number) {
		
		String sql1 = "SELECT * FROM pa_howbase2o3 WHERE number = ?";
		String sql2 = "SELECT * FROM pa_howbase WHERE number = ?";
		String sql3 = "SELECT * FROM pa_howbase0o1 WHERE number = ?";
		
		List<PlayerHitEntity> ListHIT = new ArrayList<PlayerHitEntity>();
		try {
			conn = dataSource.getConnection();
			pstmt = conn.prepareStatement(sql1);
			pstmt.setInt(1, number);
			rs = pstmt.executeQuery();
			
			while (rs.next()) {
				String str11 = rs.getString(1);
				int count11 = rs.getInt(3);
				int count12 = rs.getInt(4);
				float ratio11 = rs.getFloat(5);
				int count13 = rs.getInt(6);
				int count14 = rs.getInt(7);
				int count15 = rs.getInt(8);
				int count16 = rs.getInt(9);
				int count17 = rs.getInt(10);
				int count18 = rs.getInt(11);
				int count19 = rs.getInt(12);
				int count33 = rs.getInt(13);


				PlayerHitEntity HIT1_ = new PlayerHitEntity(count11, count12, count13, count14, count15, count16, count17, count18, count19, count33, ratio11, 0,0, 0, 0, 0, str11, "");
				ListHIT.add(HIT1_);
			}
			
			pstmt = conn.prepareStatement(sql3);
			pstmt.setInt(1, number);
			rs = pstmt.executeQuery();
			
			while (rs.next()) {
				String str11 = rs.getString(1);
				int count11 = rs.getInt(3);
				int count12 = rs.getInt(4);
				float ratio11 = rs.getFloat(5);
				int count13 = rs.getInt(6);
				int count14 = rs.getInt(7);
				int count15 = rs.getInt(8);
				int count16 = rs.getInt(9);
				int count17 = rs.getInt(10);
				int count18 = rs.getInt(11);
				int count19 = rs.getInt(12);
				int count33 = rs.getInt(13);


				PlayerHitEntity HIT1_ = new PlayerHitEntity(count11, count12, count13, count14, count15, count16, count17, count18, count19, count33, ratio11, 0,0, 0, 0, 0, str11, "");
				ListHIT.add(HIT1_);
			}
			
			pstmt = conn.prepareStatement(sql2);
			pstmt.setInt(1, number);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				String str21 = rs.getString(2);
				int count21 = rs.getInt(3);
				int count22 = rs.getInt(4);
				float ratio21 = rs.getFloat(5);
				int count23 = rs.getInt(6);
				int count24 = rs.getInt(7);
				int count25 = rs.getInt(8);
				int count26 = rs.getInt(9);
				int count27 = rs.getInt(10);
				int count28 = rs.getInt(11);
				int count29 = rs.getInt(11);
				int count33 = rs.getInt(13);


				PlayerHitEntity HIT2_ = new PlayerHitEntity(count21, count22, count23, count24, count25, count26, count27, count28, count29, count33, ratio21, 0, 0, 0, 0, 0,str21,"");
				ListHIT.add(HIT2_);
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

		return ListHIT;
	}
}
