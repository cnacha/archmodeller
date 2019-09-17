package nz.auckland.arch.viewpoint.model;

public class ADLVerifyResult {

	private String model;
	private String result;
	private int visitedStates;
	private double verificationTime;
	private String fullResultString;
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
	public int getVisitedStates() {
		return visitedStates;
	}
	public void setVisitedStates(int visitedStates) {
		this.visitedStates = visitedStates;
	}
	public double getVerificationTime() {
		return verificationTime;
	}
	public void setVerificationTime(double verificationTime) {
		this.verificationTime = verificationTime;
	}
	public String getFullResultString() {
		return fullResultString;
	}
	public void setFullResultString(String fullResultString) {
		this.fullResultString = fullResultString;
	}
	
	
}
