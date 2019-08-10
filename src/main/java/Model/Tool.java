package Model;

public class Tool {
	private long id;
	private String name;
	private boolean available;
	private ToolType type;

	public Tool() {
	}

	public Tool(long id, String name,ToolType type, boolean available) {
		this.id = id;
		this.name = name;
		this.available = available;
		this.type = type;
	}

	public ToolType getType() {
		return type;
	}

	public void setType(ToolType type) {
		this.type = type;
	}
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean getAvailable() {
		return available;
	}

	public void setAvailable(boolean available) {
		this.available = available;
	}
}
