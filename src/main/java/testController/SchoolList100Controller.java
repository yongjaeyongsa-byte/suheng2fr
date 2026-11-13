package testController;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dto.SchoolDTO;
import testService.SchoolService;

/**
 * Servlet implementation class SchoolList100Controller
 */
@WebServlet("/list100")
public class SchoolList100Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SchoolList100Controller() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//1. 한글 변환
		response.setContentType("text/html; charset=UTF-8");
		//2. 서비스 생성 후 메서드 호출
		SchoolService service = new SchoolService();
		ArrayList<SchoolDTO> list = service.getSchoolList100(); 
		//3. request 객체에 받은 list 넣기
		request.setAttribute("list", list);
		//4. list100.jsp로 이동
		request.getRequestDispatcher("/view/list100.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
