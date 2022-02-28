package nz.auckland.arch.refactor.function;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class RefactorPredicate {
	private String action;
	private List<String> parameters;
	
	public RefactorPredicate(String action) {
		this.action = action;
		this.parameters = new ArrayList<String>();
	}
	
	public void addParameters(String param) {
		parameters.add(param);
	}

	@Override
	public String toString() {
		
		return "("+action +" "+ getParameters().stream().map(Object::toString).collect(Collectors.joining(" "))+")";
	}
	
	

	public String getAction() {
		return action;
	}

	public List<String> getParameters() {
		parameters =  parameters.stream().distinct().collect(Collectors.toList());
		return parameters;
	}

	@Override
	public boolean equals(Object obj) {
		RefactorPredicate pred2 = (RefactorPredicate) obj;
		if(action.equals(pred2.getAction()) && parameters.size() == pred2.getParameters().size()) {
			for(int i =0; i<parameters.size(); i++)
				if(!pred2.getParameters().contains(parameters.get(i)))
					return false;
			return true;
		} else
			return false;
	}
	
	 @Override
	    public int hashCode() {
	        return Objects.hash(this.toString());
	    }


	

	
}
