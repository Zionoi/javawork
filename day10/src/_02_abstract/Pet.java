package _02_abstract;

abstract public class Pet { 
	//	추상클래스 : 추상메서드가 1개이상 포함되어 있으면 반드시 추상클래스로 해야한다.
	// 클래스안에 abstract 추상메서드가 있으므로 클래스앞에도 abstract이 붙는다

	
		private String kind;
		private String color;
		private String feature;
		private String name;
		
		
		public Pet(String kind, String color, String feature, String name) {
			this.kind = kind;
			this.color = color;
			this.feature = feature;
			this.name = name;
		}
		
		//추상 메서드 : 메서드 앞에 abstract 키워드 사용.  
		//			선언부만 있고 실행부가 없는 메서드
		//			상속받는 곳에서 반드시 구현해야됨
		abstract void sound();
		abstract void info();
		
		
		public String getKind() {
			return kind;
		}
		public String getColor() {
			return color;
		}
		public String getFeature() {
			return feature;
		}
		public String getName() {
			return name;
		}
		String feature() {
			return feature;
		}
		
		
		@Override
		public String toString() {
			return "이름 : "+name+"\n종류 : "+kind+"\n색상 : "+color+"\n성격 : "+feature; 
		}
	
		
	
}
