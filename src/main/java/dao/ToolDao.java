package dao;

import Model.Tool;

import java.util.List;

public interface ToolDao {
	List<Tool> getAll();
	void setAvailability(boolean isAvailable, long id);
}
