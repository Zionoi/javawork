package _02_HashMap;

public class Snack_api {
	private String flavor;
	private int calory;
	
	public Snack_api(){}

	public Snack_api(String flavor, int calory) {
		this.flavor = flavor;
		this.calory = calory;
	}

	public String getFlavor() {
		return flavor;
	}

	public void setFlavor(String flavor) {
		this.flavor = flavor;
	}

	public int getCalory() {
		return calory;
	}

	public void setCalory(int calory) {
		this.calory = calory;
	}

	@Override
	public String toString() {
		return "[flavor=" + flavor + ", calory=" + calory + "]";
	}
	
	
	

}
