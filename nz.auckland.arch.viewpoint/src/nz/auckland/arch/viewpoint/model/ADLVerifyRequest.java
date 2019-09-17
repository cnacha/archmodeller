package nz.auckland.arch.viewpoint.model;

public class ADLVerifyRequest {
	private String model;
	private String code;
	
	
	public ADLVerifyRequest(String model, String code) {
		super();
		this.model = model;
		this.code = code;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	
}
