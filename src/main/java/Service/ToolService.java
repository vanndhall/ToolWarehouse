package Service;

import Model.Tool;

import java.util.List;

public interface ToolService {
	List<Tool> getAllTools();
	void setAvailability(boolean isAvaiable , long id);
}
