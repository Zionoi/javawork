import java.util.Scanner;

public class pr2 {

	public static void main(String[] args) {
		  Scanner scanner = new Scanner(System.in);

	        System.out.println("온도를 입력하세요: ");
	        double temperature = scanner.nextDouble(); // 온도 입력

	        System.out.println("입력한 온도의 단위를 선택하세요 (C 또는 F): ");
	        String unit = scanner.next(); // 단위 입력

	        double convertedTemperature;
	        if (unit.equalsIgnoreCase("C")) {
	            convertedTemperature = (temperature * 9 / 5) + 32; // 섭씨를 화씨로 변환
	            System.out.println("화씨 온도: " + convertedTemperature);
	        } else if (unit.equalsIgnoreCase("F")) {
	            convertedTemperature = (temperature - 32) * 5 / 9; // 화씨를 섭씨로 변환
	            System.out.println("섭씨 온도: " + convertedTemperature);
	        } else {
	            System.out.println("잘못된 입력입니다. C 또는 F 중에 선택해주세요.");
	        }

	        scanner.close();
	}

}
