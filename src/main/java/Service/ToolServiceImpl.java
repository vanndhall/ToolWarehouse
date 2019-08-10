package Service;

import Model.Tool;
import dao.ToolDao;
import dao.ToolDaoImpl;

import java.util.List;

public class ToolServiceImpl implements ToolService {

	private final ToolDao toolDao = new ToolDaoImpl();
	public List<Tool> getAllTools() {
		return toolDao.getAll();
	}

	@Override
	public void setAvailability(boolean isAvaiable, long id) {
		toolDao.setAvailability(isAvaiable, id);
	}


}
