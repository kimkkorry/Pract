package BMI;

import java.util.Scanner;

public class BMI {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("몸무게를 입력해 주세요. (ex : 64.9) : ");
	float num1 = scanner.nextFloat();
	System.out.println("키를 입력해 주세요. (ex : 1.79) : ");
	float num2 = scanner.nextFloat();
 double num3 = Math.sqrt(num2);
	double bmi = 1.3 * num1/Math.pow(num3, 5);
	System.out.printf("당신의 bmi는 %.2f 입니다.\n",bmi);
	if (bmi < 18.5)
		System.out.println("저체중 입니다.");
	else if (18.5<= bmi && 25<= bmi)
		System.out.println("정상체중 입니다.");
	else if (25<= bmi && 30< bmi)
		System.out.println("과체중입니다.");
	else if (30<= bmi && 35< bmi)
		System.out.println("1단계 비만입니다.");
	else if (35<= bmi && 40< bmi)
		System.out.println("2단계 비만입니다.");
	else if (40< bmi)
		System.out.println("3단계 비만입니다.");
}
	


}


