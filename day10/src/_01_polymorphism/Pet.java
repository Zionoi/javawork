package _01_polymorphism;

public class Pet {
	// 속성 : kind,  color
	// 메소드 : sound, pattern, getKind, getColor,
	// 오버라이딩 : toString {return } 종류: 포유류, 색상: 흰색
	// info() {출력문} 종류: 포유류, 색상: 흰색
	
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
	
		void info() {
			System.out.println("이름 : "+name+"\n종류 : "+kind+"\n색상 : "+color+"\n성격 : "+feature);
		}
	
}
