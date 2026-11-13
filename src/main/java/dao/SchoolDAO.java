package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import common.DBUtils;
import dto.SchoolDTO;

public class SchoolDAO {
	public int inputSchool(SchoolDTO dto) {
		int result = 0;
		Connection con = null;
		PreparedStatement ps = null;
		try {
			con = DBUtils.getConnection();
			ps = con.prepareStatement("insert into school values(?,?,?)");
			ps.setInt(1, dto.getSno());
			ps.setString(2, dto.getSname());
			ps.setString(3, dto.getSaddr());
			result = ps.executeUpdate();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return result;
	}
	public ArrayList<SchoolDTO> getSchoolList() {
		ArrayList<SchoolDTO> list = new ArrayList<SchoolDTO>();
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			con = DBUtils.getConnection();
			ps = con.prepareStatement("select * from school");
			rs = ps.executeQuery();
			while(rs.next()) {
				SchoolDTO dto = new SchoolDTO();
				dto.setSno(rs.getInt(1));
				dto.setSname(rs.getString(2));
				dto.setSaddr(rs.getString(3));
				list.add(dto);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
		return list;
	}
	public ArrayList<SchoolDTO> getSchoolList100() {
		ArrayList<SchoolDTO> list = new ArrayList<SchoolDTO>();
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			con = DBUtils.getConnection();
			ps = con.prepareStatement("select * from school where sno <= 3");
			rs = ps.executeQuery();
			while (rs.next()) {
				SchoolDTO dto = new SchoolDTO();
				dto.setSno(rs.getInt(1));
				dto.setSname(rs.getString(2));
				dto.setSaddr(rs.getString(3));
				list.add(dto);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	public ArrayList<SchoolDTO> getSchoolList200() {
		ArrayList<SchoolDTO> list = new ArrayList<SchoolDTO>();
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			con = DBUtils.getConnection();
			ps = con.prepareStatement("select * from school where sname like '%신%'");
			rs = ps.executeQuery();
			while (rs.next()) {
				SchoolDTO dto = new SchoolDTO();
				dto.setSno(rs.getInt(1));
				dto.setSname(rs.getString(2));
				dto.setSaddr(rs.getString(3));
				list.add(dto);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return list;
	}
}
