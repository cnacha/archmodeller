package nz.auckland.arch.refactor.function;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ObjectDefinition {
	private String type;
	private List<String> names;
	
	
	public ObjectDefinition(String type) {
		this.type = type;
		names = new ArrayList<String>();
	}
	
	public void addName(String name) {
		this.names.add(name);
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public List<String> getNames() {
		names =  names.stream().distinct().collect(Collectors.toList());
		return names;
	}

	public void setNames(List<String> names) {
		this.names = names;
	}

	@Override
	public String toString() {
		return  getNames().stream().map(Object::toString).collect(Collectors.joining(" ")) +  " - " + type;
	}
	
}
