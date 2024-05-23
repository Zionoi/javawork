package _01_langPackage;

import java.nio.file.FileSystemLoopException;
import java.util.Arrays;

class Point {
		int x;
		int y;
		Point(int x, int y){
			this.x = x;
			this.y = y;
		}
		@Override
		public String toString() {
			return "x = "+x+", y = "+y;
		}
	}
	
	class Circle implements Cloneable {
		Point p;  // 중심점
		double r; // 반지름
		
		Circle(Point p, double r){
			this.p = p;
			this.r = r;
		}
		// 인스턴스변수가 기본자료형이면 깊은복사가 되지만
		// 인스턴스변수가 참조자료형(객체를 가리키고있는)이면 얕은복사(즉, 주소만 복사)
		@Override
		public Circle clone() { // 자료형을 해당클래스 자료형으로 먼저바꾸고
			Object obj = null;
			try {
				obj = super.clone();		// 부모클래스 호출해서 리턴 해주면됨
			} catch (CloneNotSupportedException e) { 
				e.printStackTrace();
			}
			return (Circle)obj; // 리턴값도 해당클래스 자료형으로 먼저 변환후 리턴해줌// 먼저했었던 오브젝트로 받는거랑 순서만 바뀐것 같은얘기임
		}
		
		// 인트턴스변수가 참조자료형일때도 깊은복사 하려면 해당클래스자료형 메소드를 하나더 만들어준후 안에 값을 바꿔야한다
		public Circle deepClone() {
			Object obj = null;
			try {
				obj = super.clone();		
			} catch (CloneNotSupportedException e) { 
				e.printStackTrace();
			}
			Circle c = (Circle)obj;
			c.p = new Point(this.p.x,this.p.y);
					
			return c;
		}
		
		
		
		
		
		@Override
		public String toString() {
			return "p = ["+p+"], r = "+r;
		}
		
		
	}
	
	
	
public class T05_cloneShallowdeepCopy {

	public static void main(String[] args) {
		
		//ShallowCopy 얕은 복사
		String[] str = {"a","b","c"}; // 스텍에 num이라는 저장공간이 올라가고 주소가 들어감 
		String copyStr[] = str; //str주소를 copyStr로 복사한것. str 값이 바뀌면 copyStr도 바뀜. 반대로 copyStr값을 바꿔도 str값이 바뀜
		str[0] = "d";
		System.out.println(str[0]); //같은 주소값이기때문에 
		System.out.println(copyStr[0]);// 같은값이 나옴
		System.out.println("--------------------------------");
		
		//deepCopy 깊은 복사
		//1.
		String[] deepCopy = new String[5];
		for(int i=0; i<str.length;i++) {
			deepCopy[i] = str[i];
		}
		System.out.println(Arrays.toString(deepCopy));
		System.out.println("--------------------------------");
		
		str[0] = "a";
		System.out.println(Arrays.toString(str)); // 해당 배열인덱스 값 바뀜
		System.out.println(Arrays.toString(deepCopy)); // 배열 인덱스 값 안바뀜
		//클론은 깊은복사 됨
		System.out.println("--------------------------------");
		
		// 2. Array.copyOf(원본배열, 복사할 길이)
		//Array.copyOf 도 깊은복사가됨.
		String[] arrayCopy = Arrays.copyOf(str,3);// 또는 (str, str.length)
		System.out.println(Arrays.toString(arrayCopy));
		System.out.println("--------------------------------");
		
		arrayCopy[2] = "z";
		System.out.println(Arrays.toString(str));
		System.out.println(Arrays.toString(arrayCopy));
		// 깊은복사는 복사하게되면 객체가 따로따로이기 때문에 하나를 변경한다고해서 다른게 바뀌진 않음
		
		
		// 3. clone() 깊은복사
		Point p1 = new Point(5,10);
		Circle c1 = new Circle(p1, 3); // c1 생성자에는 매개변수를 Point 객체, 더블형 자료형 2개를 받고있다.
//		Circle c1 = new Circle(new Point(5,10), 3); 이렇게 한줄로도 가능하다
		Circle c2 = c1.clone(); 
		System.out.println(c1);
		System.out.println(c2);
		System.out.println("--------------------------------");
		System.out.println("--------------------------------");
		
		c1.r = 100.0;
		c1.p.x = 700;
		
		System.out.println("c1 : "+c1);
		System.out.println("c2 : "+c2); // c1만 변경했는데 c2도 값이 바뀜
		System.out.println("--------------------------------");
		
		Circle c3 = c1.deepClone();
		c1.r = 50.0;
		c1.p.x = 1000;
		
		System.out.println("c1 : "+c1);
		System.out.println("c3 : "+c3); //깊은복사
		
		
		
		
		// 배열에서의 clone
		int[] num = {1,2,3};
		int[] numClone = num.clone(); // 일반 객체는 implements Cloneable을 선언해야하지만 배열은 자동으로 선언되어있어서 그냥 clone사용가능
		
		numClone[0]=100; 
		System.out.println(Arrays.toString(num)); // 값 그대로
		System.out.println(Arrays.toString(numClone)); // 얘만 바뀜. clone 깊은복사
		
		
		
	}

}

