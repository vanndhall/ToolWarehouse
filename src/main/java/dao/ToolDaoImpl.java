package dao;

import Model.Tool;
import Model.ToolType;
import Service.ToolService;
import Service.ToolServiceImpl;

import java.util.Arrays;
import java.util.List;

public class ToolDaoImpl implements ToolDao {

	private List<Tool> tools;



	public ToolDaoImpl() {
		Tool tool1 = new Tool(1, "Sonic screwdriver", ToolType.SCREWDRIVER, true);
		Tool tool2 = new Tool(2, "Srubokret od kamaza", ToolType.SCREWDRIVER, false);
		Tool tool3 = new Tool(3, "Stara pila", ToolType.SAW, true);
		Tool tool4 = new Tool(4, "Czerwony mlotek", ToolType.HAMMER, true);

		tools = Arrays.asList(tool1, tool2, tool3, tool4);
	}

	@Override
	public List<Tool> getAll() {
		return tools;
	}

	@Override
	public void setAvailability(final boolean isAvailable, long id) {
		for (Tool tool: tools) { // dla każdego toola z listy  ( dla każdego takiego samego typu z listy tools gzie są typy tool)
			if(tool.getId() == id){ // pobierz jego id  i sprawdz czy jest rowny argumetrowi id z metody setAvailability jeżeli jest równy:
				tool.setAvailable(isAvailable);// ustaw jego pole : available za pomoca setera setAvailable() dając mu argument z metody setAvailability
				return;
			}

//			for(int i = 0; i < tools.size(); i++){
//				if(tools.get(i).getId() == id){
//					tools.get(i).setAvailable(isAvailable);
//					return;
//				}
//			}
//
//			tools.stream()
//					.filter((tool -> tool.getId() == id)
//					.findAny()
//					.isPresent(tool -> tool.setSetAvailable(isAvailable));

		}
	}
	//MOCKOWANIE PONIŻEJ:
	//HAMMER, SCREWDRIVER, SAW, OTHER

//	public List<Tool> mockTool(){
//		Tool hammer = new Tool(1,"HAMMER",true);
//		Tool screwdriver = new Tool(2,"SCREWDRIVER",true);
//		Tool saw = new Tool(3,"SAW",false);
//		Tool other = new Tool(4,"OTHER",false);
//
//
//		return Arrays.asList(hammer,screwdriver,saw,other);
//	}


}
