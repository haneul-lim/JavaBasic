package sky.basic.day01;

/**
 * 
 * @author sky
 * 
 *         연습문제 실습
 *
 */

public class EX01 {
	public static void main(String[] args) {

		// 3번문제 자바 변수(식별자) 특징
		int TimeLimit; // 변수명으로 가능은 하나, 변수명은 소문자로 시작하길 권장
		// 이외 첫자리 숫자, 예약어 사용 불가함
		// 특수문자는 _, $만 가능

		// 4번 문제
		// 표현식 : expression
		// 계산이나 처리를 위해 작성하는 식을 의미
		// 수학에서 말하는 수식과 유사
		// 표현식의 중요한 특징은 평가evaluate임
		// 즉, 코드의 결과를 알아내는 과정을 의미
		int x, y, z, s, s0, v, t, g;
		int result;

		x = 10;
		y = 20;
		z = 30;
		s0 = 5;
		v = 10;
		t = 10;
		g = 10;

		result = 3 * x;
		System.out.print("3x = ");
		System.out.println(result);

		result = (3 * x) + y;
		System.out.print("3x + y = ");
		System.out.println(result);

		// 값을 대입하지 않고 바로 수식을 입력하여 출력하여도 됨.
		System.out.print("(x + y) / 7 = ");
		System.out.println((x + y) / 7);

		System.out.print("(3 * x + y) / (z + 2) = ");
		System.out.println((3 * x + y) / (z + 2));

		// result = s0 + v * t + 1/2 * g * t * t;
		result = s0 + v * t + 1 / 2 * g * t ^ 2;
		System.out.print("s0 + v * t + 1/2 * g * t ^ 2 = ");
		System.out.println(result);

		// 5번문제
		double number = (1 / 3) * 3;
		// double one = 1;
		// double three = 3;
		// System.out.println((one / three) * three);
		// 더블형 변수로 값을 받아서 계산하게 되면 제대로 값이 나옴
		int quotient = 7 / 3;
		int remainder = 7 % 3;
		// int result = 11;
		result /= 2;
		// 복합대입연산자
		// 산술연산자와 대입연산자를 합쳐놓은 연산자
		// ex) a = a + 1 => a += 1

		System.out.printf("%f, %d, %d, %d\n", number, quotient, remainder, result);

		// 차변과 대변이 모두 숫자인 경우 +는 산술연산자
		// 차변과 대변 중 하나 이상이 문자인 경우 +는 연결연산자
		// (자동형변환) 서로 다른 종류의 값을 표현식으로 나타내면
		// ( ex.double형이 앞의 문자에 의해 문자형으로 변형)

		// System.out.println("(1 / 3) * 3 = " + number);
		// 정수는 정수로 연산되어짐 (double형과는 별개로 자바..)
		// 예상 값: 1, 실제값 : 0.0
		// 정수 나누기 정수의 결과값은 정수이기 때문!
		// double number = (1.0 / 3.0) * 3.0;
		// System.out.println("(1 / 3) * 3 = " + number);
		// 실수값으로 넣으면 예상값인 1로 나옴

		// int quotient = 7 / 3;
		// 예상값 : 2.3333, 실제값 : 2

		// 6번문제

		// 정수와 실수를 연산할 때는 자동적으로 형변환이 일어나는데
		// 큰 실수로 형변환이 일어남.
		double xx = 2.5;
		double yy = 1.5;
		int m = 18;
		int n = 4;

		double a;
		a = xx + n * yy - (xx + n) * yy;
		System.out.printf("%f\n", a);

		int b;
		b = m / n + m % n;
		System.out.printf("%d\n", b);

		double c;
		c = 5 * xx - n / 5;
		System.out.printf("%f\n", c);

		int d;
		d = 1 - (1 - (1 - (1 - (1 - n))));
		System.out.printf("%d\n", d);

		// 1번문제

		System.out.println("*   *    **    ****    ****    *   *      /////");
		System.out.println("*   *   *  *   *   *   *   *   *   *     | 0 0 |");
		System.out.println("*****  *    *  ****    ****     * *     (|  ^  |)");
		System.out.println("*   *  ******  *   *   *   *     *       | [_] |");
		System.out.println("*   *  *    *  *    *  *    *    *       |_____|\n\n");
		System.out.println("               +---+");
		System.out.println("               |   |");
		System.out.println("           +---+---+");
		System.out.println("           |   |   |      /\\_/\\     -----");
		System.out.println("       +---+---+---+     ( ' ' )  / Hello \\ ");
		System.out.println("       |   |   |   |     (  -  ) <  Junior | ");
		System.out.println("   +---+---+---+---+      | | |   \\ Coder!/ ");
		System.out.println("   |   |   |   |   |     (__|__)    ----- ");
		System.out.println("   +---+---+---+---+");

	}

}
