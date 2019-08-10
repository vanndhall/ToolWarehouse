package Controller;

import Service.ToolService;
import Service.ToolServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(value = "/")
public class ToolServlet extends HttpServlet {
	private final String TOOL_PAGE_PATH ="/tools.jsp";
	private final ToolService toolService = new ToolServiceImpl();


	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		req.setAttribute("tools",toolService.getAllTools());

		getServletContext().getRequestDispatcher(TOOL_PAGE_PATH).forward(req,resp);

	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String action = req.getParameter("action");
		String id = req.getParameter("id");
		switch (action) {
			case "take":
				toolService.setAvailability(false, Long.parseLong(id));
				break;
			case "return":
				toolService.setAvailability(true, Long.parseLong(id));
				break;
		}
		// alternatywa dla tego wyzszego switcha to:
		//toolService.setAvailability(action.equals("return"));

		req.setAttribute("tools",toolService.getAllTools());
		getServletContext().getRequestDispatcher(TOOL_PAGE_PATH).forward(req,resp);
	}
}
