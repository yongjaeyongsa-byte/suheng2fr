package testController;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dto.SportsDTO;
import testService.SportsService;

/**
 * Servlet implementation class SportsInputController100
 */
@WebServlet("/SportsInput")
public class SportsInputController100 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SportsInputController100() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//1. 한글 변환
		request.setCharacterEncoding("UTF-8");
		//2. 파라미터 가저오기
		int sno = Integer.parseInt(request.getParameter("sno"));
		String sname = request.getParameter("sname");
		String smajor = request.getParameter("smajor");
		//3. DTO에 담기
		SportsDTO dto = new SportsDTO();
		dto.setSno(sno);
		dto.setSname(sname);
		dto.setSmajor(smajor);
		//4. 서비스 호출
		SportsService service = new SportsService();
		int result = service.insertSports(dto);
		//5. 결과값 보내기
		if(result==1) {
			response.sendRedirect("/index.jsp");
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
