package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import common.DBUtils;
import dto.SportsDTO;

public class SportsDAO {
	public int inputSports(SportsDTO dto) {
		int result = 0;
		Connection con = null;
		PreparedStatement ps = null;
		try {
			con = DBUtils.getConnection();
			ps = con.prepareStatement("insert into sports values(?,?,?)");
			ps.setInt(1, dto.getSno());
			ps.setString(2, dto.getSname());
			ps.setString(3, dto.getSmajor());
			result = ps.executeUpdate();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return result;
	}
}
