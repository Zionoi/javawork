package _02_abstract;

public class Frog extends Pet{

	public Frog() {
		super("청개구리", "초록색","시끌", "개굴이");
		
	}
	// 생성자 2개 
		
	/*		public void Pet(String kind, String color) {
				//오버라이딩하기
				this.kind = kind;
				this.color = color;
				this.feature = feature;
			}*/
		
		void sound() {
			System.out.println("개굴");
		}

		@Override
		void info() {
				System.out.println("특징 : "+super.getFeature());
			
		}
		
}
