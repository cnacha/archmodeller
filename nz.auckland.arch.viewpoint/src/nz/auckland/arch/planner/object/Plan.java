package nz.auckland.arch.planner.object;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import nz.auckland.arch.RefactorPart;
import nz.auckland.arch.refactor.function.RefactorPDDLDescription;

public class Plan {

	List<Action> steps;
	
	// attributes for refactoring fucntion
	RefactorPart part;
	RefactorPDDLDescription refdesc;
	List<String> verifyExprList = new ArrayList<String>();
	
	public Plan() {
		steps = new ArrayList<Action>();
	}
	
	public void addStep(Action s) {
		steps.add(s);
	}
	
	public Action getStep(int ind) {
		return steps.get(ind);
	}
	public int getStepCount() {
		return steps.size();
	}

	public List<Action> getSteps() {
		return steps;
	}

	public void setSteps(List<Action> steps) {
		this.steps = steps;
	}
	
	

	public RefactorPart getPart() {
		return part;
	}

	public void setPart(RefactorPart part) {
		this.part = part;
	}

	public RefactorPDDLDescription getRefdesc() {
		return refdesc;
	}

	public void setRefdesc(RefactorPDDLDescription refdesc) {
		this.refdesc = refdesc;
	}
	
	

	public List<String> getVerifyExprList() {
		return verifyExprList;
	}

	public void setVerifyExprList(List<String> verifyExprList) {
		this.verifyExprList = verifyExprList;
	}

	@Override
	public String toString() {
		return getSteps().stream().map(Object::toString).collect(Collectors.joining("->"));
	}

}
