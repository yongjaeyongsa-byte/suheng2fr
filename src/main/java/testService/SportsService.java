package testService;

import dao.SportsDAO;
import dto.SportsDTO;

public class SportsService {
	public int insertSports(SportsDTO dto) {
		int result = 0;
		SportsDAO dao = new SportsDAO();
		result = dao.inputSports(dto);
		return result;
	}
}
