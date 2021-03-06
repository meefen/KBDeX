package kfl.model;


public class KFSupport extends KFElement {
	
	private static final long serialVersionUID = 1L;
	
	private String name;

	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	@Override
	public String getType() {
		return "support";
	}
	
	@Override
	public String getShortDescrption() {
		return name;
	}
}
