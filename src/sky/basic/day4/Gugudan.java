package sky.basic.day4;

import java.util.Scanner;

public class Gugudan {
	public static void main(String[] args) {
		// 구구단 출력하기
		// ex) 7단을 출력하세요 v1
		System.out.println("7 x 1 = 7");
		System.out.println("7 x 2 = 14");
		System.out.println("7 x 3 = 21");
		System.out.println("7 x 4 = 28");
		System.out.println("7 x 5 = 35");
		System.out.println("7 x 6 = 42");
		System.out.println("7 x 7 = 49");
		System.out.println("7 x 8 = 56");
		System.out.println("7 x 9 = 63");
		System.out.println("----- -----");
		
		// ex) 7단을 출력하세요 v2 - for
		for(int i = 1; i <= 9; ++i) {
			// int gugu7 = 7 * i;
			// System.out.println("7 x " + i + " = " + gugu7);
			
			System.out.println("7 x " + i + " = " + (7 * i));	
		}
		
		// ex) 7단을 출력하세요 v3 - while, printf
		
		String fmt = "7 x %d = %d\n";
		int i = 1;
		while(i <= 9) {
			System.out.printf(fmt, i, i * 7);
			++i;
		}
		
		System.out.println("----- -----");
		
		// ex) 3단을 출력하세요 - while, printf
		fmt = "3 x %d = %2d\n";
		i = 1;
		while(i <= 9) {
			System.out.printf(fmt, i, i * 3);
			++i;
		}
		
		System.out.println("----- -----");
		
		// 구구단 프로그램 v1
		// 사용자로부터 숫자(1 - 9) 중 하나 입력 받아
		// 구구단을 출력하는 프로그램 작성
		// Scanner, while, printf
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("출력할 구구단의 단을 입력하세요: ");
		int dan = sc.nextInt();
		
		fmt = "%d X %d = %2d\n";
		i = 1;
		while(i <= 9) {
			System.out.printf(fmt, dan, i, (dan * i));
			++i;
		}

		
		// 구구단 프로그램 v2
		// 단, 1 - 9 이외의 숫자나 문자를 입력 받으면
		// "잘못 입력하셨습니다!!"라는 메시지를 출력하도록 합니다.
		System.out.print("출력할 구구단의 단을 입력하세요: ");
		char dan2 = sc.next().charAt(0);
		// 입력받은 문자열 중 첫번째 글자만 뽑아서 char형 변수에 대입
		
		// 입력받은 문자의  ASCII 코드값이 49~57인지 검사
		String result = (dan2 >= 49 && dan2 <=57) ? "구구단 출력" : "잘못입력하셨습니다.";
		
		System.out.println(result);
		
		
		// 구구단 프로그램 v3
		// 단, 1 - 9 이외의 숫자나 문자를 입력 받으면
		// "잘못 입력하셨습니다!!"라는 메시지를 출력하도록 합니다.
		System.out.print("출력할 구구단의 단을 입력하세요: ");
		String dan3 = sc.next();
		
		i = 1;
		
		try {
			while(i <= 9) {
				System.out.printf(fmt, dan3, i, (Integer.parseInt(dan3)*i));
				++i;
			} // 변수 타입의 형태가 다른 경우는 형변환이 안됨.
			  // ex) String dan3 -> (int)dan3 이렇게 변환할수가 없음.
		} catch(Exception ex) {
			System.out.println("잘못입력하셨습니다!");
		}
		// 예외처리코드를 이용해서
		// 프로그램 실행 중 오류발생시
		// 제어를 catch 코드쪽으로 넘김
		
		// ex) 주민번호를 이용해서 성별을 출력하는 코드를 작성
		// 주민번호 중 123456 - 7654321 에서 7이 성별을 나타내는 코드
		// 1 : 1999년 이전에 출생하 남자
		// 2 : 1999년 이전에 출생하 여자
		// 3 : 2000년 이후에 출생하 남자
		// 4 : 2000년 이후에 출생하 여자
		// charAt를 이용하기
		
		String jumin = "123456-1234567";
		
		char gender = jumin.charAt(7);
		result = (gender == '1') ? "1999남자" : (gender == '2') ? "1999여자" : (gender == '3') ? "2000남자" : "2000여자";	
		
		System.out.println(result);
	
		
		
		
		// 구구단 - for
		
		//for(int j = 2; j <= 9; ++j) {
		//	for(int k = 1; k <= 9; ++k) {
		//		System.out.printf("%d x %d = %2d\n", j, k, j * k);
		//	}
		//}
		
		
		
	}
}
