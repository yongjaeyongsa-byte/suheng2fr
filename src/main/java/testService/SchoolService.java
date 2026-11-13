package testService;

import java.util.ArrayList;

import dao.SchoolDAO;
import dto.SchoolDTO;

public class SchoolService {
	public int inputSchool(SchoolDTO dto) {
		int result = 0;
		SchoolDAO dao = new SchoolDAO();
		result = dao.inputSchool(dto);
		
		return result;
	}
	public ArrayList<SchoolDTO> getSchoolList() {
		ArrayList<SchoolDTO> list = new ArrayList<SchoolDTO>();
		//DAO 생성 후 호출
		SchoolDAO dao = new SchoolDAO();
		list = dao.getSchoolList();
		return list;
	}
	public ArrayList<SchoolDTO> getSchoolList100() {
		ArrayList<SchoolDTO> list = new ArrayList<SchoolDTO>();
		SchoolDAO dao = new SchoolDAO();
		list = dao.getSchoolList100();
		return list;
	}
	public ArrayList<SchoolDTO> getSchoolList200() {
		ArrayList<SchoolDTO> list = new ArrayList<SchoolDTO>();
		SchoolDAO dao = new SchoolDAO();
		list = dao.getSchoolList200();
		return list;
	}
}

