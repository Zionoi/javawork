package _05_BuilderPattern.BuilderConstructor;

public class SubwayBuilder {
	


	private int size;
	private String bread;
	private String cheese="모짜렐라";
	private String extraTopping="없음";
	private boolean vagetable;
	private String source;
	
	
	// 꼭 들어가야하는 멤버는 따로 생성자로 구현해둔다
	// 밑에 빌드에 들어가는 메소드들중 중복되는건 지워준다
	// 이렇게하면 생성자에 들어가는거 제외하곤 추가해줘도 되고 안해줘도되는 옵션이 된다
	public SubwayBuilder(int size, String bread, String source) {
		super();
		this.size = size;
		this.bread = bread;
		this.source = source;
	}
	
	
	public SubwayBuilder setCheese(String cheese) {
		this.cheese = cheese;
		return this;
	}
	public SubwayBuilder setExtraTopping(String extraTopping) {
		this.extraTopping = extraTopping;
		return this;

	}
	public SubwayBuilder setVagetable(boolean vagetable) {
		this.vagetable = vagetable;
		return this;

	}
	


	public SubwayMenu build() {
		return new SubwayMenu(size, bread, cheese, extraTopping, vagetable, source);//중요
	}
	
	@Override
	public String toString() {
		return "SubwayBuilder [size=" + size + ", bread=" + bread + ", cheese=" + cheese + ", extraTopping="
				+ extraTopping + ", vagetable=" + vagetable + ", source=" + source + "]";
	}
	
	
	
	

}
