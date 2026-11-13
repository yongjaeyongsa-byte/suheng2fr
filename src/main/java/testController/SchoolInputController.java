package testController;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dto.SchoolDTO;
import testService.SchoolService;

/**
 * Servlet implementation class SchoolInputController
 */
@WebServlet("/input")
public class SchoolInputController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SchoolInputController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//1. 클라이언트가 보낸 한글 데이터 준비
		request.setCharacterEncoding("UTF-8");
		//2. 클라이언트가 보낸 값 받기
		int sno = Integer.parseInt(request.getParameter("sno"));
		String sname = request.getParameter("sname");
		String saddr = request.getParameter("saddr");
		//3. DTO 생성하여 받은값 저장
		SchoolDTO dto = new SchoolDTO();
		dto.setSno(sno);
		dto.setSname(sname);
		dto.setSaddr(saddr);
		//4. 서비스객체 생성 및 DTO값을 실어서 메서드 호출
		SchoolService service = new SchoolService();
		int result = service.inputSchool(dto);
		//5. 메서드 호출결과 확인하여 list.jsp로 이동
		if(result == 1) {
			response.sendRedirect("/list");
		}else {
			request.setAttribute("dto", dto);
			request.setAttribute("error", "저장오류입니다.");
			request.getRequestDispatcher("/view/inputForm.jsp")
				.forward(request, response);
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
